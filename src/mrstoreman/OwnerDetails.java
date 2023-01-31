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
import static mrstoreman.Login.id;
import static mrstoreman.Login.username;

/**
 *
 * @author Mahdi & peom
 */
public class OwnerDetails extends javax.swing.JFrame {

    /**
     * Creates new form OwnerDetails
     */
    public OwnerDetails() {
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
        jButtonBFOD = new javax.swing.JButton();
        jButtonFetchinOD = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOwnerDetails = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabelODMin = new javax.swing.JLabel();
        jLabelODClose = new javax.swing.JLabel();
        OwnerDetailsSearchField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(17, 32, 65));

        jButtonBFOD.setBackground(new java.awt.Color(243, 67, 73));
        jButtonBFOD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonBFOD.setForeground(new java.awt.Color(240, 240, 240));
        jButtonBFOD.setText("<-");
        jButtonBFOD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBFOD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBFODMouseClicked(evt);
            }
        });
        jButtonBFOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBFODActionPerformed(evt);
            }
        });

        jButtonFetchinOD.setBackground(new java.awt.Color(243, 67, 73));
        jButtonFetchinOD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonFetchinOD.setForeground(new java.awt.Color(240, 240, 240));
        jButtonFetchinOD.setText("Fetch");
        jButtonFetchinOD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFetchinOD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFetchinODMouseClicked(evt);
            }
        });
        jButtonFetchinOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFetchinODActionPerformed(evt);
            }
        });

        jTableOwnerDetails.setBackground(new java.awt.Color(243, 67, 73));
        jTableOwnerDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTableOwnerDetails.setForeground(new java.awt.Color(240, 240, 240));
        jTableOwnerDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact", "Email", "Password", "Location"
            }
        ));
        jTableOwnerDetails.setSelectionForeground(new java.awt.Color(240, 240, 240));
        jScrollPane1.setViewportView(jTableOwnerDetails);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Owner Data");

        jLabelODMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelODMin.setForeground(new java.awt.Color(240, 240, 240));
        jLabelODMin.setText("-");
        jLabelODMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelODMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelODMinMouseClicked(evt);
            }
        });

        jLabelODClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelODClose.setForeground(new java.awt.Color(240, 240, 240));
        jLabelODClose.setText("X");
        jLabelODClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelODClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelODCloseMouseClicked(evt);
            }
        });

        OwnerDetailsSearchField.setBackground(new java.awt.Color(234, 67, 73));
        OwnerDetailsSearchField.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        OwnerDetailsSearchField.setForeground(new java.awt.Color(240, 240, 240));
        OwnerDetailsSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OwnerDetailsSearchFieldActionPerformed(evt);
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
                        .addComponent(jButtonBFOD)
                        .addGap(254, 254, 254)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelODMin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelODClose)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(OwnerDetailsSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButtonFetchinOD)
                                .addGap(27, 27, 27))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelODMin)
                        .addComponent(jLabelODClose)
                        .addComponent(jButtonBFOD))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonFetchinOD)
                    .addComponent(OwnerDetailsSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
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

    private void jButtonFetchinODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFetchinODActionPerformed
        if(OwnerDetailsSearchField.getText().length()==0)
        {
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=MrStoreMan;selectMethod=cursor", "sa", "123456");
            jTableOwnerDetails.setModel(new DefaultTableModel(null, new String[]{"ID","Name","Contact","Email","Password","Location"}));  
            Statement st1 = connection.createStatement();
              String sql1 = "select * from Owner";
              ResultSet rs1 = st1.executeQuery(sql1);
              while(rs1.next()){
                  String OwnerId = String.valueOf(rs1.getInt("OwnerId"));
                  String OwnerName = rs1.getString("OwnerName");
                  String OwnerContact = rs1.getString("OwnerContact");
                  String OwnerEmail = rs1.getString("OwnerEmail");
                  String OwnerPassword = rs1.getString("OwnerPassword");
                  String OwnerLocation = rs1.getString("OwnerLocation");
                  String SecuredPassword = "";
                  for(int i=0;i<OwnerPassword.length();i++)
                  {
                      SecuredPassword +="*";
                  }
                  
                  String OwnerData[] = {OwnerId,OwnerName,OwnerContact,OwnerEmail,SecuredPassword,OwnerLocation};
               
                  DefaultTableModel OTM = (DefaultTableModel)jTableOwnerDetails.getModel();
                  OTM.addRow(OwnerData);
              }
              
            connection.close();
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
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=MrStoreMan;selectMethod=cursor", "sa", "123456");
            jTableOwnerDetails.setModel(new DefaultTableModel(null, new String[]{"ID","Name","Contact","Email","Password","Location"})); 
            Statement st1 = connection.createStatement();
              String sql1 = "select * from Owner WHERE OwnerId LIKE '%"+OwnerDetailsSearchField.getText()+"%'";
              sql1 += "UNION select * from Owner WHERE OwnerName LIKE '%"+OwnerDetailsSearchField.getText()+"%'";
              sql1 += "UNION select * from Owner WHERE OwnerContact LIKE '%"+OwnerDetailsSearchField.getText()+"%'";
              sql1 += "UNION select * from Owner WHERE OwnerEmail LIKE '%"+OwnerDetailsSearchField.getText()+"%'";
              sql1 += "UNION select * from Owner WHERE OwnerPassword LIKE '%"+OwnerDetailsSearchField.getText()+"%'";
              sql1 += "UNION select * from Owner WHERE OwnerLocation LIKE '%"+OwnerDetailsSearchField.getText()+"%'";
              ResultSet rs1 = st1.executeQuery(sql1);
              while(rs1.next()){
                  String OwnerId = String.valueOf(rs1.getInt("OwnerId"));
                  String OwnerName = rs1.getString("OwnerName");
                  String OwnerContact = rs1.getString("OwnerContact");
                  String OwnerEmail = rs1.getString("OwnerEmail");
                  String OwnerPassword = rs1.getString("OwnerPassword");
                  String OwnerLocation = rs1.getString("OwnerLocation");
                  String SecuredPassword = "";
                  for(int i=0;i<OwnerPassword.length();i++)
                  {
                      SecuredPassword +="*";
                  }
                  
                  String OwnerData[] = {OwnerId,OwnerName,OwnerContact,OwnerEmail,SecuredPassword,OwnerLocation};
                  DefaultTableModel OTM = (DefaultTableModel)jTableOwnerDetails.getModel();
                  OTM.addRow(OwnerData);
              }
              
            connection.close();
            } 
            
            catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonFetchinODActionPerformed

    private void jButtonBFODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBFODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBFODActionPerformed

    private void jButtonBFODMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBFODMouseClicked
        // TODO add your handling code here:
                      /*OwnerInterface oi = new OwnerInterface();
                      oi.setVisible(true);
                      oi.pack();
                      oi.setLocationRelativeTo(null);
                      oi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                      this.dispose();*/
                      //JOptionPane.showMessageDialog(null,"matched");
                      //OwnerInterface oiStart = new OwnerInterface();
/*******************/ //username = rsLogin.getString("OwnerName"); /*******************/

/*******************/ new OwnerInterface(id,username).setVisible(true); /*******************/
                      this.dispose(); 

    }//GEN-LAST:event_jButtonBFODMouseClicked

    private void jButtonFetchinODMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFetchinODMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFetchinODMouseClicked

    private void jLabelODMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelODMinMouseClicked
        
        this.setState(JFrame.ICONIFIED);
        
    }//GEN-LAST:event_jLabelODMinMouseClicked

    private void jLabelODCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelODCloseMouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event_jLabelODCloseMouseClicked

    private void OwnerDetailsSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OwnerDetailsSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OwnerDetailsSearchFieldActionPerformed

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
            java.util.logging.Logger.getLogger(OwnerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OwnerDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField OwnerDetailsSearchField;
    private javax.swing.JButton jButtonBFOD;
    private javax.swing.JButton jButtonFetchinOD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelODClose;
    private javax.swing.JLabel jLabelODMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOwnerDetails;
    // End of variables declaration//GEN-END:variables
}