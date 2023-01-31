/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrstoreman;

import javax.swing.JFrame;
import static mrstoreman.Login.id;
import static mrstoreman.Login.username;

/**
 *
 * @author Mahdi
 */
public class EmployeeInfo extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeInfo
     */
    public EmployeeInfo() {
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
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonAddNewEmployee = new javax.swing.JButton();
        jButtonCurrentEmployees = new javax.swing.JButton();
        jButtonTerminateEmployeeContract = new javax.swing.JButton();
        jButtonBFEI = new javax.swing.JButton();
        jLabelEIMin = new javax.swing.JLabel();
        jLabelEIClose = new javax.swing.JLabel();
        jButtonUpdateEmployeeInfo = new javax.swing.JButton();
        jButtonRenewEmployeeContract = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(234, 67, 73));
        jPanel3.setForeground(new java.awt.Color(234, 67, 73));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("____________________________");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("_____Employee Info_____");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("______________");

        jLabel15.setIcon(new javax.swing.ImageIcon("F:\\Java\\MrStoreMan\\images\\Mr.StoreManLogo.png")); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Owner");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel16))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel13)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jPanel2.setBackground(new java.awt.Color(17, 32, 65));
        jPanel2.setForeground(new java.awt.Color(17, 32, 65));

        jButtonAddNewEmployee.setBackground(new java.awt.Color(234, 67, 73));
        jButtonAddNewEmployee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAddNewEmployee.setForeground(new java.awt.Color(240, 240, 240));
        jButtonAddNewEmployee.setText("Add Employee");
        jButtonAddNewEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddNewEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddNewEmployeeMouseClicked(evt);
            }
        });
        jButtonAddNewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNewEmployeeActionPerformed(evt);
            }
        });

        jButtonCurrentEmployees.setBackground(new java.awt.Color(234, 67, 73));
        jButtonCurrentEmployees.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCurrentEmployees.setForeground(new java.awt.Color(240, 240, 240));
        jButtonCurrentEmployees.setText("Employee Details");
        jButtonCurrentEmployees.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCurrentEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCurrentEmployeesMouseClicked(evt);
            }
        });
        jButtonCurrentEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCurrentEmployeesActionPerformed(evt);
            }
        });

        jButtonTerminateEmployeeContract.setBackground(new java.awt.Color(234, 67, 73));
        jButtonTerminateEmployeeContract.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonTerminateEmployeeContract.setForeground(new java.awt.Color(240, 240, 240));
        jButtonTerminateEmployeeContract.setText("Terminate Contract");
        jButtonTerminateEmployeeContract.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTerminateEmployeeContract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTerminateEmployeeContractMouseClicked(evt);
            }
        });
        jButtonTerminateEmployeeContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTerminateEmployeeContractActionPerformed(evt);
            }
        });

        jButtonBFEI.setBackground(new java.awt.Color(243, 67, 73));
        jButtonBFEI.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonBFEI.setForeground(new java.awt.Color(240, 240, 240));
        jButtonBFEI.setText("<-");
        jButtonBFEI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBFEI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBFEIMouseClicked(evt);
            }
        });
        jButtonBFEI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBFEIActionPerformed(evt);
            }
        });

        jLabelEIMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelEIMin.setForeground(new java.awt.Color(240, 240, 240));
        jLabelEIMin.setText("-");
        jLabelEIMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEIMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEIMinMouseClicked(evt);
            }
        });

        jLabelEIClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelEIClose.setForeground(new java.awt.Color(240, 240, 240));
        jLabelEIClose.setText("X");
        jLabelEIClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEIClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEICloseMouseClicked(evt);
            }
        });

        jButtonUpdateEmployeeInfo.setBackground(new java.awt.Color(234, 67, 73));
        jButtonUpdateEmployeeInfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonUpdateEmployeeInfo.setForeground(new java.awt.Color(240, 240, 240));
        jButtonUpdateEmployeeInfo.setText("Update Employee Info");
        jButtonUpdateEmployeeInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUpdateEmployeeInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonUpdateEmployeeInfoMouseClicked(evt);
            }
        });
        jButtonUpdateEmployeeInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateEmployeeInfoActionPerformed(evt);
            }
        });

        jButtonRenewEmployeeContract.setBackground(new java.awt.Color(234, 67, 73));
        jButtonRenewEmployeeContract.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonRenewEmployeeContract.setForeground(new java.awt.Color(240, 240, 240));
        jButtonRenewEmployeeContract.setText("Contract Renewal");
        jButtonRenewEmployeeContract.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRenewEmployeeContract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRenewEmployeeContractMouseClicked(evt);
            }
        });
        jButtonRenewEmployeeContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRenewEmployeeContractActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBFEI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelEIMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEIClose)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonUpdateEmployeeInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddNewEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCurrentEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonTerminateEmployeeContract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRenewEmployeeContract, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(123, 123, 123))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonBFEI)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelEIMin)
                        .addComponent(jLabelEIClose)))
                .addGap(17, 17, 17)
                .addComponent(jButtonAddNewEmployee)
                .addGap(52, 52, 52)
                .addComponent(jButtonUpdateEmployeeInfo)
                .addGap(75, 75, 75)
                .addComponent(jButtonCurrentEmployees)
                .addGap(68, 68, 68)
                .addComponent(jButtonTerminateEmployeeContract)
                .addGap(67, 67, 67)
                .addComponent(jButtonRenewEmployeeContract)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddNewEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddNewEmployeeMouseClicked
        AddNewEmployee ane = new AddNewEmployee();
        ane.setVisible(true);
        ane.pack();
        ane.setLocationRelativeTo(null);
        ane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonAddNewEmployeeMouseClicked

    private void jButtonAddNewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddNewEmployeeActionPerformed

    private void jButtonCurrentEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCurrentEmployeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCurrentEmployeesActionPerformed

    private void jButtonTerminateEmployeeContractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTerminateEmployeeContractMouseClicked
        TerminateEmployeeContract TEC = new TerminateEmployeeContract();
        TEC.setVisible(true);
        TEC.pack();
        TEC.setLocationRelativeTo(null);
        TEC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonTerminateEmployeeContractMouseClicked

    private void jButtonTerminateEmployeeContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerminateEmployeeContractActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTerminateEmployeeContractActionPerformed

    private void jButtonCurrentEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCurrentEmployeesMouseClicked
        EmployeeDetails ce = new EmployeeDetails();
        ce.setVisible(true);
        ce.pack();
        ce.setLocationRelativeTo(null);
        ce.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonCurrentEmployeesMouseClicked

    private void jButtonBFEIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBFEIMouseClicked
        /*OwnerInterface oi11 = new OwnerInterface();
        oi11.setVisible(true);
        oi11.pack();
        oi11.setLocationRelativeTo(null);
        oi11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();*/
        /*******************/ new OwnerInterface(id,username).setVisible(true); /*******************/
                      this.dispose(); 
    }//GEN-LAST:event_jButtonBFEIMouseClicked

    private void jLabelEIMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEIMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelEIMinMouseClicked

    private void jLabelEICloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEICloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelEICloseMouseClicked

    private void jButtonUpdateEmployeeInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUpdateEmployeeInfoMouseClicked
        UpdateEmployeeInfo uei = new UpdateEmployeeInfo();
        uei.setVisible(true);
        uei.pack();
        uei.setLocationRelativeTo(null);
        uei.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonUpdateEmployeeInfoMouseClicked

    private void jButtonUpdateEmployeeInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateEmployeeInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUpdateEmployeeInfoActionPerformed

    private void jButtonBFEIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBFEIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBFEIActionPerformed

    private void jButtonRenewEmployeeContractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRenewEmployeeContractMouseClicked
        RenewEmployeeContract rec = new RenewEmployeeContract();
        rec.setVisible(true);
        rec.pack();
        rec.setLocationRelativeTo(null);
        rec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonRenewEmployeeContractMouseClicked

    private void jButtonRenewEmployeeContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRenewEmployeeContractActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRenewEmployeeContractActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddNewEmployee;
    private javax.swing.JButton jButtonBFEI;
    private javax.swing.JButton jButtonCurrentEmployees;
    private javax.swing.JButton jButtonRenewEmployeeContract;
    private javax.swing.JButton jButtonTerminateEmployeeContract;
    private javax.swing.JButton jButtonUpdateEmployeeInfo;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabelEIClose;
    private javax.swing.JLabel jLabelEIMin;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
