package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzgj {

    /* renamed from: a */
    public static final zzjd f40094a = new zzgi((zzgh) null);

    /* renamed from: a */
    public static zzjj m57299a(zzbu zzbu) {
        zzbe zzbe;
        zzjf zzjf = new zzjf();
        zzjf.mo49502b(zzbu.mo49358b());
        for (List it : zzbu.mo49360d()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    zzbq zzbq = (zzbq) it2.next();
                    int g = zzbq.mo49352g() - 2;
                    if (g == 1) {
                        zzbe = zzbe.f39907b;
                    } else if (g == 2) {
                        zzbe = zzbe.f39908c;
                    } else if (g == 3) {
                        zzbe = zzbe.f39909d;
                    } else {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzjf.mo49501a(zzbe, zzbq.mo49346a(), zzbq.mo49348c());
                }
            }
        }
        if (zzbu.mo49357a() != null) {
            zzjf.mo49503c(zzbu.mo49357a().mo49346a());
        }
        try {
            return zzjf.mo49504d();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
