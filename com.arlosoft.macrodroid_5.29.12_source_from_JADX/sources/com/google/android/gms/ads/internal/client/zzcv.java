package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcv implements MuteThisAdReason {

    /* renamed from: a */
    private final String f1870a;

    /* renamed from: b */
    private final zzcu f1871b;

    public zzcv(zzcu zzcu) {
        String str;
        this.f1871b = zzcu;
        try {
            str = zzcu.mo19984b();
        } catch (RemoteException e) {
            zzcgp.m45227e("", e);
            str = null;
        }
        this.f1870a = str;
    }

    public final String toString() {
        return this.f1870a;
    }
}
