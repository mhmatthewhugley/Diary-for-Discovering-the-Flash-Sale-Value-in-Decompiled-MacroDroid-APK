package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzld */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzld extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzld zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private int zze;

    static {
        zzld zzld = new zzld();
        zzb = zzld;
        zzadf.m56429j(zzld.class, zzld);
    }

    private zzld() {
    }

    /* renamed from: D */
    public static zzlc m57571D() {
        return (zzlc) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzld m57573F(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzld) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: C */
    public final int mo49572C() {
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
            return zzadf.m56428f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        } else if (i2 == 3) {
            return new zzld();
        } else {
            if (i2 == 4) {
                return new zzlc((zzlb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
