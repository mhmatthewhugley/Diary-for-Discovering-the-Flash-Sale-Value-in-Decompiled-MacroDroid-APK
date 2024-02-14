package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzko */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzko extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzko zzb;
    private zzkr zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzko zzko = new zzko();
        zzb = zzko;
        zzadf.m56429j(zzko.class, zzko);
    }

    private zzko() {
    }

    /* renamed from: D */
    public static zzkn m57528D() {
        return (zzkn) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzko m57530F(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzko) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: H */
    static /* synthetic */ void m57531H(zzko zzko, zzkr zzkr) {
        zzkr.getClass();
        zzko.zzd = zzkr;
    }

    /* renamed from: C */
    public final int mo49556C() {
        return this.zze;
    }

    /* renamed from: G */
    public final zzkr mo49557G() {
        zzkr zzkr = this.zzd;
        return zzkr == null ? zzkr.m57539F() : zzkr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzko();
        } else {
            if (i2 == 4) {
                return new zzkn((zzkm) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
