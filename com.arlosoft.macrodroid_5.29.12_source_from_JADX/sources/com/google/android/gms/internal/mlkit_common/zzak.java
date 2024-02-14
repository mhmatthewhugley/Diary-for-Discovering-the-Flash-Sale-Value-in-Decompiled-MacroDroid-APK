package com.google.android.gms.internal.mlkit_common;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public abstract class zzak extends AbstractCollection implements Serializable {

    /* renamed from: a */
    private static final Object[] f41936a = new Object[0];

    zzak() {
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo51730c(Object[] objArr, int i) {
        throw null;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo51733d() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo51734f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public abstract zzbb iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Object[] mo51736i() {
        return null;
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f41936a);
    }

    public final Object[] toArray(Object[] objArr) {
        Objects.requireNonNull(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] i = mo51736i();
            if (i != null) {
                return Arrays.copyOfRange(i, mo51734f(), mo51733d(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo51730c(objArr, 0);
        return objArr;
    }
}
