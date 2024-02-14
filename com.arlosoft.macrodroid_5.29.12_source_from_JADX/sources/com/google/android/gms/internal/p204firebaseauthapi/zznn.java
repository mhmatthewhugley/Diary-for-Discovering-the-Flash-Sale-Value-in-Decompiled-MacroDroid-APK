package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zznn extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zznn zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zznh zze;
    /* access modifiers changed from: private */
    public zzacc zzf = zzacc.f39635a;

    static {
        zznn zznn = new zznn();
        zzb = zznn;
        zzadf.m56429j(zznn.class, zznn);
    }

    private zznn() {
    }

    /* renamed from: E */
    public static zznm m57764E() {
        return (zznm) zzb.mo49088v();
    }

    /* renamed from: G */
    public static zznn m57766G() {
        return zzb;
    }

    /* renamed from: H */
    public static zznn m57767H(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zznn) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: K */
    static /* synthetic */ void m57769K(zznn zznn, zznh zznh) {
        zznh.getClass();
        zznn.zze = zznh;
    }

    /* renamed from: C */
    public final int mo49648C() {
        return this.zzd;
    }

    /* renamed from: D */
    public final zznh mo49649D() {
        zznh zznh = this.zze;
        return zznh == null ? zznh.m57739E() : zznh;
    }

    /* renamed from: I */
    public final zzacc mo49650I() {
        return this.zzf;
    }

    /* renamed from: M */
    public final boolean mo49651M() {
        return this.zze != null;
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
            return new zznn();
        } else {
            if (i2 == 4) {
                return new zznm((zznl) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
