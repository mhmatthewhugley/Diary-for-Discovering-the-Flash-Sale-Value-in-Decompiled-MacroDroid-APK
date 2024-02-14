package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdy */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzdy extends zzgb {

    /* renamed from: b */
    final /* synthetic */ zzdz f39984b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdy(zzdz zzdz, Class cls) {
        super(cls);
        this.f39984b = zzdz;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzaek mo49369a(zzaek zzaek) throws GeneralSecurityException {
        zzlf D = zzlg.m57579D();
        D.mo49573n(zzacc.m56159t(zzqq.m57977a(((zzlj) zzaek).mo49578C())));
        D.mo49574o(0);
        return (zzlg) D.mo49069f();
    }

    /* renamed from: b */
    public final /* synthetic */ zzaek mo49370b(zzacc zzacc) throws zzadn {
        return zzlj.m57590F(zzacc, zzacs.m56379a());
    }

    /* renamed from: c */
    public final Map mo49371c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzli D = zzlj.m57588D();
        D.mo49577n(64);
        hashMap.put("AES256_SIV", new zzga((zzlj) D.mo49069f(), 1));
        zzli D2 = zzlj.m57588D();
        D2.mo49577n(64);
        hashMap.put("AES256_SIV_RAW", new zzga((zzlj) D2.mo49069f(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo49372d(zzaek zzaek) throws GeneralSecurityException {
        zzlj zzlj = (zzlj) zzaek;
        if (zzlj.mo49578C() != 64) {
            int C = zzlj.mo49578C();
            throw new InvalidAlgorithmParameterException("invalid key size: " + C + ". Valid keys must have 64 bytes.");
        }
    }
}
