package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzel implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzen f1959a;

    zzel(zzen zzen) {
        this.f1959a = zzen;
    }

    public final void run() {
        zzeo zzeo = this.f1959a.f1960a;
        if (zzeo.f1961a != null) {
            try {
                zzeo.f1961a.mo19893A(1);
            } catch (RemoteException e) {
                zzcgp.m45230h("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
