package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class ImmutableList<E> implements List<E>, RandomAccess {

    /* renamed from: a */
    private final List<E> f5424a;

    private ImmutableList(List<E> list) {
        this.f5424a = Collections.unmodifiableList(list);
    }

    @NonNull
    /* renamed from: c */
    public static <E> ImmutableList<E> m7424c(@NonNull List<E> list) {
        return new ImmutableList<>(list);
    }

    @NonNull
    /* renamed from: d */
    public static <E> ImmutableList<E> m7425d(E... eArr) {
        return new ImmutableList<>(Arrays.asList(eArr));
    }

    public boolean add(@NonNull E e) {
        return this.f5424a.add(e);
    }

    public boolean addAll(@NonNull Collection<? extends E> collection) {
        return this.f5424a.addAll(collection);
    }

    public void clear() {
        this.f5424a.clear();
    }

    public boolean contains(@Nullable Object obj) {
        return this.f5424a.contains(obj);
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        return this.f5424a.containsAll(collection);
    }

    public boolean equals(@Nullable Object obj) {
        return this.f5424a.equals(obj);
    }

    @NonNull
    public E get(int i) {
        return this.f5424a.get(i);
    }

    public int hashCode() {
        return this.f5424a.hashCode();
    }

    public int indexOf(@Nullable Object obj) {
        return this.f5424a.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f5424a.isEmpty();
    }

    @NonNull
    public Iterator<E> iterator() {
        return this.f5424a.iterator();
    }

    public int lastIndexOf(@Nullable Object obj) {
        return this.f5424a.lastIndexOf(obj);
    }

    @NonNull
    public ListIterator<E> listIterator() {
        return this.f5424a.listIterator();
    }

    public boolean remove(@Nullable Object obj) {
        return this.f5424a.remove(obj);
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        return this.f5424a.removeAll(collection);
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        return this.f5424a.retainAll(collection);
    }

    @NonNull
    public E set(int i, @NonNull E e) {
        return this.f5424a.set(i, e);
    }

    public int size() {
        return this.f5424a.size();
    }

    @NonNull
    public List<E> subList(int i, int i2) {
        return this.f5424a.subList(i, i2);
    }

    @Nullable
    public Object[] toArray() {
        return this.f5424a.toArray();
    }

    public void add(int i, @NonNull E e) {
        this.f5424a.add(i, e);
    }

    public boolean addAll(int i, @NonNull Collection<? extends E> collection) {
        return this.f5424a.addAll(i, collection);
    }

    @NonNull
    public ListIterator<E> listIterator(int i) {
        return this.f5424a.listIterator(i);
    }

    public E remove(int i) {
        return this.f5424a.remove(i);
    }

    public <T> T[] toArray(@Nullable T[] tArr) {
        return this.f5424a.toArray(tArr);
    }
}
