package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbjv extends zzarz implements zzbjx {
    zzbjv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    /* renamed from: L7 */
    public final void mo42697L7(zzbju zzbju) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzbju);
        mo41865A1(1, y);
    }
}
