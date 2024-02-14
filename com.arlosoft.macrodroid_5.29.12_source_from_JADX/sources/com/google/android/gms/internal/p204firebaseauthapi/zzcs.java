package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcs */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzcs extends zzgc {
    zzcs() {
        super(zzku.class, new zzcq(zzap.class));
    }

    /* renamed from: k */
    static /* bridge */ /* synthetic */ zzga m57067k(int i, int i2) {
        zzkw D = zzkx.m57554D();
        D.mo49564n(i);
        return new zzga((zzkx) D.mo49069f(), i2);
    }

    /* renamed from: a */
    public final zzgb mo49373a() {
        return new zzcr(this, zzkx.class);
    }

    /* renamed from: b */
    public final zznr mo49374b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ zzaek mo49375c(zzacc zzacc) throws zzadn {
        return zzku.m57547F(zzacc, zzacs.m56379a());
    }

    /* renamed from: d */
    public final String mo49376d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo49377e(zzaek zzaek) throws GeneralSecurityException {
        zzku zzku = (zzku) zzaek;
        zzqs.m57981c(zzku.mo49562C(), 0);
        zzqs.m57980b(zzku.mo49563G().mo48893f());
    }

    /* renamed from: f */
    public final int mo49378f() {
        return 2;
    }
}
