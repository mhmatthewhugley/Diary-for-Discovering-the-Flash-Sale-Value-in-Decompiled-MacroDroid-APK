package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzmo extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzmo zzb;
    /* access modifiers changed from: private */
    public zzacc zzd = zzacc.f39635a;
    private zzok zze;

    static {
        zzmo zzmo = new zzmo();
        zzb = zzmo;
        zzadf.m56429j(zzmo.class, zzmo);
    }

    private zzmo() {
    }

    /* renamed from: C */
    public static zzmn m57682C() {
        return (zzmn) zzb.mo49088v();
    }

    /* renamed from: E */
    public static zzmo m57684E(byte[] bArr, zzacs zzacs) throws zzadn {
        return (zzmo) zzadf.m56424A(zzb, bArr, zzacs);
    }

    /* renamed from: H */
    static /* synthetic */ void m57686H(zzmo zzmo, zzok zzok) {
        zzok.getClass();
        zzmo.zze = zzok;
    }

    /* renamed from: F */
    public final zzacc mo49615F() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzmo();
        } else {
            if (i2 == 4) {
                return new zzmn((zzmm) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
