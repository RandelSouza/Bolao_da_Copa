package com.ufc.Bolao_da_copa.View;
// teste
import com.ufc.Bolao_da_copa.Bolao_da_Copa.ConnectionFactory;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
/**
 *
 * @author randel
 */
public class Tela_ganhadores extends javax.swing.JFrame {
    DefaultListModel dlm = new DefaultListModel();     
    ConnectionFactory connect = new ConnectionFactory();
    String sql = "";    
    int palpite_gols_casa, palpite_gols_visitante, pid;
    String time_casa, time_visitante, hora, data, estadio;
    DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
    
    public Tela_ganhadores() {
        connect.connection();
        initComponents();
        jListGanhador.setModel(dlm);
        dlm.removeAllElements();  
        preencherListaGanhadores();
    }
    
    private void recuperarResultado(){       
        try {
            sql = "SELECT * FROM aposta WHERE aid = '"+jComboBoxIdUserAposta.getItemAt(jListGanhador.getSelectedIndex())+"' ;";
            connect.executaSql(sql);
            
            if(connect.rst.first()){
                pid = connect.rst.getInt("pid");
                palpite_gols_casa = connect.rst.getInt("palpite_gols_time_casa");
                palpite_gols_visitante = connect.rst.getInt("palpite_gols_time_visitante");
            }
            
            sql = "SELECT T.tnome, P.hora, P.data_partida, P.estadio FROM partida P, time T WHERE pid = '"+pid+"' and T.tid = P.time_casa ;";
            connect.executaSql(sql);
            
            if(connect.rst.first()){
                time_casa = connect.rst.getString("tnome");                        
                hora = connect.rst.getString("hora");
                data = dateFormat.format(connect.rst.getDate("data_partida"));
                estadio = connect.rst.getString("estadio");
            }
            
            sql = "SELECT T.tnome FROM partida P, time T WHERE pid = '"+pid+"' and T.tid = P.time_visitante ;";
            connect.executaSql(sql);
            
            if(connect.rst.first()){
                time_visitante = connect.rst.getString("tnome");                        
            }
            
            jLabelPartida.setText("P"+pid);
            jLabelTimeCasa.setText(time_casa);
            jLabelTimeVisitante.setText(time_visitante);
            qtd_Casa.setText(String.valueOf(palpite_gols_casa));
            qtd_Visitante.setText(String.valueOf(palpite_gols_visitante));
            jLabelHora.setText(hora);
            jLabelData.setText(data);
            jLabelEstadio.setText(estadio);
        } catch (SQLException ex) {
            Logger.getLogger(Tela_ganhadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void preencherListaGanhadores(){
        sql = "SELECT DISTINCT(U.unome), P.pid, AP.aid " +
                "FROM Usuario U, Aposta AP, Partida P, Time T " +
                "WHERE U.uid = AP.uid AND P.pid = AP.pid AND AP.palpite_gols_time_visitante = P.qtd_gols_time_visitante " +
               "AND AP.palpite_gols_time_casa = P.qtd_gols_time_casa ORDER BY U.unome;";        
                        
        try {
            connect.executaSql(sql);                        
            if(connect.rst.first()){
                do{
                    dlm.addElement(connect.rst.getString("unome")+" : "+"P"+connect.rst.getString("pid"));
                    jComboBoxIdUserAposta.addItem(String.valueOf(connect.rst.getInt("aid")));
                }while(connect.rst.next());
            }                                
            } catch (SQLException ex) {
            Logger.getLogger(Tela_timePartida.class.getName()).log(Level.SEVERE, null, ex);
        }                        
    }            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListGanhador = new javax.swing.JList<>();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelDescrico2 = new javax.swing.JLabel();
        jLabelTrofeu2 = new javax.swing.JLabel();
        jLabelTrofeu1 = new javax.swing.JLabel();
        jLabelConfete1 = new javax.swing.JLabel();
        jLabelConfete2 = new javax.swing.JLabel();
        jLabelDescricoa3 = new javax.swing.JLabel();
        jLabelDPartida = new javax.swing.JLabel();
        jLabelPartida = new javax.swing.JLabel();
        jLabelTimeCasa = new javax.swing.JLabel();
        jLabelX = new javax.swing.JLabel();
        jLabelTimeVisitante = new javax.swing.JLabel();
        qtd_Visitante = new javax.swing.JLabel();
        qtd_Casa = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelEstadio = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();
        jComboBoxIdUserAposta = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jListGanhador.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jListGanhador.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListGanhador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jListGanhadorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jListGanhadorMouseReleased(evt);
            }
        });
        jListGanhador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jListGanhadorKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jListGanhador);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 420, 230));

        jLabelDescricao.setFont(new java.awt.Font("Arial", 0, 60)); // NOI18N
        jLabelDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDescricao.setText("Ganhadores");
        jPanel1.add(jLabelDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 490, 60));

        jLabelDescrico2.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabelDescrico2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDescrico2.setText("Nomes");
        jPanel1.add(jLabelDescrico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 420, 110));

        jLabelTrofeu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/Ganhador_1.png"))); // NOI18N
        jPanel1.add(jLabelTrofeu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 100, 152));

        jLabelTrofeu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/Ganhador_1.png"))); // NOI18N
        jPanel1.add(jLabelTrofeu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 100, 152));

        jLabelConfete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/confete_1.png"))); // NOI18N
        jLabelConfete1.setText("jLabel5");
        jPanel1.add(jLabelConfete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 330, 330));

        jLabelConfete2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/confete_1.png"))); // NOI18N
        jLabelConfete2.setText("jLabel5");
        jPanel1.add(jLabelConfete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 380, 330));

        jLabelDescricoa3.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabelDescricoa3.setText("Descrição:");
        jPanel1.add(jLabelDescricoa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 180, 40));

        jLabelDPartida.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabelDPartida.setText("Partida: ");
        jPanel1.add(jLabelDPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 70, 30));

        jLabelPartida.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jPanel1.add(jLabelPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 100, 30));

        jLabelTimeCasa.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabelTimeCasa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTimeCasa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabelTimeCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 160, 30));

        jLabelX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelX.setText("X");
        jLabelX.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabelX, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 50, 30));

        jLabelTimeVisitante.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabelTimeVisitante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTimeVisitante.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabelTimeVisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 180, 30));

        qtd_Visitante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qtd_Visitante.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(qtd_Visitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 40, 30));

        qtd_Casa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qtd_Casa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(qtd_Casa, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 40, 30));

        jLabelHora.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jPanel1.add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 120, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel2.setText("Hora da partida:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 110, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel1.setText("Data da partida:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 130, 30));

        jLabelData.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jPanel1.add(jLabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 150, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel3.setText("Estadio: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 110, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 750, 170));

        jLabelEstadio.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jPanel1.add(jLabelEstadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 150, 30));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/fundo_ganhador_1.jpg"))); // NOI18N
        jPanel1.add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 670));

        jPanel1.add(jComboBoxIdUserAposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 130, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(947, 709));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        connect.disconect();
    }//GEN-LAST:event_formWindowClosed

    private void jListGanhadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListGanhadorMousePressed
        recuperarResultado();
    }//GEN-LAST:event_jListGanhadorMousePressed

    private void jListGanhadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListGanhadorKeyReleased
        recuperarResultado();
    }//GEN-LAST:event_jListGanhadorKeyReleased

    private void jListGanhadorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListGanhadorMouseReleased
        recuperarResultado();
    }//GEN-LAST:event_jListGanhadorMouseReleased
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
            java.util.logging.Logger.getLogger(Tela_ganhadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tela_ganhadores().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxIdUserAposta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelConfete1;
    private javax.swing.JLabel jLabelConfete2;
    private javax.swing.JLabel jLabelDPartida;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelDescrico2;
    private javax.swing.JLabel jLabelDescricoa3;
    private javax.swing.JLabel jLabelEstadio;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelPartida;
    private javax.swing.JLabel jLabelTimeCasa;
    private javax.swing.JLabel jLabelTimeVisitante;
    private javax.swing.JLabel jLabelTrofeu1;
    private javax.swing.JLabel jLabelTrofeu2;
    private javax.swing.JLabel jLabelX;
    private javax.swing.JList<String> jListGanhador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel qtd_Casa;
    private javax.swing.JLabel qtd_Visitante;
    // End of variables declaration//GEN-END:variables
}
