/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import Business.Role.ReportManagerRole;
import business.organization.Organization;
import business.role.Role;
import Business.BarChart.Report;
import java.util.ArrayList;

/**
 *
 * @author mrunalbhalerao
 */
public class ReportOrganization extends Organization {

    public ReportOrganization() {
        super(Organization.Type.Report.getValue());
    }

    private Report report;

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ReportManagerRole());
        return roles;
    }
}
