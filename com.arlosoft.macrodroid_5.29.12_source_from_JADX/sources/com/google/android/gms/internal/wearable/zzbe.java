package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public abstract class zzbe extends zzam {

    /* renamed from: b */
    private static final Logger f45552b = Logger.getLogger(zzbe.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f45553c = zzeo.m64486C();

    /* renamed from: a */
    zzbf f45554a;

    private zzbe() {
    }

    /* synthetic */ zzbe(zzbd zzbd) {
    }

    /* renamed from: A */
    public static int m64087A(zzci zzci) {
        int a = zzci.mo53962a();
        return m64091a(a) + a;
    }

    /* renamed from: B */
    static int m64088B(zzdc zzdc, zzdn zzdn) {
        zzag zzag = (zzag) zzdc;
        int b = zzag.mo53799b();
        if (b == -1) {
            b = zzdn.mo53996a(zzag);
            zzag.mo53800d(b);
        }
        return m64091a(b) + b;
    }

    /* renamed from: C */
    public static int m64089C(String str) {
        int i;
        try {
            i = zzet.m64520c(str);
        } catch (zzes unused) {
            i = str.getBytes(zzcd.f45635b).length;
        }
        return m64091a(i) + i;
    }

    /* renamed from: D */
    public static int m64090D(int i) {
        return m64091a(i << 3);
    }

    /* renamed from: a */
    public static int m64091a(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: b */
    public static int m64092b(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: c */
    public static zzbe m64093c(byte[] bArr) {
        return new zzbb(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public static int m64095x(zzaw zzaw) {
        int f = zzaw.mo53831f();
        return m64091a(f) + f;
    }

    @Deprecated
    /* renamed from: y */
    static int m64096y(int i, zzdc zzdc, zzdn zzdn) {
        int a = m64091a(i << 3);
        int i2 = a + a;
        zzag zzag = (zzag) zzdc;
        int b = zzag.mo53799b();
        if (b == -1) {
            b = zzdn.mo53996a(zzag);
            zzag.mo53800d(b);
        }
        return i2 + b;
    }

    /* renamed from: z */
    public static int m64097z(int i) {
        if (i >= 0) {
            return m64091a(i);
        }
        return 10;
    }

    /* renamed from: d */
    public final void mo53867d() {
        if (mo53850g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo53868e(String str, zzes zzes) throws IOException {
        f45552b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzes);
        byte[] bytes = str.getBytes(zzcd.f45635b);
        try {
            int length = bytes.length;
            mo53864u(length);
            mo53860q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzbc(e);
        }
    }

    /* renamed from: g */
    public abstract int mo53850g();

    /* renamed from: h */
    public abstract void mo53851h(byte b) throws IOException;

    /* renamed from: i */
    public abstract void mo53852i(int i, boolean z) throws IOException;

    /* renamed from: j */
    public abstract void mo53853j(int i, zzaw zzaw) throws IOException;

    /* renamed from: k */
    public abstract void mo53854k(int i, int i2) throws IOException;

    /* renamed from: l */
    public abstract void mo53855l(int i) throws IOException;

    /* renamed from: m */
    public abstract void mo53856m(int i, long j) throws IOException;

    /* renamed from: n */
    public abstract void mo53857n(long j) throws IOException;

    /* renamed from: o */
    public abstract void mo53858o(int i, int i2) throws IOException;

    /* renamed from: p */
    public abstract void mo53859p(int i) throws IOException;

    /* renamed from: q */
    public abstract void mo53860q(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: r */
    public abstract void mo53861r(int i, String str) throws IOException;

    /* renamed from: s */
    public abstract void mo53862s(int i, int i2) throws IOException;

    /* renamed from: t */
    public abstract void mo53863t(int i, int i2) throws IOException;

    /* renamed from: u */
    public abstract void mo53864u(int i) throws IOException;

    /* renamed from: v */
    public abstract void mo53865v(int i, long j) throws IOException;

    /* renamed from: w */
    public abstract void mo53866w(long j) throws IOException;
}
