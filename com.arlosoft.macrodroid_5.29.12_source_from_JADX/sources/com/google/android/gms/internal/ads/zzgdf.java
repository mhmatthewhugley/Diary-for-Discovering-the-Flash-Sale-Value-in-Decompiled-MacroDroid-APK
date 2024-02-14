package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgdf extends zzgfr {
    zzgdf() {
        super(zzgnj.class, new zzgdd(zzgak.class));
    }

    /* renamed from: a */
    public final zzgfq mo46732a() {
        return new zzgde(this, zzgnm.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46733b(zzgpw zzgpw) throws zzgrq {
        return zzgnj.m52405I(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final String mo46734c() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46735d(zzgso zzgso) throws GeneralSecurityException {
        zzgnj zzgnj = (zzgnj) zzgso;
        zzgoz.m52495b(zzgnj.mo47022F(), 0);
        if (zzgnj.mo47023J().mo47083m() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* renamed from: f */
    public final int mo46737f() {
        return 3;
    }
}
