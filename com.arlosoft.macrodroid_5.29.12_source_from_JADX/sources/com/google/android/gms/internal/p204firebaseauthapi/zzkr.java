package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzkr extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzkr zzb;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        zzkr zzkr = new zzkr();
        zzb = zzkr;
        zzadf.m56429j(zzkr.class, zzkr);
    }

    private zzkr() {
    }

    /* renamed from: D */
    public static zzkq m57537D() {
        return (zzkq) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzkr m57539F() {
        return zzb;
    }

    /* renamed from: C */
    public final int mo49559C() {
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
            return zzadf.m56428f(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new zzkr();
        } else {
            if (i2 == 4) {
                return new zzkq((zzkp) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
