package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzggt extends zzgfq {
    zzggt(zzggu zzggu, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzgso mo46728a(zzgso zzgso) throws GeneralSecurityException {
        zzgia zzgia = (zzgia) zzgso;
        zzghw G = zzghx.m51923G();
        G.mo46824u(0);
        G.mo46822n(zzgpw.m52564R(zzgox.m52491a(zzgia.mo46833F())));
        G.mo46823o(zzgia.mo46834J());
        return (zzghx) G.mo47341h();
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46729b(zzgpw zzgpw) throws zzgrq {
        return zzgia.m51942I(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final Map mo46730c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzghz G = zzgia.m51940G();
        G.mo46828n(32);
        zzgic G2 = zzgid.m51949G();
        G2.mo46835n(16);
        G.mo46829o((zzgid) G2.mo47341h());
        hashMap.put("AES_CMAC", new zzgfp((zzgia) G.mo47341h(), 1));
        zzghz G3 = zzgia.m51940G();
        G3.mo46828n(32);
        zzgic G4 = zzgid.m51949G();
        G4.mo46835n(16);
        G3.mo46829o((zzgid) G4.mo47341h());
        hashMap.put("AES256_CMAC", new zzgfp((zzgia) G3.mo47341h(), 1));
        zzghz G5 = zzgia.m51940G();
        G5.mo46828n(32);
        zzgic G6 = zzgid.m51949G();
        G6.mo46835n(16);
        G5.mo46829o((zzgid) G6.mo47341h());
        hashMap.put("AES256_CMAC_RAW", new zzgfp((zzgia) G5.mo47341h(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46731d(zzgso zzgso) throws GeneralSecurityException {
        zzgia zzgia = (zzgia) zzgso;
        zzggu.m51882m(zzgia.mo46834J());
        zzggu.m51883n(zzgia.mo46833F());
    }
}
