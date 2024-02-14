package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgbi {

    /* renamed from: a */
    private static final CopyOnWriteArrayList f36648a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static zzgbh m51538a(String str) throws GeneralSecurityException {
        Iterator it = f36648a.iterator();
        while (it.hasNext()) {
            zzgbh zzgbh = (zzgbh) it.next();
            if (zzgbh.zza()) {
                return zzgbh;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
