package com.google.android.gms.internal.nearby;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzsn extends AbstractCollection implements Serializable {

    /* renamed from: a */
    private static final Object[] f45103a = new Object[0];

    zzsn() {
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
    public int mo53239c(Object[] objArr, int i) {
        throw null;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo53241d() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo53242f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public zzsq mo53243h() {
        throw null;
    }

    /* renamed from: i */
    public abstract zzsy iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract boolean mo53246j();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Object[] mo53247k() {
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
        return toArray(f45103a);
    }

    public final Object[] toArray(Object[] objArr) {
        Objects.requireNonNull(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] k = mo53247k();
            if (k != null) {
                return Arrays.copyOfRange(k, mo53242f(), mo53241d(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo53239c(objArr, 0);
        return objArr;
    }
}
