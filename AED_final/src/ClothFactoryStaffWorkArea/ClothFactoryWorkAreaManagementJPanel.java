/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package ClothFactoryStaffWorkArea;

import business.organization.ClothFactoryStaffOrganization;
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
public class ClothFactoryWorkAreaManagementJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
    private Enterprise enterprise;
    private ClothFactoryStaffOrganization organization;
    private UserAccount userAccount;
    private Ecosystem business;
    /** Creates new form ClothFactoryWorkAreaManagementJPanel */
    public ClothFactoryWorkAreaManagementJPanel(JPanel userProcessContainer, UserAccount account,Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = (ClothFactoryStaffOrganization) organization;
        this.userAccount = account;
        this.business = business;
        valueLabel.setText(enterprise.getName());
        orgValueLabel.setText(organization.getName());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        orgValueLabel = new javax.swing.JLabel();
        CreateApparelJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(102, 0, 51));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 103, 39));

        enterpriseLabel.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 30));

        enterpriseLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel1.setText("Organization:");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 26));

        valueLabel.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(102, 0, 51));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 155, 26));

        orgValueLabel.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        orgValueLabel.setForeground(new java.awt.Color(102, 0, 51));
        orgValueLabel.setText("<value>");
        add(orgValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 220, 26));

        CreateApparelJButton.setBackground(new java.awt.Color(255, 255, 255));
        CreateApparelJButton.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        CreateApparelJButton.setForeground(new java.awt.Color(102, 0, 51));
        CreateApparelJButton.setText("Place Apparel Requests");
        CreateApparelJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateApparelJButtonActionPerformed(evt);
            }
        });
        add(CreateApparelJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 460, 180));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        jLabel1.setText("The Cloth Factory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClothFactoryStaffWorkArea/frock.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, 172, 197));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClothFactoryStaffWorkArea/frock2.gif"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 284, 249));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void CreateApparelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateApparelJButtonActionPerformed
        // TODO add your handling code here:
        ClothFactoryWorkAreaJPanel designJPanel = new ClothFactoryWorkAreaJPanel(userProcessContainer, userAccount, organization, enterprise, business);
        userProcessContainer.add("designJPanel", designJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_CreateApparelJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateApparelJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel orgValueLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}
