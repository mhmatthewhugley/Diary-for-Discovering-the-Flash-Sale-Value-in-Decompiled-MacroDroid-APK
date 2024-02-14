package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzep implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzeq f1962a;

    zzep(zzeq zzeq) {
        this.f1962a = zzeq;
    }

    public final void run() {
        zzeq zzeq = this.f1962a;
        if (zzeq.f1963a != null) {
            try {
                zzeq.f1963a.mo19893A(1);
            } catch (RemoteException e) {
                zzcgp.m45230h("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
