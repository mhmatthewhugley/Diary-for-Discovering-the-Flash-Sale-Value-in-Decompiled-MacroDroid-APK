package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcy */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzcy extends zzgc {
    zzcy() {
        super(zzlm.class, new zzcw(zzap.class));
    }

    /* renamed from: a */
    public final zzgb mo49373a() {
        return new zzcx(this, zzlp.class);
    }

    /* renamed from: b */
    public final zznr mo49374b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ zzaek mo49375c(zzacc zzacc) throws zzadn {
        return zzlm.m57598F(zzacc, zzacs.m56379a());
    }

    /* renamed from: d */
    public final String mo49376d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo49377e(zzaek zzaek) throws GeneralSecurityException {
        zzlm zzlm = (zzlm) zzaek;
        zzqs.m57981c(zzlm.mo49581C(), 0);
        if (zzlm.mo49582G().mo48893f() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
