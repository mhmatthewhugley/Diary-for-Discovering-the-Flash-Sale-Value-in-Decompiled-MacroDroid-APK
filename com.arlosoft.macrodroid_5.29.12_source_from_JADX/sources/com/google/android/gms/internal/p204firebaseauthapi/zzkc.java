package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzkc extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzkc zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzki zze;
    /* access modifiers changed from: private */
    public zzacc zzf = zzacc.f39635a;

    static {
        zzkc zzkc = new zzkc();
        zzb = zzkc;
        zzadf.m56429j(zzkc.class, zzkc);
    }

    private zzkc() {
    }

    /* renamed from: D */
    public static zzkb m57484D() {
        return (zzkb) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzkc m57486F() {
        return zzb;
    }

    /* renamed from: G */
    public static zzkc m57487G(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzkc) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: K */
    static /* synthetic */ void m57489K(zzkc zzkc, zzki zzki) {
        zzki.getClass();
        zzkc.zze = zzki;
    }

    /* renamed from: C */
    public final int mo49539C() {
        return this.zzd;
    }

    /* renamed from: H */
    public final zzki mo49540H() {
        zzki zzki = this.zze;
        return zzki == null ? zzki.m57509F() : zzki;
    }

    /* renamed from: I */
    public final zzacc mo49541I() {
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
            return zzadf.m56428f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzkc();
        } else {
            if (i2 == 4) {
                return new zzkb((zzka) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
