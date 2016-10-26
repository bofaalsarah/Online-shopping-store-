/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import assignment.Admin;
import assignment.Buyer;
import assignment.MyReader;
import assignment.Seller;
import gui.AdminFrame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author xxhackerxx
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    public void groupButton() {
        ButtonGroup group = new ButtonGroup(); //
        group.add(adminBut); //
        group.add(buyerBut);//
        group.add(sellerBut);//
    }

    public int login() {
        int test = 0;
        int a = 0;
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        ArrayList<Seller> sellers = MyReader.getSellers();
        ArrayList<Seller> mySeller = new ArrayList<Seller>();
        // can be called without an object since it's a static type
        // System.out.println(admins.size());
        for (Seller seller : sellers) {
            if (seller.getUsername().equals(username) && seller.getPassword().equals(password)) {
                new SellerFrame((seller));
                test++;
                this.setVisible(false);

            }
        }
        if (test == 0) {
            JOptionPane.showMessageDialog(this, "Incorrect username or password", "Access denied", JOptionPane.ERROR_MESSAGE);
        }
        return a;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ver = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adminBut = new javax.swing.JRadioButton();
        buyerBut = new javax.swing.JRadioButton();
        sellerBut = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trading System");
        setLocation(new java.awt.Point(380, 180));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        jLabel1.setText("User name");

        jLabel2.setText("Password");

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ver.setFont(new java.awt.Font("URW Bookman L", 1, 14)); // NOI18N
        ver.setForeground(new java.awt.Color(231, 20, 20));
        ver.setText(" ");

        jLabel4.setIcon(new javax.swing.ImageIcon("/home/xxhackerxx/Pictures/login.png")); // NOI18N

        adminBut.setSelected(true);
        adminBut.setText("Admin");
        adminBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButActionPerformed(evt);
            }
        });

        buyerBut.setText("Buyer");
        buyerBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyerButActionPerformed(evt);
            }
        });

        sellerBut.setText("Seller");
        sellerBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 730, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(adminBut)
                                    .addComponent(jLabel1))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buyerBut)
                                        .addGap(18, 18, 18)
                                        .addComponent(sellerBut))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(ver))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(adminBut)
                                    .addComponent(buyerBut)
                                    .addComponent(sellerBut))
                                .addGap(35, 35, 35)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(207, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed

    }//GEN-LAST:event_usernameFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username;
        String password;
        BufferedReader br;
        int test = 0;
        
        username = usernameField.getText();
        password = new String(passwordField.getPassword());
        if (adminBut.isSelected()) {

            try {
                ArrayList<Admin> admins = MyReader.getAdmins(); // can be called without an object since it's a static type

                for (Admin admin : admins) {

                    if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                        test++;
                        this.setVisible(false);
                        new AdminFrame(admin);
                    }
                }
                if (test == 0) {
                    JOptionPane.showMessageDialog(this, "Incorrect username or password", "Access denied", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println("ERORR: " + e);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

        else if (sellerBut.isSelected()) {
       

        ArrayList<Seller> sellers = MyReader.getSellers();
        ArrayList<Seller> mySeller = new ArrayList<Seller>();
        // can be called without an object since it's a static type
        // System.out.println(admins.size());
        for (Seller seller : sellers) {
            if (seller.getUsername().equals(username) && seller.getPassword().equals(password)) {
                new SellerFrame((seller));
                test++;
                this.setVisible(false);

            }
        }
        if (test == 0) {
            JOptionPane.showMessageDialog(this, "Incorrect username or password", "Access denied", JOptionPane.ERROR_MESSAGE);
        }
        } else {

            ArrayList<Buyer> buyers = MyReader.getBuyers(); // can be called without an object since it's a static type
            
            for (Buyer buyer : buyers) {
                if (buyer.getUsername().equals(username) && buyer.getPassword().equals(password)) {
                    new BuyerFrame(buyer);
                    test++;
                    this.setVisible(false);
                    
                }
            }
            if (test == 0) {
                JOptionPane.showMessageDialog(this, "Incorrect username or password", "Access denied", JOptionPane.ERROR_MESSAGE);
            }

        }

    }
    private void adminButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButActionPerformed
        //********
        groupButton();
        //******** This block of code force the user to select only one radio button


    }//GEN-LAST:event_adminButActionPerformed

    private void buyerButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyerButActionPerformed
        groupButton();
    }//GEN-LAST:event_buyerButActionPerformed

    private void sellerButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerButActionPerformed
        groupButton();
    }//GEN-LAST:event_sellerButActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adminBut;
    private javax.swing.JRadioButton buyerBut;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JRadioButton sellerBut;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
