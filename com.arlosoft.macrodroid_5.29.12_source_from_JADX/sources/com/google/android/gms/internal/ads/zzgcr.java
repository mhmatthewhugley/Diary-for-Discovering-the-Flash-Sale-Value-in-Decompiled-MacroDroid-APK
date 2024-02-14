package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgcr extends zzgfq {

    /* renamed from: b */
    final /* synthetic */ zzgcs f36691b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgcr(zzgcs zzgcs, Class cls) {
        super(cls);
        this.f36691b = zzgcs;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzgso mo46728a(zzgso zzgso) throws GeneralSecurityException {
        zzgjj G = zzgjk.m52077G();
        G.mo46884n(zzgpw.m52564R(zzgox.m52491a(((zzgjn) zzgso).mo46889F())));
        G.mo46885o(0);
        return (zzgjk) G.mo47341h();
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46729b(zzgpw zzgpw) throws zzgrq {
        return zzgjn.m52088I(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final Map mo46730c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zzgcs.m51647l(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zzgcs.m51647l(16, 3));
        hashMap.put("AES256_GCM_SIV", zzgcs.m51647l(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zzgcs.m51647l(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo46731d(zzgso zzgso) throws GeneralSecurityException {
        zzgoz.m52494a(((zzgjn) zzgso).mo46889F());
    }
}
