package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class Platform {
    private Platform() {
    }

    /* renamed from: a */
    static <T> T[] m28532a(Object[] objArr, int i, int i2, T[] tArr) {
        return Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    /* renamed from: b */
    static <T> T[] m28533b(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }

    /* renamed from: c */
    static <K, V> Map<K, V> m28534c(int i) {
        return CompactHashMap.m26589y(i);
    }

    /* renamed from: d */
    static <E> Set<E> m28535d(int i) {
        return CompactHashSet.m26630l(i);
    }

    /* renamed from: e */
    static <K, V> Map<K, V> m28536e(int i) {
        return CompactLinkedHashMap.m26659f0(i);
    }

    /* renamed from: f */
    static <E> Set<E> m28537f(int i) {
        return CompactLinkedHashSet.m26678W(i);
    }

    /* renamed from: g */
    static <E> Set<E> m28538g() {
        return CompactHashSet.m26628j();
    }

    /* renamed from: h */
    static <K, V> Map<K, V> m28539h() {
        return CompactHashMap.m26588t();
    }

    /* renamed from: i */
    static MapMaker m28540i(MapMaker mapMaker) {
        return mapMaker.mo35789l();
    }
}
