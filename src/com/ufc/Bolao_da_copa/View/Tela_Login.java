package com.ufc.Bolao_da_copa.View;

import com.ufc.Bolao_da_copa.Dao.UsuarioDao;
import com.ufc.Bolao_da_copa.Pojo.Usuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author randel
 */
public class Tela_Login extends javax.swing.JFrame {
    String sql = "";    
    Usuario usuarioPojo = new Usuario();
    UsuarioDao usuarioDao = new UsuarioDao();
    boolean verificar = false;
    int uid;
    /**
     * Creates new form Tela_Login
     */
    public Tela_Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator5 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelLogoUser = new javax.swing.JLabel();
        jLabelFundoLilas = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelDescription = new javax.swing.JLabel();
        jLabelDescription1 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabelLogin = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordFieldLogin = new javax.swing.JPasswordField();
        jButtonEnter = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 80, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 160, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 210, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/bola_02.png"))); // NOI18N
        jLabel5.setText("jLabel1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 100, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/bola_02.png"))); // NOI18N
        jLabel4.setText("jLabel1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 100, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/bola_02.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 100, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/bola_02.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 100, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/bola_02.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 100, 110));

        jLabelLogoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/usuario_02.png"))); // NOI18N
        getContentPane().add(jLabelLogoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 290, 260));

        jLabelFundoLilas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/Fundo_Login.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoLilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 400, 510));

        jPanel1.setBackground(new java.awt.Color(67, 19, 90));
        jPanel1.setLayout(null);

        jLabelDescription.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabelDescription.setForeground(new java.awt.Color(203, 134, 233));
        jLabelDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDescription.setText("Bolão da Copa ");
        jPanel1.add(jLabelDescription);
        jLabelDescription.setBounds(31, 5, 348, 56);

        jLabelDescription1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabelDescription1.setForeground(new java.awt.Color(203, 134, 233));
        jLabelDescription1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDescription1.setText("Login");
        jPanel1.add(jLabelDescription1);
        jLabelDescription1.setBounds(140, 66, 129, 56);

        jTextFieldLogin.setBackground(new java.awt.Color(67, 19, 90));
        jTextFieldLogin.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jTextFieldLogin.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldLogin.setBorder(null);
        jTextFieldLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldLoginFocusLost(evt);
            }
        });
        jPanel1.add(jTextFieldLogin);
        jTextFieldLogin.setBounds(90, 200, 260, 20);

        jLabelLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(203, 134, 233));
        jLabelLogin.setText("Login:");
        jPanel1.add(jLabelLogin);
        jLabelLogin.setBounds(30, 200, 60, 20);

        jLabelPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(203, 134, 233));
        jLabelPassword.setText("Senha:");
        jPanel1.add(jLabelPassword);
        jLabelPassword.setBounds(30, 270, 60, 20);

        jPasswordFieldLogin.setBackground(new java.awt.Color(67, 19, 90));
        jPasswordFieldLogin.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jPasswordFieldLogin.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordFieldLogin.setBorder(null);
        jPasswordFieldLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldLoginFocusLost(evt);
            }
        });
        jPanel1.add(jPasswordFieldLogin);
        jPasswordFieldLogin.setBounds(90, 270, 260, 20);

        jButtonEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/enter2.png"))); // NOI18N
        jButtonEnter.setText("Entrar");
        jButtonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterActionPerformed(evt);
            }
        });
        jButtonEnter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonEnterKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonEnter);
        jButtonEnter.setBounds(70, 350, 110, 40);

        jButtonRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/cadaster2.png"))); // NOI18N
        jButtonRegister.setText("Cadastrar-se");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        jButtonRegister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonRegisterKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonRegister);
        jButtonRegister.setBounds(210, 350, 140, 40);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(90, 290, 260, 20);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(90, 220, 260, 10);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 410, 500));

        setSize(new java.awt.Dimension(822, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void entrar(){                                           
        if(!jTextFieldLogin.getText().equals("") && !jPasswordFieldLogin.getText().equals("")){
            usuarioPojo.setLogin(jTextFieldLogin.getText().trim());
            usuarioPojo.setSenha(jPasswordFieldLogin.getText().trim());
            
            usuarioPojo = usuarioDao.login(usuarioPojo);
            
            if(!usuarioPojo.getUnome().equals("null")){
                if(usuarioPojo.getAdmin() == true){
                    Tela_UsuarioAdmin tela_usuarioAdmin;
                    tela_usuarioAdmin = new Tela_UsuarioAdmin(usuarioPojo.getUid());
                    tela_usuarioAdmin.setVisible(true);
                    this.dispose();
                }else{
                    if(usuarioPojo.getAdmin() == false){                        
                        Tela_Usuario tela_usuario = new Tela_Usuario(usuarioPojo.getUid());
                        tela_usuario.setVisible(true);
                        this.dispose();
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Login ou Senha incorreto!");                
            }
        }else{
                JOptionPane.showMessageDialog(null,"Preencha os campos!");                
        }                                                
    }
    
    private void jButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterActionPerformed
        entrar();
    }//GEN-LAST:event_jButtonEnterActionPerformed

    public void cadastrar(){
        Form_CadastroUsuario formUsuario = new Form_CadastroUsuario();        
        formUsuario.jLabelIsAdmin.setText("0");
        formUsuario.setVisible(true);      
    }
    
    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        cadastrar();
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButtonEnterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEnterKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){            
            entrar();
        }   
    }//GEN-LAST:event_jButtonEnterKeyPressed

    private void jButtonRegisterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonRegisterKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){            
            cadastrar();
        }   
    }//GEN-LAST:event_jButtonRegisterKeyPressed

    private void jTextFieldLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLoginFocusGained
        jTextFieldLogin.setBackground(new Color(80,23,108));                   
    }//GEN-LAST:event_jTextFieldLoginFocusGained

    private void jTextFieldLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLoginFocusLost
        jTextFieldLogin.setBackground(new Color(67,19,90));        
    }//GEN-LAST:event_jTextFieldLoginFocusLost

    private void jPasswordFieldLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldLoginFocusGained
        jPasswordFieldLogin.setBackground(new Color(80,23,108));            
    }//GEN-LAST:event_jPasswordFieldLoginFocusGained

    private void jPasswordFieldLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldLoginFocusLost
        jPasswordFieldLogin.setBackground(new Color(67,19,90));
    }//GEN-LAST:event_jPasswordFieldLoginFocusLost
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Splash sp = new Splash();
        sp.setVisible(true);
        
        for(int i = 0; i <= 100; i++){
            try {                
                Thread.sleep(100);
                sp.jLabelLoading.setText(i+"%");
                sp.jProgressBar1.setValue(i);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Tela_Login.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }        
        sp.dispose();
        
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
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tela_Login().setVisible(true);
        });        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelDescription1;
    private javax.swing.JLabel jLabelFundoLilas;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelLogoUser;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldLogin;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}