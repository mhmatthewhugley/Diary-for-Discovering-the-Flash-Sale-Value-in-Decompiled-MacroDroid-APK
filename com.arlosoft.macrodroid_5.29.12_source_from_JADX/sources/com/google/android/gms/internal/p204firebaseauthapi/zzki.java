package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzki */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzki extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzki zzb;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        zzki zzki = new zzki();
        zzb = zzki;
        zzadf.m56429j(zzki.class, zzki);
    }

    private zzki() {
    }

    /* renamed from: D */
    public static zzkh m57507D() {
        return (zzkh) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzki m57509F() {
        return zzb;
    }

    /* renamed from: C */
    public final int mo49547C() {
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
            return new zzki();
        } else {
            if (i2 == 4) {
                return new zzkh((zzkg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
