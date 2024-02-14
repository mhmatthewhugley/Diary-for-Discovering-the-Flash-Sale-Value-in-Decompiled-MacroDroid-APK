package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzph */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzph extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzph zzb;
    private int zzd;

    static {
        zzph zzph = new zzph();
        zzb = zzph;
        zzadf.m56429j(zzph.class, zzph);
    }

    private zzph() {
    }

    /* renamed from: D */
    public static zzph m57904D() {
        return zzb;
    }

    /* renamed from: E */
    public static zzph m57905E(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzph) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new zzph();
        } else {
            if (i2 == 4) {
                return new zzpg((zzpf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
