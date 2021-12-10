/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.customerCareEnterprise;
import Business.Organization.CustomerOrganization;
import CustomerWorkArea.CustomerWorkAreaManagementJPanel;
import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.role.Role;
import business.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author mrunalbhalerao
 */
public class CustomerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {

        return new CustomerWorkAreaManagementJPanel(userProcessContainer, account, (CustomerOrganization) organization, (customerCareEnterprise) enterprise, business);
    }

    @Override
    public String toString() {
        return "Customer"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
