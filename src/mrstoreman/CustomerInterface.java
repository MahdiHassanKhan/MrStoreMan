/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrstoreman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahdi
 */
public class CustomerInterface extends javax.swing.JFrame {

    /**
     * Creates new form CustomerInterface
     */
    static String customerid2;
    static String customername2;
    
    static String id4;
    static String username4;
    static String contact3;
    static String email3;
    static String salary2;
    static String password3;
    static String location3;
    
    public CustomerInterface() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public CustomerInterface(String customerid, String customername) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        jLabelCustomerID.setText(customerid);
        jLabelCustomerName.setText(customername);
    }

    

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCustomerID = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelClose2 = new javax.swing.JLabel();
        jLabelMin2 = new javax.swing.JLabel();
        jButtonDevelopers2 = new javax.swing.JButton();
        jButtonEEB = new javax.swing.JButton();
        jLabelCustomerName = new javax.swing.JLabel();
        jComboBoxEmployeeSettings = new javax.swing.JComboBox<>();
        jButtonBuyItems = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(17, 32, 65));
        jPanel5.setForeground(new java.awt.Color(234, 67, 73));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("____________________________");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("________________________");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("______________");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setText("Customer");

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\Java\\MrStoreMan\\images\\Mr.StoreManLogo2.png")); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelCustomerID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCustomerID.setForeground(new java.awt.Color(240, 240, 240));
        jLabelCustomerID.setText("ID");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(66, 66, 66))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabelCustomerID)
                        .addGap(112, 112, 112))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabelCustomerID)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        jPanel3.setBackground(new java.awt.Color(234, 67, 73));

        jLabelClose2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose2.setForeground(new java.awt.Color(240, 240, 240));
        jLabelClose2.setText("X");
        jLabelClose2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClose2MouseClicked(evt);
            }
        });

        jLabelMin2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin2.setForeground(new java.awt.Color(240, 240, 240));
        jLabelMin2.setText("-");
        jLabelMin2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMin2MouseClicked(evt);
            }
        });

        jButtonDevelopers2.setBackground(new java.awt.Color(17, 32, 65));
        jButtonDevelopers2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDevelopers2.setForeground(new java.awt.Color(240, 240, 240));
        jButtonDevelopers2.setText("Developers");
        jButtonDevelopers2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDevelopers2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDevelopers2MouseClicked(evt);
            }
        });
        jButtonDevelopers2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevelopers2ActionPerformed(evt);
            }
        });

        jButtonEEB.setBackground(new java.awt.Color(17, 32, 65));
        jButtonEEB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEEB.setForeground(new java.awt.Color(240, 240, 240));
        jButtonEEB.setText("Exit");
        jButtonEEB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEEB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEEBMouseClicked(evt);
            }
        });

        jLabelCustomerName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCustomerName.setForeground(new java.awt.Color(240, 240, 240));
        jLabelCustomerName.setText("User");

        jComboBoxEmployeeSettings.setBackground(new java.awt.Color(17, 32, 65));
        jComboBoxEmployeeSettings.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxEmployeeSettings.setForeground(new java.awt.Color(240, 240, 240));
        jComboBoxEmployeeSettings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Settings", "Account", "Log Out" }));
        jComboBoxEmployeeSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEmployeeSettingsActionPerformed(evt);
            }
        });

        jButtonBuyItems.setBackground(new java.awt.Color(17, 32, 65));
        jButtonBuyItems.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBuyItems.setForeground(new java.awt.Color(240, 240, 240));
        jButtonBuyItems.setText("Buy Items");
        jButtonBuyItems.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuyItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBuyItemsMouseClicked(evt);
            }
        });
        jButtonBuyItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuyItemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelCustomerName)
                .addGap(134, 134, 134)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 138, Short.MAX_VALUE)
                        .addComponent(jComboBoxEmployeeSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMin2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelClose2)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonEEB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBuyItems, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDevelopers2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClose2)
                    .addComponent(jLabelMin2)
                    .addComponent(jLabelCustomerName)
                    .addComponent(jComboBoxEmployeeSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBuyItems, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jButtonDevelopers2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jButtonEEB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelClose2MouseClicked

    private void jLabelMin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin2MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin2MouseClicked

    private void jButtonDevelopers2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDevelopers2MouseClicked
        DevelopersCustomer dc3 = new DevelopersCustomer();
        dc3.setVisible(true);
        dc3.pack();
        dc3.setLocationRelativeTo(null);
        dc3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonDevelopers2MouseClicked

    private void jButtonDevelopers2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevelopers2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDevelopers2ActionPerformed

    private void jButtonEEBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEEBMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButtonEEBMouseClicked

    private void jComboBoxEmployeeSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEmployeeSettingsActionPerformed
        int settings = jComboBoxEmployeeSettings.getSelectedIndex();

        if(settings == 1)
        {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connectionLogin = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=MrStoreMan;selectMethod=cursor", "sa", "123456");
                Statement stLogin = connectionLogin.createStatement();

                String sqlLogin = "select * from Customer where CustomerId=?";
                PreparedStatement pstLogin = connectionLogin.prepareStatement(sqlLogin);
                pstLogin.setString(1, jLabelCustomerID.getText());
                ResultSet rsLogin = pstLogin.executeQuery();

                //String sqlLogin2 = "select * from Employee where EmployeeEmail = ? and EmployeePassword = ?";
                //PreparedStatement pstLogin2 = connectionLogin.prepareStatement(sqlLogin2);
                //pstLogin2.setString(1, emailorphone.getText());
                //pstLogin2.setString(2, password.getText());
                //ResultSet rsLogin2 = pstLogin2.executeQuery();
                //while(rsLogin.next()){
                    /*while(rsLogin.next())
                    {
                        msg = rsLogin.getString("OwnerName");
                    }*/
                    if(rsLogin.next())
                    {
                        //JOptionPane.showMessageDialog(null,"matched");
                        //OwnerInterface oiStart = new OwnerInterface();
                        //oiStart.setVisible(true);
                        //oiStart.pack();
                        //oiStart.setLocationRelativeTo(null);
                        //oiStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        /*******************/ id4 = rsLogin.getString("CustomerId"); /*******************/
                        /*******************/ username4 = rsLogin.getString("CustomerName"); /*******************/
                        /*******************/ contact3 = rsLogin.getString("CustomerContact"); /*******************/
                        /*******************/ email3 = rsLogin.getString("CustomerEmail"); /*******************/
                        /*******************/ //salary = rsLogin.getString("EmployeeSalary"); /*******************/
                        /*******************/ password3 = rsLogin.getString("CustomerPassword"); /*******************/
                        /*******************/ location3 = rsLogin.getString("CustomerLocation"); /*******************/
                        /*******************/ new AccountSettings3(id4,username4,contact3,email3,password3,location3).setVisible(true); /*******************/
                        this.dispose();
                    }

                    else
                    {
                        JOptionPane.showMessageDialog(null,"Error Occured!");
                        //emailorphone.setText("");
                        //password.setText("");
                    }
                    //}

                connectionLogin.close();

            }
            catch (Exception e) {
                //e.printStackTrace();
                //System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null,e);
            }

            //AccountSettings as = new AccountSettings();
            //as.setVisible(true);
            //as.pack();
            //as.setLocationRelativeTo(null);
            //as.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //this.dispose();
        }
  
        else if(settings == 2)
        {
            Choose chs3 = new Choose();
            chs3.setVisible(true);
            chs3.pack();
            chs3.setLocationRelativeTo(null);
            chs3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_jComboBoxEmployeeSettingsActionPerformed

    private void jButtonBuyItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuyItemsMouseClicked
       /* BuyItems bi222 = new BuyItems();
        bi222.setVisible(true);
        bi222.pack();
        bi222.setLocationRelativeTo(null);
        bi222.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();*/
       customerid2 = jLabelCustomerID.getText();
       customername2 = jLabelCustomerName.getText();
       /*******************/ new BuyItems(customerid2,customername2).setVisible(true); /*******************/
                        this.dispose();
    }//GEN-LAST:event_jButtonBuyItemsMouseClicked

    private void jButtonBuyItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuyItemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuyItemsActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuyItems;
    private javax.swing.JButton jButtonDevelopers2;
    private javax.swing.JButton jButtonEEB;
    private javax.swing.JComboBox<String> jComboBoxEmployeeSettings;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelClose2;
    private javax.swing.JLabel jLabelCustomerID;
    private javax.swing.JLabel jLabelCustomerName;
    private javax.swing.JLabel jLabelMin2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
