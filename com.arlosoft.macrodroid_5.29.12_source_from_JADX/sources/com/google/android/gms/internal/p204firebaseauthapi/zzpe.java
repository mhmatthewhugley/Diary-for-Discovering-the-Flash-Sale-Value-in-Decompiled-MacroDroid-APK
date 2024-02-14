package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpe */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzpe extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzpe zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public zzacc zze = zzacc.f39635a;

    static {
        zzpe zzpe = new zzpe();
        zzb = zzpe;
        zzadf.m56429j(zzpe.class, zzpe);
    }

    private zzpe() {
    }

    /* renamed from: D */
    public static zzpd m57895D() {
        return (zzpd) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzpe m57897F(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzpe) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: C */
    public final int mo49708C() {
        return this.zzd;
    }

    /* renamed from: G */
    public final zzacc mo49709G() {
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
            return zzadf.m56428f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzpe();
        } else {
            if (i2 == 4) {
                return new zzpd((zzpc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
