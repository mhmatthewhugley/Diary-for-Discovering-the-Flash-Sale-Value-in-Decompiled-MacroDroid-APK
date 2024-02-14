package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbx */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzbx extends zzaz implements zzbw {

    /* renamed from: c */
    private final zzgx f39931c;

    /* renamed from: d */
    private final zzgc f39932d;

    public zzbx(zzgx zzgx, zzgc zzgc, Class cls) {
        super(zzgx, cls);
        this.f39931c = zzgx;
        this.f39932d = zzgc;
    }

    /* renamed from: c */
    public final zzns mo49366c(zzacc zzacc) throws GeneralSecurityException {
        try {
            zzaek c = this.f39931c.mo49375c(zzacc);
            this.f39931c.mo49377e(c);
            zzaek k = this.f39931c.mo49390k(c);
            this.f39932d.mo49377e(k);
            zznp C = zzns.m57780C();
            C.mo49653o(this.f39932d.mo49376d());
            C.mo49654q(k.mo48860l());
            C.mo49652n(this.f39932d.mo49374b());
            return (zzns) C.mo49069f();
        } catch (zzadn e) {
            throw new GeneralSecurityException("expected serialized proto of type ", e);
        }
    }
}
