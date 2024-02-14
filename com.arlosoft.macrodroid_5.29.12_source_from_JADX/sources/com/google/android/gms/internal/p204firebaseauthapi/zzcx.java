package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcx */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzcx extends zzgb {

    /* renamed from: b */
    final /* synthetic */ zzcy f39965b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcx(zzcy zzcy, Class cls) {
        super(cls);
        this.f39965b = zzcy;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzaek mo49369a(zzaek zzaek) throws GeneralSecurityException {
        zzlp zzlp = (zzlp) zzaek;
        zzll D = zzlm.m57596D();
        D.mo49580o(0);
        D.mo49579n(zzacc.m56159t(zzqq.m57977a(32)));
        return (zzlm) D.mo49069f();
    }

    /* renamed from: b */
    public final /* synthetic */ zzaek mo49370b(zzacc zzacc) throws zzadn {
        return zzlp.m57606E(zzacc, zzacs.m56379a());
    }

    /* renamed from: c */
    public final Map mo49371c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new zzga(zzlp.m57605D(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new zzga(zzlp.m57605D(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo49372d(zzaek zzaek) throws GeneralSecurityException {
        zzlp zzlp = (zzlp) zzaek;
    }
}
