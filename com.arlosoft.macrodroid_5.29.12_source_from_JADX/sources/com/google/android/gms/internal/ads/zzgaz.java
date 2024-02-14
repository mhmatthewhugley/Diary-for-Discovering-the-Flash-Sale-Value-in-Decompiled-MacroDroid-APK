package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgaz implements zzgba {

    /* renamed from: a */
    final /* synthetic */ zzggg f36628a;

    /* renamed from: b */
    final /* synthetic */ zzgfr f36629b;

    zzgaz(zzggg zzggg, zzgfr zzgfr) {
        this.f36628a = zzggg;
        this.f36629b = zzgfr;
    }

    /* renamed from: a */
    public final Class mo46669a() {
        return this.f36628a.getClass();
    }

    /* renamed from: b */
    public final Set mo46670b() {
        return this.f36628a.mo46780j();
    }

    /* renamed from: c */
    public final zzgau mo46671c(Class cls) throws GeneralSecurityException {
        try {
            return new zzgbw(this.f36628a, this.f36629b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: d */
    public final Class mo46672d() {
        return this.f36629b.getClass();
    }

    public final zzgau zzb() {
        zzggg zzggg = this.f36628a;
        return new zzgbw(zzggg, this.f36629b, zzggg.mo46777g());
    }
}
