package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmz */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzmz extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzmz zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzmz zzmz = new zzmz();
        zzb = zzmz;
        zzadf.m56429j(zzmz.class, zzmz);
    }

    private zzmz() {
    }

    /* renamed from: D */
    public static zzmy m57718D() {
        return (zzmy) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzmz m57720F() {
        return zzb;
    }

    /* renamed from: C */
    public final int mo49628C() {
        return this.zze;
    }

    /* renamed from: H */
    public final int mo49629H() {
        int b = zzmq.m57690b(this.zzd);
        if (b == 0) {
            return 1;
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzmz();
        } else {
            if (i2 == 4) {
                return new zzmy((zzmx) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
