package com.google.gson.internal;

import java.util.Objects;

/* renamed from: com.google.gson.internal.$Gson$Preconditions  reason: invalid class name */
public final class C$Gson$Preconditions {
    private C$Gson$Preconditions() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static void m78399a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static <T> T m78400b(T t) {
        Objects.requireNonNull(t);
        return t;
    }
}
