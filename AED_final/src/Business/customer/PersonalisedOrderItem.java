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
public class PersonalisedOrderItem {
    
    private CustomerApparel personaliseProduct;
    private int orderItemId;
    private int customizeProductId;
    private String category;
    private String style;
    private String color;
    private String size;
    private String fabricType;
    private String imageLocation;
    private String text;
    private String textLocation;
    private String designTechnique;
    private float price;
    private static int count = 0;
    

    public PersonalisedOrderItem() {
        personaliseProduct = new CustomerApparel();
        count++;
        orderItemId = count;
    }
    
    public CustomerApparel getPersonaliseProduct() {
        return personaliseProduct;
    }

    public void setPersonaliseProduct(CustomerApparel personaliseProduct) {
        this.personaliseProduct = personaliseProduct;
    }
    

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public int getCustomizeProductId() {
        return customizeProductId;
    }

    public void setCustomizeProductId(int customizeProductId) {
        this.customizeProductId = customizeProductId;
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

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
        PersonalisedOrderItem.count = count;
    }

    
    @Override
    public String toString() {
        return Integer.toString(this.orderItemId);
    }



    
}
