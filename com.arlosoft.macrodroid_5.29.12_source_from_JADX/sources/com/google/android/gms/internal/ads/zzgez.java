package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgez extends zzgfq {

    /* renamed from: b */
    final /* synthetic */ zzgfa f36755b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgez(zzgfa zzgfa, Class cls) {
        super(cls);
        this.f36755b = zzgfa;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzgso mo46728a(zzgso zzgso) throws GeneralSecurityException {
        byte[] b = zzgpa.m52497b();
        byte[] c = zzgpa.m52498c(b);
        zzglt H = zzglu.m52270H();
        H.mo46963u(0);
        H.mo46961n(((zzgll) zzgso).mo46947I());
        H.mo46962o(zzgpw.m52564R(c));
        zzglq G = zzglr.m52256G();
        G.mo46956u(0);
        G.mo46955o((zzglu) H.mo47341h());
        G.mo46954n(zzgpw.m52564R(b));
        return (zzglr) G.mo47341h();
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46729b(zzgpw zzgpw) throws zzgrq {
        return zzgll.m52236H(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final Map mo46730c() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzgfa.m51801k(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzgfa.m51801k(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzgfa.m51801k(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzgfa.m51801k(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzgfa.m51801k(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzgfa.m51801k(3, 3, 5, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzgfa.m51801k(4, 3, 3, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzgfa.m51801k(4, 3, 3, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzgfa.m51801k(4, 3, 4, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzgfa.m51801k(4, 3, 4, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zzgfa.m51801k(5, 4, 3, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzgfa.m51801k(5, 4, 3, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzgfa.m51801k(5, 4, 4, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzgfa.m51801k(5, 4, 4, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zzgfa.m51801k(6, 5, 3, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzgfa.m51801k(6, 5, 3, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzgfa.m51801k(6, 5, 4, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzgfa.m51801k(6, 5, 4, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo46731d(zzgso zzgso) throws GeneralSecurityException {
        zzgfd.m51812a(((zzgll) zzgso).mo46947I());
    }
}
