/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.DB4OUtil.DB4OUtil;
import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.useraccount.UserAccount;
import business.useraccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author mrunalbhalerao
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private Ecosystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public MainJFrame() {
        initComponents();
        
        system = dB4OUtil.retrieveSystem();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        ControlJPanel = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        btnSignOut = new javax.swing.JButton();
        btnSignIn = new javax.swing.JButton();
        JPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        WorkAreaJPanel = new javax.swing.JPanel();
        lblScreenSaver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlJPanel.setBackground(new java.awt.Color(102, 0, 51));
        ControlJPanel.setForeground(new java.awt.Color(102, 0, 51));
        ControlJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ControlJPanel.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, 112, 29));

        btnSignOut.setText("SignOut");
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });
        ControlJPanel.add(btnSignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 304, 112, -1));

        btnSignIn.setText("Sign In");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        ControlJPanel.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 269, 112, -1));
        ControlJPanel.add(JPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 188, 112, 29));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        ControlJPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 77, 106, 29));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        ControlJPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 153, -1, 29));

        jSplitPane1.setLeftComponent(ControlJPanel);

        WorkAreaJPanel.setBackground(new java.awt.Color(102, 0, 51));
        WorkAreaJPanel.setLayout(new java.awt.CardLayout());

        lblScreenSaver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Screen Shot 2021-12-12 at 4.44.07 PM.png"))); // NOI18N
        WorkAreaJPanel.add(lblScreenSaver, "card2");

        jSplitPane1.setRightComponent(WorkAreaJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
        
        String userName = txtUserName.getText();
        //Get Password
        char[] passwordCharArray = JPasswordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        //Step1: Check in the system user account directory if you have the user
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        //System.out.println(userAccount.getUsername() + userAccount.getPassword());
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        if (userAccount == null) {
            //Step2: Go inside each network to check each enterprise
            for (Network network : system.getNetworkList()) {
                //Step 2-a: Check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        //Step3: Check against each organization inside that enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) 
                            {
                           // System.out.println(organization.getName() + enterprise.getName());
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }
                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }

        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentails!");
            return;
        } else {
            CardLayout layout = (CardLayout) WorkAreaJPanel.getLayout();
            WorkAreaJPanel.add(userAccount.getRole().toString() + "workArea", userAccount.getRole().createWorkArea(WorkAreaJPanel, userAccount, inOrganization, inEnterprise, system));
            layout.next(WorkAreaJPanel);
        }
        
        btnSignIn.setEnabled(false);
        btnSignOut.setEnabled(true);
        txtUserName.setEnabled(false);
        JPasswordField.setEnabled(false);
        
        
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        // TODO add your handling code here:
        btnSignOut.setEnabled(false);
        txtUserName.setEnabled(true);
        JPasswordField.setEnabled(true);
        btnSignIn.setEnabled(true);

        txtUserName.setText("");
        JPasswordField.setText("");

        WorkAreaJPanel.removeAll();

      WorkAreaJPanel.add("blank", lblScreenSaver);

        CardLayout cardLayout = (CardLayout) WorkAreaJPanel.getLayout();
        cardLayout.next(WorkAreaJPanel);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnSignOutActionPerformed

    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlJPanel;
    private javax.swing.JPasswordField JPasswordField;
    private javax.swing.JPanel WorkAreaJPanel;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblScreenSaver;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
