package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgax implements zzgba {

    /* renamed from: a */
    final /* synthetic */ zzgau f36626a;

    zzgax(zzgau zzgau) {
        this.f36626a = zzgau;
    }

    /* renamed from: a */
    public final Class mo46669a() {
        return this.f36626a.getClass();
    }

    /* renamed from: b */
    public final Set mo46670b() {
        return Collections.singleton(this.f36626a.mo46662a());
    }

    /* renamed from: c */
    public final zzgau mo46671c(Class cls) throws GeneralSecurityException {
        if (this.f36626a.mo46662a().equals(cls)) {
            return this.f36626a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    /* renamed from: d */
    public final Class mo46672d() {
        return null;
    }

    public final zzgau zzb() {
        return this.f36626a;
    }
}
