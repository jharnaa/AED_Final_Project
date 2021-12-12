/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package ClothFactoryStaffWorkArea;

import Business.customer.ClothFactoryCatalog;
import Business.customer.ClothFactoryProduct;
import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.enterprise.clothFactoryEnterprise;
import business.enterprise.customerCareEnterprise;
import business.network.Network;
import business.organization.ClothFactoryStaffOrganization;
import business.organization.Organization;
import business.organization.StoreOrganization;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saloni
 */
public class ClothFactoryWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private Ecosystem business;
    /** Creates new form ClothFactoryWorkAreaJPanel */
    public ClothFactoryWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (ClothFactoryStaffOrganization) organization;
        this.account = account;
        this.enterprise = (clothFactoryEnterprise) enterprise;
        this.business = business;
        valueLabel.setText(enterprise.getName());
        valueLabel1.setText(organization.getName());
        populateTable();
    }
    
    private void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        dtm.setRowCount(0);

        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                if (enterprise instanceof customerCareEnterprise) {
                    for (Organization storeOrganization : enterprise.getOrganizationDirectory().getOrganizationList()) {

                        if (storeOrganization instanceof StoreOrganization) {
                            ClothFactoryCatalog cfc = ((StoreOrganization) storeOrganization).getCfc();

                            for (ClothFactoryProduct cfp : cfc.getListOfClothFactoryProduct()) {
                                Object[] row = new Object[5];
                                row[0] = cfp.getClothId();
                                row[1] = cfp.getBrand();
                                row[2] = cfp.getModelNumber();
                                row[3] = cfp.getQuantity();
                                row[4] = cfp.getPrice();
                                dtm.addRow(row);

                            }
                        }
                    }
                }

            }
        }
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
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel2 = new javax.swing.JLabel();
        valueLabel1 = new javax.swing.JLabel();
        enterpriseLabel3 = new javax.swing.JLabel();
        refreshTestJButton = new javax.swing.JButton();
        createCarModelJButton = new javax.swing.JButton();
        brandJComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        modelNumberJComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        quantityJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();

        backJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        valueLabel.setText("<value>");

        enterpriseLabel2.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        enterpriseLabel2.setText("Enterprise :");

        valueLabel1.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        valueLabel1.setText("<value>");

        enterpriseLabel3.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        enterpriseLabel3.setText("Organization:");

        refreshTestJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        createCarModelJButton.setBackground(new java.awt.Color(204, 204, 255));
        createCarModelJButton.setFont(new java.awt.Font("Palatino", 1, 14)); // NOI18N
        createCarModelJButton.setText("Create Order");
        createCarModelJButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        createCarModelJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCarModelJButtonActionPerformed(evt);
            }
        });

        brandJComboBox.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        brandJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zara", "H&M" }));
        brandJComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        brandJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jLabel1.setText("Brand");

        jLabel3.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jLabel3.setText("Model Number");

        modelNumberJComboBox.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        modelNumberJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zara Tshirt", "Zara Shirt", "Zara Hoodies", "Zara Sweat Shirts", "Zara Jackets", "Zara Tank Tops", "Zara Baby Bodysuits", "H&M Tshirt", "H&M Shirt", "H&M Hoodies", "H&M Sweat Shirts", "H&M Jackets", "H&M Tank Tops", "H&M Baby Bodysuits" }));
        modelNumberJComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        modelNumberJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelNumberJComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jLabel4.setText("Quantity");

        quantityJTextField.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        quantityJTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        workRequestJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ClothID", "Brand", "Model Number", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(workRequestJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(enterpriseLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enterpriseLabel3)
                        .addGap(16, 16, 16)
                        .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addComponent(brandJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(42, 42, 42)
                                .addComponent(modelNumberJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel4)
                                .addGap(36, 36, 36)
                                .addComponent(quantityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(createCarModelJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(enterpriseLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(valueLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(enterpriseLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addComponent(brandJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addComponent(modelNumberJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4))
                            .addComponent(quantityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(createCarModelJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        populateTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void createCarModelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCarModelJButtonActionPerformed

        ClothFactoryProduct clothFactoryProduct = null;

        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                if (enterprise instanceof customerCareEnterprise) {
                    for (Organization storeOrganization : enterprise.getOrganizationDirectory().getOrganizationList()) {

                        if (storeOrganization instanceof StoreOrganization) {
                            ClothFactoryCatalog cfc = ((StoreOrganization) storeOrganization).getCfc();

                            clothFactoryProduct = cfc.addClothFactoryProduct();

                        }

                        if (clothFactoryProduct != null) {
                            float price = 0;

                            clothFactoryProduct.setBrand(brandJComboBox.getSelectedItem().toString());
                            clothFactoryProduct.setModelNumber((modelNumberJComboBox.getSelectedItem().toString()));
                            clothFactoryProduct.setQuantity(Integer.parseInt(quantityJTextField.getText()));

                            if (clothFactoryProduct.getBrand().equalsIgnoreCase("Zara")) {
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Tshirt")) {
                                    price = price + 24780;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Shirt")) {
                                    price = price + 15700;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Hoodies")) {
                                    price = price +43009;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Sweat Shirts")) {
                                    price = price + 22000;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Jackets")) {
                                    price = price + 16150;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Tank Tops")) {
                                    price = price + 36000;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Baby Bodysuits")) {
                                    price = price + 61600;
                                }
                            }
                            if (clothFactoryProduct.getBrand().equalsIgnoreCase("H&M")) {
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Tshirt")) {
                                    price = price + 14000;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Shirt")) {
                                    price = price + 23500;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Hoodies")) {
                                    price = price + 36000;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Sweat Shirts")) {
                                    price = price + 15000;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Jackets")) {
                                    price = price + 25000;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Tank Tops")) {
                                    price = price + 32000;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Baby Bodysuits")) {
                                    price = price + 61600;
                                }
                            }

                            clothFactoryProduct.setPrice(price);
                        }
                    }

                }
            }
        }

        populateTable();

    }//GEN-LAST:event_createCarModelJButtonActionPerformed

    private void brandJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandJComboBoxActionPerformed

        final DefaultComboBoxModel teslaModelNumberJComboBox = new DefaultComboBoxModel(new String[]{"T78", "E45", "Y89"});
        final DefaultComboBoxModel vwModelNumberJComboBox = new DefaultComboBoxModel(new String[]{"T56", "E45", "Y67"});

        brandJComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (brandJComboBox.getSelectedItem().equals("Zara")) {
                    modelNumberJComboBox.setModel(teslaModelNumberJComboBox);

                } else {
                    modelNumberJComboBox.setModel(vwModelNumberJComboBox);
                }

            }

        });
    }//GEN-LAST:event_brandJComboBoxActionPerformed

    private void modelNumberJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelNumberJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelNumberJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> brandJComboBox;
    private javax.swing.JButton createCarModelJButton;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JLabel enterpriseLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> modelNumberJComboBox;
    private javax.swing.JTextField quantityJTextField;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

}
