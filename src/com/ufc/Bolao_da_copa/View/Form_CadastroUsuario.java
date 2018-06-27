package com.ufc.Bolao_da_copa.View;

import com.ufc.Bolao_da_copa.Bolao_da_Copa.ConnectionFactory;
import com.ufc.Bolao_da_copa.Dao.UsuarioDao;
import com.ufc.Bolao_da_copa.Pojo.Usuario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author randel
 */
public class Form_CadastroUsuario extends javax.swing.JFrame {
    ConnectionFactory connect = new ConnectionFactory();
    Usuario usuarioPojo = new Usuario();
    UsuarioDao usuarioDao = new UsuarioDao();   
    
    public Form_CadastroUsuario() {
        initComponents();                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogoUser = new javax.swing.JLabel();
        jLabelNameUser = new javax.swing.JLabel();
        jTextFieldNameUser = new javax.swing.JTextField();
        jLabelAgeUser = new javax.swing.JLabel();
        jTextFieldAgeUser = new javax.swing.JTextField();
        jLabelLoginName = new javax.swing.JLabel();
        jTextFieldLoginName = new javax.swing.JTextField();
        jLabelUserPassword = new javax.swing.JLabel();
        jLabelRepeatUserPassword = new javax.swing.JLabel();
        jRadioButtonUserFemaleGender = new javax.swing.JRadioButton();
        jRadioButtonUserMaleGender = new javax.swing.JRadioButton();
        jLabelGenreUser = new javax.swing.JLabel();
        jPasswordFieldUser = new javax.swing.JPasswordField();
        jPasswordFieldRepeatUser = new javax.swing.JPasswordField();
        jButtonUserCancel = new javax.swing.JButton();
        jButtonUserSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelIsAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelLogoUser.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabelLogoUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoUser.setText("Cadastro de Usuário");
        getContentPane().add(jLabelLogoUser);
        jLabelLogoUser.setBounds(160, 0, 490, 56);

        jLabelNameUser.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelNameUser.setText("Nome: ");
        getContentPane().add(jLabelNameUser);
        jLabelNameUser.setBounds(174, 90, 80, 22);

        jTextFieldNameUser.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        getContentPane().add(jTextFieldNameUser);
        jTextFieldNameUser.setBounds(270, 90, 250, 30);

        jLabelAgeUser.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelAgeUser.setText("Idade:");
        getContentPane().add(jLabelAgeUser);
        jLabelAgeUser.setBounds(172, 130, 80, 22);

        jTextFieldAgeUser.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jTextFieldAgeUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAgeUserKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldAgeUser);
        jTextFieldAgeUser.setBounds(270, 130, 250, 30);

        jLabelLoginName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelLoginName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLoginName.setText("Nome de Login:");
        getContentPane().add(jLabelLoginName);
        jLabelLoginName.setBounds(70, 210, 180, 22);

        jTextFieldLoginName.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        getContentPane().add(jTextFieldLoginName);
        jTextFieldLoginName.setBounds(270, 210, 250, 30);

        jLabelUserPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelUserPassword.setText("Senha:");
        getContentPane().add(jLabelUserPassword);
        jLabelUserPassword.setBounds(160, 260, 60, 22);

        jLabelRepeatUserPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelRepeatUserPassword.setText("Repetir Senha:");
        getContentPane().add(jLabelRepeatUserPassword);
        jLabelRepeatUserPassword.setBounds(100, 300, 130, 30);

