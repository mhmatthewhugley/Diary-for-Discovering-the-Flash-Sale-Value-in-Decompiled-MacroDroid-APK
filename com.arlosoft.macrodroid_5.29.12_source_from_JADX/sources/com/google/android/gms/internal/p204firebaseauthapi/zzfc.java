package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzfc extends zzgx {
    public zzfc() {
        super(zznk.class, zznn.class, new zzfa(zzau.class));
    }

    /* renamed from: l */
    static /* bridge */ /* synthetic */ zzga m57225l(int i, int i2, int i3, int i4) {
        zzng C = zznh.m57737C();
        C.mo49634q(i);
        C.mo49633o(i2);
        C.mo49632n(i3);
        zznd C2 = zzne.m57728C();
        C2.mo49630n((zznh) C.mo49069f());
        return new zzga((zzne) C2.mo49069f(), i4);
    }

    /* renamed from: a */
    public final zzgb mo49373a() {
        return new zzfb(this, zzne.class);
    }

    /* renamed from: b */
    public final zznr mo49374b() {
        return zznr.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: c */
    public final /* synthetic */ zzaek mo49375c(zzacc zzacc) throws zzadn {
        return zznk.m57752F(zzacc, zzacs.m56379a());
    }

    /* renamed from: d */
    public final String mo49376d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo49377e(zzaek zzaek) throws GeneralSecurityException {
        zznk zznk = (zznk) zzaek;
        if (zznk.mo49643H().mo48903D()) {
            throw new GeneralSecurityException("Private key is empty.");
        } else if (zznk.mo49644L()) {
            zzqs.m57981c(zznk.mo49641C(), 0);
            zzff.m57237a(zznk.mo49642G().mo49649D());
        } else {
            throw new GeneralSecurityException("Missing public key.");
        }
    }

    /* renamed from: k */
    public final /* synthetic */ zzaek mo49390k(zzaek zzaek) throws GeneralSecurityException {
        return ((zznk) zzaek).mo49642G();
    }
}
