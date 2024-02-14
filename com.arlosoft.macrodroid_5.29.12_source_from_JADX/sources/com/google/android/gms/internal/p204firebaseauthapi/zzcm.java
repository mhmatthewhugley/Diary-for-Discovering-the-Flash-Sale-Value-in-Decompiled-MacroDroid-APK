package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzcm extends zzgc {
    zzcm() {
        super(zzkc.class, new zzck(zzqk.class));
    }

    /* renamed from: l */
    public static final void m57044l(zzkc zzkc) throws GeneralSecurityException {
        zzqs.m57981c(zzkc.mo49539C(), 0);
        zzqs.m57980b(zzkc.mo49541I().mo48893f());
        m57045m(zzkc.mo49540H());
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m57045m(zzki zzki) throws GeneralSecurityException {
        if (zzki.mo49547C() < 12 || zzki.mo49547C() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* renamed from: a */
    public final zzgb mo49373a() {
        return new zzcl(this, zzkf.class);
    }

    /* renamed from: b */
    public final zznr mo49374b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ zzaek mo49375c(zzacc zzacc) throws zzadn {
        return zzkc.m57487G(zzacc, zzacs.m56379a());
    }

    /* renamed from: d */
    public final String mo49376d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo49377e(zzaek zzaek) throws GeneralSecurityException {
        m57044l((zzkc) zzaek);
    }
}
