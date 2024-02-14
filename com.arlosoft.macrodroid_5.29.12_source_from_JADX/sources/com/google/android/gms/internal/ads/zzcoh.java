package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcoh extends zzarz implements zzcoj {
    zzcoh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    /* renamed from: pa */
    public final void mo44188pa(IObjectWrapper iObjectWrapper, zzcog zzcog) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, zzcog);
        mo41865A1(2, y);
    }
}
