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
    private boolean active;

    //Constructores de clase genérico
    public Product() {
    }

    //Constructor de clase con argumentos
    public Product(String name, float price, int quantity, String id) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
        this.active = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public float calculateValueInventiry(){
        return quantity * price;
    }

    @Override
    public String toString() {
        String productInformation =
                        "Item Number       " + ": " + id + "\n" +
                        "Name              " + ": " + name + "\n" +
                        "Quantity in Stock " + ": " + quantity + "\n" +
                        "Price             " + ": " + price + "\n" +
                        "Stock Value       " + ": " + calculateValueInventiry() + "\n" +
                        "Product Status    " + ": " + ((active) ? "Activo" : "Descatalogado" + "\n");
        return productInformation;
    }
}
