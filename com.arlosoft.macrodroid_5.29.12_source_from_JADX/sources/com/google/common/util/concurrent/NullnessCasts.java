package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class NullnessCasts {
    private NullnessCasts() {
    }

    @ParametricNullness
    /* renamed from: a */
    static <T> T m74277a(T t) {
        return t;
    }

    @ParametricNullness
    /* renamed from: b */
    static <T> T m74278b() {
        return null;
    }
}
