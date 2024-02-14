package com.google.common.primitives;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class Primitives {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f53239a;

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f53240b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        m73647a(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        m73647a(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        m73647a(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        m73647a(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        m73647a(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        m73647a(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        m73647a(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        m73647a(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        m73647a(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        f53239a = Collections.unmodifiableMap(linkedHashMap);
        f53240b = Collections.unmodifiableMap(linkedHashMap2);
    }

    private Primitives() {
    }

    /* renamed from: a */
    private static void m73647a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: b */
    public static <T> Class<T> m73648b(Class<T> cls) {
        Preconditions.m5392s(cls);
        Class<T> cls2 = f53239a.get(cls);
        return cls2 == null ? cls : cls2;
    }
}
