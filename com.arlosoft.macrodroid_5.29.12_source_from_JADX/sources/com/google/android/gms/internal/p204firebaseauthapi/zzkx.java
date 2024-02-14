package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkx */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzkx extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzkx zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private int zze;

    static {
        zzkx zzkx = new zzkx();
        zzb = zzkx;
        zzadf.m56429j(zzkx.class, zzkx);
    }

    private zzkx() {
    }

    /* renamed from: D */
    public static zzkw m57554D() {
        return (zzkw) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzkx m57556F(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzkx) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: C */
    public final int mo49565C() {
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
            return zzadf.m56428f(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzkx();
        } else {
            if (i2 == 4) {
                return new zzkw((zzkv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
