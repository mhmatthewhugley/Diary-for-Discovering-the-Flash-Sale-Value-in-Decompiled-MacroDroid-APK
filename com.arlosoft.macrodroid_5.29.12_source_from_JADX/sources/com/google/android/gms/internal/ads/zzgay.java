package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgay implements zzgba {

    /* renamed from: a */
    final /* synthetic */ zzgfr f36627a;

    zzgay(zzgfr zzgfr) {
        this.f36627a = zzgfr;
    }

    /* renamed from: a */
    public final Class mo46669a() {
        return this.f36627a.getClass();
    }

    /* renamed from: b */
    public final Set mo46670b() {
        return this.f36627a.mo46780j();
    }

    /* renamed from: c */
    public final zzgau mo46671c(Class cls) throws GeneralSecurityException {
        try {
            return new zzgaw(this.f36627a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: d */
    public final Class mo46672d() {
        return null;
    }

    public final zzgau zzb() {
        zzgfr zzgfr = this.f36627a;
        return new zzgaw(zzgfr, zzgfr.mo46777g());
    }
}
