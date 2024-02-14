package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzkn {

    /* renamed from: a */
    static final Charset f41634a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f41635b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f41636c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f41637d;

    /* renamed from: e */
    public static final ByteBuffer f41638e;

    /* renamed from: f */
    public static final zzji f41639f;

    static {
        byte[] bArr = new byte[0];
        f41637d = bArr;
        f41638e = ByteBuffer.wrap(bArr);
        int i = zzji.f41546a;
        zzjg zzjg = new zzjg(bArr, 0, 0, false, (zzjf) null);
        try {
            zzjg.mo51350c(0);
            f41639f = zzjg;
        } catch (zzkp e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m60538a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m60539b(byte[] bArr) {
        int length = bArr.length;
        int d = m60541d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m60540c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    static int m60541d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    static Object m60542e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: f */
    static Object m60543f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* renamed from: g */
    public static String m60544g(byte[] bArr) {
        return new String(bArr, f41635b);
    }

    /* renamed from: h */
    public static boolean m60545h(byte[] bArr) {
        return zznd.m60885e(bArr);
    }
}
