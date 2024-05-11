package org.example;

public abstract class Decorador implements Producto {
    protected Producto producto;

    public Decorador(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String getId() {
        return producto.getId();
    }

    @Override
    public String getNombre() {
        return producto.getNombre();
    }

    @Override
    public String getDescripcion() {
        return producto.getDescripcion();
    }
}

