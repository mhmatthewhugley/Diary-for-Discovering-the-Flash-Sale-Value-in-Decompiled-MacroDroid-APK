package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzhp extends zzgb {
    zzhp(zzhq zzhq, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzaek mo49369a(zzaek zzaek) throws GeneralSecurityException {
        zzjq zzjq = (zzjq) zzaek;
        zzjm D = zzjn.m57431D();
        D.mo49515q(0);
        D.mo49513n(zzacc.m56159t(zzqq.m57977a(zzjq.mo49521C())));
        D.mo49514o(zzjq.mo49522G());
        return (zzjn) D.mo49069f();
    }

    /* renamed from: b */
    public final /* synthetic */ zzaek mo49370b(zzacc zzacc) throws zzadn {
        return zzjq.m57445F(zzacc, zzacs.m56379a());
    }

    /* renamed from: c */
    public final Map mo49371c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzjp D = zzjq.m57443D();
        D.mo49519n(32);
        zzjs D2 = zzjt.m57452D();
        D2.mo49523n(16);
        D.mo49520o((zzjt) D2.mo49069f());
        hashMap.put("AES_CMAC", new zzga((zzjq) D.mo49069f(), 1));
        zzjp D3 = zzjq.m57443D();
        D3.mo49519n(32);
        zzjs D4 = zzjt.m57452D();
        D4.mo49523n(16);
        D3.mo49520o((zzjt) D4.mo49069f());
        hashMap.put("AES256_CMAC", new zzga((zzjq) D3.mo49069f(), 1));
        zzjp D5 = zzjq.m57443D();
        D5.mo49519n(32);
        zzjs D6 = zzjt.m57452D();
        D6.mo49523n(16);
        D5.mo49520o((zzjt) D6.mo49069f());
        hashMap.put("AES256_CMAC_RAW", new zzga((zzjq) D5.mo49069f(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo49372d(zzaek zzaek) throws GeneralSecurityException {
        zzjq zzjq = (zzjq) zzaek;
        zzhq.m57358m(zzjq.mo49522G());
        zzhq.m57359n(zzjq.mo49521C());
    }
}
