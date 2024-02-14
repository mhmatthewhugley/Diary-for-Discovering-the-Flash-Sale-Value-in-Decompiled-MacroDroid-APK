package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbl {

    /* renamed from: a */
    private static final CopyOnWriteArrayList f39915a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static zzbk m56973a(String str) throws GeneralSecurityException {
        Iterator it = f39915a.iterator();
        while (it.hasNext()) {
            zzbk zzbk = (zzbk) it.next();
            if (zzbk.mo49340t(str)) {
                return zzbk;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
