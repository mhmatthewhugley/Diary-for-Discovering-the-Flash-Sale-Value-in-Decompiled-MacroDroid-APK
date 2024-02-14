package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgdw extends zzgfr {
    zzgdw() {
        super(zzgjq.class, new zzgdu(zzgaq.class));
    }

    /* renamed from: a */
    public final zzgfq mo46732a() {
        return new zzgdv(this, zzgjt.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46733b(zzgpw zzgpw) throws zzgrq {
        return zzgjq.m52096I(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final String mo46734c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46735d(zzgso zzgso) throws GeneralSecurityException {
        zzgjq zzgjq = (zzgjq) zzgso;
        zzgoz.m52495b(zzgjq.mo46892F(), 0);
        if (zzgjq.mo46893J().mo47083m() != 64) {
            int m = zzgjq.mo46893J().mo47083m();
            throw new InvalidKeyException("invalid key size: " + m + ". Valid keys must have 64 bytes.");
        }
    }

    /* renamed from: f */
    public final int mo46737f() {
        return 3;
    }
}
