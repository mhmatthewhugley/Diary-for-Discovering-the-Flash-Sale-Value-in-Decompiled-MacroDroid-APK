package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class NullnessCasts {
    private NullnessCasts() {
    }

    @ParametricNullness
    /* renamed from: a */
    static <T> T m28457a(T t) {
        return t;
    }

    @ParametricNullness
    /* renamed from: b */
    static <T> T m28458b() {
        return null;
    }
}
