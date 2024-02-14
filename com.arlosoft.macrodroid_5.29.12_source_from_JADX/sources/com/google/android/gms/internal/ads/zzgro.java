package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgro {

    /* renamed from: a */
    static final Charset f37161a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f37162b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f37163c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f37164d;

    /* renamed from: e */
    public static final ByteBuffer f37165e;

    /* renamed from: f */
    public static final zzgqe f37166f;

    static {
        byte[] bArr = new byte[0];
        f37164d = bArr;
        f37165e = ByteBuffer.wrap(bArr);
        int i = zzgqe.f37047e;
        f37166f = zzgqe.m52706h(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m53023a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m53024b(byte[] bArr) {
        int length = bArr.length;
        int d = m53026d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m53025c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    static int m53026d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    static Object m53027e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: f */
    static Object m53028f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* renamed from: g */
    static Object m53029g(Object obj, Object obj2) {
        return ((zzgso) obj).mo47350r().mo47046g1((zzgso) obj2).mo47336D1();
    }

    /* renamed from: h */
    public static String m53030h(byte[] bArr) {
        return new String(bArr, f37162b);
    }

    /* renamed from: i */
    public static boolean m53031i(byte[] bArr) {
        return zzgun.m53478i(bArr);
    }
}
