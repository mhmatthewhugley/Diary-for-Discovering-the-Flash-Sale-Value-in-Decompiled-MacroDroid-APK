package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzde */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzde extends zzgb {

    /* renamed from: b */
    final /* synthetic */ zzdf f39970b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzde(zzdf zzdf, Class cls) {
        super(cls);
        this.f39970b = zzdf;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzaek mo49369a(zzaek zzaek) throws GeneralSecurityException {
        zzos D = zzot.m57874D();
        D.mo49697n((zzow) zzaek);
        D.mo49698o(0);
        return (zzot) D.mo49069f();
    }

    /* renamed from: b */
    public final /* synthetic */ zzaek mo49370b(zzacc zzacc) throws zzadn {
        return zzow.m57884F(zzacc, zzacs.m56379a());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo49372d(zzaek zzaek) throws GeneralSecurityException {
        zzow zzow = (zzow) zzaek;
        if (zzow.mo49702G().isEmpty() || !zzow.mo49703H()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
