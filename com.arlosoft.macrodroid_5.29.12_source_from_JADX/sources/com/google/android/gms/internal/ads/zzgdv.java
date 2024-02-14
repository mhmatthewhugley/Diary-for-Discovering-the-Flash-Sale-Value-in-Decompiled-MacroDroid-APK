package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgdv extends zzgfq {

    /* renamed from: b */
    final /* synthetic */ zzgdw f36711b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgdv(zzgdw zzgdw, Class cls) {
        super(cls);
        this.f36711b = zzgdw;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzgso mo46728a(zzgso zzgso) throws GeneralSecurityException {
        zzgjp G = zzgjq.m52094G();
        G.mo46890n(zzgpw.m52564R(zzgox.m52491a(((zzgjt) zzgso).mo46895F())));
        G.mo46891o(0);
        return (zzgjq) G.mo47341h();
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46729b(zzgpw zzgpw) throws zzgrq {
        return zzgjt.m52105I(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final Map mo46730c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzgjs G = zzgjt.m52103G();
        G.mo46894n(64);
        hashMap.put("AES256_SIV", new zzgfp((zzgjt) G.mo47341h(), 1));
        zzgjs G2 = zzgjt.m52103G();
        G2.mo46894n(64);
        hashMap.put("AES256_SIV_RAW", new zzgfp((zzgjt) G2.mo47341h(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46731d(zzgso zzgso) throws GeneralSecurityException {
        zzgjt zzgjt = (zzgjt) zzgso;
        if (zzgjt.mo46895F() != 64) {
            int F = zzgjt.mo46895F();
            throw new InvalidAlgorithmParameterException("invalid key size: " + F + ". Valid keys must have 64 bytes.");
        }
    }
}
