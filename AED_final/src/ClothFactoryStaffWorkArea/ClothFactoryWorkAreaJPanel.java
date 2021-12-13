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
import javax.swing.JOptionPane;
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
        createClothModelJButton = new javax.swing.JButton();
        brandJComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        modelNumberJComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        quantityJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(102, 0, 51));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 93, 37));

        valueLabel.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(102, 0, 51));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 90, 150, 30));

        enterpriseLabel2.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        enterpriseLabel2.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel2.setText("Enterprise :");
        add(enterpriseLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 90, -1, 30));

        valueLabel1.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        valueLabel1.setForeground(new java.awt.Color(102, 0, 51));
        valueLabel1.setText("<value>");
        add(valueLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 121, 180, 30));

        enterpriseLabel3.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        enterpriseLabel3.setForeground(new java.awt.Color(102, 0, 51));
        enterpriseLabel3.setText("Organization:");
        add(enterpriseLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 116, -1, 40));

        refreshTestJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        refreshTestJButton.setForeground(new java.awt.Color(102, 0, 51));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 130, 37));

        createClothModelJButton.setBackground(new java.awt.Color(255, 255, 255));
        createClothModelJButton.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        createClothModelJButton.setForeground(new java.awt.Color(102, 0, 51));
        createClothModelJButton.setText("Stock Items");
        createClothModelJButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        createClothModelJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createClothModelJButtonActionPerformed(evt);
            }
        });
        add(createClothModelJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 150, 40));

        brandJComboBox.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        brandJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zara", "H&M" }));
        brandJComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        brandJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandJComboBoxActionPerformed(evt);
            }
        });
        add(brandJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 180, -1));

        jLabel1.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("Brand");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setText("Model Number");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        modelNumberJComboBox.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        modelNumberJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zara Tshirt", "Zara Shirt", "Zara Hoodies", "Zara Sweat Shirts", "Zara Jackets", "Zara Tank Tops", "Zara Baby Bodysuits", "H&M Tshirt", "H&M Shirt", "H&M Hoodies", "H&M Sweat Shirts", "H&M Jackets", "H&M Tank Tops", "H&M Baby Bodysuits" }));
        modelNumberJComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        modelNumberJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelNumberJComboBoxActionPerformed(evt);
            }
        });
        add(modelNumberJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 180, -1));

        jLabel4.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 51));
        jLabel4.setText("Quantity");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        quantityJTextField.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        quantityJTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(quantityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 180, -1));

        workRequestJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        workRequestJTable.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(102, 0, 51));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Apparel ID", "Brand", "Model Number", "Quantity", "Price"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 750, 190));

        jLabel2.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        jLabel2.setText("The Cloth Factory");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClothFactoryStaffWorkArea/jacket1.gif"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 140, -1, 224));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        populateTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void createClothModelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createClothModelJButtonActionPerformed
        
        if(quantityJTextField.getText().isEmpty() == true)
        {
            JOptionPane.showMessageDialog(this, "Please Fill in Quantity");
            return;
        }
        
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
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Zara Tshirt")) {
                                    price = price + 25;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Zara Shirt")) {
                                    price = price + 23;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Zara Hoodies")) {
                                    price = price + 60;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Zara Sweat Shirts")) {
                                    price = price + 55;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Zara Jackets")) {
                                    price = price + 70;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Zara Tank Tops")) {
                                    price = price + 15;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("Zara Baby Bodysuits")) {
                                    price = price + 20;
                                }
                            }
                            if (clothFactoryProduct.getBrand().equalsIgnoreCase("H&M")) {
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("H&M Tshirt")) {
                                    price = price + 19;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("H&M Shirt")) {
                                    price = price + 24;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("H&M Hoodies")) {
                                    price = price + 36;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("H&M Sweat Shirts")) {
                                    price = price + 45;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("H&M Jackets")) {
                                    price = price + 50;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("H&M Tank Tops")) {
                                    price = price + 32;
                                }
                                if (clothFactoryProduct.getModelNumber().equalsIgnoreCase("H&M Baby Bodysuits")) {
                                    price = price + 16;
                                }
                            }

                            clothFactoryProduct.setPrice(price);
                        }
                    }

                }
            }
        }

        populateTable();

    }//GEN-LAST:event_createClothModelJButtonActionPerformed

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
    private javax.swing.JButton createClothModelJButton;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JLabel enterpriseLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> modelNumberJComboBox;
    private javax.swing.JTextField quantityJTextField;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

}
