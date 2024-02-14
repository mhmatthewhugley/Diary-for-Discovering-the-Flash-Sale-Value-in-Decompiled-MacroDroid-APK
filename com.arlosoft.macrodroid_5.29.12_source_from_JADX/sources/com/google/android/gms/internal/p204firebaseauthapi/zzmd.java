package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzmd extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzmd zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzmg zze;
    /* access modifiers changed from: private */
    public zzacc zzf = zzacc.f39635a;

    static {
        zzmd zzmd = new zzmd();
        zzb = zzmd;
        zzadf.m56429j(zzmd.class, zzmd);
    }

    private zzmd() {
    }

    /* renamed from: D */
    public static zzmc m57639D() {
        return (zzmc) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzmd m57641F(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzmd) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: J */
    static /* synthetic */ void m57643J(zzmd zzmd, zzmg zzmg) {
        zzmg.getClass();
        zzmd.zze = zzmg;
    }

    /* renamed from: C */
    public final int mo49596C() {
        return this.zzd;
    }

    /* renamed from: G */
    public final zzmg mo49597G() {
        zzmg zzmg = this.zze;
        return zzmg == null ? zzmg.m57655G() : zzmg;
    }

    /* renamed from: H */
    public final zzacc mo49598H() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzmd();
        } else {
            if (i2 == 4) {
                return new zzmc((zzmb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
