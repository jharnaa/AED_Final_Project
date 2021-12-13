/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DesignerWorkArea;

import business.enterprise.productionEnterprise;
import business.organization.DesignOrganization;
import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author saloni
 */
public class DesignerWorkAreaManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DesignerWorkAreaManagementJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private DesignOrganization organization;
    private UserAccount userAccount;
    private Ecosystem business;
    public DesignerWorkAreaManagementJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
       this.userProcessContainer = userProcessContainer;
        this.enterprise = (productionEnterprise) enterprise;
        this.userAccount = account;
        this.organization = (DesignOrganization) organization;
        this.business = business;
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
        designProductJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        designProductJButton.setBackground(new java.awt.Color(255, 255, 255));
        designProductJButton.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        designProductJButton.setForeground(new java.awt.Color(102, 0, 51));
        designProductJButton.setText("Customized Products Work Requests");
        designProductJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designProductJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(designProductJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 660, 190));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("The Cloth Factory");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 1147, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void designProductJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designProductJButtonActionPerformed
        // TODO add your handling code here:
        DesignWorkAreaJPanel designJPanel = new DesignWorkAreaJPanel(userProcessContainer, userAccount, organization, enterprise, business);
        userProcessContainer.add("designJPanel", designJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_designProductJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton designProductJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
