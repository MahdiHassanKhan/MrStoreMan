/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrstoreman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mahdi
 */
public class EmployeeDetails extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeDetails
     */
    public EmployeeDetails() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmployeeDetails = new javax.swing.JTable();
        jButtonBFCE = new javax.swing.JButton();
        jButtonFetchinED = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelEDClose = new javax.swing.JLabel();
        jLabelEDMin = new javax.swing.JLabel();
        EmployeeDetailsSearchField = new javax.swing.JTextField();
        jComboBoxEDSettings = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(17, 32, 65));

        jTableEmployeeDetails.setBackground(new java.awt.Color(243, 67, 73));
        jTableEmployeeDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTableEmployeeDetails.setForeground(new java.awt.Color(240, 240, 240));
        jTableEmployeeDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact", "Email", "Joining Date", "Salary", "Quitting Date", "Password", "Location"
            }
        ));
        jScrollPane1.setViewportView(jTableEmployeeDetails);

        jButtonBFCE.setBackground(new java.awt.Color(243, 67, 73));
        jButtonBFCE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonBFCE.setForeground(new java.awt.Color(240, 240, 240));
        jButtonBFCE.setText("<-");
        jButtonBFCE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBFCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBFCEMouseClicked(evt);
            }
        });
        jButtonBFCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBFCEActionPerformed(evt);
            }
        });

        jButtonFetchinED.setBackground(new java.awt.Color(243, 67, 73));
        jButtonFetchinED.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonFetchinED.setForeground(new java.awt.Color(240, 240, 240));
        jButtonFetchinED.setText("Fetch");
        jButtonFetchinED.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFetchinED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFetchinEDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Employee Data");

        jLabelEDClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelEDClose.setForeground(new java.awt.Color(240, 240, 240));
        jLabelEDClose.setText("X");
        jLabelEDClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEDClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEDCloseMouseClicked(evt);
            }
        });

        jLabelEDMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelEDMin.setForeground(new java.awt.Color(240, 240, 240));
        jLabelEDMin.setText("-");
        jLabelEDMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEDMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEDMinMouseClicked(evt);
            }
        });

        EmployeeDetailsSearchField.setBackground(new java.awt.Color(234, 67, 73));
        EmployeeDetailsSearchField.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        EmployeeDetailsSearchField.setForeground(new java.awt.Color(240, 240, 240));
        EmployeeDetailsSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeDetailsSearchFieldActionPerformed(evt);
            }
        });

        jComboBoxEDSettings.setBackground(new java.awt.Color(234, 67, 73));
        jComboBoxEDSettings.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxEDSettings.setForeground(new java.awt.Color(240, 240, 240));
        jComboBoxEDSettings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Current", "Terminated" }));
        jComboBoxEDSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxEDSettingsMouseClicked(evt);
            }
        });
        jComboBoxEDSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEDSettingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(EmployeeDetailsSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFetchinED, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBFCE, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(jComboBoxEDSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabelEDMin)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEDClose)
                        .addGap(31, 31, 31))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxEDSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelEDMin)
                        .addComponent(jLabelEDClose)
                        .addComponent(jButtonBFCE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonFetchinED, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmployeeDetailsSearchField))
                .addContainerGap(29, Short.MAX_VALUE))
        );

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFetchinEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFetchinEDActionPerformed
        if(EmployeeDetailsSearchField.getText().length()==0)
        {
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection2 = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=MrStoreMan;selectMethod=cursor", "sa", "123456");
            jTableEmployeeDetails.setModel(new DefaultTableModel(null, new String[]{"ID","Name","Contact","Email","Joining Date","Salary","Quitting Date","Password","Location"}));
              Statement st2 = connection2.createStatement();
              if(jComboBoxEDSettings.getSelectedIndex()==0)
              {
                  String sql2 = "select * from Employee";
                  ResultSet rs2 = st2.executeQuery(sql2);
                  while(rs2.next()){
                  String EmployeeId = String.valueOf(rs2.getInt("EmployeeId"));
                  String EmployeeName = rs2.getString("EmployeeName");
                  String EmployeeContact = rs2.getString("EmployeeContact");
                  String EmployeeEmail = rs2.getString("EmployeeEmail");
                  String EmployeeJoiningDate = rs2.getString("EmployeeJoiningDate");
                  String EmployeeSalary = rs2.getString("EmployeeSalary");
                  String EmployeeQuittingDate = rs2.getString("EmployeeQuittingDate");
                  String EmployeePassword = rs2.getString("EmployeePassword");
                  String EmployeeLocation = rs2.getString("EmployeeLocation");
                  
                  String EmployeeData[] = {EmployeeId,EmployeeName,EmployeeContact,EmployeeEmail,EmployeeJoiningDate,EmployeeSalary,EmployeeQuittingDate,EmployeePassword,EmployeeLocation};
                  DefaultTableModel ETM = (DefaultTableModel)jTableEmployeeDetails.getModel();
                  ETM.addRow(EmployeeData);
                }
              
                connection2.close();
                }
              
              if(jComboBoxEDSettings.getSelectedIndex()==1)
              {
                  String sql2 = "select * from Employee WHERE EmployeeQuittingDate = 'In Contract' ";
                  ResultSet rs2 = st2.executeQuery(sql2);
                  while(rs2.next()){
                  String EmployeeId = String.valueOf(rs2.getInt("EmployeeId"));
                  String EmployeeName = rs2.getString("EmployeeName");
                  String EmployeeContact = rs2.getString("EmployeeContact");
                  String EmployeeEmail = rs2.getString("EmployeeEmail");
                  String EmployeeJoiningDate = rs2.getString("EmployeeJoiningDate");
                  String EmployeeSalary = rs2.getString("EmployeeSalary");
                  String EmployeeQuittingDate = rs2.getString("EmployeeQuittingDate");
                  String EmployeePassword = rs2.getString("EmployeePassword");
                  String EmployeeLocation = rs2.getString("EmployeeLocation");
                  
                  String EmployeeData[] = {EmployeeId,EmployeeName,EmployeeContact,EmployeeEmail,EmployeeJoiningDate,EmployeeSalary,EmployeeQuittingDate,EmployeePassword,EmployeeLocation};
                  DefaultTableModel ETM = (DefaultTableModel)jTableEmployeeDetails.getModel();
                  ETM.addRow(EmployeeData);
                }
              
                connection2.close();
                }
              
              if(jComboBoxEDSettings.getSelectedIndex()==2)
              {
                  String sql2 = "select * from Employee WHERE EmployeeQuittingDate <> 'In Contract' ";
                  ResultSet rs2 = st2.executeQuery(sql2);
                  while(rs2.next()){
                  String EmployeeId = String.valueOf(rs2.getInt("EmployeeId"));
                  String EmployeeName = rs2.getString("EmployeeName");
                  String EmployeeContact = rs2.getString("EmployeeContact");
                  String EmployeeEmail = rs2.getString("EmployeeEmail");
                  String EmployeeJoiningDate = rs2.getString("EmployeeJoiningDate");
                  String EmployeeSalary = rs2.getString("EmployeeSalary");
                  String EmployeeQuittingDate = rs2.getString("EmployeeQuittingDate");
                  String EmployeePassword = rs2.getString("EmployeePassword");
                  String EmployeeLocation = rs2.getString("EmployeeLocation");
                  
                  String EmployeeData[] = {EmployeeId,EmployeeName,EmployeeContact,EmployeeEmail,EmployeeJoiningDate,EmployeeSalary,EmployeeQuittingDate,EmployeePassword,EmployeeLocation};
                  DefaultTableModel ETM = (DefaultTableModel)jTableEmployeeDetails.getModel();
                  ETM.addRow(EmployeeData);
                }
              
                connection2.close();
                }
              
              
              }
              
            
            catch (Exception e) {
                //e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
        
        else
        {
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection2 = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=MrStoreMan;selectMethod=cursor", "sa", "123456");
            jTableEmployeeDetails.setModel(new DefaultTableModel(null, new String[]{"ID","Name","Contact","Email","Joining Date","Salary","Quitting Date","Password","Location"}));
              Statement st2 = connection2.createStatement();
              
              if(jComboBoxEDSettings.getSelectedIndex()==0)
              {
              String sql2 = "select * from Employee WHERE EmployeeId LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeName LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeContact LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeEmail LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeJoiningDate LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeSalary LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeQuittingDate LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeePassword LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeLocation LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              ResultSet rs2 = st2.executeQuery(sql2);
              while(rs2.next()){
                  String EmployeeId = String.valueOf(rs2.getInt("EmployeeId"));
                  String EmployeeName = rs2.getString("EmployeeName");
                  String EmployeeContact = rs2.getString("EmployeeContact");
                  String EmployeeEmail = rs2.getString("EmployeeEmail");
                  String EmployeeJoiningDate = rs2.getString("EmployeeJoiningDate");
                  String EmployeeSalary = rs2.getString("EmployeeSalary");
                  String EmployeeQuittingDate = rs2.getString("EmployeeQuittingDate");
                  String EmployeePassword = rs2.getString("EmployeePassword");
                  String EmployeeLocation = rs2.getString("EmployeeLocation");
                  
                  String EmployeeData[] = {EmployeeId,EmployeeName,EmployeeContact,EmployeeEmail,EmployeeJoiningDate,EmployeeSalary,EmployeeQuittingDate,EmployeePassword,EmployeeLocation};
                  DefaultTableModel ETM = (DefaultTableModel)jTableEmployeeDetails.getModel();
                  ETM.addRow(EmployeeData);
                  }
              
                  connection2.close();
              }
              
              if(jComboBoxEDSettings.getSelectedIndex()==1)
              {
              String sql2 = "select * from Employee WHERE EmployeeQuittingDate = 'In Contract' AND EmployeeId LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeQuittingDate = 'In Contract' AND EmployeeName LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeQuittingDate = 'In Contract' AND EmployeeContact LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeQuittingDate = 'In Contract' AND EmployeeEmail LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeQuittingDate = 'In Contract' AND EmployeeJoiningDate LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeQuittingDate = 'In Contract' AND EmployeeSalary LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeQuittingDate = 'In Contract' AND EmployeeQuittingDate LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeQuittingDate = 'In Contract' AND EmployeePassword LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeQuittingDate = 'In Contract' AND EmployeeLocation LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              ResultSet rs2 = st2.executeQuery(sql2);
              while(rs2.next()){
                  String EmployeeId = String.valueOf(rs2.getInt("EmployeeId"));
                  String EmployeeName = rs2.getString("EmployeeName");
                  String EmployeeContact = rs2.getString("EmployeeContact");
                  String EmployeeEmail = rs2.getString("EmployeeEmail");
                  String EmployeeJoiningDate = rs2.getString("EmployeeJoiningDate");
                  String EmployeeSalary = rs2.getString("EmployeeSalary");
                  String EmployeeQuittingDate = rs2.getString("EmployeeQuittingDate");
                  String EmployeePassword = rs2.getString("EmployeePassword");
                  String EmployeeLocation = rs2.getString("EmployeeLocation");
                  
                  String EmployeeData[] = {EmployeeId,EmployeeName,EmployeeContact,EmployeeEmail,EmployeeJoiningDate,EmployeeSalary,EmployeeQuittingDate,EmployeePassword,EmployeeLocation};
                  DefaultTableModel ETM = (DefaultTableModel)jTableEmployeeDetails.getModel();
                  ETM.addRow(EmployeeData);
                  }
              
                  connection2.close();
              }
              
              
              if(jComboBoxEDSettings.getSelectedIndex()==2)
              {
              String sql2 = "select * from Employee WHERE EmployeeQuittingDate <> 'In Contract' AND EmployeeId LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeQuittingDate <> 'In Contract' AND EmployeeName LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeQuittingDate <> 'In Contract' AND EmployeeContact LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeQuittingDate <> 'In Contract' AND EmployeeEmail LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeQuittingDate <> 'In Contract' AND EmployeeJoiningDate LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeQuittingDate <> 'In Contract' AND EmployeeSalary LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeQuittingDate <> 'In Contract' AND EmployeeQuittingDate LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeQuittingDate <> 'In Contract' AND EmployeePassword LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              sql2 += "UNION select * from Employee WHERE EmployeeQuittingDate <> 'In Contract' AND EmployeeLocation LIKE '%"+EmployeeDetailsSearchField.getText()+"%'";
              ResultSet rs2 = st2.executeQuery(sql2);
              while(rs2.next()){
                  String EmployeeId = String.valueOf(rs2.getInt("EmployeeId"));
                  String EmployeeName = rs2.getString("EmployeeName");
                  String EmployeeContact = rs2.getString("EmployeeContact");
                  String EmployeeEmail = rs2.getString("EmployeeEmail");
                  String EmployeeJoiningDate = rs2.getString("EmployeeJoiningDate");
                  String EmployeeSalary = rs2.getString("EmployeeSalary");
                  String EmployeeQuittingDate = rs2.getString("EmployeeQuittingDate");
                  String EmployeePassword = rs2.getString("EmployeePassword");
                  String EmployeeLocation = rs2.getString("EmployeeLocation");
                  
                  String EmployeeData[] = {EmployeeId,EmployeeName,EmployeeContact,EmployeeEmail,EmployeeJoiningDate,EmployeeSalary,EmployeeQuittingDate,EmployeePassword,EmployeeLocation};
                  DefaultTableModel ETM = (DefaultTableModel)jTableEmployeeDetails.getModel();
                  ETM.addRow(EmployeeData);
                  }
              
                  connection2.close();
              }
              
            }
            
            catch (Exception e) {
                //e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonFetchinEDActionPerformed

    private void jButtonBFCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBFCEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBFCEActionPerformed

    private void jButtonBFCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBFCEMouseClicked
        // TODO add your handling code here:
        EmployeeInfo ei2 = new EmployeeInfo();
        ei2.setVisible(true);
        ei2.pack();
        ei2.setLocationRelativeTo(null);
        ei2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonBFCEMouseClicked

    private void jLabelEDCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEDCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelEDCloseMouseClicked

    private void jLabelEDMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEDMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelEDMinMouseClicked

    private void EmployeeDetailsSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeDetailsSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeDetailsSearchFieldActionPerformed

    private void jComboBoxEDSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxEDSettingsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEDSettingsMouseClicked

    private void jComboBoxEDSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEDSettingsActionPerformed
        /*int settings = jComboBoxEDSettings.getSelectedIndex();
        if(settings == 1)
        {
            Requests r2 = new Requests();
            r2.setVisible(true);
            r2.pack();
            r2.setLocationRelativeTo(null);
            r2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
        else if(settings == 2)
        {
            Choose chs3 = new Choose();
            chs3.setVisible(true);
            chs3.pack();
            chs3.setLocationRelativeTo(null);
            chs3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }*/
    }//GEN-LAST:event_jComboBoxEDSettingsActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmployeeDetailsSearchField;
    private javax.swing.JButton jButtonBFCE;
    private javax.swing.JButton jButtonFetchinED;
    private javax.swing.JComboBox<String> jComboBoxEDSettings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEDClose;
    private javax.swing.JLabel jLabelEDMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployeeDetails;
    // End of variables declaration//GEN-END:variables
}
