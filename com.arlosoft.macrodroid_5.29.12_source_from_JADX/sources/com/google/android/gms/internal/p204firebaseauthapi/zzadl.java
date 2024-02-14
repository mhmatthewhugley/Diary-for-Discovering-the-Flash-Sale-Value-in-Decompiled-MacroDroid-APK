package com.google.android.gms.internal.p204firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzadl {

    /* renamed from: a */
    static final Charset f39745a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f39746b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f39747c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f39748d;

    /* renamed from: e */
    public static final ByteBuffer f39749e;

    /* renamed from: f */
    public static final zzacg f39750f;

    static {
        byte[] bArr = new byte[0];
        f39748d = bArr;
        f39749e = ByteBuffer.wrap(bArr);
        int i = zzacg.f39645e;
        f39750f = zzacg.m56198n(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m56457a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m56458b(byte[] bArr) {
        int length = bArr.length;
        int d = m56460d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m56459c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    static int m56460d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    static Object m56461e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: f */
    static Object m56462f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* renamed from: g */
    public static String m56463g(byte[] bArr) {
        return new String(bArr, f39746b);
    }

    /* renamed from: h */
    public static boolean m56464h(byte[] bArr) {
        return zzagc.m56876e(bArr);
    }
}
