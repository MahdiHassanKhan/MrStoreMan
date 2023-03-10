/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrstoreman;

import javax.swing.JFrame;

/**
 *
 * @author Mahdi
 */
public class Choose extends javax.swing.JFrame {

    /**
     * Creates new form Choose
     */
    public Choose() {
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
        jButtonChooseOwner = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonChooseEmployee = new javax.swing.JButton();
        jLabelChooseClose = new javax.swing.JLabel();
        jLabelChooseMin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonChooseCustomer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonBFChoose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(243, 67, 73));

        jButtonChooseOwner.setBackground(new java.awt.Color(17, 32, 65));
        jButtonChooseOwner.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonChooseOwner.setForeground(new java.awt.Color(240, 240, 240));
        jButtonChooseOwner.setText("Owner");
        jButtonChooseOwner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonChooseOwner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonChooseOwnerMouseClicked(evt);
            }
        });
        jButtonChooseOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChooseOwnerActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("F:\\Java\\MrStoreMan\\images\\Mr.StoreManLogo.png")); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonChooseOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonChooseOwner)
                .addGap(168, 168, 168))
        );

        jPanel2.setBackground(new java.awt.Color(17, 32, 65));

        jButtonChooseEmployee.setBackground(new java.awt.Color(243, 67, 73));
        jButtonChooseEmployee.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonChooseEmployee.setForeground(new java.awt.Color(240, 240, 240));
        jButtonChooseEmployee.setText("Employee");
        jButtonChooseEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonChooseEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonChooseEmployeeMouseClicked(evt);
            }
        });
        jButtonChooseEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChooseEmployeeActionPerformed(evt);
            }
        });

        jLabelChooseClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelChooseClose.setForeground(new java.awt.Color(240, 240, 240));
        jLabelChooseClose.setText("X");
        jLabelChooseClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelChooseClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelChooseCloseMouseClicked(evt);
            }
        });

        jLabelChooseMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelChooseMin.setForeground(new java.awt.Color(240, 240, 240));
        jLabelChooseMin.setText("-");
        jLabelChooseMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelChooseMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelChooseMinMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\Java\\MrStoreMan\\images\\Mr.StoreManLogo2.png")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelChooseMin)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelChooseClose)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonChooseEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelChooseClose)
                    .addComponent(jLabelChooseMin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonChooseEmployee)
                .addGap(172, 172, 172))
        );

        jPanel4.setBackground(new java.awt.Color(17, 32, 65));

        jButtonChooseCustomer.setBackground(new java.awt.Color(243, 67, 73));
        jButtonChooseCustomer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonChooseCustomer.setForeground(new java.awt.Color(240, 240, 240));
        jButtonChooseCustomer.setText("Customer");
        jButtonChooseCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonChooseCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonChooseCustomerMouseClicked(evt);
            }
        });
        jButtonChooseCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChooseCustomerActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\Java\\MrStoreMan\\images\\Mr.StoreManLogo2.png")); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButtonBFChoose.setBackground(new java.awt.Color(243, 67, 73));
        jButtonBFChoose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonBFChoose.setForeground(new java.awt.Color(240, 240, 240));
        jButtonBFChoose.setText("<-");
        jButtonBFChoose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBFChoose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBFChooseMouseClicked(evt);
            }
        });
        jButtonBFChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBFChooseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 73, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jButtonChooseCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButtonBFChoose)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBFChoose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonChooseCustomer)
                .addGap(172, 172, 172))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChooseOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChooseOwnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonChooseOwnerActionPerformed

    private void jButtonChooseEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChooseEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonChooseEmployeeActionPerformed

    private void jButtonBFChooseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBFChooseMouseClicked
        Start start = new Start();
        start.setVisible(true);
        start.pack();
        start.setLocationRelativeTo(null);
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonBFChooseMouseClicked

    private void jButtonChooseOwnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonChooseOwnerMouseClicked
        Login li = new Login();
        li.setVisible(true);
        li.pack();
        li.setLocationRelativeTo(null);
        li.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonChooseOwnerMouseClicked

    private void jLabelChooseMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelChooseMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelChooseMinMouseClicked

    private void jLabelChooseCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelChooseCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelChooseCloseMouseClicked

    private void jButtonChooseEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonChooseEmployeeMouseClicked
        Login2 li21 = new Login2();
        li21.setVisible(true);
        li21.pack();
        li21.setLocationRelativeTo(null);
        li21.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonChooseEmployeeMouseClicked

    private void jButtonBFChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBFChooseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBFChooseActionPerformed

    private void jButtonChooseCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonChooseCustomerMouseClicked
        Login3 li31 = new Login3();
        li31.setVisible(true);
        li31.pack();
        li31.setLocationRelativeTo(null);
        li31.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonChooseCustomerMouseClicked

    private void jButtonChooseCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChooseCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonChooseCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(Choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Choose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Choose().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBFChoose;
    private javax.swing.JButton jButtonChooseCustomer;
    private javax.swing.JButton jButtonChooseEmployee;
    private javax.swing.JButton jButtonChooseOwner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelChooseClose;
    private javax.swing.JLabel jLabelChooseMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
