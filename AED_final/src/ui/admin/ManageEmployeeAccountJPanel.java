/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin;

import business.organization.Organization;
import business.organization.OrganizationDirectory;
import business.person.Person;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class ManageEmployeeAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployeeAccountJPanel
     */
    
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    
    public ManageEmployeeAccountJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDir) {
        initComponents();
     
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
        
        valueLabel.setText(enterpriseLabel.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        cmbOrganization = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPersonName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 0, 51));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 61, 120, 20));

        valueLabel.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 169, 20));

        cmbOrganization.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        cmbOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrganization.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cmbOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrganizationActionPerformed(evt);
            }
        });
        add(cmbOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 154, 30));

        jLabel3.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setText("Organization");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, 20));

        tblOrganization.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tblOrganization.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Person ID", "Person Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrganization);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 417, 85));

        addJButton.setBackground(new java.awt.Color(255, 204, 204));
        addJButton.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        addJButton.setForeground(new java.awt.Color(102, 0, 51));
        addJButton.setText("Create Person");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 150, 30));

        jLabel2.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setText("Person Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, 20));

        txtPersonName.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        txtPersonName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(txtPersonName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 154, 20));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("Organization");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        organizationJComboBox.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 154, -1));

        jLabel4.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        jLabel4.setText("The Cloth Factory");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 250, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrganizationActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }
    }//GEN-LAST:event_cmbOrganizationActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        Organization organization = (Organization) cmbOrganization.getSelectedItem();
        String name = txtPersonName.getText();
        organization.getEmployeeDirectory().createPerson(name);
        populateTable(organization);
    }//GEN-LAST:event_addJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    public void populateOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }

    private void populateTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) tblOrganization.getModel();

        model.setRowCount(0);

        for (Person employee : organization.getEmployeeDirectory().getPersonList()) {
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();

            model.addRow(row);
        }
    }

    public void populateOrganizationEmpComboBox() {
        cmbOrganization.removeAllItems();

        for (Organization organization : organizationDir.getOrganizationList()) {
            cmbOrganization.addItem(organization);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox cmbOrganization;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable tblOrganization;
    private javax.swing.JTextField txtPersonName;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
