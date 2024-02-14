package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzfb extends zzgb {

    /* renamed from: b */
    final /* synthetic */ zzfc f40033b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfb(zzfc zzfc, Class cls) {
        super(cls);
        this.f40033b = zzfc;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzaek mo49369a(zzaek zzaek) throws GeneralSecurityException {
        byte[] bArr;
        byte[] bArr2;
        zzne zzne = (zzne) zzaek;
        int H = zzne.mo49631F().mo49637H() - 2;
        if (H == 1) {
            bArr = zzqq.m57977a(32);
            bArr[0] = (byte) (bArr[0] | 7);
            byte b = bArr[31] & 63;
            bArr[31] = (byte) b;
            bArr[31] = (byte) (b | 128);
            bArr2 = zzqt.m57983b(bArr);
        } else if (H == 2 || H == 3 || H == 4) {
            int g = zzff.m57243g(zzne.mo49631F().mo49637H());
            KeyPair d = zzpx.m57933d(zzpx.m57941l(g));
            bArr2 = zzpx.m57942m(g, 1, ((ECPublicKey) d.getPublic()).getW());
            bArr = ((ECPrivateKey) d.getPrivate()).getS().toByteArray();
        } else {
            throw new GeneralSecurityException("Invalid KEM");
        }
        zznm E = zznn.m57764E();
        E.mo49647q(0);
        E.mo49645n(zzne.mo49631F());
        E.mo49646o(zzacc.m56159t(bArr2));
        zznj D = zznk.m57750D();
        D.mo49640q(0);
        D.mo49639o((zznn) E.mo49069f());
        D.mo49638n(zzacc.m56159t(bArr));
        return (zznk) D.mo49069f();
    }

    /* renamed from: b */
    public final /* synthetic */ zzaek mo49370b(zzacc zzacc) throws zzadn {
        return zzne.m57730E(zzacc, zzacs.m56379a());
    }

    /* renamed from: c */
    public final Map mo49371c() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzfc.m57225l(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzfc.m57225l(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzfc.m57225l(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzfc.m57225l(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzfc.m57225l(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzfc.m57225l(3, 3, 5, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzfc.m57225l(4, 3, 3, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzfc.m57225l(4, 3, 3, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzfc.m57225l(4, 3, 4, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzfc.m57225l(4, 3, 4, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zzfc.m57225l(5, 4, 3, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzfc.m57225l(5, 4, 3, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzfc.m57225l(5, 4, 4, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzfc.m57225l(5, 4, 4, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zzfc.m57225l(6, 5, 3, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzfc.m57225l(6, 5, 3, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzfc.m57225l(6, 5, 4, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzfc.m57225l(6, 5, 4, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo49372d(zzaek zzaek) throws GeneralSecurityException {
        zzff.m57237a(((zzne) zzaek).mo49631F());
    }
}
