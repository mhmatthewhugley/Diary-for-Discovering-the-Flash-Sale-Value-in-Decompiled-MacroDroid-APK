package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zznk extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zznk zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zznn zze;
    /* access modifiers changed from: private */
    public zzacc zzf = zzacc.f39635a;

    static {
        zznk zznk = new zznk();
        zzb = zznk;
        zzadf.m56429j(zznk.class, zznk);
    }

    private zznk() {
    }

    /* renamed from: D */
    public static zznj m57750D() {
        return (zznj) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zznk m57752F(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zznk) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: J */
    static /* synthetic */ void m57754J(zznk zznk, zznn zznn) {
        zznn.getClass();
        zznk.zze = zznn;
    }

    /* renamed from: C */
    public final int mo49641C() {
        return this.zzd;
    }

    /* renamed from: G */
    public final zznn mo49642G() {
        zznn zznn = this.zze;
        return zznn == null ? zznn.m57766G() : zznn;
    }

    /* renamed from: H */
    public final zzacc mo49643H() {
        return this.zzf;
    }

    /* renamed from: L */
    public final boolean mo49644L() {
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
            return new zznk();
        } else {
            if (i2 == 4) {
                return new zznj((zzni) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
