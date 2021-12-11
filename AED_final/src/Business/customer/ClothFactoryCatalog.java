/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.customer;

import java.util.ArrayList;

/**
 *
 * @author mrunalbhalerao
 */
public class ClothFactoryCatalog {
    
    private ArrayList<ClothFactoryProduct> listOfClothFactoryProduct;

    public ClothFactoryCatalog () {
        listOfClothFactoryProduct = new ArrayList<>();
    }

    public ArrayList<ClothFactoryProduct> getListOfClothFactoryProduct() {
        return listOfClothFactoryProduct;
    }

    public void setListOfClothFactoryProduct(ArrayList<ClothFactoryProduct> listOfClothFactoryProduct) {
        this.listOfClothFactoryProduct = listOfClothFactoryProduct;
    }
    
    public ClothFactoryProduct addClothFactoryProduct() {
        ClothFactoryProduct cfp = new ClothFactoryProduct();
        listOfClothFactoryProduct.add(cfp);
        return cfp;
    }

    public void removeClothFactoryProduct(ClothFactoryProduct ClothFactoryProduct) {
        listOfClothFactoryProduct.remove(ClothFactoryProduct);
    }
}
