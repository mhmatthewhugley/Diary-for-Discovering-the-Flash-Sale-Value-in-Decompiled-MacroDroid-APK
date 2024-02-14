package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzjn extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzjn zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public zzacc zze = zzacc.f39635a;
    private zzjt zzf;

    static {
        zzjn zzjn = new zzjn();
        zzb = zzjn;
        zzadf.m56429j(zzjn.class, zzjn);
    }

    private zzjn() {
    }

    /* renamed from: D */
    public static zzjm m57431D() {
        return (zzjm) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzjn m57433F(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzjn) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: K */
    static /* synthetic */ void m57436K(zzjn zzjn, zzjt zzjt) {
        zzjt.getClass();
        zzjn.zzf = zzjt;
    }

    /* renamed from: C */
    public final int mo49516C() {
        return this.zzd;
    }

    /* renamed from: G */
    public final zzjt mo49517G() {
        zzjt zzjt = this.zzf;
        return zzjt == null ? zzjt.m57454F() : zzjt;
    }

    /* renamed from: H */
    public final zzacc mo49518H() {
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
            return zzadf.m56428f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzjn();
        } else {
            if (i2 == 4) {
                return new zzjm((zzjl) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
