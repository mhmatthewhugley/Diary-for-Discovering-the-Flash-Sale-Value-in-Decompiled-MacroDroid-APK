package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzof */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzof extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzof zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzadk zze = zzadf.m56425B();

    static {
        zzof zzof = new zzof();
        zzb = zzof;
        zzadf.m56429j(zzof.class, zzof);
    }

    private zzof() {
    }

    /* renamed from: E */
    public static zzoc m57827E() {
        return (zzoc) zzb.mo49088v();
    }

    /* renamed from: H */
    public static zzof m57829H(byte[] bArr, zzacs zzacs) throws zzadn {
        return (zzof) zzadf.m56424A(zzb, bArr, zzacs);
    }

    /* renamed from: K */
    static /* synthetic */ void m57831K(zzof zzof, zzoe zzoe) {
        zzoe.getClass();
        zzadk zzadk = zzof.zze;
        if (!zzadk.mo48862a()) {
            zzof.zze = zzadf.m56426d(zzadk);
        }
        zzof.zze.add(zzoe);
    }

    /* renamed from: C */
    public final int mo49680C() {
        return this.zze.size();
    }

    /* renamed from: D */
    public final int mo49681D() {
        return this.zzd;
    }

    /* renamed from: F */
    public final zzoe mo49682F(int i) {
        return (zzoe) this.zze.get(i);
    }

    /* renamed from: I */
    public final List mo49683I() {
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
            return zzadf.m56428f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzoe.class});
        } else if (i2 == 3) {
            return new zzof();
        } else {
            if (i2 == 4) {
                return new zzoc((zzob) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
