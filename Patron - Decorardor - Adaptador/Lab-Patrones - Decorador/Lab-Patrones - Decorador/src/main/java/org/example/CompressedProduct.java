package org.example;

public class CompressedProduct extends Decorador {
    public CompressedProduct(Producto producto) {
        super(producto);
    }

    @Override
    public String getDescripcion() {
        return comprimir(producto.getDescripcion());
    }

    private String comprimir(String texto) {
        // Implementación de la compresión
        return "Texto comprimido";
    }
}
