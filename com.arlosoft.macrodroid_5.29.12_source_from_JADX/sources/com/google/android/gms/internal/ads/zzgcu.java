package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgcu extends zzgfq {

    /* renamed from: b */
    final /* synthetic */ zzgcv f36692b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgcu(zzgcv zzgcv, Class cls) {
        super(cls);
        this.f36692b = zzgcv;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzgso mo46728a(zzgso zzgso) throws GeneralSecurityException {
        zzgjz zzgjz = (zzgjz) zzgso;
        zzgjv G = zzgjw.m52111G();
        G.mo46897o(0);
        G.mo46896n(zzgpw.m52564R(zzgox.m52491a(32)));
        return (zzgjw) G.mo47341h();
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46729b(zzgpw zzgpw) throws zzgrq {
        return zzgjz.m52121H(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final Map mo46730c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new zzgfp(zzgjz.m52120G(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new zzgfp(zzgjz.m52120G(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46731d(zzgso zzgso) throws GeneralSecurityException {
        zzgjz zzgjz = (zzgjz) zzgso;
    }
}
