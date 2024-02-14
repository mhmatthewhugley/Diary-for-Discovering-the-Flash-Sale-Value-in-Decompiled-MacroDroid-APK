package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zziy */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zziy implements zzbv {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f40199a = Logger.getLogger(zziy.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final byte[] f40200b = {0};

    zziy() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo49363a(zzbu zzbu) throws GeneralSecurityException {
        for (List it : zzbu.mo49360d()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    zzbq zzbq = (zzbq) it2.next();
                    if (zzbq.mo49347b() instanceof zziu) {
                        zziu zziu = (zziu) zzbq.mo49347b();
                        zzqv b = zzqv.m57986b(zzbq.mo49351f());
                        if (!b.equals(zziu.mo49465c())) {
                            String valueOf = String.valueOf(zziu.mo49464b());
                            String obj = zziu.mo49465c().toString();
                            String obj2 = b.toString();
                            throw new GeneralSecurityException("Mac Key with parameters " + valueOf + " has wrong output prefix (" + obj + ") instead of (" + obj2 + ")");
                        }
                    }
                }
            }
        }
        return new zzix(zzbu, (zziw) null);
    }

    public final Class zza() {
        return zzbm.class;
    }

    public final Class zzb() {
        return zzbm.class;
    }
}
