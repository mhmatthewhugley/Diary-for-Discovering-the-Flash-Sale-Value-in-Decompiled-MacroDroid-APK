package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgfa extends zzggg {
    public zzgfa() {
        super(zzglr.class, zzglu.class, new zzgey(zzgar.class));
    }

    /* renamed from: k */
    static /* bridge */ /* synthetic */ zzgfp m51801k(int i, int i2, int i3, int i4) {
        zzgln F = zzglo.m52243F();
        F.mo46950u(i);
        F.mo46949o(i2);
        F.mo46948n(i3);
        zzglk F2 = zzgll.m52234F();
        F2.mo46946n((zzglo) F.mo47341h());
        return new zzgfp((zzgll) F2.mo47341h(), i4);
    }

    /* renamed from: a */
    public final zzgfq mo46732a() {
        return new zzgez(this, zzgll.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46733b(zzgpw zzgpw) throws zzgrq {
        return zzglr.m52258I(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final String mo46734c() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46735d(zzgso zzgso) throws GeneralSecurityException {
        zzglr zzglr = (zzglr) zzgso;
        if (zzglr.mo46959K().mo47107h()) {
            throw new GeneralSecurityException("Private key is empty.");
        } else if (zzglr.mo46960O()) {
            zzgoz.m52495b(zzglr.mo46957F(), 0);
            zzgfd.m51812a(zzglr.mo46958J().mo46965G());
        } else {
            throw new GeneralSecurityException("Missing public key.");
        }
    }

    /* renamed from: f */
    public final int mo46737f() {
        return 4;
    }
}
