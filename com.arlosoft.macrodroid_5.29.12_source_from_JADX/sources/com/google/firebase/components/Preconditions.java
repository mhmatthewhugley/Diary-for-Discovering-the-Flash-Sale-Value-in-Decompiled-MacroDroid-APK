package com.google.firebase.components;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;

public final class Preconditions {
    /* renamed from: a */
    public static void m6456a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public static <T> T m6457b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    public static <T> T m6458c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: d */
    public static void m6459d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
