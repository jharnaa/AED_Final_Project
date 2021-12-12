/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package StoreManagerWorkArea;

import Business.WorkQueue.OrderOnlineWorkRequest;
import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.organization.CustomerOrganization;
import business.organization.Organization;
import business.organization.StoreOrganization;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saloni
 */
public class StoreOrdersWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StoreOrdersWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private StoreOrganization organization;
    private UserAccount userAccount;
    private Ecosystem business;
    
    public StoreOrdersWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = (StoreOrganization) organization;
        this.userAccount = account;
        this.business = business;
        
        populateStoreTable();
        
        valueLabel.setText(enterprise.getName());
        orgValueLabel.setText(organization.getName());
        
    }
        
        public void populateStoreTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        {
            for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
                if (wr instanceof OrderOnlineWorkRequest) {
                    Object[] row = new Object[5];
                    OrderOnlineWorkRequest oas = (OrderOnlineWorkRequest) wr;
                    row[0] = oas;
                    row[1] = oas.getSender().getEmployee().getName();
                    row[2] = oas.getReceiver() == null ? null : oas.getReceiver().getEmployee().getName();
                    row[3] = oas.getRequestDate();
                    row[4] = oas.getStatus();
                    model.addRow(row);

                }
            }
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

        backJButton = new javax.swing.JButton();
        assignToMeJButton1 = new javax.swing.JButton();
        sendToCustomerJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        enterpriseLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        orgValueLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        backJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(102, 0, 51));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        assignToMeJButton1.setBackground(new java.awt.Color(204, 204, 255));
        assignToMeJButton1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        assignToMeJButton1.setForeground(new java.awt.Color(102, 0, 51));
        assignToMeJButton1.setText("Accept Request");
        assignToMeJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeJButton1ActionPerformed(evt);
            }
        });

        sendToCustomerJButton.setBackground(new java.awt.Color(204, 204, 255));
        sendToCustomerJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        sendToCustomerJButton.setForeground(new java.awt.Color(102, 0, 51));
        sendToCustomerJButton.setText("Send Confirmation to Customer");
        sendToCustomerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToCustomerJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(102, 0, 51));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel3.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        enterpriseLabel3.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel3.setText("Store Order Requests");

        workRequestJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "OrderID", "Sender", "Receiver", "RequestDate", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable);

        enterpriseLabel.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel.setText("Enterprise :");

        valueLabel.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(102, 0, 51));
        valueLabel.setText("<value>");

        orgValueLabel.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        orgValueLabel.setForeground(new java.awt.Color(102, 0, 51));
        orgValueLabel.setText("<value>");

        enterpriseLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel1.setText("Organization:");

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setText("The Cloth Factory");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enterpriseLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(389, 389, 389))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sendToCustomerJButton)
                        .addGap(399, 399, 399))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(assignToMeJButton1)
                        .addGap(467, 467, 467))))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(284, 284, 284)
                .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(enterpriseLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refreshJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgValueLabel))
                .addGap(87, 87, 87)
                .addComponent(enterpriseLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(assignToMeJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendToCustomerJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void assignToMeJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeJButton1ActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }

        OrderOnlineWorkRequest request = (OrderOnlineWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        request.setReceiver(userAccount);
        request.setStatus("Pending");

        populateStoreTable();

        // TODO add your handling code here:
    }//GEN-LAST:event_assignToMeJButton1ActionPerformed

    private void sendToCustomerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToCustomerJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        OrderOnlineWorkRequest request = (OrderOnlineWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        request.setStatus("Order Processed");
        request.setSender(userAccount);
        userAccount.getWorkQueue().getWorkRequestList().add(request);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof CustomerOrganization) {
                organization.getWorkQueue().getWorkRequestList().add(request);
            }
        }
        JOptionPane.showMessageDialog(null, "Order sent to Customer", "Info", JOptionPane.INFORMATION_MESSAGE);

        populateStoreTable();
    }//GEN-LAST:event_sendToCustomerJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateStoreTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeJButton1;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel enterpriseLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel orgValueLabel;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton sendToCustomerJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
