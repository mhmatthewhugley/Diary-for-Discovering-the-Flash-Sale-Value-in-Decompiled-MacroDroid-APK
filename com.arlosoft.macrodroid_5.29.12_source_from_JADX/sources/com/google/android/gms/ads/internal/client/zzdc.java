package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzdc extends zzarz implements zzde {
    zzdc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    /* renamed from: V9 */
    public final void mo19991V9(zzs zzs) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzs);
        mo41865A1(1, y);
    }
}
