package com.ufc.Bolao_da_copa.View;

import com.ufc.Bolao_da_copa.Bolao_da_Copa.ConnectionFactory;
import com.ufc.Bolao_da_copa.Pojo.Partida;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;
/**
 *
 * @author randel
 */
public class Tela_timePartida extends javax.swing.JFrame {
    DefaultListModel dlm = new DefaultListModel();     
    DefaultListModel dlm2 = new DefaultListModel();     
    ConnectionFactory connect = new ConnectionFactory();
    String timeCasa, timeVisitante, tnome;
    int time_casa, time_visitante, pid, gtd_time_casa, qtd_time_visitante;    
    String[] lista;
    /**
     * Creates new form Tela_visualizarGanhadores
     */
    public Tela_timePartida() {  
        connect.connection();
        initComponents();                    
        jListTime.setModel(dlm); 
        jListPartida.setModel(dlm2);
        preencherLista();       
        preencherListaPesquisa();
        JList dataList = new JList(lista);
        AutoCompleteDecorator.decorate(dataList, jTextFieldPesquisa, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTime = new javax.swing.JList<>();
        jLabelPartida = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListPartida = new javax.swing.JList<>();
        jLabelTimes1 = new javax.swing.JLabel();
        jLabelTimes = new javax.swing.JLabel();
        jLabelSeta = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/pesquisar2_1.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.setToolTipText("Nome do Time");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 120, 40));

