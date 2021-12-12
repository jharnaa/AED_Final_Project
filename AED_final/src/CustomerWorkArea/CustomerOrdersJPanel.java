/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerWorkArea;

import Business.WorkQueue.CustomerCustomizedWorkRequest;
import business.organization.CustomerOrganization;
import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class CustomerOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerOrdersJPanel
     */
    private JPanel userProcessContainer;
    private CustomerOrganization customerOrganization;
    private UserAccount account;
    private Enterprise enterprise;
    private Ecosystem business;
    
    public CustomerOrdersJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.customerOrganization = (CustomerOrganization) organization;
        this.account = account;
        this.enterprise = enterprise;
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

        backJButton = new javax.swing.JButton();
        customerTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        refreshJButton = new javax.swing.JButton();
        customerOrdersjProgressBar = new javax.swing.JProgressBar();
        checkOrderStatusJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customisedOrderJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        storeOrdersJTable = new javax.swing.JTable();

        backJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        customerTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        customerTextField.setEnabled(false);
        customerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jLabel8.setText("Hello!");

        refreshJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        customerOrdersjProgressBar.setBackground(new java.awt.Color(255, 153, 153));
        customerOrdersjProgressBar.setStringPainted(true);

        checkOrderStatusJButton.setBackground(new java.awt.Color(204, 204, 255));
        checkOrderStatusJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        checkOrderStatusJButton.setText("Check Order Status");
        checkOrderStatusJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOrderStatusJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jLabel2.setText("Customized Orders");

        customisedOrderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "OrderID", "Sender", "RequestDate", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(customisedOrderJTable);

        jLabel3.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jLabel3.setText("Store Orders");

        storeOrdersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "OrderID", "Sender", "RequestDate", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(storeOrdersJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(customerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(customerOrdersjProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(checkOrderStatusJButton)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(customerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(customerOrdersjProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkOrderStatusJButton)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void customerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerTextFieldActionPerformed

    }//GEN-LAST:event_customerTextFieldActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateCustomerTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    public void populateCustomerTable() {
        DefaultTableModel model = (DefaultTableModel) customisedOrderJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof CustomerCustomizedWorkRequest) {
                Object[] row = new Object[4];
                CustomerCustomizedWorkRequest cw = (CustomerCustomizedWorkRequest) wr;
                row[0] = cw;
                row[1] = cw.getStoreSender() == null ? null : cw.getStoreSender().getEmployee().getName();
                row[2] = cw.getRequestDate();
                row[3] = cw.getStatus();
                model.addRow(row);
            }

        }
    }
    
    private void checkOrderStatusJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOrderStatusJButtonActionPerformed
        //  progress bar used to check the order status
        int selectedRow = customisedOrderJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a Row to check progress", "Warning", JOptionPane.WARNING_MESSAGE);

        } else {
            CustomerCustomizedWorkRequest cw = (CustomerCustomizedWorkRequest) customisedOrderJTable.getValueAt(selectedRow, 0);
            if (cw.getStatus().equalsIgnoreCase("Placed")) {
                customerOrdersjProgressBar.setValue(15);
            } else if (cw.getStatus().equalsIgnoreCase("Order Final")) {
                customerOrdersjProgressBar.setValue(30);
            } else if (cw.getStatus().equalsIgnoreCase("Design Order")) {
                customerOrdersjProgressBar.setValue(50);
            } else if (cw.getStatus().equalsIgnoreCase("Manufacture Order")) {
                customerOrdersjProgressBar.setValue(65);
            } else if (cw.getStatus().equalsIgnoreCase("Manufactured")) {
                customerOrdersjProgressBar.setValue(70);
            } else if (cw.getStatus().equalsIgnoreCase("Order Completed")) {
                customerOrdersjProgressBar.setValue(80);
            } else if (cw.getStatus().equalsIgnoreCase("Order Ready")) {
                customerOrdersjProgressBar.setValue(100);
            }

        }
    }//GEN-LAST:event_checkOrderStatusJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton checkOrderStatusJButton;
    private javax.swing.JProgressBar customerOrdersjProgressBar;
    private javax.swing.JTextField customerTextField;
    private javax.swing.JTable customisedOrderJTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable storeOrdersJTable;
    // End of variables declaration//GEN-END:variables
}
