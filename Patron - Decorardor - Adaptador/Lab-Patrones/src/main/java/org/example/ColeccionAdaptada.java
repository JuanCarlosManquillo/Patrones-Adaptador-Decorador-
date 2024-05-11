package org.example;

import java.util.ArrayList;

public class ColeccionAdaptada {
    private ArrayList<Object> coleccion;

    public ColeccionAdaptada() {
        this.coleccion = new ArrayList<>();
    }

    public void operacionEspecifica(Object o) {
        coleccion.add(o);
        //coleccion.remove(o);
        //coleccion.clear();
        coleccion.size();
        coleccion.isEmpty();
        // Operaciones específicas de ColeccionAdaptada
    }

    public ArrayList<Object> getColeccion() {
        return coleccion;
    }
}
