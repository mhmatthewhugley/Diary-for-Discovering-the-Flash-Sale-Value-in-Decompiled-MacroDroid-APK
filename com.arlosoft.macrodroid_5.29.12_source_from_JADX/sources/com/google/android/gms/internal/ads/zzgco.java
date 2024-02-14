package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgco extends zzgfq {

    /* renamed from: b */
    final /* synthetic */ zzgcp f36690b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgco(zzgcp zzgcp, Class cls) {
        super(cls);
        this.f36690b = zzgcp;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzgso mo46728a(zzgso zzgso) throws GeneralSecurityException {
        zzgjd G = zzgje.m52060G();
        G.mo46878n(zzgpw.m52564R(zzgox.m52491a(((zzgjh) zzgso).mo46883F())));
        G.mo46879o(0);
        return (zzgje) G.mo47341h();
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46729b(zzgpw zzgpw) throws zzgrq {
        return zzgjh.m52071I(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final Map mo46730c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzgcp.m51634k(16, 1));
        hashMap.put("AES128_GCM_RAW", zzgcp.m51634k(16, 3));
        hashMap.put("AES256_GCM", zzgcp.m51634k(32, 1));
        hashMap.put("AES256_GCM_RAW", zzgcp.m51634k(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo46731d(zzgso zzgso) throws GeneralSecurityException {
        zzgoz.m52494a(((zzgjh) zzgso).mo46883F());
    }
}
