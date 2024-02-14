package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgcl extends zzgfq {

    /* renamed from: b */
    final /* synthetic */ zzgcm f36689b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgcl(zzgcm zzgcm, Class cls) {
        super(cls);
        this.f36689b = zzgcm;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzgso mo46728a(zzgso zzgso) throws GeneralSecurityException {
        zzgiy zzgiy = (zzgiy) zzgso;
        zzgiu G = zzgiv.m52013G();
        G.mo46859n(zzgpw.m52564R(zzgox.m52491a(zzgiy.mo46867F())));
        G.mo46860o(zzgiy.mo46868J());
        G.mo46861u(0);
        return (zzgiv) G.mo47341h();
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46729b(zzgpw zzgpw) throws zzgrq {
        return zzgiy.m52027I(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final Map mo46730c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzgcm.m51623k(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzgcm.m51623k(16, 16, 3));
        hashMap.put("AES256_EAX", zzgcm.m51623k(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzgcm.m51623k(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46731d(zzgso zzgso) throws GeneralSecurityException {
        zzgiy zzgiy = (zzgiy) zzgso;
        zzgoz.m52494a(zzgiy.mo46867F());
        if (zzgiy.mo46868J().mo46877F() != 12 && zzgiy.mo46868J().mo46877F() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
