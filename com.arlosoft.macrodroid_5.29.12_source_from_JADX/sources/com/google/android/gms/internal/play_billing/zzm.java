package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.android.billingclient:billing@@4.0.0 */
public abstract class zzm<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    private static final Object[] f45483a = new Object[0];

    zzm() {
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo53706c(Object[] objArr, int i) {
        throw null;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo53708d() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo53709f() {
        throw null;
    }

    /* renamed from: h */
    public abstract zzr<E> iterator();

    /* access modifiers changed from: package-private */
    @NullableDecl
    /* renamed from: i */
    public Object[] mo53711i() {
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
        return toArray(f45483a);
    }

    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] i = mo53711i();
            if (i != null) {
                return Arrays.copyOfRange(i, mo53709f(), mo53708d(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (length > size) {
            tArr[size] = null;
        }
        mo53706c(tArr, 0);
        return tArr;
    }
}
