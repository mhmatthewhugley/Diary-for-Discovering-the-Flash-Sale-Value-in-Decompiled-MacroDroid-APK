package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import org.jspecify.nullness.NullMarked;

@NullMarked
@DoNotMock
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class zzac extends AbstractCollection implements Serializable {

    /* renamed from: a */
    private static final Object[] f39284a = new Object[0];

    zzac() {
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: c */
    public int mo48616c(Object[] objArr, int i) {
        throw null;
    }

    @DoNotCall
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo48618d() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo48619f() {
        throw null;
    }

    /* renamed from: h */
    public zzag mo48620h() {
        throw null;
    }

    /* renamed from: i */
    public abstract zzaj iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract boolean mo48623j();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Object[] mo48624k() {
        throw null;
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f39284a);
    }

    @CanIgnoreReturnValue
    public final Object[] toArray(Object[] objArr) {
        Objects.requireNonNull(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] k = mo48624k();
            if (k != null) {
                return Arrays.copyOfRange(k, mo48619f(), mo48618d(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo48616c(objArr, 0);
        return objArr;
    }
}
