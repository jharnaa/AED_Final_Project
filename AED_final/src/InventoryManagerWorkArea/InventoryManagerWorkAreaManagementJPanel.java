/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InventoryManagerWorkArea;

import business.enterprise.productionEnterprise;
import business.organization.InventoryOrganization;
import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author saloni
 */
public class InventoryManagerWorkAreaManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InventoryManagerWorkAreaManagementJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private InventoryOrganization organization;
    private UserAccount userAccount;
    private Ecosystem business;
    
    public InventoryManagerWorkAreaManagementJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = (productionEnterprise) enterprise;
        this.userAccount = account;
        this.organization = (InventoryOrganization) organization;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
