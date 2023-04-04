package com.inventory.model;

/**
 * Clase producto que podrá implementarse para el sistema de manejo de inventario
 */
public class Product {

    //Variables globales de clase
    private String name;
    private float price;
    private int quantity;
    private String id;

    //Constructores de clase genérico
    public Product(){
        name = "";
        price = 0;
        quantity = 0;
        id = "";
    }

    //Constructor de clase con argumentos
    public Product(String name, float price, int quantity, String id){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }

    //Método para obtener el valor de la variable name
    public String getName() {
        return name;
    }

    //Método para modificar el valor de la variable name
    public void setName(String name) {
        this.name = name;
    }

    //Método para obtener el valor de la variable price
    public float getPrice() {
        return price;
    }

    //Método para modificar el valor de la variable price
    public void setPrice(float price) {
        this.price = price;
    }

    //Método para obtener el valor de la variable quantity
    public int getQuantity() {
        return quantity;
    }

    //Método para modificar el valor de la variable quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //Método para obtener el valor de la variable id
    public String getId() {
        return id;
    }

    //Método para modificar el valor de la variable id
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString(){
        String productInformation =
                "Item Number       "+": "+id+"\n"+
                "Name              "+": "+name+"\n"+
                "Quantity in Stock "+": "+quantity+"\n"+
                "price             "+": "+price+"\n";
        return productInformation;
    }
}
