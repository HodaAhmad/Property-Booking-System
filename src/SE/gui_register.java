/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE;

import javax.swing.JOptionPane;

/**
 *
 * @author The Black
 */
public class gui_register extends javax.swing.JFrame {

    /**
     * Creates new form gui_register
     */
    public gui_register() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        verificationCode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        enterVerificationCode = new javax.swing.JFormattedTextField();
        Register = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        regName = new javax.swing.JTextField();
        regPW = new javax.swing.JPasswordField();
        regEmail = new javax.swing.JTextField();
        regPhone = new javax.swing.JTextField();
        regCCN = new javax.swing.JTextField();
        regBalance = new javax.swing.JTextField();
        Buyer = new javax.swing.JCheckBox();
        Tenant = new javax.swing.JCheckBox();
        Landlord = new javax.swing.JCheckBox();
        RegisterButton = new javax.swing.JButton();

        verificationCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setText("verification code");

        enterVerificationCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(verificationCode, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(enterVerificationCode)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addComponent(verificationCode, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(enterVerificationCode, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Register.setBackground(new java.awt.Color(0, 0, 0));
        Register.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        Register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Register.setText("Register");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Email:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Phone:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Credit card:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Balance:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Type: ");

        regName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        regName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        regName.setText("ENTER  YOUR NAME");
        regName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regNameMouseClicked(evt);
            }
        });
        regName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNameActionPerformed(evt);
            }
        });

        regPW.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        regPW.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        regPW.setText("PASSWORD");
        regPW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regPWMouseClicked(evt);
            }
        });
        regPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regPWActionPerformed(evt);
            }
        });

        regEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        regEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        regEmail.setText("ENTER  YOUR EMAIL");
        regEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regEmailMouseClicked(evt);
            }
        });
        regEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regEmailActionPerformed(evt);
            }
        });

        regPhone.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        regPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        regPhone.setText("ENTER  YOUR PHONE");
        regPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regPhoneMouseClicked(evt);
            }
        });
        regPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regPhoneActionPerformed(evt);
            }
        });

        regCCN.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        regCCN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        regCCN.setText("ENTER  CREDIT CARD");
        regCCN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regCCNMouseClicked(evt);
            }
        });
        regCCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regCCNActionPerformed(evt);
            }
        });

        regBalance.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        regBalance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        regBalance.setText("ENTER  YOUR BAlANCE");
        regBalance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regBalanceMouseClicked(evt);
            }
        });
        regBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBalanceActionPerformed(evt);
            }
        });

        buttonGroup1.add(Buyer);
        Buyer.setText("Buyer");

        buttonGroup1.add(Tenant);
        Tenant.setText("Tenant");
        Tenant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenantActionPerformed(evt);
            }
        });

        buttonGroup1.add(Landlord);
        Landlord.setText("Landlord");

        RegisterButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(196, 196, 196))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(regPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                                    .addComponent(regPW, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(regName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(regEmail))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Landlord)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(regBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(regCCN, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 20, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(Buyer, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(Tenant, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Register)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regName, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regPW, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regCCN, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Buyer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tenant, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Landlord, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addGap(18, 18, 18)
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regNameMouseClicked
        regName.setText("");
    }//GEN-LAST:event_regNameMouseClicked

    private void regNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNameActionPerformed

    }//GEN-LAST:event_regNameActionPerformed

    private void regPWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regPWMouseClicked
        regPW.setText("");
    }//GEN-LAST:event_regPWMouseClicked

    private void regPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regPWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regPWActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        try {
            Account acc = new Account();
            boolean selected = false;
            String register_mail = (String) regEmail.getText();
            String register_PW = new String(regPW.getPassword());
            String register_name = (String) regName.getText();
            String register_CCN = (String) regCCN.getText();
            String register_phone = (String) regPhone.getText();
            String register_Balan = (String) regBalance.getText();
            String type = "";
            double register_Balance = Double.parseDouble(register_Balan);

            if (Buyer.isSelected()) {
                type = "Buyer";
                acc.createAccount(register_mail, register_PW, type, register_name, register_CCN, register_phone, register_Balance);
                selected = true;
            } else if (Tenant.isSelected()) {
                type = "Tenant";
                acc.createAccount(register_mail, register_PW, type, register_name, register_CCN, register_phone, register_Balance);
                selected = true;
            } else if (Landlord.isSelected()) {
                type = "Landlord";
                acc.createAccount(register_mail, register_PW, type, register_name, register_CCN, register_phone, register_Balance);
                selected = true;
            } else {
                JOptionPane.showMessageDialog(null, "Please Select ", "Something is wrong", JOptionPane.WARNING_MESSAGE);
            }
            if (selected) {
                new gui_login().setVisible(true);
                this.setVisible(false);
                disable();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Something is wrong", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void regEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regEmailMouseClicked
        regEmail.setText("");
    }//GEN-LAST:event_regEmailMouseClicked

    private void regEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regEmailActionPerformed

    private void regPhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regPhoneMouseClicked
        regPhone.setText("");
    }//GEN-LAST:event_regPhoneMouseClicked

    private void regPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regPhoneActionPerformed

    private void regCCNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regCCNMouseClicked
        regCCN.setText("");
    }//GEN-LAST:event_regCCNMouseClicked

    private void regCCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regCCNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regCCNActionPerformed

    private void regBalanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regBalanceMouseClicked
        regBalance.setText("");
    }//GEN-LAST:event_regBalanceMouseClicked

    private void regBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regBalanceActionPerformed

    private void TenantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TenantActionPerformed

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
            java.util.logging.Logger.getLogger(gui_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Buyer;
    private javax.swing.JCheckBox Landlord;
    private javax.swing.JLabel Register;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JCheckBox Tenant;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField enterVerificationCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField regBalance;
    private javax.swing.JTextField regCCN;
    private javax.swing.JTextField regEmail;
    private javax.swing.JTextField regName;
    private javax.swing.JPasswordField regPW;
    private javax.swing.JTextField regPhone;
    private javax.swing.JTextField verificationCode;
    // End of variables declaration//GEN-END:variables
}