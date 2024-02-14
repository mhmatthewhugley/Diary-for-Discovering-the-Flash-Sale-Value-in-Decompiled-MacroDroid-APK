package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class CartesianList<E> extends AbstractList<List<E>> implements RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final transient ImmutableList<List<E>> f16475a;

    /* renamed from: c */
    private final transient int[] f16476c;

    /* access modifiers changed from: private */
    /* renamed from: h */
    public int m26531h(int i, int i2) {
        return (i / this.f16476c[i2 + 1]) % this.f16475a.get(i2).size();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        List<Object> list = (List) obj;
        if (list.size() != this.f16475a.size()) {
            return false;
        }
        int i = 0;
        for (Object contains : list) {
            if (!this.f16475a.get(i).contains(contains)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: f */
    public ImmutableList<E> get(final int i) {
        Preconditions.m5390q(i, size());
        return new ImmutableList<E>() {
            public E get(int i) {
                Preconditions.m5390q(i, size());
                return ((List) CartesianList.this.f16475a.get(i)).get(CartesianList.this.m26531h(i, i));
            }

            /* access modifiers changed from: package-private */
            /* renamed from: j */
            public boolean mo34781j() {
                return true;
            }

            public int size() {
                return CartesianList.this.f16475a.size();
            }
        };
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.f16475a.size()) {
            return -1;
        }
        ListIterator listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int indexOf = this.f16475a.get(nextIndex).indexOf(listIterator.next());
            if (indexOf == -1) {
                return -1;
            }
            i += indexOf * this.f16476c[nextIndex + 1];
        }
        return i;
    }

    public int lastIndexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.f16475a.size()) {
            return -1;
        }
        ListIterator listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int lastIndexOf = this.f16475a.get(nextIndex).lastIndexOf(listIterator.next());
            if (lastIndexOf == -1) {
                return -1;
            }
            i += lastIndexOf * this.f16476c[nextIndex + 1];
        }
        return i;
    }

    public int size() {
        return this.f16476c[0];
    }
}
