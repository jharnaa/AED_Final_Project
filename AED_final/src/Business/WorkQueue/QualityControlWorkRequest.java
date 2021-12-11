/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import business.workqueue.WorkRequest;

/**
 *
 * @author mrunalbhalerao
 */
public class QualityControlWorkRequest extends WorkRequest{
    
    public QualityControlWorkRequest() {
        super(WorkRequest.WorkRequestType.QualityControl.getValue());
    }
    private String reportType;

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String toString() {
        return this.reportType;
    }
    
}
