package com.ufc.Bolao_da_copa.View;

import com.ufc.Bolao_da_copa.Bolao_da_Copa.ConnectionFactory;
import com.ufc.Bolao_da_copa.Dao.TimeDao;
import com.ufc.Bolao_da_copa.Pojo.Tabela;
import com.ufc.Bolao_da_copa.Pojo.Time;
import com.ufc.Bolao_da_copa.Util.ManipularImagem;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;
/**
 *
 * @author randel
 */
public final class Form_CadastroTime extends javax.swing.JFrame {
    ConnectionFactory connect = new ConnectionFactory();
    Time timePojo = new Time();
    TimeDao timeDao = new TimeDao();
    int flag = 0;
    int resposta = 0;
    String tid = "";
    byte[] imagem = null;
    File file;
    BufferedImage bfr;
    ManipularImagem manipularImagem = new ManipularImagem();
    DefaultListModel dlm = new DefaultListModel();  
    int enter = 0;
    int lgt = 0;              
    String[] lista;
        
    public Form_CadastroTime(){ 
        connect.connection();
        initComponents();    
        preencherListaPesquisa();              
        preencherTabela("SELECT * FROM time ORDER BY tid");               
        JList dataList = new JList(lista);
        AutoCompleteDecorator.decorate(dataList, jTextFieldTeamSearch, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNameTeam = new javax.swing.JLabel();
        jTextFieldNameTeam = new javax.swing.JTextField();
        jLabelNameCoach = new javax.swing.JLabel();
        jTextFieldNameCoach = new javax.swing.JTextField();
        jButtonTeamSave = new javax.swing.JButton();
        jButtonTeamCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTeam = new javax.swing.JTable();
        jButtonTeamEdit = new javax.swing.JButton();
        jButtonTeamNew = new javax.swing.JButton();
        jTextFieldTeamSearch = new javax.swing.JTextField(20);
        jButtonTeamSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTeamId = new javax.swing.JTextField();
        jButtonTeamDelete = new javax.swing.JButton();
        jLabelImagemTime = new javax.swing.JLabel();
        jButtonImagemTime = new javax.swing.JButton();
        jLabelTeamLogo = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();
        jLabelFundo1 = new javax.swing.JLabel();
        jLabelFundo2 = new javax.swing.JLabel();

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

        jLabelNameTeam.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelNameTeam.setText("Nome do Time: ");
        jPanel1.add(jLabelNameTeam);
        jLabelNameTeam.setBounds(230, 160, 120, 30);

        jTextFieldNameTeam.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jTextFieldNameTeam.setEnabled(false);
        jPanel1.add(jTextFieldNameTeam);
        jTextFieldNameTeam.setBounds(360, 160, 250, 30);

        jLabelNameCoach.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelNameCoach.setText("Nome do Técnico: ");
        jPanel1.add(jLabelNameCoach);
        jLabelNameCoach.setBounds(210, 200, 140, 30);

        jTextFieldNameCoach.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jTextFieldNameCoach.setEnabled(false);
        jPanel1.add(jTextFieldNameCoach);
        jTextFieldNameCoach.setBounds(360, 200, 250, 30);

        jButtonTeamSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/salve2_1.png"))); // NOI18N
        jButtonTeamSave.setText("Salvar");
        jButtonTeamSave.setEnabled(false);
        jButtonTeamSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTeamSaveActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTeamSave);
        jButtonTeamSave.setBounds(20, 130, 110, 30);

        jButtonTeamCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/cancel2_1.png"))); // NOI18N
        jButtonTeamCancel.setText("Cancelar");
        jButtonTeamCancel.setEnabled(false);
        jButtonTeamCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTeamCancelActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTeamCancel);
        jButtonTeamCancel.setBounds(20, 180, 110, 30);

