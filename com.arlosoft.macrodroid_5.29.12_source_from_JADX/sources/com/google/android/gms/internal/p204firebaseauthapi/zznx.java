package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznx */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zznx extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zznx zzb;
    private String zzd = "";
    /* access modifiers changed from: private */
    public zzacc zze = zzacc.f39635a;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zznx zznx = new zznx();
        zzb = zznx;
        zzadf.m56429j(zznx.class, zznx);
    }

    private zznx() {
    }

    /* renamed from: C */
    public static zznw m57794C() {
        return (zznw) zzb.mo49088v();
    }

    /* renamed from: E */
    public static zznx m57796E() {
        return zzb;
    }

    /* renamed from: I */
    static /* synthetic */ void m57797I(zznx zznx, String str) {
        str.getClass();
        zznx.zzd = str;
    }

    /* renamed from: F */
    public final zzoy mo49663F() {
        zzoy b = zzoy.m57889b(this.zzf);
        return b == null ? zzoy.UNRECOGNIZED : b;
    }

    /* renamed from: G */
    public final zzacc mo49664G() {
        return this.zze;
    }

    /* renamed from: H */
    public final String mo49665H() {
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
            return zzadf.m56428f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zznx();
        } else {
            if (i2 == 4) {
                return new zznw((zznv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
