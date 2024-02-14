package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzcr extends zzgb {

    /* renamed from: b */
    final /* synthetic */ zzcs f39963b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcr(zzcs zzcs, Class cls) {
        super(cls);
        this.f39963b = zzcs;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzaek mo49369a(zzaek zzaek) throws GeneralSecurityException {
        zzkt D = zzku.m57545D();
        D.mo49560n(zzacc.m56159t(zzqq.m57977a(((zzkx) zzaek).mo49565C())));
        D.mo49561o(0);
        return (zzku) D.mo49069f();
    }

    /* renamed from: b */
    public final /* synthetic */ zzaek mo49370b(zzacc zzacc) throws zzadn {
        return zzkx.m57556F(zzacc, zzacs.m56379a());
    }

    /* renamed from: c */
    public final Map mo49371c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzcs.m57067k(16, 1));
        hashMap.put("AES128_GCM_RAW", zzcs.m57067k(16, 3));
        hashMap.put("AES256_GCM", zzcs.m57067k(32, 1));
        hashMap.put("AES256_GCM_RAW", zzcs.m57067k(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo49372d(zzaek zzaek) throws GeneralSecurityException {
        zzqs.m57980b(((zzkx) zzaek).mo49565C());
    }
}
