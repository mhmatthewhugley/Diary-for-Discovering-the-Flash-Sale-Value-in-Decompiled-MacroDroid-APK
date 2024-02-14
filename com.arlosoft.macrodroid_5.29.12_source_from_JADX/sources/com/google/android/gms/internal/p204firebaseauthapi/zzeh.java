package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzeh extends zzgc {
    public zzeh() {
        super(zzmg.class, new zzeg(zzav.class));
    }

    /* renamed from: b */
    public final zznr mo49374b() {
        return zznr.ASYMMETRIC_PUBLIC;
    }

    /* renamed from: c */
    public final /* synthetic */ zzaek mo49375c(zzacc zzacc) throws zzadn {
        return zzmg.m57656H(zzacc, zzacs.m56379a());
    }

    /* renamed from: d */
    public final String mo49376d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo49377e(zzaek zzaek) throws GeneralSecurityException {
        zzmg zzmg = (zzmg) zzaek;
        zzqs.m57981c(zzmg.mo49603C(), 0);
        zzeo.m57194a(zzmg.mo49604D());
    }
}
