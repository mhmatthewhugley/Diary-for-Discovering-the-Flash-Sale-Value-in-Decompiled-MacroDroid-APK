package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public abstract class zzcm extends zzbw {

    /* renamed from: b */
    private static final Logger f40802b = Logger.getLogger(zzcm.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f40803c = zzfn.m59074f();

    /* renamed from: a */
    zzcn f40804a;

    private zzcm() {
    }

    /* synthetic */ zzcm(zzcj zzcj) {
    }

    /* renamed from: A */
    public static int m58699A(int i) {
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

    /* renamed from: B */
    public static int m58700B(long j) {
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

    /* renamed from: C */
    public static int m58701C(String str) {
        int i;
        try {
            i = zzfr.m59100c(str);
        } catch (zzfq unused) {
            i = str.getBytes(zzdh.f40878a).length;
        }
        return m58699A(i) + i;
    }

    /* renamed from: D */
    public static int m58702D(zzdm zzdm) {
        int a = zzdm.mo50324a();
        return m58699A(a) + a;
    }

    /* renamed from: a */
    public static int m58703a(zzcf zzcf) {
        int f = zzcf.mo50214f();
        return m58699A(f) + f;
    }

    /* renamed from: b */
    static int m58704b(zzee zzee, zzep zzep) {
        zzbs zzbs = (zzbs) zzee;
        int b = zzbs.mo50183b();
        if (b == -1) {
            b = zzep.mo50356a(zzbs);
            zzbs.mo50184c(b);
        }
        return m58699A(b) + b;
    }

    @Deprecated
    /* renamed from: e */
    static int m58705e(int i, zzee zzee, zzep zzep) {
        int A = m58699A(i << 3);
        int i2 = A + A;
        zzbs zzbs = (zzbs) zzee;
        int b = zzbs.mo50183b();
        if (b == -1) {
            b = zzep.mo50356a(zzbs);
            zzbs.mo50184c(b);
        }
        return i2 + b;
    }

    /* renamed from: x */
    public static zzcm m58707x(byte[] bArr) {
        return new zzck(bArr, 0, bArr.length);
    }

    /* renamed from: y */
    public static int m58708y(int i) {
        return m58699A(i << 3);
    }

    /* renamed from: z */
    public static int m58709z(int i) {
        if (i >= 0) {
            return m58699A(i);
        }
        return 10;
    }

    /* renamed from: c */
    public final void mo50247c() {
        if (mo50246w() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo50248d(String str, zzfq zzfq) throws IOException {
        f40802b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzfq);
        byte[] bytes = str.getBytes(zzdh.f40878a);
        try {
            int length = bytes.length;
            mo50241r(length);
            mo50245v(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzcl(e);
        } catch (zzcl e2) {
            throw e2;
        }
    }

    /* renamed from: g */
    public abstract void mo50230g(int i, int i2) throws IOException;

    /* renamed from: h */
    public abstract void mo50231h(int i, int i2) throws IOException;

    /* renamed from: i */
    public abstract void mo50232i(int i, int i2) throws IOException;

    /* renamed from: j */
    public abstract void mo50233j(int i, int i2) throws IOException;

    /* renamed from: k */
    public abstract void mo50234k(int i, long j) throws IOException;

    /* renamed from: l */
    public abstract void mo50235l(int i, long j) throws IOException;

    /* renamed from: m */
    public abstract void mo50236m(int i, boolean z) throws IOException;

    /* renamed from: n */
    public abstract void mo50237n(int i, String str) throws IOException;

    /* renamed from: o */
    public abstract void mo50238o(int i, zzcf zzcf) throws IOException;

    /* renamed from: p */
    public abstract void mo50239p(byte b) throws IOException;

    /* renamed from: q */
    public abstract void mo50240q(int i) throws IOException;

    /* renamed from: r */
    public abstract void mo50241r(int i) throws IOException;

    /* renamed from: s */
    public abstract void mo50242s(int i) throws IOException;

    /* renamed from: t */
    public abstract void mo50243t(long j) throws IOException;

    /* renamed from: u */
    public abstract void mo50244u(long j) throws IOException;

    /* renamed from: v */
    public abstract void mo50245v(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: w */
    public abstract int mo50246w();
}
