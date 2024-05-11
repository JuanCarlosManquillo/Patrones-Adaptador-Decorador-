package org.example;

import java.util.*;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class AdaptadorColeccion implements Collection {

    private ArrayList<Object> coleccionAdaptada;

    public AdaptadorColeccion(List<Object> coleccion) {
        this.coleccionAdaptada = new ArrayList<>(coleccion);
    }

    // Operación unmodifiableCollection()
    public static Collection unmodifiableCollection(Collection c) {
        List<Object> lista = new ArrayList<>(c.size());
        Iterator<Object> it = c.iterator();
        while (it.hasNext()) {
            lista.add(it.next());
        }
        return new AdaptadorColeccion((List<Object>) Collections.unmodifiableList(lista));
    }
    @Override
    public int size() {
        return coleccionAdaptada.size();
    }

    @Override
    public boolean isEmpty() {
        return coleccionAdaptada.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return coleccionAdaptada.contains(o);
    }

    @Override
    public Iterator iterator() {
        return coleccionAdaptada.iterator();
    }

    @Override
    public void forEach(Consumer action) {
        coleccionAdaptada.forEach(action);
    }

    @Override
    public Object[] toArray() {
        return coleccionAdaptada.toArray();
    }

    @Override
    public Object[] toArray(IntFunction generator) {
        return coleccionAdaptada.toArray(generator);
    }

    @Override
    public boolean add(Object o) {
        return coleccionAdaptada.add(o);
    }

    @Override
    public boolean remove(Object o) {
        return coleccionAdaptada.remove(o);
    }

    @Override
    public boolean addAll(Collection c) {
        if (c instanceof AdaptadorColeccion) {
            return coleccionAdaptada.addAll(((AdaptadorColeccion) c).coleccionAdaptada);
        } else {
            // Manejar el caso en que c no es una instancia de AdaptadorColeccion
            // Por ejemplo, puedes lanzar una excepción o simplemente devolver false
            throw new IllegalArgumentException("El argumento debe ser una instancia de AdaptadorColeccion");
        }
    }

    @Override
    public boolean removeIf(Predicate filter) {
        return coleccionAdaptada.removeIf(filter);
    }

    @Override
    public void clear() {
        coleccionAdaptada.clear();
    }

    @Override
    public Spliterator spliterator() {
        return coleccionAdaptada.spliterator();
    }

    @Override
    public Stream stream() {
        return coleccionAdaptada.stream();
    }

    @Override
    public Stream parallelStream() {
        return coleccionAdaptada.parallelStream();
    }

    @Override
    public boolean retainAll(Collection c) {
        return coleccionAdaptada.retainAll(new AdaptadorColeccion((ArrayList<Object>) c).coleccionAdaptada);
    }

    @Override
    public boolean removeAll(Collection c) {
        return coleccionAdaptada.removeAll(new AdaptadorColeccion((ArrayList<Object>) c).coleccionAdaptada);
    }

    @Override
    public boolean containsAll(Collection c) {
        return coleccionAdaptada.containsAll(new AdaptadorColeccion((ArrayList<Object>) c).coleccionAdaptada);
    }

    @Override
    public Object[] toArray(Object[] a) {
        return coleccionAdaptada.toArray(a);
    }
}
