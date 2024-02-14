package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdi */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzdi extends zzgc {
    zzdi() {
        super(zzpe.class, new zzdg(zzap.class));
    }

    /* renamed from: a */
    public final zzgb mo49373a() {
        return new zzdh(this, zzph.class);
    }

    /* renamed from: b */
    public final zznr mo49374b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ zzaek mo49375c(zzacc zzacc) throws zzadn {
        return zzpe.m57897F(zzacc, zzacs.m56379a());
    }

    /* renamed from: d */
    public final String mo49376d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo49377e(zzaek zzaek) throws GeneralSecurityException {
        zzpe zzpe = (zzpe) zzaek;
        zzqs.m57981c(zzpe.mo49708C(), 0);
        if (zzpe.mo49709G().mo48893f() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
