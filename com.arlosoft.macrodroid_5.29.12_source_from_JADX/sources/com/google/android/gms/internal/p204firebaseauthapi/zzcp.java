package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzcp extends zzgc {
    zzcp() {
        super(zzkl.class, new zzcn(zzap.class));
    }

    /* renamed from: k */
    static /* bridge */ /* synthetic */ zzga m57056k(int i, int i2, int i3) {
        zzkn D = zzko.m57528D();
        D.mo49554n(i);
        zzkq D2 = zzkr.m57537D();
        D2.mo49558n(16);
        D.mo49555o((zzkr) D2.mo49069f());
        return new zzga((zzko) D.mo49069f(), i3);
    }

    /* renamed from: a */
    public final zzgb mo49373a() {
        return new zzco(this, zzko.class);
    }

    /* renamed from: b */
    public final zznr mo49374b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ zzaek mo49375c(zzacc zzacc) throws zzadn {
        return zzkl.m57518F(zzacc, zzacs.m56379a());
    }

    /* renamed from: d */
    public final String mo49376d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo49377e(zzaek zzaek) throws GeneralSecurityException {
        zzkl zzkl = (zzkl) zzaek;
        zzqs.m57981c(zzkl.mo49551C(), 0);
        zzqs.m57980b(zzkl.mo49553H().mo48893f());
        if (zzkl.mo49552G().mo49559C() != 12 && zzkl.mo49552G().mo49559C() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
