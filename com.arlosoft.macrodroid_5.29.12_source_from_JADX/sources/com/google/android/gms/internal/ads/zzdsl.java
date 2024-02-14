package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzdsl implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzdsn f32980a;

    public /* synthetic */ zzdsl(zzdsn zzdsn) {
        this.f32980a = zzdsn;
    }

    public final void run() {
        try {
            this.f32980a.mo42944d();
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }
}
