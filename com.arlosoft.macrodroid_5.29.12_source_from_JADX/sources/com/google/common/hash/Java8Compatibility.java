package com.google.common.hash;

import com.google.common.annotations.GwtIncompatible;
import java.nio.Buffer;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class Java8Compatibility {
    private Java8Compatibility() {
    }

    /* renamed from: a */
    static void m29765a(Buffer buffer) {
        buffer.clear();
    }

    /* renamed from: b */
    static void m29766b(Buffer buffer) {
        buffer.flip();
    }

    /* renamed from: c */
    static void m29767c(Buffer buffer, int i) {
        buffer.limit(i);
    }

    /* renamed from: d */
    static void m29768d(Buffer buffer, int i) {
        buffer.position(i);
    }
}