        jTableTeam.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jTableTeam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableTeam.setSelectionBackground(new java.awt.Color(0, 204, 0));
        jTableTeam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTeamMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableTeamMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableTeamMouseReleased(evt);
            }
        });
        jTableTeam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableTeamKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTeam);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 310, 590, 240);

        jButtonTeamEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/edit2_1.png"))); // NOI18N
        jButtonTeamEdit.setText("Editar");
        jButtonTeamEdit.setEnabled(false);
        jButtonTeamEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTeamEditActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTeamEdit);
        jButtonTeamEdit.setBounds(20, 230, 110, 30);

        jButtonTeamNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/add2_1.png"))); // NOI18N
        jButtonTeamNew.setText("Novo");
        jButtonTeamNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTeamNewActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTeamNew);
        jButtonTeamNew.setBounds(20, 90, 110, 30);

        jTextFieldTeamSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldTeamSearchKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldTeamSearch);
        jTextFieldTeamSearch.setBounds(230, 260, 250, 40);

        jButtonTeamSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/pesquisar2_1.png"))); // NOI18N
        jButtonTeamSearch.setText("Time");
        jButtonTeamSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTeamSearchActionPerformed(evt);
            }
        });
        jButtonTeamSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonTeamSearchKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonTeamSearch);
        jButtonTeamSearch.setBounds(490, 260, 90, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("ID:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(310, 120, 34, 30);

        jTextFieldTeamId.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jTextFieldTeamId.setEnabled(false);
        jPanel1.add(jTextFieldTeamId);
        jTextFieldTeamId.setBounds(360, 120, 59, 30);

        jButtonTeamDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/delete2_1.png"))); // NOI18N
        jButtonTeamDelete.setText("Excluir");
        jButtonTeamDelete.setEnabled(false);
        jButtonTeamDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTeamDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTeamDelete);
        jButtonTeamDelete.setBounds(20, 270, 110, 30);

        jLabelImagemTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(jLabelImagemTime);
        jLabelImagemTime.setBounds(760, 80, 370, 230);

        jButtonImagemTime.setText("Escolher Imagem");
        jButtonImagemTime.setEnabled(false);
        jButtonImagemTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImagemTimeActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonImagemTime);
        jButtonImagemTime.setBounds(770, 320, 350, 30);

        jLabelTeamLogo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelTeamLogo.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTeamLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTeamLogo.setText("Cadastro de Time");
        jPanel1.add(jLabelTeamLogo);
        jLabelTeamLogo.setBounds(390, 10, 320, 40);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/Fundo_Verde.jpg"))); // NOI18N
        jLabelFundo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabelFundo);
        jLabelFundo.setBounds(300, 0, 320, 610);

        jLabelFundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/Fundo_Verde.jpg"))); // NOI18N
        jPanel1.add(jLabelFundo1);
        jLabelFundo1.setBounds(550, -10, 630, 620);

        jLabelFundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/Fundo_Verde.jpg"))); // NOI18N
        jLabelFundo2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabelFundo2);
        jLabelFundo2.setBounds(0, 0, 630, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1180, 580);

        setSize(new java.awt.Dimension(1161, 605));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
              
    private void jButtonTeamSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTeamSaveActionPerformed
        
        if(flag == 1){
            if(jTextFieldNameTeam.getText().equals("") && jTextFieldNameCoach.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Os campos ainda não foram prenchidos!");            
                jTextFieldNameCoach.requestFocus();
            }else{
                // nome do time
                if(!jTextFieldNameTeam.getText().equals("")){
                    timePojo.setTnome(jTextFieldNameTeam.getText());        
                }else{
                    JOptionPane.showMessageDialog(null, "Insira o nome do time!");
                    jTextFieldNameTeam.requestFocus();
                }
                // nome do técnico    
                if(!jTextFieldNameCoach.getText().equals("")){
                    timePojo.setNome_tecnico(jTextFieldNameCoach.getText());        
                }else{
                    JOptionPane.showMessageDialog(null, "Insira o nome do técnico do time!");
                    jTextFieldNameCoach.requestFocus();
                }            
                // salvando o time e resetando os campos
                if(!jTextFieldNameTeam.getText().equals("") && !jTextFieldNameCoach.getText().equals("")){
                    
                    timeDao.salvar(timePojo);               
            
                    jTextFieldNameTeam.setText("");
                    jTextFieldNameCoach.setText("");
                
                    jButtonTeamCancel.setEnabled(false);
                    jButtonTeamSave.setEnabled(false);
                    jButtonTeamEdit.setEnabled(false); 
                    jButtonTeamNew.setEnabled(true);
                    jTextFieldNameTeam.setEnabled(false);
                    jTextFieldNameCoach.setEnabled(false);  
                    
                    jLabelImagemTime.setIcon(null);
                    preencherTabela("SELECT * FROM time ORDER BY tid");
                }
            }            
        }else{
            timePojo.setId(Integer.parseInt(jTextFieldTeamId.getText()));
            timePojo.setTnome(jTextFieldNameTeam.getText());        
            timePojo.setNome_tecnico(jTextFieldNameCoach.getText());              
            
            if(timePojo.getImagem() == null){
                timePojo.setImagem(ManipularImagem.getImgBytes((BufferedImage) ((ImageIcon)jLabelImagemTime.getIcon()).getImage()));
            }            
            timeDao.editarTime(timePojo);
            
            jButtonTeamCancel.setEnabled(false);
            jButtonTeamSave.setEnabled(false);
            jButtonTeamEdit.setEnabled(false); 
            jButtonTeamNew.setEnabled(true);
            
            jTextFieldNameTeam.setText("");
            jTextFieldNameCoach.setText("");
            jTextFieldTeamSearch.setText("");
            jTextFieldTeamId.setText("");
            
            jTextFieldNameTeam.setEnabled(false);
            jTextFieldNameCoach.setEnabled(false); 
            jLabelImagemTime.setIcon(null);
            preencherTabela("SELECT * FROM time ORDER BY tid");
            jTableTeam.clearSelection();
        }                
    }//GEN-LAST:event_jButtonTeamSaveActionPerformed

    public void procurarTime(){
        jTextFieldNameTeam.setEnabled(false);
        jTextFieldNameCoach.setEnabled(false);
        
        timePojo.setPesquisa(jTextFieldTeamSearch.getText().trim());
        
        if(!jTextFieldTeamSearch.getText().equals("")){
        
            timePojo = timeDao.buscarTime(timePojo);
            
            ManipularImagem.exibiImagemLabel(timePojo.getImagem(), jLabelImagemTime);
            jTextFieldNameTeam.setText(timePojo.getTnome());
            jTextFieldNameCoach.setText(timePojo.getNome_tecnico());
            
            if(timePojo.getId() == 0){
                jTextFieldTeamId.setText("");
            }else{
                jTextFieldTeamId.setText(String.valueOf(timePojo.getId()));
            }

            jTextFieldTeamSearch.setText("");

            jButtonTeamCancel.setEnabled(true);
            jButtonTeamSave.setEnabled(false);
            jButtonTeamEdit.setEnabled(true); 
            jButtonTeamNew.setEnabled(true);
            jButtonTeamDelete.setEnabled(true);
        }else{
            jTextFieldNameTeam.setText("");
            jTextFieldNameCoach.setText("");
            jTextFieldTeamId.setText("");
        }                        
    }
    
    private void jButtonTeamSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTeamSearchActionPerformed
        procurarTime();
    }//GEN-LAST:event_jButtonTeamSearchActionPerformed

    private void jButtonTeamNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTeamNewActionPerformed
        flag = 1;
        jTextFieldNameTeam.setText("");
        jTextFieldNameCoach.setText("");
        jTextFieldTeamSearch.setText("");
        jTextFieldTeamId.setText("");
        
        jTextFieldNameTeam.setEnabled(true);
        jTextFieldNameCoach.setEnabled(true);
        
        jButtonTeamEdit.setEnabled(false);
        jButtonTeamCancel.setEnabled(true);
        jButtonTeamSave.setEnabled(true);
        jButtonTeamNew.setEnabled(false);
        jButtonTeamDelete.setEnabled(false);       
        jButtonImagemTime.setEnabled(true);
        
        jLabelImagemTime.setIcon(null);
    }//GEN-LAST:event_jButtonTeamNewActionPerformed

    private void jButtonTeamEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTeamEditActionPerformed
        flag = 2;
     
        jTextFieldNameTeam.setEnabled(true);
        jTextFieldNameCoach.setEnabled(true);
        
        jTextFieldTeamSearch.setText("");
        
        jButtonTeamEdit.setEnabled(false);
        jButtonTeamCancel.setEnabled(true);
        jButtonTeamSave.setEnabled(true);
        jButtonTeamNew.setEnabled(false);
        jButtonTeamDelete.setEnabled(false);
        jButtonImagemTime.setEnabled(true);
        jTextFieldNameTeam.requestFocus();
    }//GEN-LAST:event_jButtonTeamEditActionPerformed

    private void jButtonTeamCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTeamCancelActionPerformed
        jButtonTeamCancel.setEnabled(false);
        jButtonTeamSave.setEnabled(false);
        jButtonTeamEdit.setEnabled(false);
        jButtonTeamNew.setEnabled(true);
        jButtonTeamDelete.setEnabled(false);

        jTextFieldNameTeam.setText("");
        jTextFieldNameCoach.setText("");
        jTextFieldTeamSearch.setText("");
        jTextFieldTeamId.setText("");

        jTextFieldNameTeam.setEnabled(false);
        jTextFieldNameCoach.setEnabled(false);
        
        jLabelImagemTime.setIcon(null);
        jButtonImagemTime.setEnabled(false);
        jTableTeam.clearSelection();
    }//GEN-LAST:event_jButtonTeamCancelActionPerformed
    
    private void jButtonTeamDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTeamDeleteActionPerformed
                
        resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o time?","Excluir time",JOptionPane.YES_NO_OPTION);              
        
        if(resposta == JOptionPane.YES_OPTION){
            timePojo.setId(Integer.parseInt(jTextFieldTeamId.getText()));
            timeDao.excluirTime(timePojo);

            jTextFieldNameTeam.setText("");
            jTextFieldNameCoach.setText("");
            jTextFieldTeamSearch.setText("");
            jTextFieldTeamId.setText("");

            jTextFieldNameTeam.setEnabled(false);
            jTextFieldNameCoach.setEnabled(false);            
            
            jButtonTeamCancel.setEnabled(false);
            jButtonTeamSave.setEnabled(false);
            jButtonTeamEdit.setEnabled(false);
            jButtonTeamNew.setEnabled(true);
            jButtonTeamDelete.setEnabled(false);
            jLabelImagemTime.setIcon(null);                        
            preencherTabela("SELECT * FROM time ORDER BY tid");            
        }        
    }//GEN-LAST:event_jButtonTeamDeleteActionPerformed

    public void recuperarTime(){
        
        if(jTableTeam.getSelectedRow() != -1){
            try {                    
                tid = ""+jTableTeam.getValueAt(jTableTeam.getSelectedRow(), 0);                
                connect.executaSql("SELECT * FROM time WHERE tid='"+tid+"'");
                connect.rst.first();

                jTextFieldTeamId.setText(String.valueOf(connect.rst.getInt("tid")));
                jTextFieldNameTeam.setText(connect.rst.getString("tnome"));
                jTextFieldNameCoach.setText(connect.rst.getString("nome_tecnico"));
                
                ManipularImagem.exibiImagemLabel(connect.rst.getBytes("imagem"), jLabelImagemTime);
                
                jButtonTeamCancel.setEnabled(true);
                jButtonTeamSave.setEnabled(false);
                jButtonTeamEdit.setEnabled(true); 
                jButtonTeamNew.setEnabled(true);
                jButtonTeamDelete.setEnabled(true);
                jButtonImagemTime.setEnabled(false);   
                jTextFieldNameCoach.setEnabled(false);
                jTextFieldNameTeam.setEnabled(false);
                
            } catch (SQLException ex) {
                Logger.getLogger(Form_CadastroTime.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Não foi possivél buscar os dados!");
            }
            
            if(flag == 1){
                jTextFieldNameTeam.setEnabled(false); 
                jTextFieldNameCoach.setEnabled(false);                
                jTextFieldTeamId.setEnabled(false);       
            }            
        }       
    }
    
    private void jTableTeamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTeamMouseClicked
        recuperarTime();        
    }//GEN-LAST:event_jTableTeamMouseClicked

    private void jTableTeamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableTeamKeyReleased
        recuperarTime();
    }//GEN-LAST:event_jTableTeamKeyReleased

    private void jTableTeamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTeamMousePressed
        recuperarTime();
    }//GEN-LAST:event_jTableTeamMousePressed

    private void jTableTeamMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTeamMouseReleased
        recuperarTime();
    }//GEN-LAST:event_jTableTeamMouseReleased

    private void jButtonImagemTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImagemTimeActionPerformed
        JFileChooser jFileChooser = new JFileChooser();        
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jFileChooser.showOpenDialog(this);
        file = jFileChooser.getSelectedFile();
                
        bfr = ManipularImagem.setImagemDimensao(file.getPath(), 370, 250);
        imagem = ManipularImagem.getImgBytes(bfr);  
        timePojo.setImagem(imagem);
        ManipularImagem.exibiImagemLabel(imagem, jLabelImagemTime);                
    }//GEN-LAST:event_jButtonImagemTimeActionPerformed
    
    private void preencherListaPesquisa(){
        try {                       
            String sql = "SELECT tnome FROM time;";
            int k = 0;                         
            connect.executaSql(sql);         

            connect.rst.last();
            lista = new String[connect.rst.getRow()];                
            connect.rst.beforeFirst();                

            while(connect.rst.next()){                  
                if(!connect.rst.getString("tnome").equals("")){            
                      lista[k] = connect.rst.getString("tnome");               
                }                
                k++;                                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Form_CadastroTime.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    private void jTextFieldTeamSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTeamSearchKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            procurarTime();
        }
    }//GEN-LAST:event_jTextFieldTeamSearchKeyPressed

    private void jButtonTeamSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonTeamSearchKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            procurarTime();
        }
    }//GEN-LAST:event_jButtonTeamSearchKeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        connect.disconect();
    }//GEN-LAST:event_formWindowClosed

    public void preencherTabela(String sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome do Time", "Nome do Técnico"};
        
        try {            
            connect.executaSql(sql);
     
            boolean estado = connect.rst.first();
            
            if(estado){
                do{
                    dados.add(new Object[]{connect.rst.getInt("tid"), connect.rst.getString("tnome"), connect.rst.getString("nome_tecnico")});                       
                }while(connect.rst.next());
            }                                    
        } catch (SQLException ex) {
            Logger.getLogger(Form_CadastroTime.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela de times");
        }                
        
        Tabela tabelaPojo = new Tabela(dados, colunas);
        jTableTeam.setModel(tabelaPojo);
        jTableTeam.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTableTeam.getColumnModel().getColumn(0).setResizable(false);
        jTableTeam.getColumnModel().getColumn(1).setPreferredWidth(242);
        jTableTeam.getColumnModel().getColumn(1).setResizable(false);
        jTableTeam.getColumnModel().getColumn(2).setPreferredWidth(242);
        jTableTeam.getColumnModel().getColumn(2).setResizable(false);
        jTableTeam.getTableHeader().setReorderingAllowed(false);
        jTableTeam.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);       
        jTableTeam.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(Form_CadastroTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Form_CadastroTime().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonImagemTime;
    private javax.swing.JButton jButtonTeamCancel;
    private javax.swing.JButton jButtonTeamDelete;
    private javax.swing.JButton jButtonTeamEdit;
    private javax.swing.JButton jButtonTeamNew;
    private javax.swing.JButton jButtonTeamSave;
    private javax.swing.JButton jButtonTeamSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelFundo1;
    private javax.swing.JLabel jLabelFundo2;
    private javax.swing.JLabel jLabelImagemTime;
    private javax.swing.JLabel jLabelNameCoach;
    private javax.swing.JLabel jLabelNameTeam;
    private javax.swing.JLabel jLabelTeamLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTeam;
    private javax.swing.JTextField jTextFieldNameCoach;
    private javax.swing.JTextField jTextFieldNameTeam;
    private javax.swing.JTextField jTextFieldTeamId;
    private javax.swing.JTextField jTextFieldTeamSearch;
    // End of variables declaration//GEN-END:variables
}