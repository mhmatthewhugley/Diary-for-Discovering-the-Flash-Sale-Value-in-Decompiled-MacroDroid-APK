package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzghd extends zzgfr {
    public zzghd() {
        super(zzgla.class, new zzghb(zzgbj.class));
    }

    /* renamed from: l */
    public static final void m51896l(zzgla zzgla) throws GeneralSecurityException {
        zzgoz.m52495b(zzgla.mo46935F(), 0);
        if (zzgla.mo46937L().mo47083m() >= 16) {
            m51898n(zzgla.mo46936K());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ zzgfp m51897m(int i, int i2, int i3, int i4) {
        zzglc G = zzgld.m52213G();
        zzglf G2 = zzglg.m52224G();
        G2.mo46943o(i3);
        G2.mo46942n(i2);
        G.mo46939o((zzglg) G2.mo47341h());
        G.mo46938n(i);
        return new zzgfp((zzgld) G.mo47341h(), i4);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m51898n(zzglg zzglg) throws GeneralSecurityException {
        if (zzglg.mo46944F() >= 10) {
            int K = zzglg.mo46945K() - 2;
            if (K != 1) {
                if (K != 2) {
                    if (K != 3) {
                        if (K != 4) {
                            if (K != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (zzglg.mo46944F() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (zzglg.mo46944F() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (zzglg.mo46944F() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (zzglg.mo46944F() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (zzglg.mo46944F() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* renamed from: a */
    public final zzgfq mo46732a() {
        return new zzghc(this, zzgld.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46733b(zzgpw zzgpw) throws zzgrq {
        return zzgla.m52203J(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final String mo46734c() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46735d(zzgso zzgso) throws GeneralSecurityException {
        m51896l((zzgla) zzgso);
    }

    /* renamed from: e */
    public final int mo46736e() {
        return 2;
    }

    /* renamed from: f */
    public final int mo46737f() {
        return 3;
    }
}
