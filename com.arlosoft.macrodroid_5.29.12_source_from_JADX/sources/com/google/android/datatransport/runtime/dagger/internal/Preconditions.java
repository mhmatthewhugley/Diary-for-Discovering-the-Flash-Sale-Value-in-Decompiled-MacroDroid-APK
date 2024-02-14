package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Objects;

public final class Preconditions {
    private Preconditions() {
    }

    /* renamed from: a */
    public static <T> void m1335a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    /* renamed from: b */
    public static <T> T m1336b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: c */
    public static <T> T m1337c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
