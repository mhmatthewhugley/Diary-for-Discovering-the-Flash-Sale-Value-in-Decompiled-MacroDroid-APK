package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzma */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzma extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzma zzb;
    private zzmj zzd;
    private zzlu zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzma zzma = new zzma();
        zzb = zzma;
        zzadf.m56429j(zzma.class, zzma);
    }

    private zzma() {
    }

    /* renamed from: D */
    public static zzlz m57626D() {
        return (zzlz) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzma m57628F() {
        return zzb;
    }

    /* renamed from: H */
    static /* synthetic */ void m57629H(zzma zzma, zzmj zzmj) {
        zzmj.getClass();
        zzma.zzd = zzmj;
    }

    /* renamed from: I */
    static /* synthetic */ void m57630I(zzma zzma, zzlu zzlu) {
        zzlu.getClass();
        zzma.zze = zzlu;
    }

    /* renamed from: C */
    public final zzlu mo49590C() {
        zzlu zzlu = this.zze;
        return zzlu == null ? zzlu.m57612E() : zzlu;
    }

    /* renamed from: G */
    public final zzmj mo49591G() {
        zzmj zzmj = this.zzd;
        return zzmj == null ? zzmj.m57671E() : zzmj;
    }

    /* renamed from: J */
    public final int mo49592J() {
        int i = this.zzf;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzma();
        } else {
            if (i2 == 4) {
                return new zzlz((zzly) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
