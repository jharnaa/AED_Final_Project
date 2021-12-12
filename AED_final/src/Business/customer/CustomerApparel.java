/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.customer;

/**
 *
 * @author jharnadoda
 */
public class CustomerApparel {
    private int customizeProductId;
    private String category;
    private String style;
    private String color;
    private String size;
    private String fabricType;
    private String quantity;
    private String PrintText;
    
    private String textLocation;
    private String designTechnique;
    private float price;
    private static int count = 0;
    
    public CustomerApparel() {
        count++;
        customizeProductId = count;
    }
    

    public String getPrintText() {
        return PrintText;
    }

    public void setPrintText(String PrintText) {
        this.PrintText = PrintText;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabricType() {
        return fabricType;
    }

    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }


    public String getTextLocation() {
        return textLocation;
    }

    public void setTextLocation(String textLocation) {
        this.textLocation = textLocation;
    }

    public String getDesignTechnique() {
        return designTechnique;
    }

    public void setDesignTechnique(String designTechnique) {
        this.designTechnique = designTechnique;
    }
    
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CustomerApparel.count = count;
    }

    public int getCustomizeProductId() {
        return customizeProductId;
    }

    public void setCustomizeProductId(int customizeProductId) {
        this.customizeProductId = customizeProductId;
    }

    @Override
    public String toString() {
        return Integer.toString(customizeProductId);

    }

    
}
