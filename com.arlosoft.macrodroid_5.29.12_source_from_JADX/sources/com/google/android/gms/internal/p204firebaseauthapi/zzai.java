package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzai */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class zzai extends AbstractCollection implements Serializable {

    /* renamed from: a */
    private static final Object[] f39890a = new Object[0];

    zzai() {
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
    public int mo49266c(Object[] objArr, int i) {
        throw null;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo49268d() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo49269f() {
        throw null;
    }

    /* renamed from: h */
    public abstract zzan iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Object[] mo49271i() {
        throw null;
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
        return toArray(f39890a);
    }

    public final Object[] toArray(Object[] objArr) {
        Objects.requireNonNull(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] i = mo49271i();
            if (i != null) {
                return Arrays.copyOfRange(i, mo49269f(), mo49268d(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo49266c(objArr, 0);
        return objArr;
    }
}
