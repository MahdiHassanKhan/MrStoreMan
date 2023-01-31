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
public class AddToCart extends javax.swing.JFrame {

    /**
     * Creates new form AddToCart
     */
    public AddToCart() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public AddToCart(String itemid, String itembrand, String itemdescription,String itemsellingprice, String itemmd, String itemed, String itemvl, String itemweight,String itemstatus,String itemquantity_instock) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        jLabelItemID.setText(itemid);
        jLabelItemBrand.setText(itembrand);
        jLabelItemDescription.setText(itemdescription);
        jLabelItemPrice.setText(itemsellingprice);
        jLabelItemMD.setText(itemmd);
        jLabelItemED.setText(itemed);
        jLabelItemValidationLeft.setText(itemvl);
        jLabelItemWeight.setText(itemweight);
        jLabelItemStatus.setText(itemstatus);
        jLabelItemQuantityInStock.setText(itemquantity_instock);
 
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonBFATC = new javax.swing.JButton();
        jLabelATCMin = new javax.swing.JLabel();
        jLabelATCClose = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        QuantityEntry = new javax.swing.JTextField();
        QuantityInc = new javax.swing.JButton();
        QuantityDec = new javax.swing.JButton();
        AddToCart = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabelItemID = new javax.swing.JLabel();
        jLabelItemBrand = new javax.swing.JLabel();
        jLabelItemDescription = new javax.swing.JLabel();
        jLabelItemPrice = new javax.swing.JLabel();
        jLabelItemMD = new javax.swing.JLabel();
        jLabelItemED = new javax.swing.JLabel();
        jLabelItemValidationLeft = new javax.swing.JLabel();
        jLabelItemWeight = new javax.swing.JLabel();
        jLabelItemStatus = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelItemQuantityInStock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(17, 32, 65));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Brand:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Type/Description:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Validation Left:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Status:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("ID:");

        jButtonBFATC.setBackground(new java.awt.Color(243, 67, 73));
        jButtonBFATC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonBFATC.setForeground(new java.awt.Color(240, 240, 240));
        jButtonBFATC.setText("<-");
        jButtonBFATC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBFATC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBFATCMouseClicked(evt);
            }
        });
        jButtonBFATC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBFATCActionPerformed(evt);
            }
        });

        jLabelATCMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelATCMin.setForeground(new java.awt.Color(240, 240, 240));
        jLabelATCMin.setText("-");
        jLabelATCMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelATCMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelATCMinMouseClicked(evt);
            }
        });

        jLabelATCClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelATCClose.setForeground(new java.awt.Color(240, 240, 240));
        jLabelATCClose.setText("X");
        jLabelATCClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelATCClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelATCCloseMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Price:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Manufacture date:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Expiration date:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Selected Item Information");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Quantity:");

        QuantityEntry.setBackground(new java.awt.Color(234, 67, 73));
        QuantityEntry.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        QuantityEntry.setForeground(new java.awt.Color(240, 240, 240));
        QuantityEntry.setText("1");
        QuantityEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityEntryActionPerformed(evt);
            }
        });

        QuantityInc.setBackground(new java.awt.Color(243, 67, 73));
        QuantityInc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        QuantityInc.setForeground(new java.awt.Color(240, 240, 240));
        QuantityInc.setText("^");
        QuantityInc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QuantityInc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuantityIncMouseClicked(evt);
            }
        });
        QuantityInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityIncActionPerformed(evt);
            }
        });

        QuantityDec.setBackground(new java.awt.Color(243, 67, 73));
        QuantityDec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        QuantityDec.setForeground(new java.awt.Color(240, 240, 240));
        QuantityDec.setText("v");
        QuantityDec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QuantityDec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuantityDecMouseClicked(evt);
            }
        });
        QuantityDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityDecActionPerformed(evt);
            }
        });

        AddToCart.setBackground(new java.awt.Color(243, 67, 73));
        AddToCart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddToCart.setForeground(new java.awt.Color(240, 240, 240));
        AddToCart.setText("ADD TO CART");
        AddToCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddToCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartMouseClicked(evt);
            }
        });
        AddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Weight:");

        jLabelItemID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelItemID.setForeground(new java.awt.Color(240, 240, 240));
        jLabelItemID.setText("ID");

        jLabelItemBrand.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelItemBrand.setForeground(new java.awt.Color(240, 240, 240));
        jLabelItemBrand.setText("Brand");

        jLabelItemDescription.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelItemDescription.setForeground(new java.awt.Color(240, 240, 240));
        jLabelItemDescription.setText("Type/Description");

        jLabelItemPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelItemPrice.setForeground(new java.awt.Color(240, 240, 240));
        jLabelItemPrice.setText("Price");

        jLabelItemMD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelItemMD.setForeground(new java.awt.Color(240, 240, 240));
        jLabelItemMD.setText("Manufacture date");

        jLabelItemED.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelItemED.setForeground(new java.awt.Color(240, 240, 240));
        jLabelItemED.setText("Expiration date");

        jLabelItemValidationLeft.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelItemValidationLeft.setForeground(new java.awt.Color(240, 240, 240));
        jLabelItemValidationLeft.setText("Validation Left");

        jLabelItemWeight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelItemWeight.setForeground(new java.awt.Color(240, 240, 240));
        jLabelItemWeight.setText("Weight");

        jLabelItemStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelItemStatus.setForeground(new java.awt.Color(240, 240, 240));
        jLabelItemStatus.setText("Status");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("In Stock:");

        jLabelItemQuantityInStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelItemQuantityInStock.setForeground(new java.awt.Color(240, 240, 240));
        jLabelItemQuantityInStock.setText("In Stock");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonBFATC)
                                .addGap(200, 200, 200)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelItemStatus)
                                    .addComponent(jLabelItemWeight)
                                    .addComponent(jLabelItemValidationLeft)
                                    .addComponent(jLabelItemED)
                                    .addComponent(jLabelItemMD)
                                    .addComponent(jLabelItemPrice)
                                    .addComponent(jLabelItemDescription)
                                    .addComponent(jLabelItemBrand)
                                    .addComponent(jLabelItemID, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                        .addComponent(jLabelATCMin)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelATCClose))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddToCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(QuantityEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(24, 24, 24)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelItemQuantityInStock)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(QuantityInc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(QuantityDec, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButtonBFATC))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelATCClose)
                        .addComponent(jLabelATCMin)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabelItemID))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(QuantityEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QuantityDec)
                            .addComponent(QuantityInc))
                        .addGap(37, 37, 37)
                        .addComponent(AddToCart)
                        .addGap(126, 126, 126))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabelItemBrand))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelItemDescription))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabelItemPrice)
                            .addComponent(jLabel12)
                            .addComponent(jLabelItemQuantityInStock))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelItemMD, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelItemED, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabelItemValidationLeft))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabelItemWeight))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelItemStatus))
                .addGap(35, 35, 35))
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

    private void jButtonBFATCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBFATCMouseClicked
        SellItems si = new SellItems();
        si.setVisible(true);
        si.pack();
        si.setLocationRelativeTo(null);
        si.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonBFATCMouseClicked

    private void jButtonBFATCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBFATCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBFATCActionPerformed

    private void jLabelATCMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelATCMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelATCMinMouseClicked

    private void jLabelATCCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelATCCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelATCCloseMouseClicked

    private void QuantityIncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuantityIncMouseClicked
        int a = Integer.parseInt(QuantityEntry.getText());
        a++;
        Integer x = new Integer(a);
        QuantityEntry.setText(x.toString());
    }//GEN-LAST:event_QuantityIncMouseClicked

    private void QuantityIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityIncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityIncActionPerformed

    private void QuantityDecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuantityDecMouseClicked
        int a = Integer.parseInt(QuantityEntry.getText());
        a--;
        Integer x = new Integer(a);
        if(x>0)
        {
            QuantityEntry.setText(x.toString());
        }
    }//GEN-LAST:event_QuantityDecMouseClicked

    private void QuantityDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityDecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityDecActionPerformed

    private void QuantityEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityEntryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityEntryActionPerformed

    private void AddToCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartMouseClicked
        
    }//GEN-LAST:event_AddToCartMouseClicked

    private void AddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartActionPerformed
         try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=MrStoreMan;selectMethod=cursor", "sa", "123456");
                //Statement stLogin = connectionLogin.createStatement();
                //String sqlLogin = "select * from Owner where OwnerEmail = ? and OwnerPassword = ?";
                //PreparedStatement pstLogin = connectionLogin.prepareStatement(sqlLogin);
                String sql = "UPDATE Item set ItemQuantity=(ItemQuantity-?) where ItemId=?;\n" +
                         "INSERT INTO SoldItems"
                         +"(ItemId,SoldItemsQuantity)"
                         +"values(?,?)";
                
                int a = Integer.parseInt(QuantityEntry.getText());
                Integer x = new Integer(a);
                //System.out.println(jLabelItemStatus.getText());
            
                int b = Integer.parseInt(jLabelItemQuantityInStock.getText());
                Integer y = new Integer(b);
                
                //if(x>y)
                //{
                //    JOptionPane.showMessageDialog(this,"Quantity exceeded. "+b+" pieces available in stock");
                //}
                
                if(jLabelItemStatus.getText().equals("Available"))
                {
                    if(x>y && x>0)
                    {
                        JOptionPane.showMessageDialog(this,"Quantity exceeded. "+b+" pieces available in stock");
                    }
                    else if(x<=0)
                    {
                        JOptionPane.showMessageDialog(this,"Item Quantity must be more than zero");
                    }
                    else
                    {
                        String sqlUpdate = "update Item set ItemQuantity=(ItemQuantity-?) where ItemId=?";
                        PreparedStatement pst = con.prepareStatement(sql);
                        pst.setString(1, QuantityEntry.getText());
                        pst.setString(2, jLabelItemID.getText());
                        pst.setString(3, jLabelItemID.getText());
                        pst.setString(4, QuantityEntry.getText());
                        pst.executeUpdate();
            
                        JOptionPane.showMessageDialog(this,"Item added to cart");
                        
                        SellItems si = new SellItems();
                        si.setVisible(true);
                        si.pack();
                        si.setLocationRelativeTo(null);
                        si.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                    }
                }
                
                if(jLabelItemStatus.getText().equals("Expired"))
                {
                    JOptionPane.showMessageDialog(this,"Expired Item can't be added to cart");
                }
        
                if(jLabelItemStatus.getText().equals("Out of stock"))
                {
                    JOptionPane.showMessageDialog(this,"Selected Item is out of stock at this moment.");
                }
                
                
            }
            catch (Exception e) {
                //e.printStackTrace();
                //System.out.println(e.getMessage());
                //JOptionPane.showMessageDialog(null,e);
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
    }//GEN-LAST:event_AddToCartActionPerformed

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
            java.util.logging.Logger.getLogger(AddToCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddToCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddToCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddToCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddToCart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToCart;
    private javax.swing.JButton QuantityDec;
    private javax.swing.JTextField QuantityEntry;
    private javax.swing.JButton QuantityInc;
    private javax.swing.JButton jButtonBFATC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelATCClose;
    private javax.swing.JLabel jLabelATCMin;
    private javax.swing.JLabel jLabelItemBrand;
    private javax.swing.JLabel jLabelItemDescription;
    private javax.swing.JLabel jLabelItemED;
    private javax.swing.JLabel jLabelItemID;
    private javax.swing.JLabel jLabelItemMD;
    private javax.swing.JLabel jLabelItemPrice;
    private javax.swing.JLabel jLabelItemQuantityInStock;
    private javax.swing.JLabel jLabelItemStatus;
    private javax.swing.JLabel jLabelItemValidationLeft;
    private javax.swing.JLabel jLabelItemWeight;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
