package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzfvi extends AbstractCollection implements Serializable {

    /* renamed from: a */
    private static final Object[] f36469a = new Object[0];

    zzfvi() {
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
    public int mo46413c(Object[] objArr, int i) {
        throw null;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo46416d() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo46417f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public zzfvn mo46418h() {
        throw null;
    }

    /* renamed from: i */
    public abstract zzfxm iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract boolean mo46421j();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Object[] mo46422k() {
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
        return toArray(f36469a);
    }

    public final Object[] toArray(Object[] objArr) {
        Objects.requireNonNull(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] k = mo46422k();
            if (k != null) {
                return Arrays.copyOfRange(k, mo46417f(), mo46416d(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo46413c(objArr, 0);
        return objArr;
    }
}
