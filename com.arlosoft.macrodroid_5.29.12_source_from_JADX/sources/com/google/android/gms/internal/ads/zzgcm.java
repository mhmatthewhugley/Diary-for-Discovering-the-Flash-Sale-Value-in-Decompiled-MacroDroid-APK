package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgcm extends zzgfr {
    zzgcm() {
        super(zzgiv.class, new zzgck(zzgak.class));
    }

    /* renamed from: k */
    static /* bridge */ /* synthetic */ zzgfp m51623k(int i, int i2, int i3) {
        zzgix G = zzgiy.m52025G();
        G.mo46865n(i);
        zzgja G2 = zzgjb.m52052G();
        G2.mo46876n(16);
        G.mo46866o((zzgjb) G2.mo47341h());
        return new zzgfp((zzgiy) G.mo47341h(), i3);
    }

    /* renamed from: a */
    public final zzgfq mo46732a() {
        return new zzgcl(this, zzgiy.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46733b(zzgpw zzgpw) throws zzgrq {
        return zzgiv.m52015I(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final String mo46734c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46735d(zzgso zzgso) throws GeneralSecurityException {
        zzgiv zzgiv = (zzgiv) zzgso;
        zzgoz.m52495b(zzgiv.mo46862F(), 0);
        zzgoz.m52494a(zzgiv.mo46864K().mo47083m());
        if (zzgiv.mo46863J().mo46877F() != 12 && zzgiv.mo46863J().mo46877F() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    /* renamed from: f */
    public final int mo46737f() {
        return 3;
    }
}
