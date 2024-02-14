package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgbf {

    /* renamed from: a */
    private final zzgmk f36645a;

    /* renamed from: b */
    private final zzghm f36646b = zzghm.f36847b;

    private zzgbf(zzgmk zzgmk) {
        this.f36645a = zzgmk;
    }

    /* renamed from: a */
    static final zzgbf m51526a(zzgmk zzgmk) throws GeneralSecurityException {
        if (zzgmk != null && zzgmk.mo46997F() > 0) {
            return new zzgbf(zzgmk);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* renamed from: b */
    public static final zzgbf m51527b(zzgbd zzgbd) throws GeneralSecurityException {
        zzgbg d = zzgbg.m51530d();
        d.mo46690c(zzgbd.mo46681a());
        return d.mo46689b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final zzgmk mo46685c() {
        return this.f36645a;
    }

    /* renamed from: d */
    public final Object mo46686d(Class cls) throws GeneralSecurityException {
        Class e = zzgby.m51564e(cls);
        if (e != null) {
            zzgbz.m51578b(this.f36645a);
            zzgbn zzgbn = new zzgbn(e, (zzgbm) null);
            zzgbn.mo46697c(this.f36646b);
            for (zzgmj zzgmj : this.f36645a.mo46999L()) {
                if (zzgmj.mo46995M() == 3) {
                    Object f = zzgby.m51565f(zzgmj.mo46993G(), e);
                    if (zzgmj.mo46992F() == this.f36645a.mo46998G()) {
                        zzgbn.mo46695a(f, zzgmj);
                    } else {
                        zzgbn.mo46696b(f, zzgmj);
                    }
                }
            }
            return zzgby.m51569j(zzgbn.mo46698d(), cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    public final String toString() {
        return zzgbz.m51577a(this.f36645a).toString();
    }
}
