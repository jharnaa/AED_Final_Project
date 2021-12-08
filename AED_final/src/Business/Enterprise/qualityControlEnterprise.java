/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import business.enterprise.Enterprise;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author mrunalbhalerao
 */
public class qualityControlEnterprise extends Enterprise{
    public qualityControlEnterprise(String name)
    {
        super(name,Enterprise.EnterpriseType.QualityControl);     
    }
    @Override
     public ArrayList<Role> getSupportedRole()
    {
        return null;
    } 
    
}
