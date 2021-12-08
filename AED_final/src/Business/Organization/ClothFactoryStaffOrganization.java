/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

/**
 *
 * @author mrunalbhalerao
 */

import business.organization.Organization;
import business.role.Role;
import java.util.ArrayList;

public class ClothFactoryStaffOrganization extends Organization {

    public ClothFactoryStaffOrganization() {
        super(Organization.Type.ClothFactoryStaff.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ());
        return roles;
    } 
    
}
