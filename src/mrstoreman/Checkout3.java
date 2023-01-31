/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrstoreman;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static mrstoreman.BuyItems.customerid3;
import static mrstoreman.BuyItems.customername3;

/**
 *
 * @author Mahdi
 */
public class Checkout3 extends javax.swing.JFrame {

    /**
     * Creates new form Checkout3
     */
    public Checkout3() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Checkout3(String itemsid3, String itemsbrand3, String itemsdescription3, String itemssellingprice3, String itemsquantity3, String itemstotalprice3, String customerid4, String customername4) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        jLabelCheckoutItemID.setText(itemsid3);
        jLabelCheckoutItemBrand.setText(itemsbrand3);
        jLabelCheckoutItemDescription.setText(itemsdescription3);
        jLabelCheckoutItemPrice.setText(itemssellingprice3);
        jLabelCheckoutItemQuantity.setText(itemsquantity3);
        jLabelCheckoutItemTotalPrice.setText(itemstotalprice3);
        jLabelCheckoutItemTotalPriceHide.setText(itemstotalprice3);
        
        jLabelCustomerID4.setText(customerid4);
        jLabelCustomerName4.setText(customername4);
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
        jButtonBFOC3 = new javax.swing.JButton();
        jLabelOC3Min = new javax.swing.JLabel();
        jLabelOC3Close = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelCheckoutItemID = new javax.swing.JLabel();
        jLabelCheckoutItemBrand = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCheckoutItemDescription = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelCheckoutItemPrice = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelCheckoutItemTotalPriceHide = new javax.swing.JLabel();
        jLabelCheckoutItemQuantity = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelCheckoutItemTotalPrice = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jToggleDiscountMode = new javax.swing.JToggleButton();
        OrderDiscount = new javax.swing.JTextField();
        jButtonDiscountConfirm = new javax.swing.JButton();
        jButtonConfirmOrder3 = new javax.swing.JButton();
        jLabelCustomerID4 = new javax.swing.JLabel();
        jLabelCustomerName4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(17, 32, 65));

        jButtonBFOC3.setBackground(new java.awt.Color(243, 67, 73));
        jButtonBFOC3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonBFOC3.setForeground(new java.awt.Color(240, 240, 240));
        jButtonBFOC3.setText("<-");
        jButtonBFOC3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBFOC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBFOC3MouseClicked(evt);
            }
        });
        jButtonBFOC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBFOC3ActionPerformed(evt);
            }
        });

        jLabelOC3Min.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelOC3Min.setForeground(new java.awt.Color(240, 240, 240));
        jLabelOC3Min.setText("-");
        jLabelOC3Min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelOC3Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelOC3MinMouseClicked(evt);
            }
        });

        jLabelOC3Close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelOC3Close.setForeground(new java.awt.Color(240, 240, 240));
        jLabelOC3Close.setText("X");
        jLabelOC3Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelOC3Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelOC3CloseMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Order Confirmation3");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("ID:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Brand:");

        jLabelCheckoutItemID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCheckoutItemID.setForeground(new java.awt.Color(240, 240, 240));
        jLabelCheckoutItemID.setText("ID");

        jLabelCheckoutItemBrand.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCheckoutItemBrand.setForeground(new java.awt.Color(240, 240, 240));
        jLabelCheckoutItemBrand.setText("Brand");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Type/Description:");

        jLabelCheckoutItemDescription.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCheckoutItemDescription.setForeground(new java.awt.Color(240, 240, 240));
        jLabelCheckoutItemDescription.setText("Type/Description");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Price:");

        jLabelCheckoutItemPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCheckoutItemPrice.setForeground(new java.awt.Color(240, 240, 240));
        jLabelCheckoutItemPrice.setText("Price");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Quantity:");

        jLabelCheckoutItemTotalPriceHide.setBackground(new java.awt.Color(17, 32, 65));
        jLabelCheckoutItemTotalPriceHide.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelCheckoutItemTotalPriceHide.setForeground(new java.awt.Color(240, 240, 240));
        jLabelCheckoutItemTotalPriceHide.setText("TotalPriceHIDE");

        jLabelCheckoutItemQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCheckoutItemQuantity.setForeground(new java.awt.Color(240, 240, 240));
        jLabelCheckoutItemQuantity.setText("Quantity");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Total Price:");

        jLabelCheckoutItemTotalPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCheckoutItemTotalPrice.setForeground(new java.awt.Color(240, 240, 240));
        jLabelCheckoutItemTotalPrice.setText("Total Price");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("TK.");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Discount:");

        jToggleDiscountMode.setBackground(new java.awt.Color(234, 67, 73));
        jToggleDiscountMode.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jToggleDiscountMode.setForeground(new java.awt.Color(240, 240, 240));
        jToggleDiscountMode.setText("%");
        jToggleDiscountMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleDiscountModeActionPerformed(evt);
            }
        });

        OrderDiscount.setBackground(new java.awt.Color(234, 67, 73));
        OrderDiscount.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        OrderDiscount.setForeground(new java.awt.Color(240, 240, 240));

        jButtonDiscountConfirm.setBackground(new java.awt.Color(243, 67, 73));
        jButtonDiscountConfirm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDiscountConfirm.setForeground(new java.awt.Color(240, 240, 240));
        jButtonDiscountConfirm.setText("OK");
        jButtonDiscountConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDiscountConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDiscountConfirmActionPerformed(evt);
            }
        });

        jButtonConfirmOrder3.setBackground(new java.awt.Color(243, 67, 73));
        jButtonConfirmOrder3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonConfirmOrder3.setForeground(new java.awt.Color(240, 240, 240));
        jButtonConfirmOrder3.setText("Confirm Order");
        jButtonConfirmOrder3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConfirmOrder3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmOrder3ActionPerformed(evt);
            }
        });

        jLabelCustomerID4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCustomerID4.setForeground(new java.awt.Color(240, 240, 240));
        jLabelCustomerID4.setText("CustomerID");

        jLabelCustomerName4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCustomerName4.setForeground(new java.awt.Color(240, 240, 240));
        jLabelCustomerName4.setText("CustomerName");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCheckoutItemPrice)
                            .addComponent(jLabelCheckoutItemQuantity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelOC3Min)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelOC3Close)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OrderDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleDiscountMode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDiscountConfirm)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCheckoutItemTotalPriceHide, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 619, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCheckoutItemID)
                                    .addComponent(jLabelCheckoutItemDescription)
                                    .addComponent(jLabelCheckoutItemBrand)))
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonBFOC3)
                                .addGap(432, 432, 432)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelCheckoutItemTotalPrice)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCustomerName4)
                                    .addComponent(jLabelCustomerID4))
                                .addGap(241, 241, 241))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonConfirmOrder3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelOC3Close)
                            .addComponent(jLabelOC3Min)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBFOC3)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabelCheckoutItemID))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelCheckoutItemBrand)
                    .addComponent(jLabelCustomerID4))
                .addGap(43, 43, 43)
                .addComponent(jLabelCustomerName4)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelCheckoutItemDescription))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelCheckoutItemPrice))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabelCheckoutItemQuantity))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrderDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleDiscountMode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDiscountConfirm)
                    .addComponent(jLabelCheckoutItemTotalPriceHide, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabelCheckoutItemTotalPrice)
                    .addComponent(jButtonConfirmOrder3))
                .addGap(51, 51, 51))
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

    private void jButtonBFOC3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBFOC3MouseClicked
        /*ViewEditCart2 vec2 = new ViewEditCart2();
        vec2.setVisible(true);
        vec2.pack();
        vec2.setLocationRelativeTo(null);
        vec2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();*/
        
        new ViewEditCart3(customerid3,customername3).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonBFOC3MouseClicked

    private void jButtonBFOC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBFOC3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBFOC3ActionPerformed

    private void jLabelOC3MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelOC3MinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelOC3MinMouseClicked

    private void jLabelOC3CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelOC3CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelOC3CloseMouseClicked

    private void jToggleDiscountModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleDiscountModeActionPerformed
        if(jToggleDiscountMode.isSelected())
        {
            jToggleDiscountMode.setText("TK");
        }
        else
        {
            jToggleDiscountMode.setText("%");
        }
    }//GEN-LAST:event_jToggleDiscountModeActionPerformed

    private void jButtonDiscountConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDiscountConfirmActionPerformed
        if(jToggleDiscountMode.isSelected())
        {
            float main1 = Float.parseFloat(jLabelCheckoutItemTotalPriceHide.getText());
            Float main2 = new Float(main1);

            float x = main2; //////////////////////////////Total Amount////////////////////////////

            String od = OrderDiscount.getText();
            float main3 = Float.parseFloat(od);
            Float main4 = new Float(main3);

            float y = main4;////////////////////////////////Discount///////////////////////////

            if(x>=y)
            {
                x=x-y;
                jLabelCheckoutItemTotalPrice.setText(String.valueOf(x));
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Unusual Discount Value!!!");
            }
        }
        else
        {
            float main1 = Float.parseFloat(jLabelCheckoutItemTotalPriceHide.getText());
            Float main2 = new Float(main1);

            float x = main2; //////////////////////////////Total Amount////////////////////////////

            String od = OrderDiscount.getText();
            float main3 = Float.parseFloat(od);
            Float main4 = new Float(main3);

            float y = main4;////////////////////////////////Discount///////////////////////////

            if(y<=100 && y>=0)
            {
                x=(x-x*(y/100));
                jLabelCheckoutItemTotalPrice.setText(String.valueOf(x));
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Unusual Discount Value!!!");
            }
        }
    }//GEN-LAST:event_jButtonDiscountConfirmActionPerformed

    private void jButtonConfirmOrder3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmOrder3ActionPerformed
        /* try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=MrStoreMan;selectMethod=cursor", "sa", "123456");
                //Statement stLogin = connectionLogin.createStatement();
                //String sqlLogin = "select * from Owner where OwnerEmail = ? and OwnerPassword = ?";
                //PreparedStatement pstLogin = connectionLogin.prepareStatement(sqlLogin);
                Date date = new Date();
                java.sql.Date ordersdate = new java.sql.Date(date.getTime());
                String sqlInsert = "insert into CustomerOrderRequest"
                +"(CustomerId,CustomerName,OrdersAmount,OrdersDate,OrderDoneBy,TraderId,TraderName)"
                +"values(?,?,?,?,?,?,?)";
                sqlInsert += "DELETE From SoldItems";

                PreparedStatement pst = con.prepareStatement(sqlInsert);
                pst.setString(1, CustomerId);
                pst.setString(2, CustomerName);
                pst.setString(3, jLabelCheckoutItemTotalPrice.getText());
                pst.setDate(4, ordersdate);
                pst.setString(5, "Employee");
                pst.setString(6, EmpId);
                pst.setString(7, EmpName);

                System.out.println(EmpId);
                System.out.println(EmpName);
                System.out.println(CustomerId);
                System.out.println(CustomerName);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Order Completed.");
                printRecord(jPanel1);

                //connectionLogin.close();
                SellItems2 si32 = new SellItems2();
                si32.setVisible(true);
                si32.pack();
                si32.setLocationRelativeTo(null);
                si32.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();

            }
            catch (Exception e) {
                //e.printStackTrace();
                //System.out.println(e.getMessage());
                //JOptionPane.showMessageDialog(null,e);
                //JOptionPane.showMessageDialog(this,e.getMessage());
                JOptionPane.showMessageDialog(this,"Order incomplete due to some wrong info");
            }
        */
    }//GEN-LAST:event_jButtonConfirmOrder3ActionPerformed

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
            java.util.logging.Logger.getLogger(Checkout3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField OrderDiscount;
    private javax.swing.JButton jButtonBFOC3;
    private javax.swing.JButton jButtonConfirmOrder3;
    private javax.swing.JButton jButtonDiscountConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCheckoutItemBrand;
    private javax.swing.JLabel jLabelCheckoutItemDescription;
    private javax.swing.JLabel jLabelCheckoutItemID;
    private javax.swing.JLabel jLabelCheckoutItemPrice;
    private javax.swing.JLabel jLabelCheckoutItemQuantity;
    private javax.swing.JLabel jLabelCheckoutItemTotalPrice;
    private javax.swing.JLabel jLabelCheckoutItemTotalPriceHide;
    private javax.swing.JLabel jLabelCustomerID4;
    private javax.swing.JLabel jLabelCustomerName4;
    private javax.swing.JLabel jLabelOC3Close;
    private javax.swing.JLabel jLabelOC3Min;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleDiscountMode;
    // End of variables declaration//GEN-END:variables

///////////////////////////////////////////////////////////////////////////////
     private void printRecord(JPanel panel){
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setJobName("Print Record");
        pj.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if(pageIndex>0)
                {
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D graphics2D = (Graphics2D)graphics;
                graphics2D.translate(pageFormat.getImageableX()*2,pageFormat.getImageableY()*2);
                graphics2D.scale(0.53, 0.5);
                panel.paint(graphics2D);
                
                return Printable.PAGE_EXISTS;
            }
        });
        
        boolean returningResult = pj.printDialog();
        if(returningResult)
        {
            try{
                pj.print();
            }
            catch(PrinterException printerException){
                JOptionPane.showMessageDialog(this, "Print Error " + printerException.getMessage());
            }
        }
        
    }


}
