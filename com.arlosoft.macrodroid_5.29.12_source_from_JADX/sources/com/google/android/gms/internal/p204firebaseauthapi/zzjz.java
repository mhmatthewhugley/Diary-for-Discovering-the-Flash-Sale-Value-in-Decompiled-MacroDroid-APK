package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjz */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzjz extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzjz zzb;
    private zzkf zzd;
    private zzmw zze;

    static {
        zzjz zzjz = new zzjz();
        zzb = zzjz;
        zzadf.m56429j(zzjz.class, zzjz);
    }

    private zzjz() {
    }

    /* renamed from: C */
    public static zzjy m57473C() {
        return (zzjy) zzb.mo49088v();
    }

    /* renamed from: E */
    public static zzjz m57475E(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzjz) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: H */
    static /* synthetic */ void m57476H(zzjz zzjz, zzkf zzkf) {
        zzkf.getClass();
        zzjz.zzd = zzkf;
    }

    /* renamed from: I */
    static /* synthetic */ void m57477I(zzjz zzjz, zzmw zzmw) {
        zzmw.getClass();
        zzjz.zze = zzmw;
    }

    /* renamed from: F */
    public final zzkf mo49533F() {
        zzkf zzkf = this.zzd;
        return zzkf == null ? zzkf.m57499F() : zzkf;
    }

    /* renamed from: G */
    public final zzmw mo49534G() {
        zzmw zzmw = this.zze;
        return zzmw == null ? zzmw.m57709F() : zzmw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzjz();
        } else {
            if (i2 == 4) {
                return new zzjy((zzjx) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
