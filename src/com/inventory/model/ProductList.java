package com.inventory.model;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

    private List<Product> productList;

    public ProductList() {
        this.productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public void printList() {
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

}