        jListTime.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jListTime.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 5", "Item 5", "Item 5", "Item 5", "Item 5", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListTimeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jListTimeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jListTimeMouseReleased(evt);
            }
        });
        jListTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jListTimeKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jListTime);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 230, 240));

        jLabelPartida.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabelPartida.setForeground(new java.awt.Color(130, 86, 34));
        jLabelPartida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPartida.setText("Partidas");
        jPanel1.add(jLabelPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 230, 60));

        jListPartida.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jListPartida.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListPartida);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 390, 250));

        jLabelTimes1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabelTimes1.setForeground(new java.awt.Color(130, 86, 34));
        jLabelTimes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTimes1.setText("Visualizar");
        jPanel1.add(jLabelTimes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -10, 300, 80));

        jLabelTimes.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabelTimes.setForeground(new java.awt.Color(130, 86, 34));
        jLabelTimes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTimes.setText("Times");
        jPanel1.add(jLabelTimes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, 60));

        jLabelSeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/seta_1.png"))); // NOI18N
        jPanel1.add(jLabelSeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 170, 110));

        jTextFieldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisaKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 180, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufc/Bolao_da_copa/Imagens/fundo_abstrac_1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(971, 591));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    
    private void preencherLista(){
        try {
            connect.executaSql("SELECT tnome FROM time order by tnome");
            connect.rst.first();
            
            do{
                dlm.addElement(connect.rst.getString("tnome"));
            }while(connect.rst.next());
                    
            } catch (SQLException ex) {
            Logger.getLogger(Tela_timePartida.class.getName()).log(Level.SEVERE, null, ex);
        }                        
    }    
              
   private void preencherListaPartidas(ArrayList<Partida> partidas){
        String qtdC = "";
        String qtdV = "";
        
        if (partidas != null){
            for(Partida p : partidas){
                try {
                    connect.executaSql("SELECT tnome FROM time WHERE tid = '"+p.getTime_casa()+"';");

                    if(connect.rst.first()){
                        timeCasa = connect.rst.getString("tnome");

                        connect.executaSql("SELECT tnome FROM time WHERE tid = '"+p.getTime_visitante()+"';");
                        connect.rst.first();

                        if(connect.rst.first()){
                            timeVisitante = connect.rst.getString("tnome");

                            if(p.getQtd_gols_time_casa() == -1){
                                qtdC = "";
                            }else{
                                qtdC = String.valueOf(p.getQtd_gols_time_casa());
                            }

                            if(p.getQtd_gols_time_visitante() == -1){
                                qtdV = "";
                            }else{
                                qtdV = String.valueOf(p.getQtd_gols_time_visitante());
                            }
                            dlm2.addElement("P"+p.getId()+": "+timeCasa+" "+qtdC+" X "+""+qtdV+" " +timeVisitante);            
                        }                    
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Tela_timePartida.class.getName()).log(Level.SEVERE, null, ex);
                }                   
            }
        }               
   }
   
    private void obterPartida(int opcao){          
        ArrayList<Partida> partidas = null;
        String sql  = "";
        int qtdLinhas = 0;
        dlm2.removeAllElements();
        obterNomeTime(opcao);       
       
        if (opcao == 1){
            sql = "SELECT P.pid, P.time_casa, P.time_visitante,"
                + " P.qtd_gols_time_visitante, P.qtd_gols_time_casa,"
                + " P.estadio, P.data_partida, P.hora, T.tnome, T.tid" +
                " FROM Partida P, Time T, time_relacao_partida TRP" +
                " WHERE P.pid = TRP.pid AND T.tid = TRP.tid AND T.tnome = '"+tnome+"' ORDER BY P.pid;";                          
        }else{
            sql = "SELECT P.pid, P.time_casa, P.time_visitante,"
                + " P.qtd_gols_time_visitante, P.qtd_gols_time_casa,"
                + " P.estadio, P.data_partida, P.hora, T.tnome, T.tid" +
                " FROM Partida P, Time T, time_relacao_partida TRP" +
                " WHERE P.pid = TRP.pid AND T.tid = TRP.tid AND T.tnome LIKE '%"+tnome+"%' ORDER BY P.pid;";                          
        }              
       
       // obtém todas as partidas de um time
        try {
            connect.executaSql(sql);
            if(connect.rst.first()){                        
                if (connect.rst.last()) // verifica se existe linhas
                {
                    qtdLinhas = connect.rst.getRow(); // vai para o ultimo registro
                    connect.rst.beforeFirst(); // volta para antes do primeiro
                    connect.rst.next(); // Pega o primeiro registro                    
                }
                
                partidas  = new ArrayList<>(qtdLinhas);
                
                do{              
                    Partida partida = new Partida();
                    partida.setId(connect.rst.getInt("pid"));
                    partida.setTime_casa(connect.rst.getInt("time_casa"));
                    partida.setTime_visitante(connect.rst.getInt("time_visitante"));
                    partida.setQtd_gols_time_casa(connect.rst.getInt("qtd_gols_time_casa"));
                    partida.setQtd_gols_time_visitante(connect.rst.getInt("qtd_gols_time_visitante"));
                    partidas.add(partida);                                    
                }
                while(connect.rst.next());                
            }            
            preencherListaPartidas(partidas);            
        } catch (SQLException ex) {
            Logger.getLogger(Tela_timePartida.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    private void obterNomeTime(int opcao){
        if(opcao == 1){
            tnome = jListTime.getSelectedValue().trim();
        }else{
            tnome = jTextFieldPesquisa.getText().trim();
        }                        
    }
    
    private void jListTimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListTimeMouseClicked
        obterPartida(1);
    }//GEN-LAST:event_jListTimeMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        connect.disconect();
    }//GEN-LAST:event_formWindowClosed

    private void jListTimeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListTimeKeyReleased
        obterPartida(1);
    }//GEN-LAST:event_jListTimeKeyReleased

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        if(!jTextFieldPesquisa.getText().trim().equals("")){
            obterPartida(0);        
            jTextFieldPesquisa.setText("");
        }        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jListTimeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListTimeMousePressed
        obterPartida(1);
    }//GEN-LAST:event_jListTimeMousePressed

    private void jListTimeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListTimeMouseReleased
        obterPartida(1);
    }//GEN-LAST:event_jListTimeMouseReleased

    private void jTextFieldPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            obterPartida(0);
            jTextFieldPesquisa.setText("");
        }
    }//GEN-LAST:event_jTextFieldPesquisaKeyPressed
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
            java.util.logging.Logger.getLogger(Tela_timePartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tela_timePartida().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPartida;
    private javax.swing.JLabel jLabelSeta;
    private javax.swing.JLabel jLabelTimes;
    private javax.swing.JLabel jLabelTimes1;
    private javax.swing.JList<String> jListPartida;
    private javax.swing.JList<String> jListTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
