package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class Platform {

    /* renamed from: a */
    private static final ThreadLocal<char[]> f17357a = new ThreadLocal<char[]>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public char[] initialValue() {
            return new char[1024];
        }
    };

    private Platform() {
    }

    /* renamed from: a */
    static char[] m29232a() {
        return f17357a.get();
    }
}
