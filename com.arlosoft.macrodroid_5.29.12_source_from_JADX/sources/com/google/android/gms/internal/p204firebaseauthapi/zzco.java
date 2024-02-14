package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzco */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzco extends zzgb {

    /* renamed from: b */
    final /* synthetic */ zzcp f39962b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzco(zzcp zzcp, Class cls) {
        super(cls);
        this.f39962b = zzcp;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzaek mo49369a(zzaek zzaek) throws GeneralSecurityException {
        zzko zzko = (zzko) zzaek;
        zzkk D = zzkl.m57516D();
        D.mo49548n(zzacc.m56159t(zzqq.m57977a(zzko.mo49556C())));
        D.mo49549o(zzko.mo49557G());
        D.mo49550q(0);
        return (zzkl) D.mo49069f();
    }

    /* renamed from: b */
    public final /* synthetic */ zzaek mo49370b(zzacc zzacc) throws zzadn {
        return zzko.m57530F(zzacc, zzacs.m56379a());
    }

    /* renamed from: c */
    public final Map mo49371c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzcp.m57056k(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzcp.m57056k(16, 16, 3));
        hashMap.put("AES256_EAX", zzcp.m57056k(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzcp.m57056k(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo49372d(zzaek zzaek) throws GeneralSecurityException {
        zzko zzko = (zzko) zzaek;
        zzqs.m57980b(zzko.mo49556C());
        if (zzko.mo49557G().mo49559C() != 12 && zzko.mo49557G().mo49559C() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
