package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfe */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzfe extends zzgc {
    public zzfe() {
        super(zznn.class, new zzfd(zzav.class));
    }

    /* renamed from: b */
    public final zznr mo49374b() {
        return zznr.ASYMMETRIC_PUBLIC;
    }

    /* renamed from: c */
    public final /* synthetic */ zzaek mo49375c(zzacc zzacc) throws zzadn {
        return zznn.m57767H(zzacc, zzacs.m56379a());
    }

    /* renamed from: d */
    public final String mo49376d() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo49377e(zzaek zzaek) throws GeneralSecurityException {
        zznn zznn = (zznn) zzaek;
        zzqs.m57981c(zznn.mo49648C(), 0);
        if (zznn.mo49651M()) {
            zzff.m57237a(zznn.mo49649D());
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }
}
