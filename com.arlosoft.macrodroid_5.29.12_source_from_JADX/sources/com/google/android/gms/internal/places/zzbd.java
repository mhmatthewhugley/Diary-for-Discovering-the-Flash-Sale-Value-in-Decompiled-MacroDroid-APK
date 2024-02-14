package com.google.android.gms.internal.places;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

public final class zzbd {

    /* renamed from: a */
    static final Charset f45276a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final Charset f45277b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f45278c;

    /* renamed from: d */
    private static final ByteBuffer f45279d;

    /* renamed from: e */
    private static final zzai f45280e;

    static {
        byte[] bArr = new byte[0];
        f45278c = bArr;
        f45279d = ByteBuffer.wrap(bArr);
        f45280e = zzai.m63092c(bArr, 0, bArr.length, false);
    }

    /* renamed from: a */
    static <T> T m63340a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    public static int m63341b(byte[] bArr) {
        int length = bArr.length;
        int c = m63342c(length, bArr, 0, length);
        if (c == 0) {
            return 1;
        }
        return c;
    }

    /* renamed from: c */
    static int m63342c(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: d */
    static Object m63343d(Object obj, Object obj2) {
        return ((zzck) obj).mo53447c().mo53533W((zzck) obj2).mo53458Q();
    }

    /* renamed from: e */
    static <T> T m63344e(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: f */
    public static int m63345f(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: g */
    public static boolean m63346g(byte[] bArr) {
        return zzea.m63762g(bArr);
    }

    /* renamed from: h */
    public static String m63347h(byte[] bArr) {
        return new String(bArr, f45276a);
    }

    /* renamed from: i */
    static boolean m63348i(zzck zzck) {
        return false;
    }

    /* renamed from: j */
    public static int m63349j(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
