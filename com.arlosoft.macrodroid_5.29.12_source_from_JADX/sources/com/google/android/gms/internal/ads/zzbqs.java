package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbqs extends zzarz implements zzbqu {
    zzbqs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    /* renamed from: W */
    public final void mo42916W(String str) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        mo41865A1(1, y);
    }
}
