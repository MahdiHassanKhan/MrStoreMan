/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrstoreman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahdi
 */
public class Registration2 extends javax.swing.JFrame {

    /**
     * Creates new form Registration2
     */
    public Registration2() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EmployeeNameR = new javax.swing.JTextField();
        EmployeeContactR = new javax.swing.JTextField();
        EmployeeEmailR = new javax.swing.JTextField();
        EmployeePasswordR = new javax.swing.JTextField();
        jButtonInsertIntoERRTable = new javax.swing.JButton();
        jButtonBFRegistration2 = new javax.swing.JButton();
        jLabelRegistration2Min = new javax.swing.JLabel();
        jLabelRegistration2Close = new javax.swing.JLabel();
        EmployeeLocationR = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        EmployeeSalaryR = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(17, 32, 65));
        jPanel3.setForeground(new java.awt.Color(234, 67, 73));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("____________________________");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("________________________");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("______________");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Employee");

        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\Java\\MrStoreMan\\images\\Mr.StoreManLogo2.png")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(60, 60, 60))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(390, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(175, 175, 175)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(175, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(234, 67, 73));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Contact:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Email:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Password:");

        EmployeeNameR.setBackground(new java.awt.Color(17, 32, 65));
        EmployeeNameR.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        EmployeeNameR.setForeground(new java.awt.Color(240, 240, 240));

        EmployeeContactR.setBackground(new java.awt.Color(17, 32, 65));
        EmployeeContactR.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        EmployeeContactR.setForeground(new java.awt.Color(240, 240, 240));
        EmployeeContactR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeContactRActionPerformed(evt);
            }
        });

        EmployeeEmailR.setBackground(new java.awt.Color(17, 32, 65));
        EmployeeEmailR.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        EmployeeEmailR.setForeground(new java.awt.Color(240, 240, 240));
        EmployeeEmailR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeEmailRActionPerformed(evt);
            }
        });

        EmployeePasswordR.setBackground(new java.awt.Color(17, 32, 65));
        EmployeePasswordR.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        EmployeePasswordR.setForeground(new java.awt.Color(240, 240, 240));

        jButtonInsertIntoERRTable.setBackground(new java.awt.Color(17, 32, 65));
        jButtonInsertIntoERRTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonInsertIntoERRTable.setForeground(new java.awt.Color(240, 240, 240));
        jButtonInsertIntoERRTable.setText("Sign Up");
        jButtonInsertIntoERRTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertIntoERRTableActionPerformed(evt);
            }
        });

        jButtonBFRegistration2.setBackground(new java.awt.Color(17, 32, 65));
        jButtonBFRegistration2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonBFRegistration2.setForeground(new java.awt.Color(240, 240, 240));
        jButtonBFRegistration2.setText("<-");
        jButtonBFRegistration2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBFRegistration2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBFRegistration2MouseClicked(evt);
            }
        });

        jLabelRegistration2Min.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelRegistration2Min.setForeground(new java.awt.Color(240, 240, 240));
        jLabelRegistration2Min.setText("-");
        jLabelRegistration2Min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegistration2Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistration2MinMouseClicked(evt);
            }
        });

        jLabelRegistration2Close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelRegistration2Close.setForeground(new java.awt.Color(240, 240, 240));
        jLabelRegistration2Close.setText("X");
        jLabelRegistration2Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegistration2Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistration2CloseMouseClicked(evt);
            }
        });

        EmployeeLocationR.setBackground(new java.awt.Color(17, 32, 65));
        EmployeeLocationR.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        EmployeeLocationR.setForeground(new java.awt.Color(240, 240, 240));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Location:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Salary:");

        EmployeeSalaryR.setBackground(new java.awt.Color(17, 32, 65));
        EmployeeSalaryR.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        EmployeeSalaryR.setForeground(new java.awt.Color(240, 240, 240));
        EmployeeSalaryR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeSalaryRActionPerformed(evt);
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
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EmployeeLocationR, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EmployeeNameR, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBFRegistration2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelRegistration2Min)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelRegistration2Close))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EmployeeContactR, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EmployeeEmailR, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EmployeeSalaryR, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(EmployeePasswordR, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonInsertIntoERRTable)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonBFRegistration2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelRegistration2Min)
                        .addComponent(jLabelRegistration2Close)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeNameR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EmployeeContactR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(EmployeeEmailR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(EmployeeSalaryR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(EmployeePasswordR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(EmployeeLocationR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonInsertIntoERRTable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmployeeContactRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeContactRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeContactRActionPerformed

    private void EmployeeEmailRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeEmailRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeEmailRActionPerformed

    private void jButtonInsertIntoERRTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertIntoERRTableActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=MrStoreMan;selectMethod=cursor", "sa", "123456");
            //Statement stLogin = connectionLogin.createStatement();
            //String sqlLogin = "select * from Owner where OwnerEmail = ? and OwnerPassword = ?";
            //PreparedStatement pstLogin = connectionLogin.prepareStatement(sqlLogin);
            String sqlInsert = "insert into EmployeeRegistrationRequests"
            +"(EmployeeName,EmployeeContact,EmployeeEmail,EmployeeSalary,EmployeePassword,EmployeeLocation)"
            +"values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sqlInsert);
            pst.setString(1, EmployeeNameR.getText());
            pst.setString(2, EmployeeContactR.getText());
            pst.setString(3, EmployeeEmailR.getText());
            pst.setString(4, EmployeeSalaryR.getText());
            pst.setString(5, EmployeePasswordR.getText());
            pst.setString(6, EmployeeLocationR.getText());
            if(EmployeeLocationR.getText().length()>0)
            {
                pst.setString(6, EmployeeLocationR.getText());
            }
            else
            {
                pst.setString(6, "Dhaka");
            }

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Registration Completed as an Employee. Wait for approval");
            EmployeeNameR.setText("");
            EmployeeContactR.setText("");
            EmployeeEmailR.setText("");
            EmployeeSalaryR.setText("");
            EmployeePasswordR.setText("");
            EmployeeLocationR.setText("");

            //connectionLogin.close();

        }
        catch (Exception e) {
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            //JOptionPane.showMessageDialog(null,e);
            //JOptionPane.showMessageDialog(this,e.getMessage());
            JOptionPane.showMessageDialog(this,"Someone already registered with same Contact or email. Try Again.");
        }
    }//GEN-LAST:event_jButtonInsertIntoERRTableActionPerformed

    private void jButtonBFRegistration2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBFRegistration2MouseClicked
        Login2 li3 = new Login2();
        li3.setVisible(true);
        li3.pack();
        li3.setLocationRelativeTo(null);
        li3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonBFRegistration2MouseClicked

    private void jLabelRegistration2MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistration2MinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelRegistration2MinMouseClicked

    private void jLabelRegistration2CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistration2CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelRegistration2CloseMouseClicked

    private void EmployeeSalaryRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeSalaryRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeSalaryRActionPerformed

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
            java.util.logging.Logger.getLogger(Registration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmployeeContactR;
    private javax.swing.JTextField EmployeeEmailR;
    private javax.swing.JTextField EmployeeLocationR;
    private javax.swing.JTextField EmployeeNameR;
    private javax.swing.JTextField EmployeePasswordR;
    private javax.swing.JTextField EmployeeSalaryR;
    private javax.swing.JButton jButtonBFRegistration2;
    private javax.swing.JButton jButtonInsertIntoERRTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelRegistration2Close;
    private javax.swing.JLabel jLabelRegistration2Min;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
