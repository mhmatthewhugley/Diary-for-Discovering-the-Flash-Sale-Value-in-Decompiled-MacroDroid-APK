package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzee */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzee extends zzgb {

    /* renamed from: b */
    final /* synthetic */ zzef f39992b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzee(zzef zzef, Class cls) {
        super(cls);
        this.f39992b = zzef;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzaek mo49369a(zzaek zzaek) throws GeneralSecurityException {
        zzlx zzlx = (zzlx) zzaek;
        KeyPair d = zzpx.m57933d(zzpx.m57941l(zzeo.m57196c(zzlx.mo49586F().mo49591G().mo49611H())));
        ECPoint w = ((ECPublicKey) d.getPublic()).getW();
        zzmf E = zzmg.m57653E();
        E.mo49600o(0);
        E.mo49599n(zzlx.mo49586F());
        E.mo49601q(zzacc.m56159t(w.getAffineX().toByteArray()));
        E.mo49602r(zzacc.m56159t(w.getAffineY().toByteArray()));
        zzmc D = zzmd.m57639D();
        D.mo49595q(0);
        D.mo49594o((zzmg) E.mo49069f());
        D.mo49593n(zzacc.m56159t(((ECPrivateKey) d.getPrivate()).getS().toByteArray()));
        return (zzmd) D.mo49069f();
    }

    /* renamed from: b */
    public final /* synthetic */ zzaek mo49370b(zzacc zzacc) throws zzadn {
        return zzlx.m57619E(zzacc, zzacs.m56379a());
    }

    /* renamed from: c */
    public final Map mo49371c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzef.m57176m(4, 5, 3, zzbg.m56949a("AES128_GCM"), zzef.f39993e, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzef.m57176m(4, 5, 3, zzbg.m56949a("AES128_GCM"), zzef.f39993e, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzef.m57176m(4, 5, 4, zzbg.m56949a("AES128_GCM"), zzef.f39993e, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzef.m57176m(4, 5, 4, zzbg.m56949a("AES128_GCM"), zzef.f39993e, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzef.m57176m(4, 5, 4, zzbg.m56949a("AES128_GCM"), zzef.f39993e, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzef.m57176m(4, 5, 3, zzbg.m56949a("AES128_CTR_HMAC_SHA256"), zzef.f39993e, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzef.m57176m(4, 5, 3, zzbg.m56949a("AES128_CTR_HMAC_SHA256"), zzef.f39993e, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzef.m57176m(4, 5, 4, zzbg.m56949a("AES128_CTR_HMAC_SHA256"), zzef.f39993e, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzef.m57176m(4, 5, 4, zzbg.m56949a("AES128_CTR_HMAC_SHA256"), zzef.f39993e, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo49372d(zzaek zzaek) throws GeneralSecurityException {
        zzeo.m57194a(((zzlx) zzaek).mo49586F());
    }
}
