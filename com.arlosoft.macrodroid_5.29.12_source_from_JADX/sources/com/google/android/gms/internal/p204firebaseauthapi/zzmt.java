package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzmt extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzmt zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzmz zze;
    /* access modifiers changed from: private */
    public zzacc zzf = zzacc.f39635a;

    static {
        zzmt zzmt = new zzmt();
        zzb = zzmt;
        zzadf.m56429j(zzmt.class, zzmt);
    }

    private zzmt() {
    }

    /* renamed from: D */
    public static zzms m57694D() {
        return (zzms) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzmt m57696F() {
        return zzb;
    }

    /* renamed from: G */
    public static zzmt m57697G(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzmt) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: K */
    static /* synthetic */ void m57699K(zzmt zzmt, zzmz zzmz) {
        zzmz.getClass();
        zzmt.zze = zzmz;
    }

    /* renamed from: C */
    public final int mo49619C() {
        return this.zzd;
    }

    /* renamed from: H */
    public final zzmz mo49620H() {
        zzmz zzmz = this.zze;
        return zzmz == null ? zzmz.m57720F() : zzmz;
    }

    /* renamed from: I */
    public final zzacc mo49621I() {
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
            return new zzmt();
        } else {
            if (i2 == 4) {
                return new zzms((zzmr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
