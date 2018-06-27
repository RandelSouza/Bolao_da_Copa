package com.ufc.Bolao_da_copa.View;

import com.ufc.Bolao_da_copa.Bolao_da_Copa.ConnectionFactory;
import com.ufc.Bolao_da_copa.Dao.ApostaDao;
import com.ufc.Bolao_da_copa.Pojo.Aposta;
import com.ufc.Bolao_da_copa.Pojo.Tabela;
import com.ufc.Bolao_da_copa.Util.ManipularImagem;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
/**
 *
 * @author randel
 */
public final class Form_visualizar_excluir_aposta extends javax.swing.JFrame {
    ConnectionFactory connect = new ConnectionFactory();
    static int uid ;
    String aid, sql;
    int idPartida, tid1, tid2;
    int count2 = 0; 
    int time_casa, time_visitante;  
    ManipularImagem manipularImagem = new ManipularImagem();
    Aposta apostaPojo = new Aposta();
    ApostaDao apostaDao = new ApostaDao();
    /**
     * Creates new form Form_visualizar_excluir_aposta
     * @param uid
     */
    public Form_visualizar_excluir_aposta(int uid) {
        connect.connection();
        Form_visualizar_excluir_aposta.uid = uid;
        initComponents();     
        preencherTabela("SELECT AP.aid, AP.palpite_gols_time_casa, AP.palpite_gols_time_visitante, AP.pid " +
                        "FROM Aposta AP, partida_relacao_aposta PAP " +
                        "WHERE AP.pid = PAP.pid AND AP.aid = PAP.aid AND AP.uid ="+uid+" ;");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonCancel = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAposta = new javax.swing.JTable();
        jLabelTimeVisitante = new javax.swing.JLabel();
        jLabelX = new javax.swing.JLabel();
        jLabelTimeCasa = new javax.swing.JLabel();
        jLabelTimeCasaResult = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabelTimeVisitanteResult = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabeldesvisitante = new javax.swing.JLabel();
        jLabeldescasa = new javax.swing.JLabel();
        jLabelCasa = new javax.swing.JLabel();
        jLabelVisitante = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/cancel2.png"))); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.setEnabled(false);
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 120, 40));

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/delete2.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 600, 100, 40));

        jTableAposta.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jTableAposta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAposta.setGridColor(new java.awt.Color(153, 255, 255));
        jTableAposta.setSelectionBackground(new java.awt.Color(0, 204, 0));
        jTableAposta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableApostaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableApostaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableApostaMouseReleased(evt);
            }
        });
        jTableAposta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableApostaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAposta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 810, 260));

        jLabelTimeVisitante.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(jLabelTimeVisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 190, 130));

        jLabelX.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelX.setText("X");
        jPanel1.add(jLabelX, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 80, 70));

        jLabelTimeCasa.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(jLabelTimeCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 200, 130));

        jLabelTimeCasaResult.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelTimeCasaResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTimeCasaResult.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(jLabelTimeCasaResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 80, 70));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 340, 30));

        jLabelTimeVisitanteResult.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelTimeVisitanteResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTimeVisitanteResult.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(jLabelTimeVisitanteResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 80, 70));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/pesquisar2_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 110, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(157, 220, 141));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Visualizar/Excluir Aposta(s)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, -20, 670, 80));

        jLabeldesvisitante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabeldesvisitante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeldesvisitante.setText("Time Visitante:");
        jPanel1.add(jLabeldesvisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 200, 30));

        jLabeldescasa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabeldescasa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeldescasa.setText("Time Casa:");
        jPanel1.add(jLabeldescasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 200, 30));

        jLabelCasa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelCasa.setForeground(new java.awt.Color(229, 229, 38));
        jLabelCasa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 200, 30));

        jLabelVisitante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelVisitante.setForeground(new java.awt.Color(229, 229, 38));
        jLabelVisitante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelVisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 200, 30));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/fundo_veEx_1.jpg"))); // NOI18N
        jPanel1.add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1165, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        connect.disconect();
    }//GEN-LAST:event_formWindowClosed

    private void jTableApostaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableApostaMouseClicked
        try {
            recuperarTime();
        } catch (IOException ex) {
            Logger.getLogger(Form_visualizar_excluir_aposta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableApostaMouseClicked

    private void jTableApostaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableApostaMousePressed
        try {
            recuperarTime();
        } catch (IOException ex) {
            Logger.getLogger(Form_visualizar_excluir_aposta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableApostaMousePressed

    private void jTableApostaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableApostaKeyReleased
        try {
            recuperarTime();
        } catch (IOException ex) {
            Logger.getLogger(Form_visualizar_excluir_aposta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableApostaKeyReleased

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        apostaDao.excluir(apostaPojo);
        jLabelTimeCasa.setIcon(null);
        jLabelTimeVisitante.setIcon(null);
        jLabelTimeCasaResult.setText("");
        jLabelTimeVisitanteResult.setText("");
        jTableAposta.clearSelection();        
        
        preencherTabela("SELECT AP.aid, AP.palpite_gols_time_casa, AP.palpite_gols_time_visitante, AP.pid " +
                        "FROM Aposta AP, partida_relacao_aposta PAP " +
                        "WHERE AP.pid = PAP.pid AND AP.aid = PAP.aid AND AP.uid ="+uid+" ;");
        
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        jLabelTimeCasa.setIcon(null);
        jLabelTimeVisitante.setIcon(null);
        jLabelTimeCasaResult.setText("");
        jLabelTimeVisitanteResult.setText("");
        jTableAposta.clearSelection();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            buscarAposta();
        } catch (IOException ex) {
            Logger.getLogger(Form_visualizar_excluir_aposta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                buscarAposta();
            } catch (IOException ex) {
                Logger.getLogger(Form_visualizar_excluir_aposta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jTableApostaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableApostaMouseReleased
        try {
            recuperarTime();
        } catch (IOException ex) {
            Logger.getLogger(Form_visualizar_excluir_aposta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableApostaMouseReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        int k = evt.getKeyChar();
        if((!(k > 47 && k < 58))) {            
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);             
         } 
    }//GEN-LAST:event_jTextField1KeyTyped
                
    public void preencherTabela(String sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Palpite Gols Time Casa", "Palpite Gols Time Visitante", "Partida"};
        
        try {            
            connect.executaSql(sql);     
            boolean estado = connect.rst.first();
            
            if(estado){
                do{
                dados.add(new Object[]{connect.rst.getInt("aid"), connect.rst.getInt("palpite_gols_time_casa"), connect.rst.getInt("palpite_gols_time_visitante"), "P"+connect.rst.getInt("pid")});                       
                }while(connect.rst.next());
            }
                        
        } catch (SQLException ex) {
            Logger.getLogger(Form_CadastroTime.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela de Aposta");
        }                
        
        Tabela tabelaPojo = new Tabela(dados, colunas);
        jTableAposta.setModel(tabelaPojo);
        jTableAposta.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTableAposta.getColumnModel().getColumn(0).setResizable(false);
        jTableAposta.getColumnModel().getColumn(1).setPreferredWidth(242);
        jTableAposta.getColumnModel().getColumn(1).setResizable(false);
        jTableAposta.getColumnModel().getColumn(2).setPreferredWidth(242);
        jTableAposta.getColumnModel().getColumn(2).setResizable(false);
        jTableAposta.getColumnModel().getColumn(3).setPreferredWidth(220);
        jTableAposta.getColumnModel().getColumn(3).setResizable(false);
        
        jTableAposta.getTableHeader().setReorderingAllowed(false);
        jTableAposta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);       
        jTableAposta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }        
    
    public void buscarAposta() throws IOException{                
        aid = jTextField1.getText().trim();        
        
        try {                            
            connect.executaSql("SELECT * FROM Aposta WHERE aid='"+aid+"'");
            apostaPojo.setAid(Integer.parseInt(aid));
            boolean estado = connect.rst.first();
            
            if(estado){
                jLabelTimeCasaResult.setText(String.valueOf(connect.rst.getInt("palpite_gols_time_casa")));
                jLabelTimeVisitanteResult.setText(String.valueOf(connect.rst.getInt("palpite_gols_time_visitante")));

                try {
                        idPartida = connect.rst.getInt("pid");
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

                            InputStream input = new ByteArrayInputStream(connect.rst.getBytes("imagem"));

                            BufferedImage brf = ManipularImagem.setImagemDimensao(input, 300, 130);
                            byte[] img = ManipularImagem.getImgBytes(brf);                            
                            ManipularImagem.exibiImagemLabel(img, jLabelTimeCasa);
                            jLabelCasa.setText(connect.rst.getString("tnome"));
                            //jLabeltimecasades.setText(connect.rst.getString("tnome"));                                                    
                        }else{
                            if(tid2 == connect.rst.getInt("time_casa")){                          
                                sql = "SELECT imagem, tnome  FROM time WHERE tid = "+tid2+";";
                                connect.executaSql(sql);
                                connect.rst.first();                                                        


                                InputStream input = new ByteArrayInputStream(connect.rst.getBytes("imagem"));

                                BufferedImage brf = ManipularImagem.setImagemDimensao(input, 300, 130);
                                byte[] img = ManipularImagem.getImgBytes(brf);      
                                ManipularImagem.exibiImagemLabel(img, jLabelTimeCasa);
                                jLabelCasa.setText(connect.rst.getString("tnome"));
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
                            InputStream input = new ByteArrayInputStream(connect.rst.getBytes("imagem"));

                            BufferedImage brf = ManipularImagem.setImagemDimensao(input, 300, 130);
                            byte[] img = ManipularImagem.getImgBytes(brf);      
                            ManipularImagem.exibiImagemLabel(img, jLabelTimeVisitante);
                            jLabelVisitante.setText(connect.rst.getString("tnome"));
                            //jLabeltimevisitantedes.setText(connect.rst.getString("tnome"));                                                    
                        }else{
                            if(tid2 == connect.rst.getInt("time_visitante")){                            
                                sql = "SELECT imagem, tnome  FROM time WHERE tid = "+tid2+";";
                                connect.executaSql(sql);
                                connect.rst.first();                                                    
                                InputStream input = new ByteArrayInputStream(connect.rst.getBytes("imagem"));

                                BufferedImage brf = ManipularImagem.setImagemDimensao(input, 300, 130);
                                byte[] img = ManipularImagem.getImgBytes(brf);      
                                ManipularImagem.exibiImagemLabel(img, jLabelTimeVisitante);
                                jLabelVisitante.setText(connect.rst.getString("tnome"));
                            }
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Form_CadastroAposta.class.getName()).log(Level.SEVERE, null, ex);
                    }                                                                                                                
                jButtonExcluir.setEnabled(true);
                jButtonCancel.setEnabled(true);
            }        
        } catch (SQLException ex) {
            Logger.getLogger(Form_CadastroTime.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possivél buscar os dados!");
        }                            
    }
    
    public void recuperarTime() throws IOException{        
        if(jTableAposta.getSelectedRow() != -1){
            try {                    
                aid = ""+jTableAposta.getValueAt(jTableAposta.getSelectedRow(), 0);                
                connect.executaSql("SELECT * FROM Aposta WHERE aid='"+aid+"'");
                apostaPojo.setAid(Integer.parseInt(aid));
                connect.rst.first();
                
                jLabelTimeCasaResult.setText(String.valueOf(connect.rst.getInt("palpite_gols_time_casa")));
                jLabelTimeVisitanteResult.setText(String.valueOf(connect.rst.getInt("palpite_gols_time_visitante")));
                
                try {
                        idPartida = connect.rst.getInt("pid");
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
                            
                            InputStream input = new ByteArrayInputStream(connect.rst.getBytes("imagem"));
                                                        
                            BufferedImage brf = ManipularImagem.setImagemDimensao(input, 300, 130);
                            byte[] img = ManipularImagem.getImgBytes(brf);                            
                            ManipularImagem.exibiImagemLabel(img, jLabelTimeCasa);
                            jLabelCasa.setText(connect.rst.getString("tnome"));
                            //jLabeltimecasades.setText(connect.rst.getString("tnome"));                                                    
                        }else{
                            if(tid2 == connect.rst.getInt("time_casa")){                          
                                sql = "SELECT imagem, tnome  FROM time WHERE tid = "+tid2+";";
                                connect.executaSql(sql);
                                connect.rst.first();                                                        
                                
                                
                                InputStream input = new ByteArrayInputStream(connect.rst.getBytes("imagem"));
                                                        
                                BufferedImage brf = ManipularImagem.setImagemDimensao(input, 300, 130);
                                byte[] img = ManipularImagem.getImgBytes(brf);      
                                ManipularImagem.exibiImagemLabel(img, jLabelTimeCasa);
                                jLabelCasa.setText(connect.rst.getString("tnome"));
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
                            InputStream input = new ByteArrayInputStream(connect.rst.getBytes("imagem"));

                            BufferedImage brf = ManipularImagem.setImagemDimensao(input, 300, 130);
                            byte[] img = ManipularImagem.getImgBytes(brf);      
                            ManipularImagem.exibiImagemLabel(img, jLabelTimeVisitante);
                            jLabelVisitante.setText(connect.rst.getString("tnome"));                           
                        }else{
                            if(tid2 == connect.rst.getInt("time_visitante")){                            
                                sql = "SELECT imagem, tnome  FROM time WHERE tid = "+tid2+";";
                                connect.executaSql(sql);
                                connect.rst.first();                                                    
                                InputStream input;
                                input = new ByteArrayInputStream(connect.rst.getBytes("imagem"));

                                BufferedImage brf = ManipularImagem.setImagemDimensao(input, 300, 130);
                                byte[] img = ManipularImagem.getImgBytes(brf);      
                                ManipularImagem.exibiImagemLabel(img, jLabelTimeVisitante);
                                jLabelVisitante.setText(connect.rst.getString("tnome"));
                            }
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Form_CadastroAposta.class.getName()).log(Level.SEVERE, null, ex);
                    }                                                                                
                    
                jButtonExcluir.setEnabled(true);
                jButtonCancel.setEnabled(true);
            } catch (SQLException ex) {
                Logger.getLogger(Form_CadastroTime.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Não foi possivél buscar os dados!");
            }                        
        }    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_visualizar_excluir_aposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Form_visualizar_excluir_aposta(uid).setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCasa;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelTimeCasa;
    private javax.swing.JLabel jLabelTimeCasaResult;
    private javax.swing.JLabel jLabelTimeVisitante;
    private javax.swing.JLabel jLabelTimeVisitanteResult;
    private javax.swing.JLabel jLabelVisitante;
    private javax.swing.JLabel jLabelX;
    private javax.swing.JLabel jLabeldescasa;
    private javax.swing.JLabel jLabeldesvisitante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAposta;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}