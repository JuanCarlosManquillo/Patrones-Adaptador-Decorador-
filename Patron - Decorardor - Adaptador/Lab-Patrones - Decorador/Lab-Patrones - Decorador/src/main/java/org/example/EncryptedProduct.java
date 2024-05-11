package org.example;

public class EncryptedProduct extends Decorador {
    public EncryptedProduct(Producto producto) {
        super(producto);
    }

    @Override
    public String getNombre() {
        return encriptar(producto.getNombre());
    }

    @Override
    public String getDescripcion() {
        return encriptar(producto.getDescripcion());
    }

    private String encriptar(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            // Verificar si el caracter es una letra minúscula
            if (Character.isLowerCase(caracter)) {
                // Calcular el nuevo valor ASCII con un desplazamiento de 2
                int nuevoValor = (caracter - 'a' + 1) % 26 + 'a';
                // Agregar el nuevo caracter encriptado al resultado
                resultado.append((char) nuevoValor);
            } else if (Character.isUpperCase(caracter)) { // Verificar si el caracter es una letra mayúscula
                // Calcular el nuevo valor ASCII con un desplazamiento de 2
                int nuevoValor = (caracter - 'A' + 1) % 26 + 'A';
                // Agregar el nuevo caracter encriptado al resultado
                resultado.append((char) nuevoValor);
            } else {
                // Si no es una letra, mantener el mismo caracter
                resultado.append(caracter);
            }
        }
        return resultado.toString();
    }


}
