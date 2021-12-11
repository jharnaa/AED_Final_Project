/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

//import business.enterprise.Enterprise;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author mrunalbhalerao
 */
public class productionEnterprise extends Enterprise{
    public productionEnterprise(String name)
    {
        super(name,Enterprise.EnterpriseType.Production);     
    }
    @Override
     public ArrayList<Role> getSupportedRole()
    {
        return null;
    }
    
}
