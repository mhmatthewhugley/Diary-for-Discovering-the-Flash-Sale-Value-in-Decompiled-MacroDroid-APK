package com.google.android.gms.internal.location;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public abstract class zzbs<E> extends zzbp<E> implements List<E>, RandomAccess {

    /* renamed from: c */
    private static final zzbv<Object> f41134c = new zzbq(zzbt.f41135g, 0);

    zzbs() {
    }

    /* renamed from: m */
    public static <E> zzbs<E> m59284m() {
        return zzbt.f41135g;
    }

    /* renamed from: n */
    public static <E> zzbs<E> m59285n(Collection<? extends E> collection) {
        if (collection instanceof zzbp) {
            zzbs<E> i = ((zzbp) collection).mo50608i();
            if (!i.mo50610j()) {
                return i;
            }
            Object[] array = i.toArray();
            return m59286p(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        int i2 = 0;
        while (i2 < length) {
            if (array2[i2] != null) {
                i2++;
            } else {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
        return m59286p(array2, length);
    }

    /* renamed from: p */
    static <E> zzbs<E> m59286p(Object[] objArr, int i) {
        if (i == 0) {
            return zzbt.f41135g;
        }
        return new zzbt(objArr, i);
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final zzbu<E> mo50603c() {
        return listIterator(0);
    }

    public final boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (zzbl.m59264a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzbl.m59264a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final zzbs<E> mo50608i() {
        return this;
    }

    public final int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo50611k(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    /* renamed from: l */
    public zzbs<E> subList(int i, int i2) {
        zzbm.m59267c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzbt.f41135g;
        }
        return new zzbr(this, i, i3);
    }

    public final int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: q */
    public final zzbv<E> listIterator(int i) {
        zzbm.m59266b(i, size(), "index");
        if (isEmpty()) {
            return f41134c;
        }
        return new zzbq(this, i);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }
}
