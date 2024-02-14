package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzoq extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzoq zzb;
    private String zzd = "";

    static {
        zzoq zzoq = new zzoq();
        zzb = zzoq;
        zzadf.m56429j(zzoq.class, zzoq);
    }

    private zzoq() {
    }

    /* renamed from: D */
    public static zzoq m57868D() {
        return zzb;
    }

    /* renamed from: E */
    public static zzoq m57869E(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzoq) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: F */
    public final String mo49696F() {
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
            return zzadf.m56428f(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new zzoq();
        } else {
            if (i2 == 4) {
                return new zzop((zzoo) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
