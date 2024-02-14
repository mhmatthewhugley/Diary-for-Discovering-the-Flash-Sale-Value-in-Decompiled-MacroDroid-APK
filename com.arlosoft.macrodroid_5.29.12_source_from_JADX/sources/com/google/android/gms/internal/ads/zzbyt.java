package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbyt extends zzarz implements zzbyv {
    zzbyt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    /* renamed from: B7 */
    public final void mo43226B7(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        y.writeString(str);
        y.writeString(str2);
        mo41865A1(2, y);
    }

    /* renamed from: F1 */
    public final void mo43227F1(Intent intent) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, intent);
        mo41865A1(1, y);
    }

    /* renamed from: c */
    public final void mo43228c() throws RemoteException {
        mo41865A1(3, mo41869y());
    }
}
