package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzig */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzig extends zzgb {

    /* renamed from: b */
    final /* synthetic */ zzih f40163b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzig(zzih zzih, Class cls) {
        super(cls);
        this.f40163b = zzih;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzaek mo49369a(zzaek zzaek) throws GeneralSecurityException {
        zzmw zzmw = (zzmw) zzaek;
        zzms D = zzmt.m57694D();
        D.mo49618q(0);
        D.mo49617o(zzmw.mo49625H());
        D.mo49616n(zzacc.m56159t(zzqq.m57977a(zzmw.mo49624C())));
        return (zzmt) D.mo49069f();
    }

    /* renamed from: b */
    public final /* synthetic */ zzaek mo49370b(zzacc zzacc) throws zzadn {
        return zzmw.m57710G(zzacc, zzacs.m56379a());
    }

    /* renamed from: c */
    public final Map mo49371c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzih.m57390m(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzih.m57390m(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", zzih.m57390m(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzih.m57390m(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", zzih.m57390m(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzih.m57390m(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", zzih.m57390m(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzih.m57390m(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", zzih.m57390m(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzih.m57390m(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo49372d(zzaek zzaek) throws GeneralSecurityException {
        zzmw zzmw = (zzmw) zzaek;
        if (zzmw.mo49624C() >= 16) {
            zzih.m57391n(zzmw.mo49625H());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
