/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.organization.Organization;
import business.role.Role;
import Business.Role.QualityControlManagerRole;
import java.util.ArrayList;

/**
 *
 * @author mrunalbhalerao
 */
public class QualityControlOrganization extends Organization {

    public QualityControlOrganization() {
        
        super(Organization.Type.QualityControl.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new QualityControlManagerRole());
        return roles;
    }
    
}
