package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzla */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzla extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzla zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public zzacc zze = zzacc.f39635a;

    static {
        zzla zzla = new zzla();
        zzb = zzla;
        zzadf.m56429j(zzla.class, zzla);
    }

    private zzla() {
    }

    /* renamed from: D */
    public static zzkz m57562D() {
        return (zzkz) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzla m57564F(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzla) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: C */
    public final int mo49569C() {
        return this.zzd;
    }

    /* renamed from: G */
    public final zzacc mo49570G() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzla();
        } else {
            if (i2 == 4) {
                return new zzkz((zzky) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
