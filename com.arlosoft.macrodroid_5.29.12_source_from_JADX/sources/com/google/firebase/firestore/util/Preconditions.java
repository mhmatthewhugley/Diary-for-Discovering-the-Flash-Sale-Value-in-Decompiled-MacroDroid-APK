package com.google.firebase.firestore.util;

import java.util.Objects;

public class Preconditions {
    /* renamed from: a */
    public static void m76512a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public static <T> T m76513b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: c */
    public static <T> T m76514c(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: d */
    public static void m76515d(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}
