package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzot */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzot extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzot zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzow zze;

    static {
        zzot zzot = new zzot();
        zzb = zzot;
        zzadf.m56429j(zzot.class, zzot);
    }

    private zzot() {
    }

    /* renamed from: D */
    public static zzos m57874D() {
        return (zzos) zzb.mo49088v();
    }

    /* renamed from: F */
    public static zzot m57876F(zzacc zzacc, zzacs zzacs) throws zzadn {
        return (zzot) zzadf.m56434z(zzb, zzacc, zzacs);
    }

    /* renamed from: I */
    static /* synthetic */ void m57878I(zzot zzot, zzow zzow) {
        zzow.getClass();
        zzot.zze = zzow;
    }

    /* renamed from: C */
    public final int mo49699C() {
        return this.zzd;
    }

    /* renamed from: G */
    public final zzow mo49700G() {
        zzow zzow = this.zze;
        return zzow == null ? zzow.m57883E() : zzow;
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
            return new zzot();
        } else {
            if (i2 == 4) {
                return new zzos((zzor) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
