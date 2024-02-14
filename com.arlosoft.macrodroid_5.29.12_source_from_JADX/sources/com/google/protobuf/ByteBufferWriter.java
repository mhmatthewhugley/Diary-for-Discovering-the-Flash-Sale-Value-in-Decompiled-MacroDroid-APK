package com.google.protobuf;

import java.lang.ref.SoftReference;

final class ByteBufferWriter {

    /* renamed from: a */
    private static final ThreadLocal<SoftReference<byte[]>> f56616a = new ThreadLocal<>();

    /* renamed from: b */
    private static final Class<?> f56617b;

    /* renamed from: c */
    private static final long f56618c;

    static {
        Class<?> b = m79756b("java.io.FileOutputStream");
        f56617b = b;
        f56618c = m79755a(b);
    }

    private ByteBufferWriter() {
    }

    /* renamed from: a */
    private static long m79755a(Class<?> cls) {
        if (cls == null) {
            return -1;
        }
        try {
            if (UnsafeUtil.m81362H()) {
                return UnsafeUtil.m81364J(cls.getDeclaredField("channel"));
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    private static Class<?> m79756b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
