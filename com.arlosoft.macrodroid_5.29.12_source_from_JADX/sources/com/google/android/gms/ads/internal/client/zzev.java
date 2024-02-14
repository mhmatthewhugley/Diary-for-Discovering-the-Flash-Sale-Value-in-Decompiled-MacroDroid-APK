package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzccs;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zzev implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzccs f1966a;

    public /* synthetic */ zzev(zzccs zzccs) {
        this.f1966a = zzccs;
    }

    public final void run() {
        zzccs zzccs = this.f1966a;
        if (zzccs != null) {
            try {
                zzccs.mo43359A(1);
            } catch (RemoteException e) {
                zzcgp.m45231i("#007 Could not call remote method.", e);
            }
        }
    }
}
