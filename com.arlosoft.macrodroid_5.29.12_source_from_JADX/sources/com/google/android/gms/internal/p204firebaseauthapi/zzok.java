package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzok */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzok extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzok zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzadk zze = zzadf.m56425B();

    static {
        zzok zzok = new zzok();
        zzb = zzok;
        zzadf.m56429j(zzok.class, zzok);
    }

    private zzok() {
    }

    /* renamed from: C */
    public static zzoh m57851C() {
        return (zzoh) zzb.mo49088v();
    }

    /* renamed from: G */
    static /* synthetic */ void m57854G(zzok zzok, zzoj zzoj) {
        zzoj.getClass();
        zzadk zzadk = zzok.zze;
        if (!zzadk.mo48862a()) {
            zzok.zze = zzadf.m56426d(zzadk);
        }
        zzok.zze.add(zzoj);
    }

    /* renamed from: D */
    public final zzoj mo49691D(int i) {
        return (zzoj) this.zze.get(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzoj.class});
        } else if (i2 == 3) {
            return new zzok();
        } else {
            if (i2 == 4) {
                return new zzoh((zzog) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
