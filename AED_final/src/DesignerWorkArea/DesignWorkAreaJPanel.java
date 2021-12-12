/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignerWorkArea;

import Business.WorkQueue.CustomerCustomizedWorkRequest;
import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.organization.DesignOrganization;
import business.organization.ManufacturingOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jharnadoda
 */
public class DesignWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DesignWorkAreaJPanel
     */
     private JPanel userProcessContainer;
     private Enterprise enterprise;
    private DesignOrganization designOrganization;
    private UserAccount userAccount;
    private Ecosystem business;
    public DesignWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem business) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.designOrganization = (DesignOrganization) organization;
        this.userAccount = userAccount;
        this.business = business;

         populateDesignTable();
        //add enterprise name to label
        valueLabel.setText(enterprise.getName());
        orgValueLabel.setText(organization.getName());
    }
        public void populateDesignTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest wr : designOrganization.getWorkQueue().getWorkRequestList()) {

            Object[] row = new Object[5];
            CustomerCustomizedWorkRequest cw = (CustomerCustomizedWorkRequest) wr;
            row[0] = cw;
            row[1] = cw.getStoreSender() == null ? null : cw.getStoreSender().getEmployee().getName();
            row[2] = cw.getDesignerReceiver() == null ? null : cw.getDesignerReceiver().getEmployee().getName();
            row[3] = cw.getRequestDate();
            row[4] = cw.getStatus();
            model.addRow(row);

        }

    
        
        
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
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        orgValueLabel = new javax.swing.JLabel();
        designCompleteJButton = new javax.swing.JButton();
        assignToMeJButton = new javax.swing.JButton();
        requestManufacturertJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setForeground(new java.awt.Color(102, 0, 51));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        valueLabel.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(102, 0, 51));
        valueLabel.setText("<value>");

        enterpriseLabel.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel.setText("Enterprise :");

        enterpriseLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel1.setText("Organization:");

        orgValueLabel.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        orgValueLabel.setForeground(new java.awt.Color(102, 0, 51));
        orgValueLabel.setText("<value>");

        designCompleteJButton.setBackground(new java.awt.Color(204, 204, 255));
        designCompleteJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        designCompleteJButton.setForeground(new java.awt.Color(102, 0, 51));
        designCompleteJButton.setText("Design Complete");
        designCompleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designCompleteJButtonActionPerformed(evt);
            }
        });

        assignToMeJButton.setBackground(new java.awt.Color(204, 204, 255));
        assignToMeJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        assignToMeJButton.setForeground(new java.awt.Color(102, 0, 51));
        assignToMeJButton.setText("Accept Request");
        assignToMeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeJButtonActionPerformed(evt);
            }
        });

        requestManufacturertJButton.setBackground(new java.awt.Color(204, 204, 255));
        requestManufacturertJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        requestManufacturertJButton.setForeground(new java.awt.Color(102, 0, 51));
        requestManufacturertJButton.setText("Request Manufacturing Team");
        requestManufacturertJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestManufacturertJButtonActionPerformed(evt);
            }
        });

        workRequestJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        workRequestJTable.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Sender", "Receiver", "RequestDate", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(assignToMeJButton)
                        .addGap(40, 40, 40)
                        .addComponent(requestManufacturertJButton)
                        .addGap(48, 48, 48)
                        .addComponent(designCompleteJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestManufacturertJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignToMeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(designCompleteJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        backJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(102, 0, 51));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        refreshTestJButton.setForeground(new java.awt.Color(102, 0, 51));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setText("The Cloth Factory");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(167, 167, 167)
                        .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshTestJButton)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void designCompleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designCompleteJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }

        CustomerCustomizedWorkRequest request = (CustomerCustomizedWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        request.setStatus("Design Complete");
        populateDesignTable();

    }//GEN-LAST:event_designCompleteJButtonActionPerformed

    private void assignToMeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }

        CustomerCustomizedWorkRequest request = (CustomerCustomizedWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setDesignerReceiver(userAccount);
        request.setStatus("Pending With Design");
        populateDesignTable();
    }//GEN-LAST:event_assignToMeJButtonActionPerformed

    private void requestManufacturertJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestManufacturertJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }

        CustomerCustomizedWorkRequest cRequest = (CustomerCustomizedWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        //check the status for designer
        if (cRequest.getStatus().equals("Order Ready")) {
            JOptionPane.showMessageDialog(null, "Please complete the design first", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (cRequest.getStatus().equals("Pending With Design")) {
            JOptionPane.showMessageDialog(null, "The design is not ready", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (cRequest.getStatus().equals("Design Complete")) {
            cRequest.setStatus("Manufacture Order");
            cRequest.setDesignerSender(userAccount);
            userAccount.getWorkQueue().getWorkRequestList().add(cRequest);

            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof ManufacturingOrganization) {
                    organization.getWorkQueue().getWorkRequestList().add(cRequest);

                }

            }
            JOptionPane.showMessageDialog(null, " Design sent to Manufacturer for manufacturing", "Warning", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_requestManufacturertJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateDesignTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton designCompleteJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel orgValueLabel;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestManufacturertJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}