package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzne */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzne extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzne zzb;
    private zznh zzd;

    static {
        zzne zzne = new zzne();
        zzb = zzne;
        zzadf.m56429j(zzne.class, zzne);
    }

    private zzne() {
    }

    /* renamed from: C */
    public static zznd m57728C() {
        return (zznd) zzb.mo49088v();
    }

    /* renamed from: E */
    public static zzne m57730E(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzne) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: G */
    static /* synthetic */ void m57731G(zzne zzne, zznh zznh) {
        zznh.getClass();
        zzne.zzd = zznh;
    }

    /* renamed from: F */
    public final zznh mo49631F() {
        zznh zznh = this.zzd;
        return zznh == null ? zznh.m57739E() : zznh;
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
            return new zzne();
        } else {
            if (i2 == 4) {
                return new zznd((zznc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
