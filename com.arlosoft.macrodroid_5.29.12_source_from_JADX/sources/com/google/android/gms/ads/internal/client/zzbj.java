package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbj extends zzarz implements zzbl {
    zzbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* renamed from: Q8 */
    public final void mo19903Q8(zzl zzl) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzl);
        mo41865A1(1, y);
    }
}