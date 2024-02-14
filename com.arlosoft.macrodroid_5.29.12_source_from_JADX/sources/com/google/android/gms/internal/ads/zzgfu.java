package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgfu {

    /* renamed from: a */
    public static final zzghn f36802a = new zzgft((zzgfs) null);

    /* renamed from: a */
    public static zzght m51845a(zzgbu zzgbu) {
        zzgbc zzgbc;
        zzghp zzghp = new zzghp();
        zzghp.mo46811b(zzgbu.mo46711b());
        for (List it : zzgbu.mo46713d()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    zzgbo zzgbo = (zzgbo) it2.next();
                    int e = zzgbo.mo46703e() - 2;
                    if (e == 1) {
                        zzgbc = zzgbc.f36640b;
                    } else if (e == 2) {
                        zzgbc = zzgbc.f36641c;
                    } else if (e == 3) {
                        zzgbc = zzgbc.f36642d;
                    } else {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzghp.mo46810a(zzgbc, zzgbo.mo46699a(), zzgbo.mo46700b());
                }
            }
        }
        if (zzgbu.mo46710a() != null) {
            zzghp.mo46812c(zzgbu.mo46710a().mo46699a());
        }
        try {
            return zzghp.mo46813d();
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
