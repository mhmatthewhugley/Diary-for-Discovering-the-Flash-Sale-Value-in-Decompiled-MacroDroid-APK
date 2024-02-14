package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzgql extends zzgpl {

    /* renamed from: b */
    private static final Logger f37063b = Logger.getLogger(zzgql.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f37064c = zzgui.m53431a();

    /* renamed from: a */
    zzgqm f37065a;

    private zzgql() {
    }

    /* synthetic */ zzgql(zzgqk zzgqk) {
    }

    /* renamed from: E */
    public static int m52825E(zzgpw zzgpw) {
        int m = zzgpw.mo47083m();
        return m52833f(m) + m;
    }

    @Deprecated
    /* renamed from: F */
    static int m52826F(int i, zzgso zzgso, zzgth zzgth) {
        int f = m52833f(i << 3);
        int i2 = f + f;
        zzgpf zzgpf = (zzgpf) zzgso;
        int a = zzgpf.mo47047a();
        if (a == -1) {
            a = zzgth.mo47412a(zzgpf);
            zzgpf.mo47048d(a);
        }
        return i2 + a;
    }

    /* renamed from: G */
    public static int m52827G(int i) {
        if (i >= 0) {
            return m52833f(i);
        }
        return 10;
    }

    /* renamed from: H */
    public static int m52828H(zzgru zzgru) {
        int a = zzgru.mo47374a();
        return m52833f(a) + a;
    }

    /* renamed from: b */
    static int m52829b(zzgso zzgso, zzgth zzgth) {
        zzgpf zzgpf = (zzgpf) zzgso;
        int a = zzgpf.mo47047a();
        if (a == -1) {
            a = zzgth.mo47412a(zzgpf);
            zzgpf.mo47048d(a);
        }
        return m52833f(a) + a;
    }

    /* renamed from: c */
    static int m52830c(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: d */
    public static int m52831d(String str) {
        int i;
        try {
            i = zzgun.m53474e(str);
        } catch (zzgum unused) {
            i = str.getBytes(zzgro.f37162b).length;
        }
        return m52833f(i) + i;
    }

    /* renamed from: e */
    public static int m52832e(int i) {
        return m52833f(i << 3);
    }

    /* renamed from: f */
    public static int m52833f(int i) {
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

    /* renamed from: g */
    public static int m52834g(long j) {
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

    /* renamed from: h */
    public static zzgql m52835h(byte[] bArr) {
        return new zzgqh(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static zzgql m52836i(OutputStream outputStream, int i) {
        return new zzgqj(outputStream, i);
    }

    /* renamed from: A */
    public abstract void mo47206A(int i, int i2) throws IOException;

    /* renamed from: B */
    public abstract void mo47207B(int i) throws IOException;

    /* renamed from: C */
    public abstract void mo47208C(int i, long j) throws IOException;

    /* renamed from: D */
    public abstract void mo47209D(long j) throws IOException;

    /* renamed from: a */
    public abstract void mo47074a(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: j */
    public final void mo47227j() {
        if (mo47205q() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo47228k(String str, zzgum zzgum) throws IOException {
        f37063b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzgum);
        byte[] bytes = str.getBytes(zzgro.f37162b);
        try {
            int length = bytes.length;
            mo47207B(length);
            mo47074a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgqi(e);
        }
    }

    /* renamed from: m */
    public abstract void mo47212m() throws IOException;

    /* renamed from: n */
    public abstract void mo47213n(byte b) throws IOException;

    /* renamed from: o */
    public abstract void mo47214o(int i, boolean z) throws IOException;

    /* renamed from: p */
    public abstract void mo47215p(int i, zzgpw zzgpw) throws IOException;

    /* renamed from: q */
    public abstract int mo47205q();

    /* renamed from: r */
    public abstract void mo47216r(int i, int i2) throws IOException;

    /* renamed from: s */
    public abstract void mo47217s(int i) throws IOException;

    /* renamed from: t */
    public abstract void mo47218t(int i, long j) throws IOException;

    /* renamed from: u */
    public abstract void mo47219u(long j) throws IOException;

    /* renamed from: v */
    public abstract void mo47220v(int i, int i2) throws IOException;

    /* renamed from: w */
    public abstract void mo47221w(int i) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public abstract void mo47222x(int i, zzgso zzgso, zzgth zzgth) throws IOException;

    /* renamed from: y */
    public abstract void mo47223y(int i, String str) throws IOException;

    /* renamed from: z */
    public abstract void mo47224z(int i, int i2) throws IOException;
}
