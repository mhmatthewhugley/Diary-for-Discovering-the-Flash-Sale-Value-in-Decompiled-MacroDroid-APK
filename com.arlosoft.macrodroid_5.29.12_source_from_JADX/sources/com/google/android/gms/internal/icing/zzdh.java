package com.google.android.gms.internal.icing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzdh {

    /* renamed from: a */
    static final Charset f40878a = Charset.forName("UTF-8");

    /* renamed from: b */
    static final Charset f40879b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f40880c;

    /* renamed from: d */
    public static final ByteBuffer f40881d;

    /* renamed from: e */
    public static final zzci f40882e;

    static {
        byte[] bArr = new byte[0];
        f40880c = bArr;
        f40881d = ByteBuffer.wrap(bArr);
        zzch zzch = new zzch(bArr, 0, 0, false, (zzcg) null);
        try {
            zzch.mo50227a(0);
            f40882e = zzch;
        } catch (zzdj e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    static <T> T m58816a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    static <T> T m58817b(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: c */
    public static boolean m58818c(byte[] bArr) {
        return zzfr.m59098a(bArr);
    }

    /* renamed from: d */
    public static String m58819d(byte[] bArr) {
        return new String(bArr, f40878a);
    }

    /* renamed from: e */
    public static int m58820e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: f */
    public static int m58821f(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: g */
    public static int m58822g(byte[] bArr) {
        int length = bArr.length;
        int h = m58823h(length, bArr, 0, length);
        if (h == 0) {
            return 1;
        }
        return h;
    }

    /* renamed from: h */
    static int m58823h(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: i */
    static Object m58824i(Object obj, Object obj2) {
        return ((zzee) obj).mo50308H().mo50182f1((zzee) obj2).mo50305j();
    }
}
