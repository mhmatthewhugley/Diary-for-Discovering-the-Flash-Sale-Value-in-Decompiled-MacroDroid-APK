package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzkf extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzkf zzb;
    private zzki zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzkf zzkf = new zzkf();
        zzb = zzkf;
        zzadf.m56429j(zzkf.class, zzkf);
    }

    private zzkf() {
    }

    /* renamed from: D */
    public static zzke m57497D() {
        return (zzke) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzkf m57499F() {
        return zzb;
    }

    /* renamed from: G */
    public static zzkf m57500G(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzkf) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: I */
    static /* synthetic */ void m57501I(zzkf zzkf, zzki zzki) {
        zzki.getClass();
        zzkf.zzd = zzki;
    }

    /* renamed from: C */
    public final int mo49544C() {
        return this.zze;
    }

    /* renamed from: H */
    public final zzki mo49545H() {
        zzki zzki = this.zzd;
        return zzki == null ? zzki.m57509F() : zzki;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzkf();
        } else {
            if (i2 == 4) {
                return new zzke((zzkd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
