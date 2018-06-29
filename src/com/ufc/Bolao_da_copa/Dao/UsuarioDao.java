package com.ufc.Bolao_da_copa.Dao;

import com.ufc.Bolao_da_copa.Bolao_da_Copa.ConnectionFactory;
import com.ufc.Bolao_da_copa.Pojo.Usuario;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author randel
 */
public class UsuarioDao {
    ConnectionFactory connect = new ConnectionFactory();    
    boolean estado = false;
    
    // Método que insere um usuário no Banco de Dados.
    public void salvar(Usuario usuarioPojo){       
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(usuarioPojo.getSenha().getBytes("UTF-8"));  
            StringBuilder sb = new StringBuilder();
            
            for(byte b : messageDigest){
                sb.append(String.format("%02X", 0xFF & b));
            }
            
            String senhaHex = sb.toString();
            
            connect.connection();
            PreparedStatement pst = connect.connect.prepareStatement("INSERT INTO usuario(unome, sexo, idade, senha, admin, login) VALUES (?, ?, ?, ?, ?, ?) ");
            pst.setString(1, usuarioPojo.getUnome());
            pst.setObject(2, usuarioPojo.getSexo(), java.sql.Types.CHAR);
            pst.setInt(3, usuarioPojo.getIdade());
            pst.setString(4, senhaHex);
            pst.setBoolean(5, usuarioPojo.getAdmin());
            pst.setString(6, usuarioPojo.getLogin());
            pst.execute();
            connect.disconect();
            JOptionPane.showMessageDialog(null, "Usuário salvo com êxito!");
        } catch (SQLException ex) {           
            JOptionPane.showMessageDialog(null, "Erro ao salvar o usuário: " + "\n" + ex.getMessage());
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }     
    
    // Método que recupera um usuário devidamente cadastrado e com suas credenciais válidas no Banco de Dados.
    public Usuario login(Usuario usuarioPojo){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(usuarioPojo.getSenha().getBytes("UTF-8"));  
            StringBuilder sb = new StringBuilder();
            
            for(byte b : messageDigest){
                sb.append(String.format("%02X", 0xFF & b));
            }
            
            String senhaHex = sb.toString();
            
            connect.connection();            
            connect.executaSql("SELECT unome, senha, admin, uid, login FROM usuario WHERE login = '"+usuarioPojo.getLogin()+"' ;");                    
            estado = connect.rst.first();                                                                                   
            
            if(estado){
                
                String senhaHash = connect.rst.getString("senha").trim();            
                String loginBanco = connect.rst.getString("login").trim();                                                               
                
                if(loginBanco.equals(usuarioPojo.getLogin()) &&
                   senhaHash.equals(senhaHex)){
                    
                   usuarioPojo.setUnome(connect.rst.getString("unome").trim());                   
                   usuarioPojo.setAdmin(connect.rst.getBoolean("admin"));  
                   usuarioPojo.setUid(connect.rst.getInt("uid"));
                }else{
                   usuarioPojo.setUnome("null");                   
                }                              
            }else{
                usuarioPojo.setUnome("null");                   
            }
                        
            connect.disconect();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar Login" + "\n" + ex.getMessage());
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarioPojo;
    }
    
    public boolean verificarLogin(Usuario usuarioPojo){
        try {
            connect.connection();
                       
            connect.executaSql("SELECT '"+usuarioPojo.getLogin()+"' NOT IN (SELECT login FROM Usuario) AS login;");
            estado = connect.rst.first();
            
            if(estado){
               return connect.rst.getBoolean("login");            
            }            
            
            connect.disconect();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return false;
    }        
}
