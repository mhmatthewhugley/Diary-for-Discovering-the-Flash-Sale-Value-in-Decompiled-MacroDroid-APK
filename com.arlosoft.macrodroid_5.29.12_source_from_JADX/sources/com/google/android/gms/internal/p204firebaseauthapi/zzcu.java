package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzcu extends zzgb {

    /* renamed from: b */
    final /* synthetic */ zzcv f39964b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcu(zzcv zzcv, Class cls) {
        super(cls);
        this.f39964b = zzcv;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzaek mo49369a(zzaek zzaek) throws GeneralSecurityException {
        zzkz D = zzla.m57562D();
        D.mo49566n(zzacc.m56159t(zzqq.m57977a(((zzld) zzaek).mo49572C())));
        D.mo49567o(0);
        return (zzla) D.mo49069f();
    }

    /* renamed from: b */
    public final /* synthetic */ zzaek mo49370b(zzacc zzacc) throws zzadn {
        return zzld.m57573F(zzacc, zzacs.m56379a());
    }

    /* renamed from: c */
    public final Map mo49371c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zzcv.m57080l(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zzcv.m57080l(16, 3));
        hashMap.put("AES256_GCM_SIV", zzcv.m57080l(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zzcv.m57080l(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo49372d(zzaek zzaek) throws GeneralSecurityException {
        zzqs.m57980b(((zzld) zzaek).mo49572C());
    }
}
