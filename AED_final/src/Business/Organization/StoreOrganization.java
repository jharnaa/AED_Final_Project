/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import Business.Role.StoreManagerRole;
import Business.customer.ClothFactoryCatalog;
import Business.customer.MasterOrderList;
import business.organization.Organization;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author mrunalbhalerao
 */
public class StoreOrganization extends Organization {
    
    private MasterOrderList mol;
    private ClothFactoryCatalog cfc;

    public MasterOrderList getMol() {
        return mol;
    }

    public void setMol(MasterOrderList mol) {
        this.mol = mol;
    }

    public ClothFactoryCatalog getCfc() {
        return cfc;
    }

    public void setCfc(ClothFactoryCatalog cfc) {
        this.cfc = cfc;
    }

    public StoreOrganization() {
        super(Organization.Type.Store.getValue());
        mol = new MasterOrderList();
        cfc = new ClothFactoryCatalog();
    }

    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new StoreManagerRole());
        return roles;
    }
    
}
