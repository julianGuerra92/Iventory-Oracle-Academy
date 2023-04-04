package com.inventory;

import com.inventory.model.Product;
import com.inventory.model.ProductList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @version 0.0.1
 * Ejercicio inventory correspondiente al curso java de Oracle
 * @authors Julián Andrés Rodríguez Guerra
 * @since Febrero 20 de 2023
 */
public class ProductTester {

    private static int tempQuantity;
    private static String tempName;
    private static String tempID;
    private static float tempPrice;
    private static ProductList productList;

    public static String readData(String message) throws IOException {
        String data;
        System.out.print(message);
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        data = stdin.readLine();
        return data;
    }

    public static void registerProduct() throws IOException {
        tempID = readData("Por favor ingrese el ID del producto a registrar o 9999 para salir: ");
        while (!tempID.equals("9999")) {
            tempName = readData("Nombre del producto: ");
            tempPrice = Float.parseFloat(readData("Precio por Unidad: "));
            tempQuantity = Integer.parseInt(readData("Cantidad de Unidades en Inventario: "));
            productList.addProduct(new Product(tempName, tempPrice, tempQuantity, tempID));
            System.out.print("\nRegistro exitoso!\n\n");
            tempID = readData("Ingrese otro ID de producto o 9999 para salir: ");
        }
    }

    public static void main(String[] args) throws IOException {
        productList = new ProductList();
        System.out.println("---> Bienvenido al sistema de inventario! <---");
        registerProduct();
        System.out.println("\nImprimiedo resultados de ingreso al inventario:");
        productList.printList();
    }
}