package com.google.api.client.util.escape;

final class Platform {

    /* renamed from: a */
    private static final ThreadLocal<char[]> f52849a = new ThreadLocal<char[]>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public char[] initialValue() {
            return new char[1024];
        }
    };

    private Platform() {
    }

    /* renamed from: a */
    static char[] m72756a() {
        return f52849a.get();
    }
}
