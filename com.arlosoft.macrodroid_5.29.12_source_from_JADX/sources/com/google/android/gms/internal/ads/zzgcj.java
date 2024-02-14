package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgcj extends zzgfr {
    zzgcj() {
        super(zzgim.class, new zzgch(zzgor.class));
    }

    /* renamed from: l */
    public static final void m51611l(zzgim zzgim) throws GeneralSecurityException {
        zzgoz.m52495b(zzgim.mo46850F(), 0);
        zzgoz.m52494a(zzgim.mo46852L().mo47083m());
        m51612m(zzgim.mo46851K());
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m51612m(zzgis zzgis) throws GeneralSecurityException {
        if (zzgis.mo46858F() < 12 || zzgis.mo46858F() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* renamed from: a */
    public final zzgfq mo46732a() {
        return new zzgci(this, zzgip.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46733b(zzgpw zzgpw) throws zzgrq {
        return zzgim.m51984J(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final String mo46734c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46735d(zzgso zzgso) throws GeneralSecurityException {
        m51611l((zzgim) zzgso);
    }

    /* renamed from: f */
    public final int mo46737f() {
        return 3;
    }
}
