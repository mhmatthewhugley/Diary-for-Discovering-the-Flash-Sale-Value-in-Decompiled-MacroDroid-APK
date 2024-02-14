package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgfc extends zzgfr {
    public zzgfc() {
        super(zzglu.class, new zzgfb(zzgas.class));
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46733b(zzgpw zzgpw) throws zzgrq {
        return zzglu.m52273K(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final String mo46734c() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46735d(zzgso zzgso) throws GeneralSecurityException {
        zzglu zzglu = (zzglu) zzgso;
        zzgoz.m52495b(zzglu.mo46964F(), 0);
        if (zzglu.mo46967P()) {
            zzgfd.m51812a(zzglu.mo46965G());
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }

    /* renamed from: f */
    public final int mo46737f() {
        return 5;
    }
}
