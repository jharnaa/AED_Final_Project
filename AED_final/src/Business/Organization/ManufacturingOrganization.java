/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ProducerRole;
import business.organization.Organization;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author mrunalbhalerao
 */
public class ManufacturingOrganization extends Organization {

    public ManufacturingOrganization() {
        super(Organization.Type.Manufacturing.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProducerRole());
        return roles;
    }
    
}