package org.example;

public class ProductoBase implements Producto {
    private String id;
    private String nombre;
    private String descripcion;

    public ProductoBase(String id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }
}

