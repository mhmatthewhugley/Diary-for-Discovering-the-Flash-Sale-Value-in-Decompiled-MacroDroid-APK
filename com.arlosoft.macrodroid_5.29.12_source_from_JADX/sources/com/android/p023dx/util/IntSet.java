package com.android.p023dx.util;

/* renamed from: com.android.dx.util.IntSet */
public interface IntSet {
    void add(int i);

    int elements();

    boolean has(int i);

    IntIterator iterator();

    void merge(IntSet intSet);

    void remove(int i);
}
