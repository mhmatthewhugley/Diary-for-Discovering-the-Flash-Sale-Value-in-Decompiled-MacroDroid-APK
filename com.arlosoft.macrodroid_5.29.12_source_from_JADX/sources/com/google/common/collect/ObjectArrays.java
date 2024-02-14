package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Array;
import java.util.Collection;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class ObjectArrays {
    private ObjectArrays() {
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    static Object m28465a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    static Object[] m28466b(Object... objArr) {
        m28467c(objArr, objArr.length);
        return objArr;
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    static Object[] m28467c(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m28465a(objArr[i2], i2);
        }
        return objArr;
    }

    @GwtIncompatible
    /* renamed from: d */
    public static <T> T[] m28468d(T[] tArr, T[] tArr2, Class<T> cls) {
        T[] f = m28470f(cls, tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, f, 0, tArr.length);
        System.arraycopy(tArr2, 0, f, tArr.length, tArr2.length);
        return f;
    }

    @CanIgnoreReturnValue
    /* renamed from: e */
    private static Object[] m28469e(Iterable<?> iterable, Object[] objArr) {
        int i = 0;
        for (Object obj : iterable) {
            objArr[i] = obj;
            i++;
        }
        return objArr;
    }

    @GwtIncompatible
    /* renamed from: f */
    public static <T> T[] m28470f(Class<T> cls, int i) {
        return (Object[]) Array.newInstance(cls, i);
    }

    /* renamed from: g */
    public static <T> T[] m28471g(T[] tArr, int i) {
        return Platform.m28533b(tArr, i);
    }

    /* renamed from: h */
    static Object[] m28472h(Collection<?> collection) {
        return m28469e(collection, new Object[collection.size()]);
    }

    /* renamed from: i */
    static <T> T[] m28473i(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = m28471g(tArr, size);
        }
        m28469e(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    /* renamed from: j */
    static <T> T[] m28474j(Object[] objArr, int i, int i2, T[] tArr) {
        Preconditions.m5397x(i, i + i2, objArr.length);
        if (tArr.length < i2) {
            tArr = m28471g(tArr, i2);
        } else if (tArr.length > i2) {
            tArr[i2] = null;
        }
        System.arraycopy(objArr, i, tArr, 0, i2);
        return tArr;
    }
}
