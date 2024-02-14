package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgbg {

    /* renamed from: a */
    private final zzgmh f36647a;

    private zzgbg(zzgmh zzgmh) {
        this.f36647a = zzgmh;
    }

    /* renamed from: d */
    public static zzgbg m51530d() {
        return new zzgbg(zzgmk.m52335H());
    }

    /* renamed from: e */
    private final synchronized int m51531e() {
        int a;
        a = zzggq.m51874a();
        while (m51533g(a)) {
            a = zzggq.m51874a();
        }
        return a;
    }

    /* renamed from: f */
    private final synchronized zzgmj m51532f(zzgmc zzgmc) throws GeneralSecurityException {
        return m51534h(zzgby.m51562c(zzgmc), zzgmc.mo46979M());
    }

    /* renamed from: g */
    private final synchronized boolean m51533g(int i) {
        boolean z;
        Iterator it = this.f36647a.mo46987u().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((zzgmj) it.next()).mo46992F() == i) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    /* renamed from: h */
    private final synchronized zzgmj m51534h(zzglx zzglx, int i) throws GeneralSecurityException {
        zzgmi H;
        int e = m51531e();
        if (i != 2) {
            H = zzgmj.m52323H();
            H.mo46988n(zzglx);
            H.mo46989o(e);
            H.mo46991v(3);
            H.mo46990u(i);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (zzgmj) H.mo47341h();
    }

    @Deprecated
    /* renamed from: a */
    public final synchronized int mo46688a(zzgmc zzgmc, boolean z) throws GeneralSecurityException {
        zzgmj f;
        f = m51532f(zzgmc);
        this.f36647a.mo46985n(f);
        this.f36647a.mo46986o(f.mo46992F());
        return f.mo46992F();
    }

    /* renamed from: b */
    public final synchronized zzgbf mo46689b() throws GeneralSecurityException {
        return zzgbf.m51526a((zzgmk) this.f36647a.mo47341h());
    }

    @Deprecated
    /* renamed from: c */
    public final synchronized zzgbg mo46690c(zzgmc zzgmc) throws GeneralSecurityException {
        mo46688a(zzgmc, true);
        return this;
    }
}
