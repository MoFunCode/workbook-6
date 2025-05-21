package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixedList<T> {

    private final List<T> items;
    private final int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public boolean add(T item) {
        if (items.size() >= maxSize) {
            throw new IllegalStateException("Cannot add more items. The list has reached its maximum size of " + maxSize);
        }
        return items.add(item);
    }

    public List<T> getItems() {
        return Collections.unmodifiableList(items);
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int size() {
        return items.size();
    }
}
