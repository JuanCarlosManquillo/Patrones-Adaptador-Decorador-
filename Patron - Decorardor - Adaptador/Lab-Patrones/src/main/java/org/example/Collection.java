package org.example;

import java.util.Iterator;

public interface Collection {

    boolean add(Object o);
    boolean addAll(Collection c);
    void clear();
    boolean contains(Object o);
    boolean containsAll(Collection c);
    boolean isEmpty();
    Iterator iterator();
    boolean remove(Object o);
    boolean removeAll(Collection c);
    boolean retainAll(Collection c);
    int size();
    Object[] toArray();
}