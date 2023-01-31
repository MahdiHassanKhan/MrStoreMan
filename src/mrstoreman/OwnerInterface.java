package mrstoreman;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static mrstoreman.Login.id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahdi & Peom
 */
public class OwnerInterface extends javax.swing.JFrame {

    /**
     * Creates new form OwnerInterface
     */
    static String id2;
    static String username2;
    static String contact;
    static String email;
    static String password;
    static String location;
    
    public OwnerInterface() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public OwnerInterface(String id , String username) {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabelUserID.setText(id);
        jLabelUserName.setText(username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButtonOwnerDetails = new javax.swing.JButton();
        jButtonEmployeeDetails = new javax.swing.JButton();
        jButtonCustomerDetails = new javax.swing.JButton();
        jButtonItemDetails = new javax.swing.JButton();
        jButtonAccountsDetails = new javax.swing.JButton();
        jButtonDevelopers2 = new javax.swing.JButton();
        jButtonOEB = new javax.swing.JButton();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jComboBoxOwnerSettings = new javax.swing.JComboBox<>();
        jLabelUserName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabelUserID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(17, 32, 65));

        jButtonOwnerDetails.setBackground(new java.awt.Color(243, 67, 73));
        jButtonOwnerDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonOwnerDetails.setForeground(new java.awt.Color(240, 240, 240));
        jButtonOwnerDetails.setText("Owner");
        jButtonOwnerDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOwnerDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOwnerDetailsMouseClicked(evt);
            }
        });
        jButtonOwnerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOwnerDetailsActionPerformed(evt);
            }
        });

        jButtonEmployeeDetails.setBackground(new java.awt.Color(243, 67, 73));
        jButtonEmployeeDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEmployeeDetails.setForeground(new java.awt.Color(240, 240, 240));
        jButtonEmployeeDetails.setText("Employee");
        jButtonEmployeeDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEmployeeDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEmployeeDetailsMouseClicked(evt);
            }
        });
        jButtonEmployeeDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmployeeDetailsActionPerformed(evt);
            }
        });

        jButtonCustomerDetails.setBackground(new java.awt.Color(243, 67, 73));
        jButtonCustomerDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCustomerDetails.setForeground(new java.awt.Color(240, 240, 240));
        jButtonCustomerDetails.setText("Customer");
        jButtonCustomerDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCustomerDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCustomerDetailsMouseClicked(evt);
            }
        });
        jButtonCustomerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCustomerDetailsActionPerformed(evt);
            }
        });

        jButtonItemDetails.setBackground(new java.awt.Color(243, 67, 73));
        jButtonItemDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonItemDetails.setForeground(new java.awt.Color(240, 240, 240));
        jButtonItemDetails.setText("Item");
        jButtonItemDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonItemDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonItemDetailsMouseClicked(evt);
            }
        });
        jButtonItemDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonItemDetailsActionPerformed(evt);
            }
        });

        jButtonAccountsDetails.setBackground(new java.awt.Color(243, 67, 73));
        jButtonAccountsDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAccountsDetails.setForeground(new java.awt.Color(240, 240, 240));
        jButtonAccountsDetails.setText("Store Records");
        jButtonAccountsDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAccountsDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAccountsDetailsMouseClicked(evt);
            }
        });
        jButtonAccountsDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccountsDetailsActionPerformed(evt);
            }
        });

        jButtonDevelopers2.setBackground(new java.awt.Color(243, 67, 73));
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

        jButtonOEB.setBackground(new java.awt.Color(243, 67, 73));
        jButtonOEB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonOEB.setForeground(new java.awt.Color(240, 240, 240));
        jButtonOEB.setText("Exit");
        jButtonOEB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOEB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOEBMouseClicked(evt);
            }
        });
        jButtonOEB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOEBActionPerformed(evt);
            }
        });

        jLabelClose.setBackground(new java.awt.Color(248, 148, 6));
        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(240, 240, 240));
        jLabelClose.setText(" X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(240, 240, 240));
        jLabelMin.setText("  -");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jComboBoxOwnerSettings.setBackground(new java.awt.Color(234, 67, 73));
        jComboBoxOwnerSettings.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxOwnerSettings.setForeground(new java.awt.Color(240, 240, 240));
        jComboBoxOwnerSettings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Settings", "Account", "Requests", "Log Out" }));
        jComboBoxOwnerSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOwnerSettingsActionPerformed(evt);
            }
        });

        jLabelUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelUserName.setForeground(new java.awt.Color(240, 240, 240));
        jLabelUserName.setText("User");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonAccountsDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonDevelopers2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addComponent(jButtonOEB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(91, 91, 91))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jComboBoxOwnerSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonOwnerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEmployeeDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCustomerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonItemDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabelMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxOwnerSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelUserName))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addComponent(jButtonOwnerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEmployeeDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCustomerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonItemDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAccountsDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDevelopers2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonOEB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(234, 67, 73));
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

        jLabel15.setIcon(new javax.swing.ImageIcon("F:\\Java\\MrStoreMan\\images\\Mr.StoreManLogo.png")); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Owner");

        jLabelUserID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelUserID.setForeground(new java.awt.Color(240, 240, 240));
        jLabelUserID.setText("ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(65, 65, 65))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel16))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabelUserID)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabelUserID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
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

    private void jButtonOwnerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOwnerDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOwnerDetailsActionPerformed

    private void jButtonEmployeeDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmployeeDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEmployeeDetailsActionPerformed

    private void jButtonCustomerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCustomerDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCustomerDetailsActionPerformed

    private void jButtonItemDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonItemDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonItemDetailsActionPerformed

    private void jButtonAccountsDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccountsDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAccountsDetailsActionPerformed

    private void jButtonDevelopers2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevelopers2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDevelopers2ActionPerformed

    private void jButtonOEBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOEBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOEBActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        
        this.setState(JFrame.ICONIFIED);
        
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jButtonOwnerDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOwnerDetailsMouseClicked
        OwnerDetails od = new OwnerDetails();
        od.setVisible(true);
        od.pack();
        od.setLocationRelativeTo(null);
        od.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonOwnerDetailsMouseClicked

    private void jButtonOEBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOEBMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonOEBMouseClicked

    private void jButtonEmployeeDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEmployeeDetailsMouseClicked
        // TODO add your handling code here:
        EmployeeInfo ei = new EmployeeInfo();
        ei.setVisible(true);
        ei.pack();
        ei.setLocationRelativeTo(null);
        ei.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonEmployeeDetailsMouseClicked

    private void jButtonCustomerDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCustomerDetailsMouseClicked
        CustomerDetails cd = new CustomerDetails();
        cd.setVisible(true);
        cd.pack();
        cd.setLocationRelativeTo(null);
        cd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonCustomerDetailsMouseClicked

    private void jButtonItemDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonItemDetailsMouseClicked
        ItemInfo ii = new ItemInfo();
        ii.setVisible(true);
        ii.pack();
        ii.setLocationRelativeTo(null);
        ii.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonItemDetailsMouseClicked

    private void jComboBoxOwnerSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOwnerSettingsActionPerformed
        int settings = jComboBoxOwnerSettings.getSelectedIndex();
        
        if(settings == 1)
        {
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connectionLogin = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=MrStoreMan;selectMethod=cursor", "sa", "123456");
              Statement stLogin = connectionLogin.createStatement();
              
              String sqlLogin = "select * from Owner where OwnerId=?";
              PreparedStatement pstLogin = connectionLogin.prepareStatement(sqlLogin);
              pstLogin.setString(1, jLabelUserID.getText());
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
/*******************/ id2 = rsLogin.getString("OwnerId"); /*******************/
/*******************/ username2 = rsLogin.getString("OwnerName"); /*******************/
/*******************/ contact = rsLogin.getString("OwnerContact"); /*******************/
/*******************/ email = rsLogin.getString("OwnerEmail"); /*******************/
/*******************/ password = rsLogin.getString("OwnerPassword"); /*******************/
/*******************/ location = rsLogin.getString("OwnerLocation"); /*******************/
/*******************/ new AccountSettings(id2,username2,contact,email,password,location).setVisible(true); /*******************/
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
            Requests r2 = new Requests();
            r2.setVisible(true);
            r2.pack();
            r2.setLocationRelativeTo(null);
            r2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
        else if(settings == 3)
        {
            Choose chs3 = new Choose();
            chs3.setVisible(true);
            chs3.pack();
            chs3.setLocationRelativeTo(null);
            chs3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_jComboBoxOwnerSettingsActionPerformed

    private void jButtonDevelopers2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDevelopers2MouseClicked
            DevelopersOwner do2 = new DevelopersOwner();
            do2.setVisible(true);
            do2.pack();
            do2.setLocationRelativeTo(null);
            do2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_jButtonDevelopers2MouseClicked

    private void jButtonAccountsDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAccountsDetailsMouseClicked
            StoreRecords sr = new StoreRecords();
            sr.setVisible(true);
            sr.pack();
            sr.setLocationRelativeTo(null);
            sr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_jButtonAccountsDetailsMouseClicked

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
            java.util.logging.Logger.getLogger(OwnerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OwnerInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccountsDetails;
    private javax.swing.JButton jButtonCustomerDetails;
    private javax.swing.JButton jButtonDevelopers2;
    private javax.swing.JButton jButtonEmployeeDetails;
    private javax.swing.JButton jButtonItemDetails;
    private javax.swing.JButton jButtonOEB;
    private javax.swing.JButton jButtonOwnerDetails;
    private javax.swing.JComboBox<String> jComboBoxOwnerSettings;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelUserID;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
