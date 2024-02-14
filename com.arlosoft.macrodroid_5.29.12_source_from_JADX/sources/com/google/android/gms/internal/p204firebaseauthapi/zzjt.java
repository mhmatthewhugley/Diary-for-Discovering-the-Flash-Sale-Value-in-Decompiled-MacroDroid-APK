package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzjt extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzjt zzb;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        zzjt zzjt = new zzjt();
        zzb = zzjt;
        zzadf.m56429j(zzjt.class, zzjt);
    }

    private zzjt() {
    }

    /* renamed from: D */
    public static zzjs m57452D() {
        return (zzjs) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzjt m57454F() {
        return zzb;
    }

    /* renamed from: C */
    public final int mo49524C() {
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
            return new zzjt();
        } else {
            if (i2 == 4) {
                return new zzjs((zzjr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
