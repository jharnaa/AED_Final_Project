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
public class customerCareEnterprise extends Enterprise{
    public customerCareEnterprise(String name)
    {
        super(name,Enterprise.EnterpriseType.CustomerCare);     
    }
    @Override
     public ArrayList<Role> getSupportedRole()
    {
        return null;
    }
    
}
