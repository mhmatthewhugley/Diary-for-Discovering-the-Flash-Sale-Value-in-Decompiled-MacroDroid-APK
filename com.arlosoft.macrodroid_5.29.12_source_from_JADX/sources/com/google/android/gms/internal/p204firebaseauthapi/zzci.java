package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzci */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzci extends zzgb {

    /* renamed from: b */
    final /* synthetic */ zzcj f39960b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzci(zzcj zzcj, Class cls) {
        super(cls);
        this.f39960b = zzcj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzaek mo49369a(zzaek zzaek) throws GeneralSecurityException {
        zzjz zzjz = (zzjz) zzaek;
        new zzcm();
        zzkc g = zzcl.m57038g(zzjz.mo49533F());
        zzaek a = new zzih().mo49373a().mo49369a(zzjz.mo49534G());
        zzjv D = zzjw.m57461D();
        D.mo49525n(g);
        D.mo49526o((zzmt) a);
        D.mo49527q(0);
        return (zzjw) D.mo49069f();
    }

    /* renamed from: b */
    public final /* synthetic */ zzaek mo49370b(zzacc zzacc) throws zzadn {
        return zzjz.m57475E(zzacc, zzacs.m56379a());
    }

    /* renamed from: c */
    public final Map mo49371c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzcj.m57030k(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzcj.m57030k(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", zzcj.m57030k(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzcj.m57030k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo49372d(zzaek zzaek) throws GeneralSecurityException {
        zzjz zzjz = (zzjz) zzaek;
        ((zzcl) new zzcm().mo49373a()).mo49372d(zzjz.mo49533F());
        new zzih().mo49373a().mo49372d(zzjz.mo49534G());
        zzqs.m57980b(zzjz.mo49533F().mo49544C());
    }
}
