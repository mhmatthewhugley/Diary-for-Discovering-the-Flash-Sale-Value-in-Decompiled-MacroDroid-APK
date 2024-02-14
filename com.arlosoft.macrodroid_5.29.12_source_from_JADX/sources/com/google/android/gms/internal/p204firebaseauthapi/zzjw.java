package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjw */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzjw extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzjw zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzkc zze;
    private zzmt zzf;

    static {
        zzjw zzjw = new zzjw();
        zzb = zzjw;
        zzadf.m56429j(zzjw.class, zzjw);
    }

    private zzjw() {
    }

    /* renamed from: D */
    public static zzjv m57461D() {
        return (zzjv) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzjw m57463F(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzjw) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: J */
    static /* synthetic */ void m57465J(zzjw zzjw, zzkc zzkc) {
        zzkc.getClass();
        zzjw.zze = zzkc;
    }

    /* renamed from: K */
    static /* synthetic */ void m57466K(zzjw zzjw, zzmt zzmt) {
        zzmt.getClass();
        zzjw.zzf = zzmt;
    }

    /* renamed from: C */
    public final int mo49528C() {
        return this.zzd;
    }

    /* renamed from: G */
    public final zzkc mo49529G() {
        zzkc zzkc = this.zze;
        return zzkc == null ? zzkc.m57486F() : zzkc;
    }

    /* renamed from: H */
    public final zzmt mo49530H() {
        zzmt zzmt = this.zzf;
        return zzmt == null ? zzmt.m57696F() : zzmt;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzjw();
        } else {
            if (i2 == 4) {
                return new zzjv((zzju) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
