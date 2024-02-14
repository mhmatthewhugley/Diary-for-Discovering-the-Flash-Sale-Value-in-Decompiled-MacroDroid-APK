package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzmg extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzmg zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzma zze;
    /* access modifiers changed from: private */
    public zzacc zzf;
    /* access modifiers changed from: private */
    public zzacc zzg;

    static {
        zzmg zzmg = new zzmg();
        zzb = zzmg;
        zzadf.m56429j(zzmg.class, zzmg);
    }

    private zzmg() {
        zzacc zzacc = zzacc.f39635a;
        this.zzf = zzacc;
        this.zzg = zzacc;
    }

    /* renamed from: E */
    public static zzmf m57653E() {
        return (zzmf) zzb.mo49088v();
    }

    /* renamed from: G */
    public static zzmg m57655G() {
        return zzb;
    }

    /* renamed from: H */
    public static zzmg m57656H(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzmg) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: L */
    static /* synthetic */ void m57658L(zzmg zzmg, zzma zzma) {
        zzma.getClass();
        zzmg.zze = zzma;
    }

    /* renamed from: C */
    public final int mo49603C() {
        return this.zzd;
    }

    /* renamed from: D */
    public final zzma mo49604D() {
        zzma zzma = this.zze;
        return zzma == null ? zzma.m57628F() : zzma;
    }

    /* renamed from: I */
    public final zzacc mo49605I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final zzacc mo49606J() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzmg();
        } else {
            if (i2 == 4) {
                return new zzmf((zzme) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
