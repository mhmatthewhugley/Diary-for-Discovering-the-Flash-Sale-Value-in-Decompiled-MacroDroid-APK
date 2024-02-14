package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzns */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzns extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzns zzb;
    /* access modifiers changed from: private */
    public String zzd = "";
    /* access modifiers changed from: private */
    public zzacc zze = zzacc.f39635a;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzns zzns = new zzns();
        zzb = zzns;
        zzadf.m56429j(zzns.class, zzns);
    }

    private zzns() {
    }

    /* renamed from: C */
    public static zznp m57780C() {
        return (zznp) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzns m57782F() {
        return zzb;
    }

    /* renamed from: D */
    public final zznr mo49657D() {
        zznr b = zznr.m57779b(this.zzf);
        return b == null ? zznr.UNRECOGNIZED : b;
    }

    /* renamed from: G */
    public final zzacc mo49658G() {
        return this.zze;
    }

    /* renamed from: H */
    public final String mo49659H() {
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
            return zzadf.m56428f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzns();
        } else {
            if (i2 == 4) {
                return new zznp((zzno) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
