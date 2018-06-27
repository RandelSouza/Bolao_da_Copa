package com.ufc.Bolao_da_copa.Dao;

import com.ufc.Bolao_da_copa.Bolao_da_Copa.ConnectionFactory;
import com.ufc.Bolao_da_copa.Pojo.Partida;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author randel
 */
public class PartidaDao {
    ConnectionFactory connect = new ConnectionFactory();    
    int lastId;
    boolean estado;
    String data_partida;    
    SimpleDateFormat formatacao = new SimpleDateFormat("yyyy-MM-dd");
    
    public void salvar(Partida partidaPojo){       
        try {
            java.sql.Date dataSQL = new Date(partidaPojo.getData_partida().getTime());
            connect.connection();            
            PreparedStatement pst = connect.connect.prepareStatement("INSERT INTO partida(qtd_gols_time_visitante, qtd_gols_time_casa, estadio, data_partida, hora, time_casa,  time_visitante) values(?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);            
            
            pst.setInt(1, partidaPojo.getQtd_gols_time_visitante());
            pst.setInt(2,  partidaPojo.getQtd_gols_time_casa()); 
            pst.setString(3, partidaPojo.getEstadio()); 
            pst.setObject(4, dataSQL); 
            pst.setString(5, partidaPojo.getHora());
            pst.setInt(6, partidaPojo.getTime_casa());       
            pst.setInt(7, partidaPojo.getTime_visitante());  
            pst.execute();                                             
                                             
            connect.disconect();
            JOptionPane.showMessageDialog(null, "Partida salva com êxito!");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar a partida: " + "\n" + ex.getMessage());
        }
    }

    public Partida buscarPartida(Partida partidaPojo){        
        try {
            connect.connection();
            connect.executaSql("SELECT * FROM partida WHERE pid ='"+partidaPojo.getPesquisa()+"';");
        
            estado = connect.rst.first();
                                    
            if(estado){                                              
                partidaPojo.setTime_casa(connect.rst.getInt("time_casa"));
                partidaPojo.setTime_visitante(connect.rst.getInt("time_visitante"));
                partidaPojo.setEstadio(connect.rst.getString("estadio")); 
                partidaPojo.setHora(connect.rst.getString("hora"));
                partidaPojo.setQtd_gols_time_casa(connect.rst.getInt("qtd_gols_time_visitante"));
                partidaPojo.setQtd_gols_time_visitante(connect.rst.getInt("qtd_gols_time_casa"));
                partidaPojo.setId(connect.rst.getInt("pid"));               
                
                try {                               
                    partidaPojo.setData_partida(formatacao.parse(connect.rst.getString("data_partida")));
                } catch (ParseException ex) {
                    Logger.getLogger(PartidaDao.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }else{                
                partidaPojo.setTime_casa(-2);
                partidaPojo.setTime_visitante(-2);
                partidaPojo.setEstadio(""); 
                partidaPojo.setHora("");
                partidaPojo.setQtd_gols_time_casa(-2);
                partidaPojo.setQtd_gols_time_visitante(-2);
                partidaPojo.setId(-2);
                partidaPojo.setData_partida(null);
            }            
           
            connect.disconect();
                        
        } catch (SQLException ex) {
            Logger.getLogger(TimeDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao buscar a partida: " + "\n" + ex.getMessage());
        }
        
        return partidaPojo;
    }
    
    public void excluirPartida(Partida partidaPojo){                
        try {
            connect.connection();
            PreparedStatement pst = connect.connect.prepareStatement("DELETE FROM partida WHERE pid=?");            
            pst.setInt(1, partidaPojo.getId());
            pst.execute();
            connect.disconect();        
            JOptionPane.showMessageDialog(null, "A partida foi excluida com êxito!");
            
        } catch (SQLException ex) {
            Logger.getLogger(TimeDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error ao excluir partida!");
        }        
    }    
    
    public void editarPartida(Partida partidaPojo){
        
        try {
            connect.connection();
            
            java.sql.Date dataSQL = new Date(partidaPojo.getData_partida().getTime());
            
            PreparedStatement pst = connect.connect.prepareStatement("UPDATE partida SET qtd_gols_time_visitante=?,"+
                                                                                        "qtd_gols_time_casa=?, estadio=?,"+
                                                                                        "data_partida=?,hora=?, time_casa=?, time_visitante=? "+
                                                                     " WHERE pid=?;");
            pst.setInt(1, partidaPojo.getQtd_gols_time_visitante());
            pst.setInt(2, partidaPojo.getQtd_gols_time_casa());
            pst.setString(3, partidaPojo.getEstadio());
            pst.setObject(4, dataSQL);
            pst.setString(5, partidaPojo.getHora());
            pst.setInt(6, partidaPojo.getTime_casa());
            pst.setInt(7, partidaPojo.getTime_visitante());
            pst.setInt(8, partidaPojo.getId());            
            pst.execute();
            connect.disconect();        
            JOptionPane.showMessageDialog(null, "A partida foi alterada com êxito!");
            
        } catch (SQLException ex) {
            Logger.getLogger(TimeDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error ao alterar partida!");
        }       
    }
}