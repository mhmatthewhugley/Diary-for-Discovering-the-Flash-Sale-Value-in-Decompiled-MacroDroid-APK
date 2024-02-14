package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgcv extends zzgfr {
    zzgcv() {
        super(zzgjw.class, new zzgct(zzgak.class));
    }

    /* renamed from: a */
    public final zzgfq mo46732a() {
        return new zzgcu(this, zzgjz.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46733b(zzgpw zzgpw) throws zzgrq {
        return zzgjw.m52113I(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final String mo46734c() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46735d(zzgso zzgso) throws GeneralSecurityException {
        zzgjw zzgjw = (zzgjw) zzgso;
        zzgoz.m52495b(zzgjw.mo46898F(), 0);
        if (zzgjw.mo46899J().mo47083m() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* renamed from: f */
    public final int mo46737f() {
        return 3;
    }
}
