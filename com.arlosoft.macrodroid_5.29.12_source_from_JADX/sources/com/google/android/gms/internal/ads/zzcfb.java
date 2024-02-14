package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcfb extends zzarz implements zzcfd {
    zzcfb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    /* renamed from: F2 */
    public final void mo43234F2(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        y.writeString(str2);
        zzasb.m42227e(y, bundle);
        mo41865A1(3, y);
    }

    /* renamed from: t */
    public final void mo43235t(String str) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        mo41865A1(2, y);
    }
}
