package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzghc extends zzgfq {

    /* renamed from: b */
    final /* synthetic */ zzghd f36837b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzghc(zzghd zzghd, Class cls) {
        super(cls);
        this.f36837b = zzghd;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzgso mo46728a(zzgso zzgso) throws GeneralSecurityException {
        zzgld zzgld = (zzgld) zzgso;
        zzgkz G = zzgla.m52200G();
        G.mo46934u(0);
        G.mo46933o(zzgld.mo46941K());
        G.mo46932n(zzgpw.m52564R(zzgox.m52491a(zzgld.mo46940F())));
        return (zzgla) G.mo47341h();
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46729b(zzgpw zzgpw) throws zzgrq {
        return zzgld.m52216J(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final Map mo46730c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzghd.m51897m(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzghd.m51897m(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", zzghd.m51897m(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzghd.m51897m(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", zzghd.m51897m(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzghd.m51897m(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", zzghd.m51897m(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzghd.m51897m(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", zzghd.m51897m(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzghd.m51897m(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46731d(zzgso zzgso) throws GeneralSecurityException {
        zzgld zzgld = (zzgld) zzgso;
        if (zzgld.mo46940F() >= 16) {
            zzghd.m51898n(zzgld.mo46941K());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
