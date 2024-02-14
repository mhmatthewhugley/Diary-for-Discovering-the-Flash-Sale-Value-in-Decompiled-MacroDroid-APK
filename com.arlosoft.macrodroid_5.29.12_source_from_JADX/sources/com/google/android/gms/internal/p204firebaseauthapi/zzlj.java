package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzlj extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzlj zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private int zze;

    static {
        zzlj zzlj = new zzlj();
        zzb = zzlj;
        zzadf.m56429j(zzlj.class, zzlj);
    }

    private zzlj() {
    }

    /* renamed from: D */
    public static zzli m57588D() {
        return (zzli) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzlj m57590F(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzlj) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: C */
    public final int mo49578C() {
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
            return zzadf.m56428f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzlj();
        } else {
            if (i2 == 4) {
                return new zzli((zzlh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
