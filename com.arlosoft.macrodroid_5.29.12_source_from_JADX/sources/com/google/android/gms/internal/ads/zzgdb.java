package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgdb extends zzgfq {

    /* renamed from: b */
    final /* synthetic */ zzgdc f36697b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgdb(zzgdc zzgdc, Class cls) {
        super(cls);
        this.f36697b = zzgdc;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzgso mo46728a(zzgso zzgso) throws GeneralSecurityException {
        zzgmx G = zzgmy.m52380G();
        G.mo47011n((zzgnb) zzgso);
        G.mo47012o(0);
        return (zzgmy) G.mo47341h();
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46729b(zzgpw zzgpw) throws zzgrq {
        return zzgnb.m52390I(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46731d(zzgso zzgso) throws GeneralSecurityException {
        zzgnb zzgnb = (zzgnb) zzgso;
        if (zzgnb.mo47017J().isEmpty() || !zzgnb.mo47018K()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
