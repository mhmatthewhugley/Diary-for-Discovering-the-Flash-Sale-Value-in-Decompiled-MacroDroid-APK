package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlx */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzlx extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzlx zzb;
    private zzma zzd;

    static {
        zzlx zzlx = new zzlx();
        zzb = zzlx;
        zzadf.m56429j(zzlx.class, zzlx);
    }

    private zzlx() {
    }

    /* renamed from: C */
    public static zzlw m57617C() {
        return (zzlw) zzb.mo49088v();
    }

    /* renamed from: E */
    public static zzlx m57619E(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzlx) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: G */
    static /* synthetic */ void m57620G(zzlx zzlx, zzma zzma) {
        zzma.getClass();
        zzlx.zzd = zzma;
    }

    /* renamed from: F */
    public final zzma mo49586F() {
        zzma zzma = this.zzd;
        return zzma == null ? zzma.m57628F() : zzma;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new zzlx();
        } else {
            if (i2 == 4) {
                return new zzlw((zzlv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
