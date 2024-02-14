package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class AbstractProtobufList<E> extends AbstractList<E> implements Internal.ProtobufList<E> {

    /* renamed from: a */
    private boolean f56562a = true;

    AbstractProtobufList() {
    }

    /* renamed from: U */
    public final void mo64743U() {
        this.f56562a = false;
    }

    public boolean add(E e) {
        mo64748c();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo64748c();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo64748c() {
        if (!this.f56562a) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c1 */
    public boolean mo64749c1() {
        return this.f56562a;
    }

    public void clear() {
        mo64748c();
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
        mo64748c();
        return super.remove(i);
    }

    public boolean removeAll(Collection<?> collection) {
        mo64748c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo64748c();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo64748c();
        return super.set(i, e);
    }

    public void add(int i, E e) {
        mo64748c();
        super.add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo64748c();
        return super.addAll(i, collection);
    }

    public boolean remove(Object obj) {
        mo64748c();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
