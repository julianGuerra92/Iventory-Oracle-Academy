package com.inventory;

import com.inventory.model.Product;

/**
 * @authors  Julián Andrés Rodríguez Guerra - Oscar Albeiro Blandón Agudelo
 * @since Febrero 20 de 2023
 * @version 0.0.1
 * Ejercicio inventory correspondiente al curso java de Oracle
 */
public class ProductTester {
    public static void main(String[] args) {
        Product product1 = new Product("Lavadora", 500000f, 5, "1");
        Product product2 = new Product("Horno Microondas", 150000.150f, 10, "2");
        Product product3 = new Product("Nevera", 849550.480f, 20, "3");
        Product product4 = new Product("Televisor", 1500000f, 3, "4");
        Product product5 = new Product();
        Product product6 = new Product();
        product5.setName("Computador Dell");
        product5.setPrice(4500000.850f);
        product5.setQuantity(150);
        product5.setId("5");
        product6.setName("Ipad Mini");
        product6.setPrice(3500000.460f);
        product6.setQuantity(30);
        product6.setId("6");
        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());
        System.out.println(product4.toString());
        System.out.println(product5.toString());
        System.out.println(product6.toString());
    }
}