package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmw */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzmw extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzmw zzb;
    private zzmz zzd;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzmw zzmw = new zzmw();
        zzb = zzmw;
        zzadf.m56429j(zzmw.class, zzmw);
    }

    private zzmw() {
    }

    /* renamed from: D */
    public static zzmv m57707D() {
        return (zzmv) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzmw m57709F() {
        return zzb;
    }

    /* renamed from: G */
    public static zzmw m57710G(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzmw) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: I */
    static /* synthetic */ void m57711I(zzmw zzmw, zzmz zzmz) {
        zzmz.getClass();
        zzmw.zzd = zzmz;
    }

    /* renamed from: C */
    public final int mo49624C() {
        return this.zze;
    }

    /* renamed from: H */
    public final zzmz mo49625H() {
        zzmz zzmz = this.zzd;
        return zzmz == null ? zzmz.m57720F() : zzmz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzmw();
        } else {
            if (i2 == 4) {
                return new zzmv((zzmu) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
