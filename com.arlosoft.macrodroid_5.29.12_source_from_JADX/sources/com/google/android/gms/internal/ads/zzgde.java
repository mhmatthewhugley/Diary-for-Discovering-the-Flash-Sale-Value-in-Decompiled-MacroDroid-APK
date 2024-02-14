package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgde extends zzgfq {

    /* renamed from: b */
    final /* synthetic */ zzgdf f36698b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgde(zzgdf zzgdf, Class cls) {
        super(cls);
        this.f36698b = zzgdf;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzgso mo46728a(zzgso zzgso) throws GeneralSecurityException {
        zzgnm zzgnm = (zzgnm) zzgso;
        zzgni G = zzgnj.m52403G();
        G.mo47021o(0);
        G.mo47020n(zzgpw.m52564R(zzgox.m52491a(32)));
        return (zzgnj) G.mo47341h();
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46729b(zzgpw zzgpw) throws zzgrq {
        return zzgnm.m52413H(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final Map mo46730c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new zzgfp(zzgnm.m52412G(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new zzgfp(zzgnm.m52412G(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46731d(zzgso zzgso) throws GeneralSecurityException {
        zzgnm zzgnm = (zzgnm) zzgso;
    }
}
