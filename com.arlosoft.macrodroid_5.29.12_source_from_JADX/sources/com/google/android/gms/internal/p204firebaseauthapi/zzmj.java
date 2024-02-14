package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzmj extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzmj zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzacc zzf = zzacc.f39635a;

    static {
        zzmj zzmj = new zzmj();
        zzb = zzmj;
        zzadf.m56429j(zzmj.class, zzmj);
    }

    private zzmj() {
    }

    /* renamed from: C */
    public static zzmi m57669C() {
        return (zzmi) zzb.mo49088v();
    }

    /* renamed from: E */
    public static zzmj m57671E() {
        return zzb;
    }

    /* renamed from: F */
    public final zzacc mo49610F() {
        return this.zzf;
    }

    /* renamed from: H */
    public final int mo49611H() {
        int i = this.zzd;
        int i2 = 5;
        if (i == 0) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 4;
        } else if (i != 3) {
            i2 = i != 4 ? i != 5 ? 0 : 7 : 6;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* renamed from: I */
    public final int mo49612I() {
        int b = zzmq.m57690b(this.zze);
        if (b == 0) {
            return 1;
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new zzmj();
        } else {
            if (i2 == 4) {
                return new zzmi((zzmh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
