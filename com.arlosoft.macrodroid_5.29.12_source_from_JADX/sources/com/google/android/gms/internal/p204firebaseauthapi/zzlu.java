package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzlu extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzlu zzb;
    private zznx zzd;

    static {
        zzlu zzlu = new zzlu();
        zzb = zzlu;
        zzadf.m56429j(zzlu.class, zzlu);
    }

    private zzlu() {
    }

    /* renamed from: C */
    public static zzlt m57610C() {
        return (zzlt) zzb.mo49088v();
    }

    /* renamed from: E */
    public static zzlu m57612E() {
        return zzb;
    }

    /* renamed from: G */
    static /* synthetic */ void m57613G(zzlu zzlu, zznx zznx) {
        zznx.getClass();
        zzlu.zzd = zznx;
    }

    /* renamed from: F */
    public final zznx mo49584F() {
        zznx zznx = this.zzd;
        return zznx == null ? zznx.m57796E() : zznx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new zzlu();
        } else {
            if (i2 == 4) {
                return new zzlt((zzls) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
