package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzjq extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzjq zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzjt zze;

    static {
        zzjq zzjq = new zzjq();
        zzb = zzjq;
        zzadf.m56429j(zzjq.class, zzjq);
    }

    private zzjq() {
    }

    /* renamed from: D */
    public static zzjp m57443D() {
        return (zzjp) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzjq m57445F(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzjq) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: I */
    static /* synthetic */ void m57447I(zzjq zzjq, zzjt zzjt) {
        zzjt.getClass();
        zzjq.zze = zzjt;
    }

    /* renamed from: C */
    public final int mo49521C() {
        return this.zzd;
    }

    /* renamed from: G */
    public final zzjt mo49522G() {
        zzjt zzjt = this.zze;
        return zzjt == null ? zzjt.m57454F() : zzjt;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzjq();
        } else {
            if (i2 == 4) {
                return new zzjp((zzjo) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
