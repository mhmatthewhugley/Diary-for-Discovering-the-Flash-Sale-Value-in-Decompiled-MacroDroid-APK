package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class zzacn extends zzabs {

    /* renamed from: b */
    private static final Logger f39661b = Logger.getLogger(zzacn.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f39662c = zzafx.m56831C();

    /* renamed from: a */
    zzaco f39663a;

    private zzacn() {
    }

    /* synthetic */ zzacn(zzacm zzacm) {
    }

    /* renamed from: E */
    public static int m56304E(zzacc zzacc) {
        int f = zzacc.mo48893f();
        return m56312f(f) + f;
    }

    @Deprecated
    /* renamed from: F */
    static int m56305F(int i, zzaek zzaek, zzaew zzaew) {
        int f = m56312f(i << 3);
        return f + f + ((zzabm) zzaek).mo48858b(zzaew);
    }

    /* renamed from: G */
    public static int m56306G(int i) {
        if (i >= 0) {
            return m56312f(i);
        }
        return 10;
    }

    /* renamed from: H */
    public static int m56307H(zzadq zzadq) {
        int a = zzadq.mo49104a();
        return m56312f(a) + a;
    }

    /* renamed from: b */
    static int m56308b(zzaek zzaek, zzaew zzaew) {
        int b = ((zzabm) zzaek).mo48858b(zzaew);
        return m56312f(b) + b;
    }

    /* renamed from: c */
    static int m56309c(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: d */
    public static int m56310d(String str) {
        int i;
        try {
            i = zzagc.m56874c(str);
        } catch (zzagb unused) {
            i = str.getBytes(zzadl.f39746b).length;
        }
        return m56312f(i) + i;
    }

    /* renamed from: e */
    public static int m56311e(int i) {
        return m56312f(i << 3);
    }

    /* renamed from: f */
    public static int m56312f(int i) {
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
    public static int m56313g(long j) {
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
    public static zzacn m56314h(byte[] bArr) {
        return new zzacj(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static zzacn m56315i(OutputStream outputStream, int i) {
        return new zzacl(outputStream, i);
    }

    /* renamed from: A */
    public abstract void mo48973A(int i, int i2) throws IOException;

    /* renamed from: B */
    public abstract void mo48974B(int i) throws IOException;

    /* renamed from: C */
    public abstract void mo48975C(int i, long j) throws IOException;

    /* renamed from: D */
    public abstract void mo48976D(long j) throws IOException;

    /* renamed from: a */
    public abstract void mo48884a(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: j */
    public final void mo48994j() {
        if (mo48972q() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo48995k(String str, zzagb zzagb) throws IOException {
        f39661b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzagb);
        byte[] bytes = str.getBytes(zzadl.f39746b);
        try {
            int length = bytes.length;
            mo48974B(length);
            mo48884a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzack(e);
        }
    }

    /* renamed from: m */
    public abstract void mo48979m() throws IOException;

    /* renamed from: n */
    public abstract void mo48980n(byte b) throws IOException;

    /* renamed from: o */
    public abstract void mo48981o(int i, boolean z) throws IOException;

    /* renamed from: p */
    public abstract void mo48982p(int i, zzacc zzacc) throws IOException;

    /* renamed from: q */
    public abstract int mo48972q();

    /* renamed from: r */
    public abstract void mo48983r(int i, int i2) throws IOException;

    /* renamed from: s */
    public abstract void mo48984s(int i) throws IOException;

    /* renamed from: t */
    public abstract void mo48985t(int i, long j) throws IOException;

    /* renamed from: u */
    public abstract void mo48986u(long j) throws IOException;

    /* renamed from: v */
    public abstract void mo48987v(int i, int i2) throws IOException;

    /* renamed from: w */
    public abstract void mo48988w(int i) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public abstract void mo48989x(int i, zzaek zzaek, zzaew zzaew) throws IOException;

    /* renamed from: y */
    public abstract void mo48990y(int i, String str) throws IOException;

    /* renamed from: z */
    public abstract void mo48991z(int i, int i2) throws IOException;
}
