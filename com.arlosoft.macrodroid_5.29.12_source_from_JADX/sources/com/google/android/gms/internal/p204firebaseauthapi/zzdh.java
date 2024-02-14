package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzdh extends zzgb {

    /* renamed from: b */
    final /* synthetic */ zzdi f39971b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdh(zzdi zzdi, Class cls) {
        super(cls);
        this.f39971b = zzdi;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzaek mo49369a(zzaek zzaek) throws GeneralSecurityException {
        zzph zzph = (zzph) zzaek;
        zzpd D = zzpe.m57895D();
        D.mo49707o(0);
        D.mo49706n(zzacc.m56159t(zzqq.m57977a(32)));
        return (zzpe) D.mo49069f();
    }

    /* renamed from: b */
    public final /* synthetic */ zzaek mo49370b(zzacc zzacc) throws zzadn {
        return zzph.m57905E(zzacc, zzacs.m56379a());
    }

    /* renamed from: c */
    public final Map mo49371c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new zzga(zzph.m57904D(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new zzga(zzph.m57904D(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo49372d(zzaek zzaek) throws GeneralSecurityException {
        zzph zzph = (zzph) zzaek;
    }
}
