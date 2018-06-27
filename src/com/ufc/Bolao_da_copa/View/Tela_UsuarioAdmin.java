package com.ufc.Bolao_da_copa.View;

import com.ufc.Bolao_da_copa.Bolao_da_Copa.ConnectionFactory;
import com.ufc.Bolao_da_copa.Pojo.Hora;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author randel
 */
public class Tela_UsuarioAdmin extends javax.swing.JFrame {
    static int uid ; 
    ConnectionFactory connnect = new ConnectionFactory();
    Date date;
    DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);    
        
    public Tela_UsuarioAdmin(int uid) {
        Tela_UsuarioAdmin.uid = uid;
        connnect.connection();
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
        jInternalFrameAdmin = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButtonVisualizarGanhadores = new javax.swing.JButton();
        jButtonUserAdminAdmin = new javax.swing.JButton();
        jButtonUserAdminTeam = new javax.swing.JButton();
        jButtonUserAdminMatch = new javax.swing.JButton();
        jLabelDescriptionProgram = new javax.swing.JLabel();
        jLabelUserAdminDescription2 = new javax.swing.JLabel();
        jLabelUserAdminDescription = new javax.swing.JLabel();
        jButtonPartidasTime = new javax.swing.JButton();
        jLabelFundo2 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabelNomeUsuario = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelFundo1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUserAdminCadaster = new javax.swing.JMenu();
        jMenuItemUserAdminTeam = new javax.swing.JMenuItem();
        jMenuItemUserAdminMatch = new javax.swing.JMenuItem();
        jMenuItemUserAdminAdmin = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuUserAdminOptions = new javax.swing.JMenu();
        jMenuItemUserAdminExit = new javax.swing.JMenuItem();
        jMenuItemUserAdminInitial = new javax.swing.JMenuItem();
        jMenuItemLogin = new javax.swing.JMenuItem();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrameAdmin.setClosable(true);
        jInternalFrameAdmin.setTitle("Bem Vindo!");
        jInternalFrameAdmin.setFocusCycleRoot(false);
        jInternalFrameAdmin.setOpaque(true);
        try {
            jInternalFrameAdmin.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        jInternalFrameAdmin.setVerifyInputWhenFocusTarget(false);
        jInternalFrameAdmin.setVisible(true);

        jPanel1.setBackground(new java.awt.Color(213, 209, 239));
        jPanel1.setLayout(null);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel5.setLayout(null);

        jButtonVisualizarGanhadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/ganhadores_1.png"))); // NOI18N
        jButtonVisualizarGanhadores.setToolTipText("Ganhador(es)");
        jButtonVisualizarGanhadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarGanhadoresActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonVisualizarGanhadores);
        jButtonVisualizarGanhadores.setBounds(360, 290, 250, 180);

        jButtonUserAdminAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/usuario_admin2.png"))); // NOI18N
        jButtonUserAdminAdmin.setToolTipText("Usuário Administrador");
        jButtonUserAdminAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUserAdminAdminActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonUserAdminAdmin);
        jButtonUserAdminAdmin.setBounds(690, 80, 250, 180);

        jButtonUserAdminTeam.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jButtonUserAdminTeam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/icone_time2.png"))); // NOI18N
        jButtonUserAdminTeam.setToolTipText("Time");
        jButtonUserAdminTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUserAdminTeamActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonUserAdminTeam);
        jButtonUserAdminTeam.setBounds(30, 80, 250, 180);

        jButtonUserAdminMatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/partida2.png"))); // NOI18N
        jButtonUserAdminMatch.setToolTipText("Partida");
        jButtonUserAdminMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUserAdminMatchActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonUserAdminMatch);
        jButtonUserAdminMatch.setBounds(360, 80, 250, 180);

        jLabelDescriptionProgram.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        jLabelDescriptionProgram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDescriptionProgram.setText("Módulo de Gerenciamento do Bolão da Copa");
        jPanel5.add(jLabelDescriptionProgram);
        jLabelDescriptionProgram.setBounds(220, 0, 590, 40);

        jLabelUserAdminDescription2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelUserAdminDescription2.setText("Visualisar:");
        jPanel5.add(jLabelUserAdminDescription2);
        jLabelUserAdminDescription2.setBounds(30, 270, 100, 17);

        jLabelUserAdminDescription.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelUserAdminDescription.setText("Cadastro de:");
        jPanel5.add(jLabelUserAdminDescription);
        jLabelUserAdminDescription.setBounds(30, 50, 100, 17);

        jButtonPartidasTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/binocular.png"))); // NOI18N
        jButtonPartidasTime.setToolTipText("Partidas do time");
        jButtonPartidasTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPartidasTimeActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonPartidasTime);
        jButtonPartidasTime.setBounds(30, 290, 250, 180);

        jLabelFundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/fundo_azul_05_02.jpg"))); // NOI18N
        jLabelFundo2.setText("jLabel1");
        jPanel5.add(jLabelFundo2);
        jLabelFundo2.setBounds(0, 0, 980, 480);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 0, 990, 480);

        jInternalFrameAdmin.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jInternalFrameAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1000, 510));

        jLabel.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel.setText("Nome: ");
        getContentPane().add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 90, 30));

        jLabelNomeUsuario.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        getContentPane().add(jLabelNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 240, 30));

        jLabelData.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        getContentPane().add(jLabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 180, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel1.setText("Data:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, 110, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel2.setText("Hora:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 540, 60, 30));

        jLabelHora.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        getContentPane().add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 540, 120, 30));

        jLabelFundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/fundo04-02.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 600));

        jMenuBar1.setBackground(new java.awt.Color(242, 239, 239));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setOpaque(false);

        jMenuUserAdminCadaster.setText("Cadastrar");

        jMenuItemUserAdminTeam.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemUserAdminTeam.setText("Time");
        jMenuItemUserAdminTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUserAdminTeamActionPerformed(evt);
            }
        });
        jMenuUserAdminCadaster.add(jMenuItemUserAdminTeam);

        jMenuItemUserAdminMatch.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemUserAdminMatch.setText("Partida");
        jMenuItemUserAdminMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUserAdminMatchActionPerformed(evt);
            }
        });
        jMenuUserAdminCadaster.add(jMenuItemUserAdminMatch);

        jMenuItemUserAdminAdmin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemUserAdminAdmin.setText("Administrador");
        jMenuItemUserAdminAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUserAdminAdminActionPerformed(evt);
            }
        });
        jMenuUserAdminCadaster.add(jMenuItemUserAdminAdmin);

        jMenuBar1.add(jMenuUserAdminCadaster);

        jMenu1.setText("Visualizar");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Ganhadores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Partidas do time");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenuUserAdminOptions.setText("Opções");

        jMenuItemUserAdminExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemUserAdminExit.setText("Sair");
        jMenuItemUserAdminExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUserAdminExitActionPerformed(evt);
            }
        });
        jMenuUserAdminOptions.add(jMenuItemUserAdminExit);

        jMenuItemUserAdminInitial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemUserAdminInitial.setText("Tela Inicial");
        jMenuItemUserAdminInitial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUserAdminInitialActionPerformed(evt);
            }
        });
        jMenuUserAdminOptions.add(jMenuItemUserAdminInitial);

        jMenuItemLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemLogin.setText("Tela Login");
        jMenuItemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLoginActionPerformed(evt);
            }
        });
        jMenuUserAdminOptions.add(jMenuItemLogin);

        jMenuBar1.add(jMenuUserAdminOptions);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1047, 643));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemUserAdminMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUserAdminMatchActionPerformed
      Form_CadastroPartida formPartida = new Form_CadastroPartida();
      formPartida.setVisible(true);
    }//GEN-LAST:event_jMenuItemUserAdminMatchActionPerformed
    
    private void jMenuItemUserAdminAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUserAdminAdminActionPerformed
        Form_CadastroUsuario formUsuario = new Form_CadastroUsuario();
        formUsuario.jLabelIsAdmin.setText("1");
        formUsuario.setVisible(true);        
    }//GEN-LAST:event_jMenuItemUserAdminAdminActionPerformed

    private void jMenuItemUserAdminTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUserAdminTeamActionPerformed
        Form_CadastroTime formTime = new Form_CadastroTime();
        formTime.setVisible(true);
    }//GEN-LAST:event_jMenuItemUserAdminTeamActionPerformed

    private void jMenuItemUserAdminInitialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUserAdminInitialActionPerformed
        jInternalFrameAdmin.dispose();
        jInternalFrameAdmin.setVisible(true);
    }//GEN-LAST:event_jMenuItemUserAdminInitialActionPerformed

    private void jMenuItemUserAdminExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUserAdminExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemUserAdminExitActionPerformed

    private void jMenuItemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLoginActionPerformed
        Tela_Login tela_login = new Tela_Login();
        tela_login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemLoginActionPerformed

    private void jButtonUserAdminTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserAdminTeamActionPerformed
        Form_CadastroTime formTime = new Form_CadastroTime();
        formTime.setVisible(true);
    }//GEN-LAST:event_jButtonUserAdminTeamActionPerformed

    private void jButtonUserAdminMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserAdminMatchActionPerformed
      Form_CadastroPartida formPartida = new Form_CadastroPartida();
      formPartida.setVisible(true);
    }//GEN-LAST:event_jButtonUserAdminMatchActionPerformed

    private void jButtonUserAdminAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserAdminAdminActionPerformed
        Form_CadastroUsuario formUsuario = new Form_CadastroUsuario();
        formUsuario.jLabelIsAdmin.setText("1");
        formUsuario.setVisible(true);        
    }//GEN-LAST:event_jButtonUserAdminAdminActionPerformed

    private void jButtonVisualizarGanhadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarGanhadoresActionPerformed
        Tela_ganhadores tela_ganhadores = new Tela_ganhadores();
        tela_ganhadores.setVisible(true);
    }//GEN-LAST:event_jButtonVisualizarGanhadoresActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Tela_ganhadores tela_ganhadores = new Tela_ganhadores();
        tela_ganhadores.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        Hora mostrarHora = new Hora();
        mostrarHora.lerHora();        
        jLabelHora.setText(mostrarHora.getHora());
    }//GEN-LAST:event_timer1OnTime

    private void jButtonPartidasTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPartidasTimeActionPerformed
        Tela_timePartida tela_timePartida = new Tela_timePartida();
        tela_timePartida.setVisible(true);
    }//GEN-LAST:event_jButtonPartidasTimeActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Tela_timePartida tela_timePartida = new Tela_timePartida();
        tela_timePartida.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
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
            java.util.logging.Logger.getLogger(Tela_UsuarioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tela_UsuarioAdmin(uid).setVisible(true);
        });
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPartidasTime;
    private javax.swing.JButton jButtonUserAdminAdmin;
    private javax.swing.JButton jButtonUserAdminMatch;
    private javax.swing.JButton jButtonUserAdminTeam;
    private javax.swing.JButton jButtonVisualizarGanhadores;
    private javax.swing.JInternalFrame jInternalFrameAdmin;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelDescriptionProgram;
    private javax.swing.JLabel jLabelFundo1;
    private javax.swing.JLabel jLabelFundo2;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JLabel jLabelUserAdminDescription;
    private javax.swing.JLabel jLabelUserAdminDescription2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JMenuItem jMenuItemUserAdminAdmin;
    private javax.swing.JMenuItem jMenuItemUserAdminExit;
    private javax.swing.JMenuItem jMenuItemUserAdminInitial;
    private javax.swing.JMenuItem jMenuItemUserAdminMatch;
    private javax.swing.JMenuItem jMenuItemUserAdminTeam;
    private javax.swing.JMenu jMenuUserAdminCadaster;
    private javax.swing.JMenu jMenuUserAdminOptions;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables
}