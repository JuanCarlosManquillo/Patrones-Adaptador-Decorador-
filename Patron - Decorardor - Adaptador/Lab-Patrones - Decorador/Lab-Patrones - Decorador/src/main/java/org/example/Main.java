package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Crear un producto base
        Producto productoBase = new ProductoBase("123", "Arroz chino", "Arroz especial importado de China");

        // Decorar el producto base con encriptación
        Producto productoEncriptado = new EncryptedProduct(productoBase);

        // Decorar el producto encriptado con compresión
        Producto productoEncriptadoYComprimido = new CompressedProduct(productoEncriptado);

        // Mostrar los detalles del producto base
        System.out.println("Producto base:");
        mostrarDetalleProducto(productoBase);

        // Mostrar los detalles del producto encriptado
        System.out.println("\nProducto encriptado:");
        mostrarDetalleProducto(productoEncriptado);

        // Mostrar los detalles del producto encriptado y comprimido
        System.out.println("\nProducto encriptado y comprimido:");
        mostrarDetalleProducto(productoEncriptadoYComprimido);
    }

    private static void mostrarDetalleProducto(Producto producto) {
        System.out.println("ID: " + producto.getId());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Descripción: " + producto.getDescripcion());
    }
}
