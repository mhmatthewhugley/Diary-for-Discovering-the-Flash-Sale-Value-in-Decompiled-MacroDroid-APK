package com.google.android.gms.internal.icing;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
abstract class zzbt<E> extends AbstractList<E> implements zzdg<E> {

    /* renamed from: a */
    private boolean f40783a = true;

    zzbt() {
    }

    public void add(int i, E e) {
        mo50190c();
        super.add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo50190c();
        return super.addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo50190c() {
        if (!this.f40783a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo50190c();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public E remove(int i) {
        mo50190c();
        return super.remove(i);
    }

    public final boolean removeAll(Collection<?> collection) {
        mo50190c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo50190c();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo50190c();
        return super.set(i, e);
    }

    public final boolean zza() {
        return this.f40783a;
    }

    public final void zzb() {
        this.f40783a = false;
    }

    public boolean add(E e) {
        mo50190c();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo50190c();
        return super.addAll(collection);
    }

    public final boolean remove(Object obj) {
        mo50190c();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
