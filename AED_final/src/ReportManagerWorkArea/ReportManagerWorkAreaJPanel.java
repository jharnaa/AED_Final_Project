/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ReportManagerWorkArea;

import business.organization.ReportOrganization;
import Business.customer.MasterOrderList;
//import business.customer.MasterOrderList;
import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.enterprise.productionEnterprise;
import business.organization.Organization;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author saloni
 */
public class ReportManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReportManagerWorkAreaJPanel
     */
    private MasterOrderList mod;
    //private CustomizedOrder customizedOrder;
    //private CustomizedOrderItem customizedOrderItem;
    //private OrderAtStore orderAtStore;
    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private Ecosystem business;
    private Organization organization;

    final String applicationTitle = "Hazardous Content Chart";
    final String chartTitle = "Hazardous Content Chart";
    
    public ReportManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (ReportOrganization) organization;
        this.account = account;
        this.enterprise = enterprise;
        this.business = business;
        
        valueLabel.setText(enterprise.getName());
        orgValueLabel.setText(organization.getName());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton7 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseLabel2 = new javax.swing.JLabel();
        orgValueLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        hazardousContentjBtn = new javax.swing.JButton();
        revenueJButton5 = new javax.swing.JButton();
        workREquestJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        backJButton7.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        backJButton7.setText("Back");
        backJButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton7ActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");

        enterpriseLabel2.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        enterpriseLabel2.setText("Organization:");

        orgValueLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        orgValueLabel.setText("<value>");

        valueLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        valueLabel.setText("<value>");

        hazardousContentjBtn.setBackground(new java.awt.Color(204, 204, 255));
        hazardousContentjBtn.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 18)); // NOI18N
        hazardousContentjBtn.setText("Level of Hazardous Content");
        hazardousContentjBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hazardousContentjBtnActionPerformed(evt);
            }
        });

        revenueJButton5.setBackground(new java.awt.Color(204, 204, 255));
        revenueJButton5.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 18)); // NOI18N
        revenueJButton5.setText("Revenue ");
        revenueJButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revenueJButton5ActionPerformed(evt);
            }
        });

        workREquestJButton.setBackground(new java.awt.Color(204, 204, 255));
        workREquestJButton.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 18)); // NOI18N
        workREquestJButton.setText("Work Requests");
        workREquestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workREquestJButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 18)); // NOI18N
        jButton1.setText("Organization");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel2)
                        .addGap(16, 16, 16)
                        .addComponent(orgValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backJButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hazardousContentjBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workREquestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(revenueJButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(backJButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hazardousContentjBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(workREquestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(revenueJButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton7ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton7ActionPerformed

    private void hazardousContentjBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hazardousContentjBtnActionPerformed
        // TODO add your handling code here:

        HazardousContentReportJPanel lcjp = new HazardousContentReportJPanel(userProcessContainer, mod,business);
        userProcessContainer.add("HazardousContentReportJPanel", lcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hazardousContentjBtnActionPerformed

    private void revenueJButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revenueJButton5ActionPerformed
        // TODO add your handling code here:
        ReportRevenueJPanel rrjp = new ReportRevenueJPanel(userProcessContainer, mod, business);
        userProcessContainer.add("LeadContentReportJPanel", rrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        //            JOptionPane.showMessageDialog(null, customizedRevenue, "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_revenueJButton5ActionPerformed

    private void workREquestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workREquestJButtonActionPerformed

        QualityControlJPanel ojp = new QualityControlJPanel(userProcessContainer,account,organization,enterprise, business);
        userProcessContainer.add("RegulatoryWorkRequests", ojp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_workREquestJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ReportOfOrganizationJPanel ojp = new ReportOfOrganizationJPanel(userProcessContainer, mod, business);
        userProcessContainer.add("OrganizationReportJPanel", ojp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton7;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JButton hazardousContentjBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel orgValueLabel;
    private javax.swing.JButton revenueJButton5;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton workREquestJButton;
    // End of variables declaration//GEN-END:variables
}
