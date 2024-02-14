package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbi */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbi {

    /* renamed from: a */
    private final zzoc f39914a;

    private zzbi(zzoc zzoc) {
        this.f39914a = zzoc;
    }

    /* renamed from: e */
    public static zzbi m56959e() {
        return new zzbi(zzof.m57827E());
    }

    /* renamed from: f */
    public static zzbi m56960f(zzbh zzbh) {
        return new zzbi((zzoc) zzbh.mo49329c().mo49089w());
    }

    /* renamed from: g */
    private final synchronized int m56961g() {
        int a;
        a = zzhj.m57342a();
        while (m56964j(a)) {
            a = zzhj.m57342a();
        }
        return a;
    }

    /* renamed from: h */
    private final synchronized zzoe m56962h(zzns zzns, zzoy zzoy) throws GeneralSecurityException {
        zzod E;
        int g = m56961g();
        if (zzoy != zzoy.UNKNOWN_PREFIX) {
            E = zzoe.m57815E();
            E.mo49671n(zzns);
            E.mo49672o(g);
            E.mo49674r(3);
            E.mo49673q(zzoy);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (zzoe) E.mo49069f();
    }

    /* renamed from: i */
    private final synchronized zzoe m56963i(zznx zznx) throws GeneralSecurityException {
        return m56962h(zzbz.m56998c(zznx), zznx.mo49663F());
    }

    /* renamed from: j */
    private final synchronized boolean m56964j(int i) {
        boolean z;
        Iterator it = this.f39914a.mo49670t().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((zzoe) it.next()).mo49675C() == i) {
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

    @Deprecated
    /* renamed from: a */
    public final synchronized int mo49335a(zznx zznx, boolean z) throws GeneralSecurityException {
        zzoe i;
        i = m56963i(zznx);
        this.f39914a.mo49667o(i);
        return i.mo49675C();
    }

    /* renamed from: b */
    public final synchronized zzbh mo49336b() throws GeneralSecurityException {
        return zzbh.m56950a((zzof) this.f39914a.mo49069f());
    }

    /* renamed from: c */
    public final synchronized zzbi mo49337c(zzbf zzbf) throws GeneralSecurityException {
        mo49335a(zzbf.mo49324a(), false);
        return this;
    }

    /* renamed from: d */
    public final synchronized zzbi mo49338d(int i) throws GeneralSecurityException {
        int i2 = 0;
        while (i2 < this.f39914a.mo49666n()) {
            zzoe r = this.f39914a.mo49669r(i2);
            if (r.mo49675C() != i) {
                i2++;
            } else if (r.mo49679L() == 3) {
                this.f39914a.mo49668q(i);
            } else {
                throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }
}
