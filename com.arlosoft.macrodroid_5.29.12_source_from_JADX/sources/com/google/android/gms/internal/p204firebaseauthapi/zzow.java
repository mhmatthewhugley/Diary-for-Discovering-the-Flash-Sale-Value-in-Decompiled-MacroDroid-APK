package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzow */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzow extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzow zzb;
    private String zzd = "";
    private zznx zze;

    static {
        zzow zzow = new zzow();
        zzb = zzow;
        zzadf.m56429j(zzow.class, zzow);
    }

    private zzow() {
    }

    /* renamed from: E */
    public static zzow m57883E() {
        return zzb;
    }

    /* renamed from: F */
    public static zzow m57884F(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzow) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: C */
    public final zznx mo49701C() {
        zznx zznx = this.zze;
        return zznx == null ? zznx.m57796E() : zznx;
    }

    /* renamed from: G */
    public final String mo49702G() {
        return this.zzd;
    }

    /* renamed from: H */
    public final boolean mo49703H() {
        return this.zze != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzow();
        } else {
            if (i2 == 4) {
                return new zzov((zzou) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
