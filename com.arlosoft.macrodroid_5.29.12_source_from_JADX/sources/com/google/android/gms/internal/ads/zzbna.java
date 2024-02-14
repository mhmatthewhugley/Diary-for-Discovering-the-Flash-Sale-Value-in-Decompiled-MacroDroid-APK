package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbna extends zzarz implements zzbnc {
    zzbna(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    /* renamed from: K3 */
    public final void mo42820K3(zzbmt zzbmt) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzbmt);
        mo41865A1(1, y);
    }
}