        jRadioButtonUserFemaleGender.setBackground(new java.awt.Color(55, 221, 244));
        jRadioButtonUserFemaleGender.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jRadioButtonUserFemaleGender.setSelected(true);
        jRadioButtonUserFemaleGender.setText("Feminino");
        jRadioButtonUserFemaleGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonUserFemaleGenderActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonUserFemaleGender);
        jRadioButtonUserFemaleGender.setBounds(420, 170, 120, 31);

        jRadioButtonUserMaleGender.setBackground(new java.awt.Color(55, 221, 244));
        jRadioButtonUserMaleGender.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jRadioButtonUserMaleGender.setText("Masculino");
        jRadioButtonUserMaleGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonUserMaleGenderActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonUserMaleGender);
        jRadioButtonUserMaleGender.setBounds(270, 170, 120, 31);

        jLabelGenreUser.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelGenreUser.setText("Sexo:");
        getContentPane().add(jLabelGenreUser);
        jLabelGenreUser.setBounds(180, 170, 60, 22);
        getContentPane().add(jPasswordFieldUser);
        jPasswordFieldUser.setBounds(270, 260, 250, 30);
        getContentPane().add(jPasswordFieldRepeatUser);
        jPasswordFieldRepeatUser.setBounds(270, 300, 250, 30);

        jButtonUserCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/cancel2.png"))); // NOI18N
        jButtonUserCancel.setText("Cancelar");
        jButtonUserCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUserCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUserCancel);
        jButtonUserCancel.setBounds(400, 380, 130, 40);

        jButtonUserSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/salve2.png"))); // NOI18N
        jButtonUserSave.setText("Salvar");
        jButtonUserSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUserSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUserSave);
        jButtonUserSave.setBounds(250, 380, 130, 40);

        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 70, 700, 290);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/fundoUsuario02_1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 830, 520);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabelIsAdmin.setText("0");
        jLabelIsAdmin.setEnabled(false);
        jPanel1.add(jLabelIsAdmin);
        jLabelIsAdmin.setBounds(250, 340, 30, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 50, 780, 400);

        setSize(new java.awt.Dimension(816, 484));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonUserFemaleGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonUserFemaleGenderActionPerformed
        if(jRadioButtonUserFemaleGender.isSelected()){
            jRadioButtonUserMaleGender.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonUserFemaleGenderActionPerformed

    private void jButtonUserCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserCancelActionPerformed
        jTextFieldAgeUser.setText("");
        jTextFieldLoginName.setText("");
        jTextFieldNameUser.setText("");
        jPasswordFieldUser.setText("");
        jPasswordFieldRepeatUser.setText("");        
        
        if(jRadioButtonUserMaleGender.isSelected()){
            jRadioButtonUserMaleGender.setSelected(false);
            jRadioButtonUserFemaleGender.setSelected(true);
        }
    }//GEN-LAST:event_jButtonUserCancelActionPerformed

    private void jButtonUserSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserSaveActionPerformed
        
        if(jTextFieldNameUser.getText().equals("") && jTextFieldLoginName.getText().equals("")
           && jTextFieldAgeUser.getText().equals("") && jPasswordFieldUser.getText().equals("") 
           && jPasswordFieldRepeatUser.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Preencha os campos!");
                jTextFieldNameUser.requestFocus();
        }else{
            // nome
            if(jTextFieldNameUser.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Preencha o campo Nome!");
                 jTextFieldNameUser.requestFocus();
            }else{
                // unome
                usuarioPojo.setUnome(jTextFieldNameUser.getText().trim());        
            }
            
            // login            
            if(jTextFieldLoginName.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Preencha o campo Login!");
                 jTextFieldLoginName.requestFocus();
            }else{
                // login
                usuarioPojo.setLogin(jTextFieldLoginName.getText().trim());
            }
            
            // idade
            if(jTextFieldAgeUser.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Preencha o campo Idade!");
                 jTextFieldAgeUser.requestFocus();
            }else{
                // idade       
                usuarioPojo.setIdade(Integer.parseInt(jTextFieldAgeUser.getText().trim()));
            }
            
            // senha
            if(jPasswordFieldUser.getText().equals("") ){
                 JOptionPane.showMessageDialog(null, "Preencha o campo Senha!");
                 jPasswordFieldUser.requestFocus();
            }else{
                usuarioPojo.setSenha(jPasswordFieldUser.getText().trim());
            }
             
            // repetir senha
            if(jPasswordFieldRepeatUser.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Preencha o campo Repetir Senha!");
                 jPasswordFieldRepeatUser.requestFocus();
            }
                           
            // sexo
            if(jRadioButtonUserMaleGender.isSelected()){
                usuarioPojo.setSexo('M');
                jRadioButtonUserFemaleGender.setSelected(true);
            }else{
                if(jRadioButtonUserFemaleGender.isSelected()){
                    usuarioPojo.setSexo('F');            
                }
            }          
            
            // verificando se senha e repetir senha são iguais
            if(jPasswordFieldUser.getText().equals(jPasswordFieldRepeatUser.getText())){
                usuarioPojo.setSenha(jPasswordFieldUser.getText().trim());
            }else{
                JOptionPane.showMessageDialog(null, "As senhas não coincidem!");
                jPasswordFieldRepeatUser.setFocusable(true);
            }

            // É usuario admin?
            if(jLabelIsAdmin.getText().equals("0")){
                usuarioPojo.setAdmin(false);           
            }else{
                usuarioPojo.setAdmin(true);              
            }               

            if(!jTextFieldNameUser.getText().equals("") && !jTextFieldLoginName.getText().equals("")
                && !jTextFieldAgeUser.getText().equals("") && !jPasswordFieldUser.getText().equals("") 
                && !jPasswordFieldRepeatUser.getText().equals("")){
                                
                boolean login = usuarioDao.verificarLogin(usuarioPojo);
                
                if(login){
                    // salvar        
                    usuarioDao.salvar(usuarioPojo); 

                    // resetar campos após o envio
                    jTextFieldAgeUser.setText("");
                    jTextFieldLoginName.setText("");
                    jTextFieldAgeUser.setText("");
                    jPasswordFieldUser.setText("");
                    jPasswordFieldRepeatUser.setText("");
                    jTextFieldNameUser.setText("");

                    if(jRadioButtonUserMaleGender.isSelected()){
                        jRadioButtonUserMaleGender.setSelected(false);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "O nome de login já existe\n Por favor escolha outro nome de login.");
                    jTextFieldLoginName.requestFocus();
                }                
            }            
        }                     
    }//GEN-LAST:event_jButtonUserSaveActionPerformed

    private void jRadioButtonUserMaleGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonUserMaleGenderActionPerformed
        if(jRadioButtonUserMaleGender.isSelected()){
            jRadioButtonUserFemaleGender.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonUserMaleGenderActionPerformed

    private void jTextFieldAgeUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAgeUserKeyTyped
        int k = evt.getKeyChar();
        if((!(k > 47 && k < 58))) {            
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);             
         } 
    }//GEN-LAST:event_jTextFieldAgeUserKeyTyped
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
            java.util.logging.Logger.getLogger(Form_CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }                
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Form_CadastroUsuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonUserCancel;
    private javax.swing.JButton jButtonUserSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAgeUser;
    private javax.swing.JLabel jLabelGenreUser;
    public javax.swing.JLabel jLabelIsAdmin;
    private javax.swing.JLabel jLabelLoginName;
    private javax.swing.JLabel jLabelLogoUser;
    private javax.swing.JLabel jLabelNameUser;
    private javax.swing.JLabel jLabelRepeatUserPassword;
    private javax.swing.JLabel jLabelUserPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldRepeatUser;
    private javax.swing.JPasswordField jPasswordFieldUser;
    private javax.swing.JRadioButton jRadioButtonUserFemaleGender;
    private javax.swing.JRadioButton jRadioButtonUserMaleGender;
    private javax.swing.JTextField jTextFieldAgeUser;
    private javax.swing.JTextField jTextFieldLoginName;
    private javax.swing.JTextField jTextFieldNameUser;
    // End of variables declaration//GEN-END:variables
}