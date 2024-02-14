package com.google.android.datatransport.runtime.dagger.internal;

import java.util.HashSet;
import java.util.LinkedHashMap;

public final class DaggerCollections {
    private DaggerCollections() {
    }

    /* renamed from: a */
    private static int m1326a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    static <T> HashSet<T> m1327b(int i) {
        return new HashSet<>(m1326a(i));
    }

    /* renamed from: c */
    public static <K, V> LinkedHashMap<K, V> m1328c(int i) {
        return new LinkedHashMap<>(m1326a(i));
    }
}
