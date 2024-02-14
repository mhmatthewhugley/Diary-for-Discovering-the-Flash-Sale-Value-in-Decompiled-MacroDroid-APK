package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgec extends zzggg {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final byte[] f36722e = new byte[0];

    zzgec() {
        super(zzgkn.class, zzgkq.class, new zzgea(zzgar.class));
    }

    /* renamed from: l */
    static /* bridge */ /* synthetic */ zzgfp m51750l(int i, int i2, int i3, zzgbd zzgbd, byte[] bArr, int i4) {
        zzgkg F = zzgkh.m52132F();
        zzgks F2 = zzgkt.m52184F();
        int i5 = 4;
        F2.mo46927o(4);
        F2.mo46928u(5);
        F2.mo46926n(zzgpw.m52564R(bArr));
        zzgkt zzgkt = (zzgkt) F2.mo47341h();
        zzgmb F3 = zzgmc.m52299F();
        F3.mo46974n(zzgbd.mo46682b());
        F3.mo46975o(zzgpw.m52564R(zzgbd.mo46683c()));
        int d = zzgbd.mo46684d() - 1;
        if (d == 0) {
            i5 = 3;
        } else if (d != 1) {
            i5 = d != 2 ? 6 : 5;
        }
        F3.mo46976u(i5);
        zzgkd F4 = zzgke.m52125F();
        F4.mo46902n((zzgmc) F3.mo47341h());
        zzgkj G = zzgkk.m52141G();
        G.mo46907o(zzgkt);
        G.mo46906n((zzgke) F4.mo47341h());
        G.mo46908u(i3);
        F.mo46904n((zzgkk) G.mo47341h());
        return new zzgfp((zzgkh) F.mo47341h(), i4);
    }

    /* renamed from: a */
    public final zzgfq mo46732a() {
        return new zzgeb(this, zzgkh.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46733b(zzgpw zzgpw) throws zzgrq {
        return zzgkn.m52156I(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final String mo46734c() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46735d(zzgso zzgso) throws GeneralSecurityException {
        zzgkn zzgkn = (zzgkn) zzgso;
        if (!zzgkn.mo46917K().mo47107h()) {
            zzgoz.m52495b(zzgkn.mo46915F(), 0);
            zzgel.m51765a(zzgkn.mo46916J().mo46923G());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    /* renamed from: f */
    public final int mo46737f() {
        return 4;
    }
}
