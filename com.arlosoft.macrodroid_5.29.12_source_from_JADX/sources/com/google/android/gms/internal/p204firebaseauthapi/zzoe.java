package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoe */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzoe extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzoe zzb;
    private zzns zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzoe zzoe = new zzoe();
        zzb = zzoe;
        zzadf.m56429j(zzoe.class, zzoe);
    }

    private zzoe() {
    }

    /* renamed from: E */
    public static zzod m57815E() {
        return (zzod) zzb.mo49088v();
    }

    /* renamed from: H */
    static /* synthetic */ void m57817H(zzoe zzoe, zzns zzns) {
        zzns.getClass();
        zzoe.zzd = zzns;
    }

    /* renamed from: C */
    public final int mo49675C() {
        return this.zzf;
    }

    /* renamed from: D */
    public final zzns mo49676D() {
        zzns zzns = this.zzd;
        return zzns == null ? zzns.m57782F() : zzns;
    }

    /* renamed from: G */
    public final zzoy mo49677G() {
        zzoy b = zzoy.m57889b(this.zzg);
        return b == null ? zzoy.UNRECOGNIZED : b;
    }

    /* renamed from: K */
    public final boolean mo49678K() {
        return this.zzd != null;
    }

    /* renamed from: L */
    public final int mo49679L() {
        int i = this.zze;
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
            return zzadf.m56428f(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzoe();
        } else {
            if (i2 == 4) {
                return new zzod((zzob) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
