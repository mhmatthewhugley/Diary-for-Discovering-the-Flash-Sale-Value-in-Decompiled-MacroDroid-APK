package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zznh extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zznh zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zznh zznh = new zznh();
        zzb = zznh;
        zzadf.m56429j(zznh.class, zznh);
    }

    private zznh() {
    }

    /* renamed from: C */
    public static zzng m57737C() {
        return (zzng) zzb.mo49088v();
    }

    /* renamed from: E */
    public static zznh m57739E() {
        return zzb;
    }

    /* renamed from: F */
    public final int mo49635F() {
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

    /* renamed from: G */
    public final int mo49636G() {
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

    /* renamed from: H */
    public final int mo49637H() {
        int i = this.zzd;
        int i2 = 4;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = i != 3 ? i != 4 ? 0 : 6 : 5;
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
            return zzadf.m56428f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zznh();
        } else {
            if (i2 == 4) {
                return new zzng((zznf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
