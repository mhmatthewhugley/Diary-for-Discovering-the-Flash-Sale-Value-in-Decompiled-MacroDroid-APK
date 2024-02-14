package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzlg extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzlg zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public zzacc zze = zzacc.f39635a;

    static {
        zzlg zzlg = new zzlg();
        zzb = zzlg;
        zzadf.m56429j(zzlg.class, zzlg);
    }

    private zzlg() {
    }

    /* renamed from: D */
    public static zzlf m57579D() {
        return (zzlf) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzlg m57581F(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzlg) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: C */
    public final int mo49575C() {
        return this.zzd;
    }

    /* renamed from: G */
    public final zzacc mo49576G() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzlg();
        } else {
            if (i2 == 4) {
                return new zzlf((zzle) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
