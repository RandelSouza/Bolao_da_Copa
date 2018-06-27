package com.ufc.Bolao_da_copa.View;

import com.ufc.Bolao_da_copa.Bolao_da_Copa.ConnectionFactory;
import com.ufc.Bolao_da_copa.Dao.PartidaDao;
import com.ufc.Bolao_da_copa.Pojo.Partida;
import com.ufc.Bolao_da_copa.Pojo.Tabela;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
/**
 *
 * @author randel
 */
public final class Form_CadastroPartida extends javax.swing.JFrame {    
    int flag = 0;
    public ConnectionFactory connect = new ConnectionFactory();    
    public Partida partidaPojo = new Partida();
    public PartidaDao partidaDao = new PartidaDao();
    public SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");
    public String[] data_array = new String[3];
    public String data = "";
    public int pid,  resposta;
    public int id1, id2;
    public String qtdv, qtda;    
    public String timeCasa = "";
    public String timeVisitante = "";
        
    public Form_CadastroPartida() {
        connect.connection();
        initComponents();       
        PreencherJcomboboxTime();      
        preencherTabela("SELECT * FROM partida ORDER BY pid");
        AutoCompleteDecorator.decorate(jComboBoxFootballMatchHomeTeam);
        AutoCompleteDecorator.decorate(jComboBoxFootballMatchTeamVisitor);
    }

    public void PreencherJcomboboxTime(){                
        connect.executaSql("SELECT * FROM time ORDER BY tid");
        try {
            connect.rst.first();
            jComboBoxFootballMatchHomeTeam.removeAllItems();
            jComboBoxFootballMatchTeamVisitor.removeAllItems();
            jComboBoxIdTeam.removeAllItems();
            do{                
                jComboBoxFootballMatchHomeTeam.addItem(connect.rst.getString("tnome"));                
                jComboBoxFootballMatchTeamVisitor.addItem(connect.rst.getString("tnome"));   
                jComboBoxIdTeam.addItem(String.valueOf(connect.rst.getInt("tid")));
            }while(connect.rst.next());
        } catch (SQLException ex) {
            Logger.getLogger(Form_CadastroPartida.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao preencher o jComboBox de time: " + "\n"+ ex.getMessage());
        }        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBoxFootballMatchTeamVisitor = new javax.swing.JComboBox<>();
        jComboBoxFootballMatchHomeTeam = new javax.swing.JComboBox<>();
        jLabelFootballMatchDate = new javax.swing.JLabel();
        jLabelFootballMatchStadium = new javax.swing.JLabel();
        jLabelFootballMatchHomeTeamQtd = new javax.swing.JLabel();
        jLabelFootballMatchTeamVisitorQtd = new javax.swing.JLabel();
        jLabelFootballMatchHomeTeam = new javax.swing.JLabel();
        jLabelFootballMatchTeamVisitor = new javax.swing.JLabel();
        jTextFieldFootballMatchTeamVisitorQtd = new javax.swing.JTextField();
        jTextFieldFootballMatchHomeTeamQtd = new javax.swing.JTextField();
        jLabelFootballMatchHour = new javax.swing.JLabel();
        jTextFieldFootballMatchHour = new javax.swing.JTextField();
        jTextFieldFootballMatchStadium = new javax.swing.JTextField();
        jButtonFootballMatchSave = new javax.swing.JButton();
        jButtonFootballMatchCancel = new javax.swing.JButton();
        jButtonNew = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMatch = new javax.swing.JTable();
        jButtonSearch = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jDateChooserDate = new com.toedter.calendar.JDateChooser();
        jLabelLogoFootballMatchDescription = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxIdTeam = new javax.swing.JComboBox<>();

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

        jComboBoxFootballMatchTeamVisitor.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jComboBoxFootballMatchTeamVisitor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxFootballMatchTeamVisitor.setEnabled(false);
        jPanel1.add(jComboBoxFootballMatchTeamVisitor);
        jComboBoxFootballMatchTeamVisitor.setBounds(880, 100, 170, 30);

        jComboBoxFootballMatchHomeTeam.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jComboBoxFootballMatchHomeTeam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxFootballMatchHomeTeam.setEnabled(false);
        jPanel1.add(jComboBoxFootballMatchHomeTeam);
        jComboBoxFootballMatchHomeTeam.setBounds(440, 100, 170, 30);

        jLabelFootballMatchDate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelFootballMatchDate.setText("Data da Partida:");
        jPanel1.add(jLabelFootballMatchDate);
        jLabelFootballMatchDate.setBounds(300, 190, 130, 30);

        jLabelFootballMatchStadium.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelFootballMatchStadium.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFootballMatchStadium.setText("Estádio:");
        jPanel1.add(jLabelFootballMatchStadium);
        jLabelFootballMatchStadium.setBounds(320, 240, 110, 30);

        jLabelFootballMatchHomeTeamQtd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelFootballMatchHomeTeamQtd.setText("Quantidade de Gols do Time da Casa: ");
        jPanel1.add(jLabelFootballMatchHomeTeamQtd);
        jLabelFootballMatchHomeTeamQtd.setBounds(160, 140, 270, 30);

        jLabelFootballMatchTeamVisitorQtd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelFootballMatchTeamVisitorQtd.setText("Quantidade de Gols do Time Visitante: ");
        jPanel1.add(jLabelFootballMatchTeamVisitorQtd);
        jLabelFootballMatchTeamVisitorQtd.setBounds(600, 140, 280, 40);

        jLabelFootballMatchHomeTeam.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelFootballMatchHomeTeam.setText(" Time da Casa: ");
        jPanel1.add(jLabelFootballMatchHomeTeam);
        jLabelFootballMatchHomeTeam.setBounds(320, 100, 140, 30);

        jLabelFootballMatchTeamVisitor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelFootballMatchTeamVisitor.setText("Time Visitante: ");
        jPanel1.add(jLabelFootballMatchTeamVisitor);
        jLabelFootballMatchTeamVisitor.setBounds(750, 100, 130, 30);

        jTextFieldFootballMatchTeamVisitorQtd.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jTextFieldFootballMatchTeamVisitorQtd.setEnabled(false);
        jTextFieldFootballMatchTeamVisitorQtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFootballMatchTeamVisitorQtdKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldFootballMatchTeamVisitorQtd);
        jTextFieldFootballMatchTeamVisitorQtd.setBounds(880, 140, 110, 30);

        jTextFieldFootballMatchHomeTeamQtd.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jTextFieldFootballMatchHomeTeamQtd.setEnabled(false);
        jTextFieldFootballMatchHomeTeamQtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFootballMatchHomeTeamQtdKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldFootballMatchHomeTeamQtd);
        jTextFieldFootballMatchHomeTeamQtd.setBounds(440, 140, 110, 30);

