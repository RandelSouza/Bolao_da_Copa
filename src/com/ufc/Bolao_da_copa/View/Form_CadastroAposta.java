package com.ufc.Bolao_da_copa.View;

import com.ufc.Bolao_da_copa.Bolao_da_Copa.ConnectionFactory;
import com.ufc.Bolao_da_copa.Dao.ApostaDao;
import com.ufc.Bolao_da_copa.Pojo.Aposta;
import com.ufc.Bolao_da_copa.Util.ManipularImagem;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
/**
 *
 * @author randel
 */
// Formulário de cadastro de aposta.
public final class Form_CadastroAposta extends javax.swing.JFrame {
    int flag = 0;
    int resposta, tid1, tid2;
    static int uid = 0;
    String timeCasa, timeVisitante, sql, tcasaNome, tvisitanteNome;
    ConnectionFactory connect = new ConnectionFactory();        
    Aposta apostaPojo = new Aposta();
    ApostaDao apostaDao = new ApostaDao();
    int idPartida;
    
    public Form_CadastroAposta(int uid) {
        Form_CadastroAposta.uid = uid;
        connect.connection();
        initComponents();
        PreencherJcomboboxPartida();   
        escolherPartida();
        AutoCompleteDecorator.decorate(jComboBoxPartida);                
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelBetHunch = new javax.swing.JLabel();
        jTextFieldQtdTimeVisitante = new javax.swing.JTextField();
        jLabelBetHunch1 = new javax.swing.JLabel();
        jTextFieldQtdTimeCasa = new javax.swing.JTextField();
        jButtonNew = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxPartida = new javax.swing.JComboBox<>();
        jLabelTimeCasa = new javax.swing.JLabel();
        jLabelX = new javax.swing.JLabel();
        jLabelTimeVisitante = new javax.swing.JLabel();
        jLabelLogoUser = new javax.swing.JLabel();
        jLabelTeamCasa = new javax.swing.JLabel();
        jLabelDescricaoTimeCasa = new javax.swing.JLabel();
        jLabeltimecasades = new javax.swing.JLabel();
        jLabeltimev = new javax.swing.JLabel();
        jLabeltimevisitantedes = new javax.swing.JLabel();
        jLabelFundoAposta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxPartidaId = new javax.swing.JComboBox<>();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabelBetHunch.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelBetHunch.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBetHunch.setText("Palpite Gols Time Visitante: ");
        jPanel1.add(jLabelBetHunch);
        jLabelBetHunch.setBounds(680, 380, 280, 30);

        jTextFieldQtdTimeVisitante.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextFieldQtdTimeVisitante.setEnabled(false);
        jTextFieldQtdTimeVisitante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldQtdTimeVisitanteKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldQtdTimeVisitante);
        jTextFieldQtdTimeVisitante.setBounds(950, 380, 100, 30);

        jLabelBetHunch1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelBetHunch1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBetHunch1.setText("Palpite Gols Time Casa: ");
        jPanel1.add(jLabelBetHunch1);
        jLabelBetHunch1.setBounds(90, 380, 240, 30);

