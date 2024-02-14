package com.google.common.p206io;

import com.google.common.annotations.GwtIncompatible;
import java.nio.Buffer;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.Java8Compatibility */
final class Java8Compatibility {
    private Java8Compatibility() {
    }

    /* renamed from: a */
    static void m73451a(Buffer buffer) {
        buffer.clear();
    }

    /* renamed from: b */
    static void m73452b(Buffer buffer) {
        buffer.flip();
    }

    /* renamed from: c */
    static void m73453c(Buffer buffer, int i) {
        buffer.limit(i);
    }

    /* renamed from: d */
    static void m73454d(Buffer buffer, int i) {
        buffer.position(i);
    }
}
