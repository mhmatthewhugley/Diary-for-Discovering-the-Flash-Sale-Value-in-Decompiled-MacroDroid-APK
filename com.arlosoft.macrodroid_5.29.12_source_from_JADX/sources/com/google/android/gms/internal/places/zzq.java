package com.google.android.gms.internal.places;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zzq<E> extends AbstractList<E> implements zzbh<E> {

    /* renamed from: a */
    private boolean f45463a = true;

    zzq() {
    }

    /* renamed from: N */
    public boolean mo53474N() {
        return this.f45463a;
    }

    public boolean add(E e) {
        mo53665c();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo53665c();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo53665c() {
        if (!this.f45463a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo53665c();
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

    /* renamed from: h2 */
    public final void mo53475h2() {
        this.f45463a = false;
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
        mo53665c();
        return super.remove(i);
    }

    public boolean removeAll(Collection<?> collection) {
        mo53665c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo53665c();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo53665c();
        return super.set(i, e);
    }

    public void add(int i, E e) {
        mo53665c();
        super.add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo53665c();
        return super.addAll(i, collection);
    }

    public boolean remove(Object obj) {
        mo53665c();
        return super.remove(obj);
    }
}
