package com.google.android.gms.internal.wearable;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzcd {

    /* renamed from: a */
    static final Charset f45634a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f45635b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final Charset f45636c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f45637d;

    /* renamed from: e */
    public static final ByteBuffer f45638e;

    /* renamed from: f */
    public static final zzba f45639f;

    static {
        byte[] bArr = new byte[0];
        f45637d = bArr;
        f45638e = ByteBuffer.wrap(bArr);
        int i = zzba.f45548a;
        zzay zzay = new zzay(bArr, 0, 0, false, (zzax) null);
        try {
            zzay.mo53844a(0);
            f45639f = zzay;
        } catch (zzcf e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m64222a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m64223b(byte[] bArr) {
        int length = bArr.length;
        int d = m64225d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m64224c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    static int m64225d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    static Object m64226e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: f */
    static Object m64227f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* renamed from: g */
    static Object m64228g(Object obj, Object obj2) {
        return ((zzdc) obj).mo53941D().mo53797n0((zzdc) obj2).mo53940w();
    }

    /* renamed from: h */
    public static String m64229h(byte[] bArr) {
        return new String(bArr, f45635b);
    }

    /* renamed from: i */
    public static boolean m64230i(byte[] bArr) {
        return zzet.m64521d(bArr);
    }
}
