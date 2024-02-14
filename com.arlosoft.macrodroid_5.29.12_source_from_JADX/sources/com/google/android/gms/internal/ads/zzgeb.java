package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgeb extends zzgfq {

    /* renamed from: b */
    final /* synthetic */ zzgec f36721b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgeb(zzgec zzgec, Class cls) {
        super(cls);
        this.f36721b = zzgec;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzgso mo46728a(zzgso zzgso) throws GeneralSecurityException {
        zzgkh zzgkh = (zzgkh) zzgso;
        KeyPair c = zzgoe.m52446c(zzgoe.m52454k(zzgel.m51767c(zzgkh.mo46905I().mo46910J().mo46930K())));
        ECPoint w = ((ECPublicKey) c.getPublic()).getW();
        zzgkp H = zzgkq.m52168H();
        H.mo46919o(0);
        H.mo46918n(zzgkh.mo46905I());
        H.mo46920u(zzgpw.m52564R(w.getAffineX().toByteArray()));
        H.mo46921v(zzgpw.m52564R(w.getAffineY().toByteArray()));
        zzgkm G = zzgkn.m52154G();
        G.mo46914u(0);
        G.mo46913o((zzgkq) H.mo47341h());
        G.mo46912n(zzgpw.m52564R(((ECPrivateKey) c.getPrivate()).getS().toByteArray()));
        return (zzgkn) G.mo47341h();
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46729b(zzgpw zzgpw) throws zzgrq {
        return zzgkh.m52134H(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final Map mo46730c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzgec.m51750l(4, 5, 3, zzgbe.m51525a("AES128_GCM"), zzgec.f36722e, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzgec.m51750l(4, 5, 3, zzgbe.m51525a("AES128_GCM"), zzgec.f36722e, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzgec.m51750l(4, 5, 4, zzgbe.m51525a("AES128_GCM"), zzgec.f36722e, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzgec.m51750l(4, 5, 4, zzgbe.m51525a("AES128_GCM"), zzgec.f36722e, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzgec.m51750l(4, 5, 4, zzgbe.m51525a("AES128_GCM"), zzgec.f36722e, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzgec.m51750l(4, 5, 3, zzgbe.m51525a("AES128_CTR_HMAC_SHA256"), zzgec.f36722e, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzgec.m51750l(4, 5, 3, zzgbe.m51525a("AES128_CTR_HMAC_SHA256"), zzgec.f36722e, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzgec.m51750l(4, 5, 4, zzgbe.m51525a("AES128_CTR_HMAC_SHA256"), zzgec.f36722e, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzgec.m51750l(4, 5, 4, zzgbe.m51525a("AES128_CTR_HMAC_SHA256"), zzgec.f36722e, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo46731d(zzgso zzgso) throws GeneralSecurityException {
        zzgel.m51765a(((zzgkh) zzgso).mo46905I());
    }
}
