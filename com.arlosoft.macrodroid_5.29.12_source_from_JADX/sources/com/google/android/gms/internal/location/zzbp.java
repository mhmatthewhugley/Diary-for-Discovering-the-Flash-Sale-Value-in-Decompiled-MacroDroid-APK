package com.google.android.gms.internal.location;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public abstract class zzbp<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    private static final Object[] f41130a = new Object[0];

    zzbp() {
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public abstract zzbu<E> iterator();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    /* renamed from: d */
    public Object[] mo50605d() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo50606f() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo50607h() {
        throw null;
    }

    /* renamed from: i */
    public zzbs<E> mo50608i() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract boolean mo50610j();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo50611k(Object[] objArr, int i) {
        throw null;
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f41130a);
    }

    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] d = mo50605d();
            if (d != null) {
                return Arrays.copyOfRange(d, mo50606f(), mo50607h(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (length > size) {
            tArr[size] = null;
        }
        mo50611k(tArr, 0);
        return tArr;
    }
}
