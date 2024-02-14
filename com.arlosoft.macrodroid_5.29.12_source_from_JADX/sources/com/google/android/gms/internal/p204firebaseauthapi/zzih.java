package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzih */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzih extends zzgc {
    public zzih() {
        super(zzmt.class, new zzif(zzbm.class));
    }

    /* renamed from: l */
    public static final void m57389l(zzmt zzmt) throws GeneralSecurityException {
        zzqs.m57981c(zzmt.mo49619C(), 0);
        if (zzmt.mo49621I().mo48893f() >= 16) {
            m57391n(zzmt.mo49620H());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ zzga m57390m(int i, int i2, int i3, int i4) {
        zzmv D = zzmw.m57707D();
        zzmy D2 = zzmz.m57718D();
        D2.mo49627o(i3);
        D2.mo49626n(i2);
        D.mo49623o((zzmz) D2.mo49069f());
        D.mo49622n(i);
        return new zzga((zzmw) D.mo49069f(), i4);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m57391n(zzmz zzmz) throws GeneralSecurityException {
        if (zzmz.mo49628C() >= 10) {
            int H = zzmz.mo49629H() - 2;
            if (H != 1) {
                if (H != 2) {
                    if (H != 3) {
                        if (H != 4) {
                            if (H != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (zzmz.mo49628C() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (zzmz.mo49628C() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (zzmz.mo49628C() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (zzmz.mo49628C() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (zzmz.mo49628C() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* renamed from: a */
    public final zzgb mo49373a() {
        return new zzig(this, zzmw.class);
    }

    /* renamed from: b */
    public final zznr mo49374b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ zzaek mo49375c(zzacc zzacc) throws zzadn {
        return zzmt.m57697G(zzacc, zzacs.m56379a());
    }

    /* renamed from: d */
    public final String mo49376d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo49377e(zzaek zzaek) throws GeneralSecurityException {
        m57389l((zzmt) zzaek);
    }

    /* renamed from: f */
    public final int mo49378f() {
        return 2;
    }
}
