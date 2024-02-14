package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzon */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzon extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzon zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzoq zze;

    static {
        zzon zzon = new zzon();
        zzb = zzon;
        zzadf.m56429j(zzon.class, zzon);
    }

    private zzon() {
    }

    /* renamed from: D */
    public static zzom m57859D() {
        return (zzom) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzon m57861F(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzon) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: I */
    static /* synthetic */ void m57863I(zzon zzon, zzoq zzoq) {
        zzoq.getClass();
        zzon.zze = zzoq;
    }

    /* renamed from: C */
    public final int mo49694C() {
        return this.zzd;
    }

    /* renamed from: G */
    public final zzoq mo49695G() {
        zzoq zzoq = this.zze;
        return zzoq == null ? zzoq.m57868D() : zzoq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzon();
        } else {
            if (i2 == 4) {
                return new zzom((zzol) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