        jTextFieldQtdTimeCasa.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextFieldQtdTimeCasa.setEnabled(false);
        jTextFieldQtdTimeCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldQtdTimeCasaKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldQtdTimeCasa);
        jTextFieldQtdTimeCasa.setBounds(340, 380, 100, 30);

        jButtonNew.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/add2.png"))); // NOI18N
        jButtonNew.setText("Nova");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNew);
        jButtonNew.setBounds(320, 520, 130, 50);

        jButtonSave.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/salve2.png"))); // NOI18N
        jButtonSave.setText("Salvar");
        jButtonSave.setEnabled(false);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSave);
        jButtonSave.setBounds(480, 520, 130, 50);

        jButtonCancel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/cancel2.png"))); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.setEnabled(false);
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancel);
        jButtonCancel.setBounds(640, 520, 140, 50);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Partida:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(340, 450, 130, 40);

        jComboBoxPartida.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jComboBoxPartida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxPartida.setEnabled(false);
        jComboBoxPartida.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxPartidaItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBoxPartida);
        jComboBoxPartida.setBounds(440, 450, 240, 40);

        jLabelTimeCasa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelTimeCasa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTimeCasa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabelTimeCasa);
        jLabelTimeCasa.setBounds(90, 80, 370, 250);

        jLabelX.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jLabelX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelX.setText("X");
        jPanel1.add(jLabelX);
        jLabelX.setBounds(520, 140, 80, 90);

        jLabelTimeVisitante.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabelTimeVisitante);
        jLabelTimeVisitante.setBounds(680, 80, 370, 250);

        jLabelLogoUser.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabelLogoUser.setForeground(new java.awt.Color(169, 229, 112));
        jLabelLogoUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoUser.setText("Realizar Aposta");
        jPanel1.add(jLabelLogoUser);
        jLabelLogoUser.setBounds(380, 0, 380, 40);

        jLabelTeamCasa.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelTeamCasa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTeamCasa.setText("Time Casa: ");
        jPanel1.add(jLabelTeamCasa);
        jLabelTeamCasa.setBounds(90, 340, 150, 30);
        jPanel1.add(jLabelDescricaoTimeCasa);
        jLabelDescricaoTimeCasa.setBounds(150, 244, 310, 30);

        jLabeltimecasades.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabeltimecasades.setForeground(new java.awt.Color(222, 216, 0));
        jPanel1.add(jLabeltimecasades);
        jLabeltimecasades.setBounds(210, 340, 260, 30);

        jLabeltimev.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabeltimev.setForeground(new java.awt.Color(255, 255, 255));
        jLabeltimev.setText("Time visitante:");
        jPanel1.add(jLabeltimev);
        jLabeltimev.setBounds(680, 340, 150, 30);

        jLabeltimevisitantedes.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabeltimevisitantedes.setForeground(new java.awt.Color(222, 216, 0));
        jPanel1.add(jLabeltimevisitantedes);
        jLabeltimevisitantedes.setBounds(830, 340, 220, 30);

        jLabelFundoAposta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelFundoAposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/fundo_aposta_1.jpg"))); // NOI18N
        jPanel1.add(jLabelFundoAposta);
        jLabelFundoAposta.setBounds(-30, 0, 1170, 620);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 480, 110, 50);

        jComboBoxPartidaId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBoxPartidaId);
        jComboBoxPartidaId.setBounds(50, 500, 70, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1120, 590);

        setSize(new java.awt.Dimension(1115, 613));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   //  Preenche com as dados das partidas
   public void PreencherJcomboboxPartida(){                
        int count = 1;
        
        sql = "select T.tnome, T.tid, P.pid, P.time_casa, P.time_visitante\n" +
                     "from Time T, Partida P\n" +
                     "where P.time_casa = T.tid or P.time_visitante = T.tid order by P.pid;";        
        
        connect.executaSql(sql);
        
        try {
            connect.rst.first();
            jComboBoxPartida.removeAllItems();  
            jComboBoxPartidaId.removeAllItems();
            do{        
                if(count <= 2){
                    
                    if(count == 1){
                        if(connect.rst.getInt("tid") == connect.rst.getInt("time_casa")){
                            timeCasa = connect.rst.getString("tnome");
                        }
                        if(connect.rst.getInt("tid") == connect.rst.getInt("time_visitante")){
                            timeVisitante = connect.rst.getString("tnome");
                        }
                    }
                                        
                    if(count == 2){                    
                        if(connect.rst.getInt("tid") == connect.rst.getInt("time_casa")){
                            timeCasa = connect.rst.getString("tnome");
                        }
                        if(connect.rst.getInt("tid") == connect.rst.getInt("time_visitante")){
                            timeVisitante = connect.rst.getString("tnome");
                        }
                        
                        jComboBoxPartida.addItem(timeCasa+" X "+timeVisitante+": P" + connect.rst.getInt("pid"));
                        jComboBoxPartidaId.addItem(String.valueOf(connect.rst.getInt("pid")));
                        count = 0;                                                                                       
                    }                   
                }       
                    count++;                    
            }while(connect.rst.next());
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Form_CadastroPartida.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao preencher o jComboBox de time: " + "\n"+ ex.getMessage());
        }        
    }    
    
    public ImageIcon criarImageIcon(String caminho, String descricao) {
        java.net.URL imgURL = getClass().getResource(caminho);
        if (imgURL != null) {
                return new ImageIcon(imgURL, descricao);
        } else {    
                return null;
        }
    }
         
    public void escolherPartida(){
        int count = 1; 
        int count2 = 0; 
        int time_casa, time_visitante;       
        idPartida = -1;        
        if(count == 1){
            if(jComboBoxPartida.getSelectedIndex() != -1){                            
                if(jComboBoxPartidaId.getItemAt((jComboBoxPartida.getSelectedIndex())) != null ){                        
                    try {
                        idPartida = Integer.parseInt(jComboBoxPartidaId.getItemAt((jComboBoxPartida.getSelectedIndex())));
                        sql = "SELECT tid  FROM time_relacao_partida WHERE pid = "+idPartida+";";
                        
                        connect.executaSql(sql);                    

                        while(connect.rst.next()){
                            count2++;
                            if(count2 == 1){
                                tid1 = connect.rst.getInt("tid");
                            }
                            if(count2 == 2){
                                tid2 = connect.rst.getInt("tid");
                                count2 = 0;
                            }
                        }                                                  

                    } catch (SQLException ex) {
                          Logger.getLogger(Form_CadastroAposta.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    sql = "SELECT time_casa FROM partida WHERE pid = "+idPartida+";";
                    connect.executaSql(sql);

                    try {                    
                        connect.rst.first();
                        if(tid1 == connect.rst.getInt("time_casa")){                        
                            sql = "SELECT imagem, tnome  FROM time WHERE tid = "+tid1+";";
                            connect.executaSql(sql);
                            connect.rst.first();                                                    
                            ManipularImagem.exibiImagemLabel(connect.rst.getBytes("imagem"), jLabelTimeCasa);
                            jLabeltimecasades.setText(connect.rst.getString("tnome"));                                                    
                        }else{
                            if(tid2 == connect.rst.getInt("time_casa")){                          
                                sql = "SELECT imagem, tnome  FROM time WHERE tid = "+tid2+";";
                                connect.executaSql(sql);
                                connect.rst.first();                                                        
                                ManipularImagem.exibiImagemLabel(connect.rst.getBytes("imagem"), jLabelTimeCasa);
                                jLabeltimecasades.setText(connect.rst.getString("tnome"));                                                 
                            }                        
                        } 
                    } catch (SQLException ex) {
                      Logger.getLogger(Form_CadastroAposta.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    try {                    
                        sql = "SELECT time_visitante FROM partida WHERE pid = "+idPartida+";";
                        connect.executaSql(sql);
                        connect.rst.first();                    
                        if(tid1 == connect.rst.getInt("time_visitante")){                        
                            sql = "SELECT imagem, tnome  FROM time WHERE tid = "+tid1+";";
                            connect.executaSql(sql);
                            connect.rst.first();                                                
                            ManipularImagem.exibiImagemLabel(connect.rst.getBytes("imagem"), jLabelTimeVisitante);
                            jLabeltimevisitantedes.setText(connect.rst.getString("tnome"));                                                    
                        }else{
                            if(tid2 == connect.rst.getInt("time_visitante")){                            
                                sql = "SELECT imagem, tnome  FROM time WHERE tid = "+tid2+";";
                                connect.executaSql(sql);
                                connect.rst.first();                                                    
                                ManipularImagem.exibiImagemLabel(connect.rst.getBytes("imagem"), jLabelTimeVisitante);
                                jLabeltimevisitantedes.setText(connect.rst.getString("tnome"));                                             
                            }
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(Form_CadastroAposta.class.getName()).log(Level.SEVERE, null, ex);
                    }                                
                }                     
            }
          count++;        
        }                    
    }
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
          connect.disconect();
    }//GEN-LAST:event_formWindowClosed

    private void jComboBoxPartidaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxPartidaItemStateChanged
        escolherPartida();
    }//GEN-LAST:event_jComboBoxPartidaItemStateChanged

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        jTextFieldQtdTimeCasa.setEnabled(false);
        jTextFieldQtdTimeVisitante.setEnabled(false);
        jComboBoxPartida.setEnabled(false);
        jButtonNew.setEnabled(true);
        jButtonCancel.setEnabled(false);
        jButtonSave.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        if(flag == 1){
            if(!jTextFieldQtdTimeCasa.getText().equals("") && !jTextFieldQtdTimeVisitante.getText().equals("")){
                apostaPojo.setUid(uid);
                apostaPojo.setPontos_usuario(0);
                apostaPojo.setPalpite_gols_time_casa(Integer.parseInt(jTextFieldQtdTimeCasa.getText().trim()));
                apostaPojo.setPalpite_gols_time_visitante(Integer.parseInt(jTextFieldQtdTimeVisitante.getText().trim()));                
                apostaPojo.setPid(idPartida);
                
                if(Integer.parseInt(jTextFieldQtdTimeCasa.getText().trim()) ==  Integer.parseInt(jTextFieldQtdTimeVisitante.getText().trim())){
                    apostaPojo.setEmpate(true);
                }else{
                    apostaPojo.setEmpate(false);
                }
                // Salva a aposta no BD
                apostaDao.salvar(apostaPojo);                               
                
                jButtonCancel.setEnabled(false);
                jButtonSave.setEnabled(false);
                jButtonNew.setEnabled(true);               
                
                jTextFieldQtdTimeCasa.setText("");
                jTextFieldQtdTimeVisitante.setText("");
                jComboBoxPartida.setSelectedIndex(0);
                
                jTextFieldQtdTimeCasa.setEnabled(false);
                jTextFieldQtdTimeVisitante.setEnabled(false);
                jComboBoxPartida.setEnabled(false);
            }else{
                if(!jTextFieldQtdTimeCasa.getText().equals("") && jTextFieldQtdTimeVisitante.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Preencha o palpite de gols para o time visitante");
                    jTextFieldQtdTimeVisitante.requestFocus();
                }
                if(jTextFieldQtdTimeCasa.getText().equals("") && !jTextFieldQtdTimeVisitante.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Preencha o palpite de gols para o time da casa");
                    jTextFieldQtdTimeCasa.requestFocus();
                }
                if(jTextFieldQtdTimeCasa.getText().equals("") && jTextFieldQtdTimeVisitante.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                    jTextFieldQtdTimeCasa.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        flag = 1;
        jTextFieldQtdTimeCasa.setEnabled(true);
        jTextFieldQtdTimeVisitante.setEnabled(true);
        jComboBoxPartida.setEnabled(true);
        jButtonNew.setEnabled(false);
        jButtonSave.setEnabled(true);
        jButtonCancel.setEnabled(true);       
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jTextFieldQtdTimeCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQtdTimeCasaKeyTyped
        int k = evt.getKeyChar();
        if((!(k > 47 && k < 58))) {            
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);             
         } 
    }//GEN-LAST:event_jTextFieldQtdTimeCasaKeyTyped

    private void jTextFieldQtdTimeVisitanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQtdTimeVisitanteKeyTyped
        int k = evt.getKeyChar();
        if((!(k > 47 && k < 58))) {            
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);             
         } 
    }//GEN-LAST:event_jTextFieldQtdTimeVisitanteKeyTyped
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {                
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_CadastroTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }     
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Form_CadastroAposta(uid).setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxPartida;
    private javax.swing.JComboBox<String> jComboBoxPartidaId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBetHunch;
    private javax.swing.JLabel jLabelBetHunch1;
    private javax.swing.JLabel jLabelDescricaoTimeCasa;
    private javax.swing.JLabel jLabelFundoAposta;
    private javax.swing.JLabel jLabelLogoUser;
    private javax.swing.JLabel jLabelTeamCasa;
    private javax.swing.JLabel jLabelTimeCasa;
    private javax.swing.JLabel jLabelTimeVisitante;
    private javax.swing.JLabel jLabelX;
    private javax.swing.JLabel jLabeltimecasades;
    private javax.swing.JLabel jLabeltimev;
    private javax.swing.JLabel jLabeltimevisitantedes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldQtdTimeCasa;
    private javax.swing.JTextField jTextFieldQtdTimeVisitante;
    // End of variables declaration//GEN-END:variables
}
