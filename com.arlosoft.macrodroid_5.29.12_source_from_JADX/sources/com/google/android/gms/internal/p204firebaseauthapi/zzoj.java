package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzoj extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzoj zzb;
    private String zzd = "";
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzoj zzoj = new zzoj();
        zzb = zzoj;
        zzadf.m56429j(zzoj.class, zzoj);
    }

    private zzoj() {
    }

    /* renamed from: D */
    public static zzoi m57843D() {
        return (zzoi) zzb.mo49088v();
    }

    /* renamed from: F */
    static /* synthetic */ void m57845F(zzoj zzoj, String str) {
        str.getClass();
        zzoj.zzd = str;
    }

    /* renamed from: C */
    public final int mo49690C() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzoj();
        } else {
            if (i2 == 4) {
                return new zzoi((zzog) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
