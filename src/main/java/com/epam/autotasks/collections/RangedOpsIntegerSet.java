package com.epam.autotasks.collections;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class RangedOpsIntegerSet extends AbstractSet<Integer> {

    private final SortedSet<Integer> elements;

    public RangedOpsIntegerSet() {
        this.elements = new TreeSet<>();
    }

    public boolean add(int fromInclusive, int toExclusive) {
        boolean modified = false;
        for (int i = fromInclusive; i < toExclusive; i++) {
            modified |= elements.add(i);
        }
        return modified;
    }

    public boolean remove(int fromInclusive, int toExclusive) {
        boolean modified = false;
        for (int i = fromInclusive; i < toExclusive; i++) {
            modified |= elements.remove(i);
        }
        return modified;
    }

    @Override
    public boolean add(final Integer integer) {
        return elements.add(integer);
    }

    @Override
    public boolean remove(final Object o) {
        return elements.remove(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return elements.iterator();
    }

    @Override
    public int size() {
        return elements.size();
    }

    // Example usage in main method for testing purposes
    public static void main(String[] args) {
        RangedOpsIntegerSet set = new RangedOpsIntegerSet();
        set.add(1, 5);
        set.add(9, 11);
        for (Integer el : set) {
            System.out.println(el);
        }

        set.remove(3, 12);
        for (Integer el : set) {
            System.out.println(el);
        }
    }
}
