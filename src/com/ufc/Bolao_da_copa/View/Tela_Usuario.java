package com.ufc.Bolao_da_copa.View;

import com.ufc.Bolao_da_copa.Bolao_da_Copa.ConnectionFactory;
import com.ufc.Bolao_da_copa.Pojo.Hora;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tela_Usuario extends javax.swing.JFrame {
    static int uid;
    ConnectionFactory connnect = new ConnectionFactory();
    Date date;
    DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        
    public Tela_Usuario(int uid) {
        connnect.connection();
        Tela_Usuario.uid = uid;
        initComponents();
        obterNomeUsuario();
        connnect.disconect();
        
        date = new Date();
        jLabelData.setText(dateFormat.format(date));
        
        Hora mostrarHora = new Hora();
        mostrarHora.lerHora();        
        jLabelHora.setText(mostrarHora.getHora());        
        timer1.start();
    }

    private void obterNomeUsuario(){
        try {
            connnect.executaSql("SELECT unome FROM usuario WHERE uid = " +uid+" ;");
            if(connnect.rst.first()){
                jLabelNomeUsuario.setText(connnect.rst.getString("unome").trim());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Tela_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButtonVisualizarGanhadores = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonFazerAposta = new javax.swing.JButton();
        jButtonExluiVisualizar = new javax.swing.JButton();
        jButtonPartidasTime = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelNomeUsuario = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelFundoUsu = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuView = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonVisualizarGanhadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/ganhadores_1.png"))); // NOI18N
        jButtonVisualizarGanhadores.setToolTipText("Ganhador(es)");
        jButtonVisualizarGanhadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarGanhadoresActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButtonVisualizarGanhadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 250, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/sorte_1.png"))); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 100, 100));

        jButtonFazerAposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/fazer_aposta_1.png"))); // NOI18N
        jButtonFazerAposta.setToolTipText("Fazer Aposta");
        jButtonFazerAposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFazerApostaActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButtonFazerAposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 250, 180));

        jButtonExluiVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/visua_1.png"))); // NOI18N
        jButtonExluiVisualizar.setToolTipText("Visualizar/Excluir Aposta");
        jButtonExluiVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExluiVisualizarActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButtonExluiVisualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 250, 180));

        jButtonPartidasTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/binocular.png"))); // NOI18N
        jButtonPartidasTime.setToolTipText("Partidas do time");
        jButtonPartidasTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPartidasTimeActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButtonPartidasTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 250, 180));

        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Bolão da Copa Módulo Usuário");
        jInternalFrame1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 420, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/fundo_inter_1.jpg"))); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 420));

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1000, 450));

        jLabelNomeUsuario.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        getContentPane().add(jLabelNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 380, 30));

        jLabelNome.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabelNome.setText("Nome:");
        getContentPane().add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 80, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel4.setText("Data:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 110, 30));

        jLabelData.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        getContentPane().add(jLabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 180, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel5.setText("Hora:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, 90, 30));

        jLabelHora.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        getContentPane().add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 520, 140, 30));

        jLabelFundoUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/fundo_usu_1.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 570));

        jMenuBar1.setBackground(new java.awt.Color(242, 239, 239));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setOpaque(false);

        jMenu1.setText("Aposta");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Fazer");
        jMenuItem6.setToolTipText("Fazer uma aposta");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Visualizar/Excluir");
        jMenuItem7.setToolTipText("Excluir aposta(s)");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenuView.setText("Listar");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Ganhador(s)");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuView.add(jMenuItem5);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Partidas do Time");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenuView.add(jMenuItem10);

        jMenuBar1.add(jMenuView);

        jMenu2.setText("Opções");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Tela Inicial");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Tela Login");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Sair");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1101, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Tela_Login telaLogin = new Tela_Login();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Form_CadastroAposta formCadastroAposta = new Form_CadastroAposta(uid);
        formCadastroAposta.setVisible(true);        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Form_visualizar_excluir_aposta formVisualizarExcluir = new Form_visualizar_excluir_aposta(uid);
        formVisualizarExcluir.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButtonFazerApostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFazerApostaActionPerformed
        Form_CadastroAposta formCadastroAposta = new Form_CadastroAposta(uid);
        formCadastroAposta.setVisible(true);        
    }//GEN-LAST:event_jButtonFazerApostaActionPerformed

    private void jButtonExluiVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExluiVisualizarActionPerformed
        Form_visualizar_excluir_aposta formVisualizarExcluir = new Form_visualizar_excluir_aposta(uid);
        formVisualizarExcluir.setVisible(true);
    }//GEN-LAST:event_jButtonExluiVisualizarActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jInternalFrame1.dispose();
        jInternalFrame1.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Tela_timePartida tela_timePartida = new Tela_timePartida();
        tela_timePartida.setVisible(true); 
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jButtonPartidasTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPartidasTimeActionPerformed
        Tela_timePartida tela_timePartida = new Tela_timePartida();
        tela_timePartida.setVisible(true); 
    }//GEN-LAST:event_jButtonPartidasTimeActionPerformed

    private void jButtonVisualizarGanhadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarGanhadoresActionPerformed
        Tela_ganhadores tela_ganhadores = new Tela_ganhadores();
        tela_ganhadores.setVisible(true);
    }//GEN-LAST:event_jButtonVisualizarGanhadoresActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        Hora mostrarHora = new Hora();
        mostrarHora.lerHora();        
        jLabelHora.setText(mostrarHora.getHora());        
        timer1.start();
    }//GEN-LAST:event_timer1OnTime

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Tela_ganhadores tela_ganhadores = new Tela_ganhadores();
        tela_ganhadores.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
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
            java.util.logging.Logger.getLogger(Tela_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tela_Usuario(uid).setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExluiVisualizar;
    private javax.swing.JButton jButtonFazerAposta;
    private javax.swing.JButton jButtonPartidasTime;
    private javax.swing.JButton jButtonVisualizarGanhadores;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelFundoUsu;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jMenuView;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables
}