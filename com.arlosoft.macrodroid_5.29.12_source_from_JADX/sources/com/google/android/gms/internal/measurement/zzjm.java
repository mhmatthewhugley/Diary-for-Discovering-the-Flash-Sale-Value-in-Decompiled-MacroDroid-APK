package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class zzjm extends zziu {

    /* renamed from: b */
    private static final Logger f41550b = Logger.getLogger(zzjm.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f41551c = zzmy.m60843C();

    /* renamed from: a */
    zzjn f41552a;

    private zzjm() {
    }

    /* synthetic */ zzjm(zzjl zzjl) {
    }

    /* renamed from: A */
    public static int m60392A(zzks zzks) {
        int a = zzks.mo51475a();
        return m60396a(a) + a;
    }

    /* renamed from: B */
    static int m60393B(zzlm zzlm, zzlx zzlx) {
        int f = ((zzio) zzlm).mo51305f(zzlx);
        return m60396a(f) + f;
    }

    /* renamed from: C */
    public static int m60394C(String str) {
        int i;
        try {
            i = zznd.m60883c(str);
        } catch (zznc unused) {
            i = str.getBytes(zzkn.f41635b).length;
        }
        return m60396a(i) + i;
    }

    /* renamed from: D */
    public static int m60395D(int i) {
        return m60396a(i << 3);
    }

    /* renamed from: a */
    public static int m60396a(int i) {
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
    public static int m60397b(long j) {
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
    public static zzjm m60398c(byte[] bArr) {
        return new zzjj(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public static int m60400x(zzje zzje) {
        int f = zzje.mo51336f();
        return m60396a(f) + f;
    }

    @Deprecated
    /* renamed from: y */
    static int m60401y(int i, zzlm zzlm, zzlx zzlx) {
        int a = m60396a(i << 3);
        return a + a + ((zzio) zzlm).mo51305f(zzlx);
    }

    /* renamed from: z */
    public static int m60402z(int i) {
        if (i >= 0) {
            return m60396a(i);
        }
        return 10;
    }

    /* renamed from: d */
    public final void mo51370d() {
        if (mo51353g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo51371e(String str, zznc zznc) throws IOException {
        f41550b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zznc);
        byte[] bytes = str.getBytes(zzkn.f41635b);
        try {
            int length = bytes.length;
            mo51367u(length);
            mo51363q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjk(e);
        }
    }

    /* renamed from: g */
    public abstract int mo51353g();

    /* renamed from: h */
    public abstract void mo51354h(byte b) throws IOException;

    /* renamed from: i */
    public abstract void mo51355i(int i, boolean z) throws IOException;

    /* renamed from: j */
    public abstract void mo51356j(int i, zzje zzje) throws IOException;

    /* renamed from: k */
    public abstract void mo51357k(int i, int i2) throws IOException;

    /* renamed from: l */
    public abstract void mo51358l(int i) throws IOException;

    /* renamed from: m */
    public abstract void mo51359m(int i, long j) throws IOException;

    /* renamed from: n */
    public abstract void mo51360n(long j) throws IOException;

    /* renamed from: o */
    public abstract void mo51361o(int i, int i2) throws IOException;

    /* renamed from: p */
    public abstract void mo51362p(int i) throws IOException;

    /* renamed from: q */
    public abstract void mo51363q(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: r */
    public abstract void mo51364r(int i, String str) throws IOException;

    /* renamed from: s */
    public abstract void mo51365s(int i, int i2) throws IOException;

    /* renamed from: t */
    public abstract void mo51366t(int i, int i2) throws IOException;

    /* renamed from: u */
    public abstract void mo51367u(int i) throws IOException;

    /* renamed from: v */
    public abstract void mo51368v(int i, long j) throws IOException;

    /* renamed from: w */
    public abstract void mo51369w(long j) throws IOException;
}
