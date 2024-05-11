package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de ColeccionAdaptada
        ColeccionAdaptada coleccionAdaptada = new ColeccionAdaptada();
        coleccionAdaptada.operacionEspecifica("Elemento 1");
        coleccionAdaptada.operacionEspecifica("Elemento 2");

        // Obtener la colección adaptada
        ArrayList<Object> listaAdaptada = coleccionAdaptada.getColeccion();

        // Crear una instancia del Adaptador
        AdaptadorColeccion adaptador = new AdaptadorColeccion(listaAdaptada);

        // Utilizar los métodos de la interfaz Collection a través del Adaptador
        adaptador.add("Elemento 3");
        //adaptador.addAll(adaptador); // Agregar todos los elementos del adaptador a sí mismo
        System.out.println("Elementos en el Adaptador:");
        Iterator<Object> iterador = adaptador.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        // Crear una colección inmutable a partir del Adaptador
        Collection coleccionInmutable = AdaptadorColeccion.unmodifiableCollection(adaptador);
        System.out.println("\nElementos en la colección inmutable:");
        iterador = coleccionInmutable.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}