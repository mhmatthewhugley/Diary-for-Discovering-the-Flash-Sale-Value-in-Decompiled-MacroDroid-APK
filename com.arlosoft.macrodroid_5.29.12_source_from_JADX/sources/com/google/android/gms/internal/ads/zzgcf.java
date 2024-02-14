package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgcf extends zzgfq {

    /* renamed from: b */
    final /* synthetic */ zzgcg f36687b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgcf(zzgcg zzgcg, Class cls) {
        super(cls);
        this.f36687b = zzgcg;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzgso mo46728a(zzgso zzgso) throws GeneralSecurityException {
        zzgij zzgij = (zzgij) zzgso;
        new zzgcj();
        zzgim g = zzgci.m51605g(zzgij.mo46845I());
        zzgso a = new zzghd().mo46732a().mo46728a(zzgij.mo46846J());
        zzgif G = zzgig.m51958G();
        G.mo46837n(g);
        G.mo46838o((zzgla) a);
        G.mo46839u(0);
        return (zzgig) G.mo47341h();
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46729b(zzgpw zzgpw) throws zzgrq {
        return zzgij.m51972H(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final Map mo46730c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzgcg.m51597k(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzgcg.m51597k(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", zzgcg.m51597k(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzgcg.m51597k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46731d(zzgso zzgso) throws GeneralSecurityException {
        zzgij zzgij = (zzgij) zzgso;
        ((zzgci) new zzgcj().mo46732a()).mo46731d(zzgij.mo46845I());
        new zzghd().mo46732a().mo46731d(zzgij.mo46846J());
        zzgoz.m52494a(zzgij.mo46845I().mo46855F());
    }
}
