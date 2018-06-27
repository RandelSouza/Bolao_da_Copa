package com.ufc.Bolao_da_copa.Dao;

import com.ufc.Bolao_da_copa.Bolao_da_Copa.ConnectionFactory;
import com.ufc.Bolao_da_copa.Pojo.Aposta;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author randel
 */
public class ApostaDao {   
    ConnectionFactory connect = new ConnectionFactory();
    Aposta apostaPojo = new Aposta();   
    String sql = "";
    
    public void salvar(Aposta apostaPojo){
        sql = "INSERT INTO aposta(uid, palpite_gols_time_visitante, "+
              "palpite_gols_time_casa, empate, pontos_usuario, pid) " +
              "VALUES(?, ?, ?, ?, ?, ?) ";                
        try {
            connect.connection();
            PreparedStatement pst = connect.connect.prepareStatement(sql);
            pst.setInt(1, apostaPojo.getUid());
            pst.setInt(2, apostaPojo.getPalpite_gols_time_visitante());
            pst.setInt(3, apostaPojo.getPalpite_gols_time_casa());
            pst.setBoolean(4, apostaPojo.isEmpate());
            pst.setInt(5, apostaPojo.getPontos_usuario());
            pst.setInt(6, apostaPojo.getPid());
            pst.execute();
            connect.disconect();
            JOptionPane.showMessageDialog(null, "Aposta salva com êxito!");
        } catch (SQLException ex) {            
            JOptionPane.showMessageDialog(null, "Não foi possivel salvar a aposta: " + ex.getMessage());
        }                        
    }        
    
    public void excluir(Aposta apostaPojo){
            try {
            connect.connection();
            PreparedStatement pst = connect.connect.prepareStatement("DELETE FROM aposta WHERE aid=?");            
            pst.setInt(1, apostaPojo.getAid());
            pst.execute();
            connect.disconect();        
            JOptionPane.showMessageDialog(null, "Aposta excluida com êxito!");
            
        } catch (SQLException ex) {
            Logger.getLogger(TimeDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error ao excluir a aposta!");
        }
    }   
}
