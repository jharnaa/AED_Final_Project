/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BarChart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author mrunalbhalerao
 */
public class HazardousContentReport {
    
    private Report report;
    private JFreeChart barChart;

    public HazardousContentReport(String applicationTitle, String chartTitle, Report report) {
        //super(applicationTitle);
        this.report = report;
        this.barChart = ChartFactory.createBarChart3D(
                chartTitle,
                "FACTORS",
                "LEVEL OF CONTENTS",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);
    }

    public ChartPanel getChartPanel() {
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(600, 350));
        return chartPanel;
    }

    private CategoryDataset createDataset() {
        final String fabricType = "FABRIC TYPE";
        final String designTechnique = "DESIGN TECHNIQUE";
        final String manufacturingProcess = "MANUFACTURING PROCESS";
        
        final String carbonEmissions = "CARBON EMSSONS";
        final String waterToxins = "WATER TOXINS";
        final String waste = "WASTE";
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //adding values to the dataset 
        dataset.addValue(report.getCarbonEmissionFabricType(), carbonEmissions , fabricType);
        dataset.addValue(report.getCarbonEmissionDesignTechnique(), carbonEmissions, designTechnique);
        dataset.addValue(report.getCarbonEmissionManufacturingProcess(), carbonEmissions, manufacturingProcess);

        dataset.addValue(report.getWaterToxinFabricType(), waterToxins, fabricType);
        dataset.addValue(report.getWaterToxinDesignTechnque(), waterToxins, designTechnique);
        dataset.addValue(report.getWaterToxinManufacturingProcess(), waterToxins, manufacturingProcess);

        dataset.addValue(report.getWasteFabricType(), waste, fabricType);
        dataset.addValue(report.getWasteManufacturingProcess(), waste, designTechnique);
        dataset.addValue(report.getWasteManufacturingProcess(), waste, manufacturingProcess);

        return dataset;
    }
    
}
