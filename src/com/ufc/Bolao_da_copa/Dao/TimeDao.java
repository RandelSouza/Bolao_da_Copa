package com.ufc.Bolao_da_copa.Dao;

import com.ufc.Bolao_da_copa.Bolao_da_Copa.ConnectionFactory;
import com.ufc.Bolao_da_copa.Pojo.Time;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author randel
 */
public class TimeDao {
    boolean estado = false;
    ConnectionFactory connect = new ConnectionFactory();    
    
    // Método que salva um time no Banco de Dados.
    public void salvar(Time timePojo){       
        try {
            connect.connection();
            PreparedStatement pst = connect.connect.prepareStatement("INSERT INTO time(tnome, nome_tecnico, imagem) VALUES (?, ?, ?) ");
            pst.setString(1, timePojo.getTnome());
            pst.setObject(2, timePojo.getNome_tecnico()); 
            pst.setBytes(3, timePojo.getImagem()); 
            pst.execute();
            connect.disconect();
            JOptionPane.showMessageDialog(null, "Time salvo com êxito!");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar o time: " + "\n" + ex.getMessage());
        }
    }    
    
    // Método que recupera um time do Banco de Dados.
    public Time buscarTime(Time timePojo){        
        try {
            connect.connection();
            connect.executaSql("SELECT * FROM time WHERE tnome LIKE '%"+timePojo.getPesquisa()+"%';");
            estado = connect.rst.first();
            
            if(estado){                              
                timePojo.setTnome(connect.rst.getString("tnome"));
                timePojo.setNome_tecnico(connect.rst.getString("nome_tecnico")); 
                timePojo.setId(connect.rst.getInt("tid"));
                timePojo.setImagem(connect.rst.getBytes("imagem"));
                             
            }else{                
                timePojo.setTnome("");
                timePojo.setNome_tecnico(""); 
                timePojo.setId(0);
                timePojo.setImagem(null);
            }            
           
            connect.disconect();
        } catch (SQLException ex) {            
            JOptionPane.showMessageDialog(null, "Erro ao buscar o time: " + "\n" + ex.getMessage());
        }
        
        return timePojo;
    }
    
    // Método que atualiza um time do Banco de Dados.
    public void editarTime(Time timePojo){
        
        try {
            connect.connection();
            PreparedStatement pst = connect.connect.prepareStatement("UPDATE time SET tnome=?, nome_tecnico=?, imagem=? WHERE tid=?;");
            pst.setString(1, timePojo.getTnome());
            pst.setString(2, timePojo.getNome_tecnico());            
            pst.setBytes(3, timePojo.getImagem());
            pst.setInt(4, timePojo.getId());
            pst.execute();
            connect.disconect();        
            System.out.println(pst.getFetchSize());
            JOptionPane.showMessageDialog(null, "O time foi alterado com êxito!");
            
        } catch (SQLException ex) {
            Logger.getLogger(TimeDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error ao alterar time!");
        }       
    }
    
    // Método que deleta um time do Banco de Dados.
    public void excluirTime(Time timePojo){                
        try {
            connect.connection();
            PreparedStatement pst = connect.connect.prepareStatement("DELETE FROM time WHERE tid=?");            
            pst.setInt(1, timePojo.getId());
            pst.execute();            
            JOptionPane.showMessageDialog(null, "O time foi excluido com êxito!");            
            connect.disconect();        
        } catch (SQLException ex) {
            Logger.getLogger(TimeDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error ao excluir o time!");
        }        
    }
}
