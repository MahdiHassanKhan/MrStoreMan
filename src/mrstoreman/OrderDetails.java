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
public class OrderDetails extends javax.swing.JFrame {

    /**
     * Creates new form OrderDetails
     */
    public OrderDetails() {
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
        jTableOrderDetails = new javax.swing.JTable();
        jButtonFetchinOD = new javax.swing.JButton();
        jButtonBFOD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelODMin = new javax.swing.JLabel();
        jLabelODClose = new javax.swing.JLabel();
        OrderDetailsSearchField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(17, 32, 65));

        jTableOrderDetails.setBackground(new java.awt.Color(243, 67, 73));
        jTableOrderDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTableOrderDetails.setForeground(new java.awt.Color(240, 240, 240));
        jTableOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Customer ID", "Customer Name", "Order Amount", "Order Date", "Order Done By", "Trader ID", "Trader Name"
            }
        ));
        jTableOrderDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOrderDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableOrderDetails);

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Order Details");

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

        OrderDetailsSearchField.setBackground(new java.awt.Color(234, 67, 73));
        OrderDetailsSearchField.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        OrderDetailsSearchField.setForeground(new java.awt.Color(240, 240, 240));
        OrderDetailsSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderDetailsSearchFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBFOD)
                        .addGap(297, 297, 297)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelODMin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelODClose)
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OrderDetailsSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButtonFetchinOD)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelODClose)
                        .addComponent(jLabelODMin)
                        .addComponent(jButtonBFOD))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonFetchinOD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OrderDetailsSearchField))
                .addContainerGap(38, Short.MAX_VALUE))
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

    private void jTableOrderDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOrderDetailsMouseClicked
        
    }//GEN-LAST:event_jTableOrderDetailsMouseClicked

    private void jButtonFetchinODMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFetchinODMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFetchinODMouseClicked

    private void jButtonFetchinODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFetchinODActionPerformed
        if(OrderDetailsSearchField.getText().length()==0)
        {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection3 = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=MrStoreMan;selectMethod=cursor", "sa", "123456");
                jTableOrderDetails.setModel(new DefaultTableModel(null, new String[]{"Order ID","Customer ID","Customer Name","Order Amount","Order Date","Order Done By","Trader ID","Trader Name"}));
                Statement st3 = connection3.createStatement();
                String sql3 = "select * from Orders";
                ResultSet rs3 = st3.executeQuery(sql3);
                while(rs3.next()){
                    String OrdersId = String.valueOf(rs3.getInt("OrdersId"));
                    String CustomerId = String.valueOf(rs3.getInt("CustomerId"));
                    String CustomerName = rs3.getString("CustomerName");
                    String OrdersAmount = rs3.getString("OrdersAmount");
                    String OrdersDate = rs3.getString("OrdersDate");
                    String OrderDoneBy = rs3.getString("OrderDoneBy");
                    String TraderId = rs3.getString("TraderId");
                    String TraderName = rs3.getString("TraderName");

                    String OrderData[] = {OrdersId,CustomerId,CustomerName,OrdersAmount,OrdersDate,OrderDoneBy,TraderId,TraderName};
                    DefaultTableModel CTM = (DefaultTableModel)jTableOrderDetails.getModel();
                    CTM.addRow(OrderData);
                }

                connection3.close();
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
                Connection connection3 = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=MrStoreMan;selectMethod=cursor", "sa", "123456");
                jTableOrderDetails.setModel(new DefaultTableModel(null, new String[]{"Order ID","Customer ID","Customer Name","Order Amount","Order Date","Order Done By","Trader ID","Trader Name"}));
                Statement st3 = connection3.createStatement();
                String sql3 = "select * from Orders WHERE OrdersId LIKE '%"+OrderDetailsSearchField.getText()+"%'";
                sql3 += "UNION select * from Orders WHERE CustomerId LIKE '%"+OrderDetailsSearchField.getText()+"%'";
                sql3 += "UNION select * from Orders WHERE CustomerName LIKE '%"+OrderDetailsSearchField.getText()+"%'";
                sql3 += "UNION select * from Orders WHERE OrdersAmount LIKE '%"+OrderDetailsSearchField.getText()+"%'";
                sql3 += "UNION select * from Orders WHERE OrdersDate LIKE '%"+OrderDetailsSearchField.getText()+"%'";
                sql3 += "UNION select * from Orders WHERE OrderDoneBy LIKE '%"+OrderDetailsSearchField.getText()+"%'";
                sql3 += "UNION select * from Orders WHERE TraderId LIKE '%"+OrderDetailsSearchField.getText()+"%'";
                sql3 += "UNION select * from Orders WHERE TraderName LIKE '%"+OrderDetailsSearchField.getText()+"%'";
                ResultSet rs3 = st3.executeQuery(sql3);
                while(rs3.next()){
                    String OrdersId = String.valueOf(rs3.getInt("OrdersId"));
                    String CustomerId = String.valueOf(rs3.getInt("CustomerId"));
                    String CustomerName = rs3.getString("CustomerName");
                    String OrdersAmount = rs3.getString("OrdersAmount");
                    String OrdersDate = rs3.getString("OrdersDate");
                    String OrderDoneBy = rs3.getString("OrderDoneBy");
                    String TraderId = rs3.getString("TraderId");
                    String TraderName = rs3.getString("TraderName");

                    String OrderData[] = {OrdersId,CustomerId,CustomerName,OrdersAmount,OrdersDate,OrderDoneBy,TraderId,TraderName};
                    DefaultTableModel CTM = (DefaultTableModel)jTableOrderDetails.getModel();
                    CTM.addRow(OrderData);
                }

                connection3.close();

            }
            catch (Exception e) {
                //e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonFetchinODActionPerformed

    private void jButtonBFODMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBFODMouseClicked
        StoreRecords sr2 = new StoreRecords();
        sr2.setVisible(true);
        sr2.pack();
        sr2.setLocationRelativeTo(null);
        sr2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonBFODMouseClicked

    private void jButtonBFODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBFODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBFODActionPerformed

    private void jLabelODMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelODMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelODMinMouseClicked

    private void jLabelODCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelODCloseMouseClicked
        //System.exit(0);
        this.dispose();
    }//GEN-LAST:event_jLabelODCloseMouseClicked

    private void OrderDetailsSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderDetailsSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderDetailsSearchFieldActionPerformed

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
            java.util.logging.Logger.getLogger(OrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField OrderDetailsSearchField;
    private javax.swing.JButton jButtonBFOD;
    private javax.swing.JButton jButtonFetchinOD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelODClose;
    private javax.swing.JLabel jLabelODMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOrderDetails;
    // End of variables declaration//GEN-END:variables
}
