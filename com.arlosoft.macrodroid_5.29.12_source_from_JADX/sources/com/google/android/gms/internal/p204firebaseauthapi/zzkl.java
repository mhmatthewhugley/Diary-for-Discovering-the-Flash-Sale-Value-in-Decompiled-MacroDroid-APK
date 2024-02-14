package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzkl extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzkl zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzkr zze;
    /* access modifiers changed from: private */
    public zzacc zzf = zzacc.f39635a;

    static {
        zzkl zzkl = new zzkl();
        zzb = zzkl;
        zzadf.m56429j(zzkl.class, zzkl);
    }

    private zzkl() {
    }

    /* renamed from: D */
    public static zzkk m57516D() {
        return (zzkk) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzkl m57518F(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzkl) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: J */
    static /* synthetic */ void m57520J(zzkl zzkl, zzkr zzkr) {
        zzkr.getClass();
        zzkl.zze = zzkr;
    }

    /* renamed from: C */
    public final int mo49551C() {
        return this.zzd;
    }

    /* renamed from: G */
    public final zzkr mo49552G() {
        zzkr zzkr = this.zze;
        return zzkr == null ? zzkr.m57539F() : zzkr;
    }

    /* renamed from: H */
    public final zzacc mo49553H() {
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
            return new zzkl();
        } else {
            if (i2 == 4) {
                return new zzkk((zzkj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