        jLabelFootballMatchHour.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelFootballMatchHour.setText("Hora da Partida:");
        jPanel1.add(jLabelFootballMatchHour);
        jLabelFootballMatchHour.setBounds(750, 190, 150, 30);

        jTextFieldFootballMatchHour.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jTextFieldFootballMatchHour.setEnabled(false);
        jTextFieldFootballMatchHour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldFootballMatchHourKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFootballMatchHourKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldFootballMatchHour);
        jTextFieldFootballMatchHour.setBounds(880, 190, 110, 30);

        jTextFieldFootballMatchStadium.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jTextFieldFootballMatchStadium.setEnabled(false);
        jPanel1.add(jTextFieldFootballMatchStadium);
        jTextFieldFootballMatchStadium.setBounds(440, 240, 160, 30);

        jButtonFootballMatchSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/salve2_1.png"))); // NOI18N
        jButtonFootballMatchSave.setText("Salvar");
        jButtonFootballMatchSave.setEnabled(false);
        jButtonFootballMatchSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFootballMatchSaveActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFootballMatchSave);
        jButtonFootballMatchSave.setBounds(30, 170, 110, 30);

        jButtonFootballMatchCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/cancel2_1.png"))); // NOI18N
        jButtonFootballMatchCancel.setText("Cancelar");
        jButtonFootballMatchCancel.setEnabled(false);
        jButtonFootballMatchCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFootballMatchCancelActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFootballMatchCancel);
        jButtonFootballMatchCancel.setBounds(30, 220, 110, 30);

        jButtonNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/add2_1.png"))); // NOI18N
        jButtonNew.setText("Nova");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNew);
        jButtonNew.setBounds(30, 120, 110, 30);

        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/delete2_1.png"))); // NOI18N
        jButtonDelete.setText("Excluir");
        jButtonDelete.setEnabled(false);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDelete);
        jButtonDelete.setBounds(30, 310, 110, 30);

        jButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/edit2_1.png"))); // NOI18N
        jButtonEdit.setText("Editar");
        jButtonEdit.setEnabled(false);
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEdit);
        jButtonEdit.setBounds(30, 260, 110, 30);

        jTextFieldSearch.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldSearch);
        jTextFieldSearch.setBounds(390, 320, 230, 30);

        jTableMatch.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jTableMatch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableMatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMatchMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableMatchMouseReleased(evt);
            }
        });
        jTableMatch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableMatchKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMatch);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 360, 1040, 210);

        jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/pesquisar2_1.png"))); // NOI18N
        jButtonSearch.setToolTipText("Pesquisar Pelo ID da Partida");
        jButtonSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSearch);
        jButtonSearch.setBounds(620, 320, 60, 30);

        jTextFieldID.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jTextFieldID.setEnabled(false);
        jPanel1.add(jTextFieldID);
        jTextFieldID.setBounds(880, 240, 59, 30);

        jLabelID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelID.setText("ID:");
        jPanel1.add(jLabelID);
        jLabelID.setBounds(840, 240, 40, 30);

        jDateChooserDate.setEnabled(false);
        jDateChooserDate.setFocusTraversalPolicyProvider(true);
        jDateChooserDate.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jPanel1.add(jDateChooserDate);
        jDateChooserDate.setBounds(440, 190, 160, 30);

        jLabelLogoFootballMatchDescription.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabelLogoFootballMatchDescription.setForeground(new java.awt.Color(0, 51, 102));
        jLabelLogoFootballMatchDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoFootballMatchDescription.setText("Cadastro de Partida");
        jPanel1.add(jLabelLogoFootballMatchDescription);
        jLabelLogoFootballMatchDescription.setBounds(330, 0, 490, 56);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/Fundo_Azul_02.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(490, -30, 630, 680);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/Fundo_Azul_02.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(360, -20, 230, 650);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/Fundo_Azul_02.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, -10, 390, 640);

        jComboBoxIdTeam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBoxIdTeam);
        jComboBoxIdTeam.setBounds(540, 110, 56, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 630);

        setSize(new java.awt.Dimension(1092, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    // habilitarCampos(int homeTeamQtd, int stadium, int homeTeam, int hour, int date, int visitorTeamQtd, int visitorTeam)    
    public void habilitarCampos(int homeTeamQtd, int stadium,
                              int homeTeam, int hour, int date,
                              int visitorTeamQtd, int visitorTeam){

        // jtextfild Quantidade de gols do time da casa
        if(homeTeamQtd == 1){
            jTextFieldFootballMatchHomeTeamQtd.setEnabled(true);
        }else{
            if(homeTeamQtd == 0){
                jTextFieldFootballMatchHomeTeamQtd.setEnabled(false);
            }
        }
        // jtextfild Quantidade de gols do time visitante
        if(visitorTeamQtd == 1){
            jTextFieldFootballMatchTeamVisitorQtd.setEnabled(true);
        }else{
            if(visitorTeamQtd == 0){
                jTextFieldFootballMatchTeamVisitorQtd.setEnabled(false);
            }            
        }        
        // jcombobox time da casa
        if(homeTeam == 1){
            jComboBoxFootballMatchHomeTeam.setEnabled(true);
        }else{
            if(homeTeam == 0){
                jComboBoxFootballMatchHomeTeam.setEnabled(false);
            }
        }
        // jcombobox time visitante                
        if(visitorTeam == 1){            
            jComboBoxFootballMatchTeamVisitor.setEnabled(true);
        }else{
            if(visitorTeam == 0){
                jComboBoxFootballMatchTeamVisitor.setEnabled(false);
            }
        }                                
        // jtextfild estadio
        if(stadium == 1){
            jTextFieldFootballMatchStadium.setEnabled(true);
        }else{
            if(stadium == 0){
                jTextFieldFootballMatchStadium.setEnabled(false);
            }
        }
        // jtextfild hora
        if(hour == 1){
            jTextFieldFootballMatchHour.setEnabled(true);
        }else{
            if(hour == 0){
            jTextFieldFootballMatchHour.setEnabled(false);
            }
        }        
        // JCalendar data
        if(date == 1){
            jDateChooserDate.setEnabled(true);
        }else{
            if(date == 0){
                jDateChooserDate.setEnabled(false);
            }
        }        
    }
    
    private void jButtonFootballMatchCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFootballMatchCancelActionPerformed
        jComboBoxFootballMatchHomeTeam.getItemAt(0);
        jComboBoxFootballMatchTeamVisitor.getItemAt(0);
        
        jDateChooserDate.setDate(null);
        jTextFieldFootballMatchHomeTeamQtd.setText("");
        jTextFieldFootballMatchTeamVisitorQtd.setText("");
        jTextFieldFootballMatchStadium.setText("");
        jTextFieldFootballMatchHour.setText("");
        jTextFieldSearch.setText("");
        jTextFieldID.setText("");
        
        jComboBoxFootballMatchHomeTeam.setSelectedIndex(0);
        jComboBoxFootballMatchTeamVisitor.setSelectedIndex(0);
        
        // habilitarCampos(int homeTeamQtd, int stadium, int homeTeam, int hour, int date, int visitorTeamQtd, int visitorTeam)    
        habilitarCampos(0, 0, 0, 0, 0, 0, 0);
        
        jButtonNew.setEnabled(true);
        jButtonFootballMatchCancel.setEnabled(false);
        jButtonFootballMatchSave.setEnabled(false);
        jButtonEdit.setEnabled(false);
        jButtonDelete.setEnabled(false);        
        jTableMatch.clearSelection();
    }//GEN-LAST:event_jButtonFootballMatchCancelActionPerformed

    private void jButtonFootballMatchSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFootballMatchSaveActionPerformed
        if(flag == 1){
            // Salvando uma nova partida 
            if(jComboBoxFootballMatchHomeTeam.getSelectedItem().equals(jComboBoxFootballMatchTeamVisitor.getSelectedItem())){
                JOptionPane.showMessageDialog(null, "Somente é possivél cadastrar partidas com times distintos!");
            }else{
                // Tratando o campo Estadio
                if(jTextFieldFootballMatchStadium.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Preencha o campo Estadio!");
                    jTextFieldFootballMatchStadium.requestFocus();
                }else{
                    partidaPojo.setEstadio(jTextFieldFootballMatchStadium.getText());                    
                    // Tratando Qtd_gols_time_casa e Qtd_gols_time_visitante
                    if(!jTextFieldFootballMatchHomeTeamQtd.getText().equals("") &&  !jTextFieldFootballMatchTeamVisitorQtd.getText().equals("")){
                        partidaPojo.setQtd_gols_time_casa(Integer.parseInt(jTextFieldFootballMatchHomeTeamQtd.getText()));
                        partidaPojo.setQtd_gols_time_visitante(Integer.parseInt(jTextFieldFootballMatchTeamVisitorQtd.getText()));
                    }else{
                        partidaPojo.setQtd_gols_time_casa(-1);
                        partidaPojo.setQtd_gols_time_visitante(-1);
                    }
                    
                    try {
                        if(jDateChooserDate.getDate() != null){                            
                            partidaPojo.setData_partida(jDateChooserDate.getDate());                                                    
                        }else{
                            partidaPojo.setData_partida(formatacao.parse("1/1/1"));
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(Form_CadastroPartida.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    // Tratando a hora
                    if(!jTextFieldFootballMatchHour.getText().equals("")){
                        partidaPojo.setHora(jTextFieldFootballMatchHour.getText());
                    }else{
                        partidaPojo.setHora("");
                    }

                    partidaPojo.setTime_casa(Integer.parseInt(jComboBoxIdTeam.getItemAt(jComboBoxFootballMatchHomeTeam.getSelectedIndex())));
                    partidaPojo.setTime_visitante(Integer.parseInt(jComboBoxIdTeam.getItemAt(jComboBoxFootballMatchTeamVisitor.getSelectedIndex())));

                    if(jTextFieldFootballMatchStadium.getText() != null && partidaPojo.getTime_casa() != null &&
                       partidaPojo.getTime_visitante() != null){                        
                        partidaDao.salvar(partidaPojo);                           
                        preencherTabela("SELECT * FROM partida ORDER BY pid");
                        
                        jDateChooserDate.setDate(null);
                        jTextFieldFootballMatchHomeTeamQtd.setText("");
                        jTextFieldFootballMatchHour.setText("");
                        jTextFieldFootballMatchStadium.setText("");
                        jTextFieldFootballMatchTeamVisitorQtd.setText("");
                        jTextFieldID.setText("");
                        
                        // habilitarCampos(int homeTeamQtd, int stadium, int homeTeam, int hour, int date, int visitorTeamQtd, int visitorTeam)    
                        habilitarCampos(0, 0, 0, 0, 0, 0, 0);                        
                        
                        jButtonFootballMatchCancel.setEnabled(false);
                        jButtonFootballMatchSave.setEnabled(false);
                        jButtonNew.setEnabled(true);
                        
                        jComboBoxFootballMatchHomeTeam.setSelectedIndex(0);
                        jComboBoxFootballMatchTeamVisitor.setSelectedIndex(0);
                        
                    }                    
                }                                               
            }                                                
        }else{
            // Salvando uma partida editada
            if(jComboBoxFootballMatchHomeTeam.getSelectedItem().equals(jComboBoxFootballMatchTeamVisitor.getSelectedItem())){
                JOptionPane.showMessageDialog(null, "Somente é possivél cadastrar partidas com times distintos!");
            }else{
               partidaPojo.setId(Integer.parseInt(jTextFieldID.getText()));                       
               partidaPojo.setTime_casa(Integer.parseInt(jComboBoxIdTeam.getItemAt(jComboBoxFootballMatchHomeTeam.getSelectedIndex())));            
               partidaPojo.setTime_visitante(Integer.parseInt(jComboBoxIdTeam.getItemAt(jComboBoxFootballMatchTeamVisitor.getSelectedIndex())));            

               if(!jTextFieldFootballMatchHomeTeamQtd.getText().equals("") &&  !jTextFieldFootballMatchTeamVisitorQtd.getText().equals("")){
                        partidaPojo.setQtd_gols_time_casa(Integer.parseInt(jTextFieldFootballMatchHomeTeamQtd.getText()));
                        partidaPojo.setQtd_gols_time_visitante(Integer.parseInt(jTextFieldFootballMatchTeamVisitorQtd.getText()));
                    }else{
                        partidaPojo.setQtd_gols_time_casa(-1);
                        partidaPojo.setQtd_gols_time_visitante(-1);
                    }
                              
               partidaPojo.setEstadio(jTextFieldFootballMatchStadium.getText());
               partidaPojo.setHora(jTextFieldFootballMatchHour.getText());
               
               try {
                    if(jDateChooserDate.getDate() != null){
                        partidaPojo.setData_partida(jDateChooserDate.getDate());                        
                    }else{
                        partidaPojo.setData_partida(formatacao.parse("1/1/1"));
                    }

                    } catch (ParseException ex) {
                        Logger.getLogger(Form_CadastroPartida.class.getName()).log(Level.SEVERE, null, ex);
                    }                                             

                if(jTextFieldFootballMatchStadium.getText() != null && partidaPojo.getTime_casa() != null &&
                    partidaPojo.getTime_visitante() != null){                                                           
                    partidaDao.editarPartida(partidaPojo);            
                    preencherTabela("SELECT * FROM partida ORDER BY pid");               
                    
                    jDateChooserDate.setDate(null);
                    jTextFieldFootballMatchHomeTeamQtd.setText("");
                    jTextFieldFootballMatchHour.setText("");
                    jTextFieldFootballMatchStadium.setText("");
                    jTextFieldFootballMatchTeamVisitorQtd.setText("");
                    jTextFieldID.setText("");

                    // habilitarCampos(int homeTeamQtd, int stadium, int homeTeam, int hour, int date, int visitorTeamQtd, int visitorTeam)    
                    habilitarCampos(0, 0, 0, 0, 0, 0, 0);
                    
                    jButtonFootballMatchCancel.setEnabled(false);
                    jButtonFootballMatchSave.setEnabled(false);
                    jButtonNew.setEnabled(true);
                    jButtonDelete.setEnabled(false);
                    jButtonEdit.setEnabled(false);                    
                }
            }            
        }
    }//GEN-LAST:event_jButtonFootballMatchSaveActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        flag = 1;                
        // habilitarCampos(int homeTeamQtd, int stadium, int homeTeam, int hour, int date, int visitorTeamQtd, int visitorTeam)    
        habilitarCampos(1, 1, 1, 1, 1, 1, 1);
                      
        jTextFieldFootballMatchHomeTeamQtd.setText("");
        jTextFieldFootballMatchTeamVisitorQtd.setText("");
        jTextFieldFootballMatchStadium.setText("");        
        jTextFieldFootballMatchHour.setText("");   
        jDateChooserDate.setDate(null);
        jTextFieldSearch.setText("");
        jTextFieldID.setText("");
        
        jComboBoxFootballMatchHomeTeam.setSelectedIndex(0);
        jComboBoxFootballMatchTeamVisitor.setSelectedIndex(0);        
                        
        jButtonNew.setEnabled(false);
        jButtonFootballMatchSave.setEnabled(true);
        jButtonFootballMatchCancel.setEnabled(true);        
        jButtonEdit.setEnabled(false);
        jButtonDelete.setEnabled(false);        
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void pesquisarPartida(){           
        habilitarCampos(0, 0, 0, 0, 0, 0, 0);
        
        jButtonFootballMatchCancel.setEnabled(true);
        jButtonFootballMatchSave.setEnabled(false);
        jButtonEdit.setEnabled(true);
        jButtonNew.setEnabled(true);
        jButtonDelete.setEnabled(true);        
        
        if(!jTextFieldSearch.getText().equals("")){
            partidaPojo.setPesquisa(jTextFieldSearch.getText().trim());
        
            partidaPojo = partidaDao.buscarPartida(partidaPojo);
            jTextFieldSearch.setText("");
            
            if(partidaPojo.getData_partida() == null){                
                jDateChooserDate.setDate(null);
            }else{
                data = formatacao.format(partidaPojo.getData_partida());                
                if(data.equals("01/01/0001")){                    
                    jDateChooserDate.setDate(null);
                }else{
                    jDateChooserDate.setDate(partidaPojo.getData_partida());                    
                }
            }                         
            
            if(partidaPojo.getTime_casa() == -2 && partidaPojo.getTime_visitante() == -2){
                jComboBoxFootballMatchHomeTeam.setSelectedIndex(0);
                jComboBoxFootballMatchTeamVisitor.setSelectedIndex(0);        
            }else{
                for(int i = 0; i < jComboBoxIdTeam.getItemCount(); i++){            
                    if(jComboBoxIdTeam.getItemAt(i).equals(String.valueOf(partidaPojo.getTime_casa()))){
                        jComboBoxFootballMatchHomeTeam.setSelectedIndex(i);
                    }

                    if(jComboBoxIdTeam.getItemAt(i).equals(String.valueOf(partidaPojo.getTime_visitante()))){
                        jComboBoxFootballMatchTeamVisitor.setSelectedIndex(i);
                    }
                }
            }
            
            if(partidaPojo.getQtd_gols_time_casa() == -2 && partidaPojo.getQtd_gols_time_visitante() == -2){
                jTextFieldFootballMatchHomeTeamQtd.setText("");
                jTextFieldFootballMatchTeamVisitorQtd.setText("");
            }else{
                if(partidaPojo.getQtd_gols_time_casa() == -1 && partidaPojo.getQtd_gols_time_visitante() == -1){
                    jTextFieldFootballMatchHomeTeamQtd.setText("");
                    jTextFieldFootballMatchTeamVisitorQtd.setText("");
                }else{
                    jTextFieldFootballMatchHomeTeamQtd.setText(String.valueOf(partidaPojo.getQtd_gols_time_casa()));
                    jTextFieldFootballMatchTeamVisitorQtd.setText(String.valueOf(partidaPojo.getQtd_gols_time_visitante()));
                }                
            }
            
            if(partidaPojo.getHora() == null){
                jTextFieldFootballMatchHour.setText("");
            }else{
                if(partidaPojo.getHora().equals("")){                
                  jTextFieldFootballMatchHour.setText("");
                }else{
                    jTextFieldFootballMatchHour.setText(partidaPojo.getHora());              
                } 
            }
            
            if(partidaPojo.getEstadio().equals("")){
                jTextFieldFootballMatchStadium.setText("");
            }else{
                jTextFieldFootballMatchStadium.setText(partidaPojo.getEstadio());
            }
            
            if(partidaPojo.getId() == -2){
                jTextFieldID.setText("");               
            }else{
                jTextFieldID.setText(String.valueOf(partidaPojo.getId()));              
            }                        
        }else{
            jTextFieldFootballMatchHomeTeamQtd.setText("");
            jTextFieldFootballMatchTeamVisitorQtd.setText("");
            jTextFieldFootballMatchStadium.setText("");            
            jTextFieldFootballMatchHour.setText("");           
            jTextFieldSearch.setText("");
            jDateChooserDate.setDate(null);
            jTextFieldID.setText("");
        
            jComboBoxFootballMatchHomeTeam.setSelectedIndex(0);
            jComboBoxFootballMatchTeamVisitor.setSelectedIndex(0);                    
        }
    }
        
    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        pesquisarPartida();
    }//GEN-LAST:event_jButtonSearchActionPerformed
    // Método que recupera os dados da partida selecionada na tabela
    public void recuperarPartida(){
        if(jTableMatch.getSelectedRow() != -1){
            try {
                pid = (int) jTableMatch.getValueAt(jTableMatch.getSelectedRow(), 0);                
                connect.executaSql("SELECT * FROM partida WHERE pid='"+pid+"'");
                connect.rst.first();

                data = formatacao.format(connect.rst.getDate("data_partida"));            

                if(connect.rst.getInt("qtd_gols_time_visitante") == -1 && connect.rst.getInt("qtd_gols_time_casa") == -1){
                    qtdv = "";
                    qtda = "";
                }else{
                     qtdv = String.valueOf(connect.rst.getInt("qtd_gols_time_visitante"));
                     qtda = String.valueOf(connect.rst.getInt("qtd_gols_time_casa"));
                }
                if(data.equals("01/01/0001")){                
                    jDateChooserDate.setDate(null);                
                }else{
                    jDateChooserDate.setDate(connect.rst.getDate("data_partida"));
                }

                jTextFieldFootballMatchHomeTeamQtd.setText(qtda);
                jTextFieldFootballMatchTeamVisitorQtd.setText(qtdv);
                jTextFieldID.setText(connect.rst.getString("pid"));
                jTextFieldFootballMatchStadium.setText(connect.rst.getString("estadio"));
                jTextFieldFootballMatchHour.setText(connect.rst.getString("hora"));            

                id1 = connect.rst.getInt("time_casa");
                id2 = connect.rst.getInt("time_visitante");

                for(int i = 0; i < jComboBoxIdTeam.getItemCount(); i++){            
                    if(jComboBoxIdTeam.getItemAt(i).equals(String.valueOf(id1))){
                        jComboBoxFootballMatchHomeTeam.setSelectedIndex(i);
                    }

                    if(jComboBoxIdTeam.getItemAt(i).equals(String.valueOf(id2))){
                        jComboBoxFootballMatchTeamVisitor.setSelectedIndex(i);
                    }
                }            

                jButtonFootballMatchCancel.setEnabled(true);
                jButtonFootballMatchSave.setEnabled(false);
                jButtonEdit.setEnabled(true); 
                jButtonNew.setEnabled(true);
                jButtonDelete.setEnabled(true);            

                // habilitarCampos(int homeTeamQtd, int stadium, int homeTeam, int hour, int date, int visitorTeamQtd, int visitorTeam)    
                habilitarCampos(0, 0, 0, 0, 0, 0, 0);
                                                
            } catch (SQLException ex) {
                Logger.getLogger(Form_CadastroTime.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Não foi possivél buscar os dados!");
            }
        }        
    }
    
    private void jTableMatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMatchMouseClicked
        recuperarPartida();
    }//GEN-LAST:event_jTableMatchMouseClicked

    private void jTableMatchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMatchMouseReleased
        recuperarPartida();
    }//GEN-LAST:event_jTableMatchMouseReleased

    private void jTableMatchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableMatchKeyReleased
        recuperarPartida();
    }//GEN-LAST:event_jTableMatchKeyReleased

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a partida?", "Excluir Partida", JOptionPane.YES_NO_OPTION);
        
        if(resposta == JOptionPane.YES_OPTION){
            partidaPojo.setId(Integer.parseInt(jTextFieldID.getText()));
            partidaDao.excluirPartida(partidaPojo);

            // habilitarCampos(int homeTeamQtd, int stadium, int homeTeam, int hour, int date, int visitorTeamQtd, int visitorTeam)    
            habilitarCampos(0, 0, 0, 0, 0, 0, 0);
                        
            jTextFieldFootballMatchHomeTeamQtd.setText("");
            jTextFieldFootballMatchTeamVisitorQtd.setText("");
            jTextFieldFootballMatchStadium.setText("");            
            jTextFieldFootballMatchHour.setText("");
            jDateChooserDate.setDate(null);
            jTextFieldSearch.setText("");
            jTextFieldID.setText("");

            jComboBoxFootballMatchHomeTeam.setSelectedIndex(0);
            jComboBoxFootballMatchTeamVisitor.setSelectedIndex(0);        

            jButtonNew.setEnabled(true);
            jButtonFootballMatchSave.setEnabled(false);
            jButtonFootballMatchCancel.setEnabled(false);        
            jButtonEdit.setEnabled(false);        
            jButtonDelete.setEnabled(false);
            preencherTabela("SELECT * FROM partida ORDER BY pid");            
        }        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        flag = 2;        
        jButtonNew.setEnabled(false);
        jButtonFootballMatchSave.setEnabled(true);
        jButtonFootballMatchCancel.setEnabled(true);        
        jButtonEdit.setEnabled(false);        
        jButtonDelete.setEnabled(false);    

        // habilitarCampos(int homeTeamQtd, int stadium, int homeTeam, int hour, int date, int visitorTeamQtd, int visitorTeam)    
        habilitarCampos(1, 1, 1, 1, 1, 1, 1);                       
        jTextFieldSearch.setText("");
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        connect.disconect();
    }//GEN-LAST:event_formWindowClosed

    private void jTextFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            pesquisarPartida();
        }
    }//GEN-LAST:event_jTextFieldSearchKeyPressed

    private void jTextFieldFootballMatchHourKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFootballMatchHourKeyPressed
        //System.out.println(evt.getKeyCode());
        if(evt.getKeyCode() != 8 ){          
            if(jTextFieldFootballMatchHour.getText().trim().length() == 2){
                jTextFieldFootballMatchHour.setText(jTextFieldFootballMatchHour.getText()+":");                           
            }            
        }        
    }//GEN-LAST:event_jTextFieldFootballMatchHourKeyPressed

    private void jTextFieldFootballMatchHourKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFootballMatchHourKeyTyped
        int k = evt.getKeyChar();
         if((k > 47 && k < 58)) {
             if(jTextFieldFootballMatchHour.getText().length() == 5){
                 evt.setKeyChar((char)KeyEvent.VK_CLEAR);
             }
         } else {
             evt.setKeyChar((char)KeyEvent.VK_CLEAR);
         }
    }//GEN-LAST:event_jTextFieldFootballMatchHourKeyTyped

    private void jTextFieldFootballMatchHomeTeamQtdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFootballMatchHomeTeamQtdKeyTyped
        int k = evt.getKeyChar();
        if((!(k > 47 && k < 58))) {            
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);             
         } 
    }//GEN-LAST:event_jTextFieldFootballMatchHomeTeamQtdKeyTyped

    private void jTextFieldFootballMatchTeamVisitorQtdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFootballMatchTeamVisitorQtdKeyTyped
        int k = evt.getKeyChar();        
        if((!(k > 47 && k < 58))) {            
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);             
         } 
    }//GEN-LAST:event_jTextFieldFootballMatchTeamVisitorQtdKeyTyped

    private void jTextFieldSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyTyped
        int k = evt.getKeyChar();
        if((!(k > 47 && k < 58))) {            
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);             
         } 
    }//GEN-LAST:event_jTextFieldSearchKeyTyped

     public void preencherTabela(String sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "QTD Gols Visitante","QTD Gols Time Casa", "Estadio", "Data Partida", "Hora", "Time Casa", "Time Visitante"};
        
        try {            
            connect.executaSql(sql);
     
            connect.rst.first();
            
            do{ 
                id1 = connect.rst.getInt("time_casa");
                id2 = connect.rst.getInt("time_Visitante");
                data = formatacao.format(connect.rst.getDate("data_partida"));
                
                for(int i = 0; i < jComboBoxIdTeam.getItemCount(); i++){            
                    if(jComboBoxIdTeam.getItemAt(i).equals(String.valueOf(id1))){
                        timeCasa = jComboBoxFootballMatchHomeTeam.getItemAt(i);
                    }

                    if(jComboBoxIdTeam.getItemAt(i).equals(String.valueOf(id2))){
                        timeVisitante = jComboBoxFootballMatchTeamVisitor.getItemAt(i);
                    }
                }          
                 
                if(connect.rst.getInt("qtd_gols_time_visitante") == -1 && connect.rst.getInt("qtd_gols_time_casa") == -1){
                    qtdv = "";
                    qtda = "";
                }else{
                     qtdv = String.valueOf(connect.rst.getInt("qtd_gols_time_visitante"));
                     qtda = String.valueOf(connect.rst.getInt("qtd_gols_time_casa"));
                }
         
                if(data.equals("01/01/0001")){
                    data = "";
                }
                               
                dados.add(new Object[]{connect.rst.getInt("pid"),qtdv, qtda, connect.rst.getString("estadio"),
                                       data,connect.rst.getString("hora"),
                                       timeCasa,timeVisitante});                       
            }while(connect.rst.next());
                        
        } catch (SQLException ex) {
            Logger.getLogger(Form_CadastroTime.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela de times");
        }                
        
        Tabela tabelaPojo = new Tabela(dados, colunas);
        jTableMatch.setModel(tabelaPojo);
        jTableMatch.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableMatch.getColumnModel().getColumn(0).setResizable(false);
        jTableMatch.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableMatch.getColumnModel().getColumn(1).setResizable(false);
        jTableMatch.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTableMatch.getColumnModel().getColumn(2).setResizable(false);
        jTableMatch.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTableMatch.getColumnModel().getColumn(3).setResizable(false);
        jTableMatch.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTableMatch.getColumnModel().getColumn(4).setResizable(false);
        jTableMatch.getColumnModel().getColumn(5).setPreferredWidth(150);
        jTableMatch.getColumnModel().getColumn(5).setResizable(false);
        jTableMatch.getColumnModel().getColumn(6).setPreferredWidth(134);
        jTableMatch.getColumnModel().getColumn(6).setResizable(false);
        jTableMatch.getColumnModel().getColumn(7).setPreferredWidth(100);
        jTableMatch.getColumnModel().getColumn(7).setResizable(false);
        jTableMatch.getTableHeader().setReorderingAllowed(false);
        jTableMatch.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);       
        jTableMatch.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        
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
        
        java.awt.EventQueue.invokeLater(() -> {
            new Form_CadastroPartida().setVisible(true);
         });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonFootballMatchCancel;
    private javax.swing.JButton jButtonFootballMatchSave;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxFootballMatchHomeTeam;
    private javax.swing.JComboBox<String> jComboBoxFootballMatchTeamVisitor;
    private javax.swing.JComboBox<String> jComboBoxIdTeam;
    private com.toedter.calendar.JDateChooser jDateChooserDate;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFootballMatchDate;
    private javax.swing.JLabel jLabelFootballMatchHomeTeam;
    private javax.swing.JLabel jLabelFootballMatchHomeTeamQtd;
    private javax.swing.JLabel jLabelFootballMatchHour;
    private javax.swing.JLabel jLabelFootballMatchStadium;
    private javax.swing.JLabel jLabelFootballMatchTeamVisitor;
    private javax.swing.JLabel jLabelFootballMatchTeamVisitorQtd;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelLogoFootballMatchDescription;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMatch;
    private javax.swing.JTextField jTextFieldFootballMatchHomeTeamQtd;
    private javax.swing.JTextField jTextFieldFootballMatchHour;
    private javax.swing.JTextField jTextFieldFootballMatchStadium;
    private javax.swing.JTextField jTextFieldFootballMatchTeamVisitorQtd;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}