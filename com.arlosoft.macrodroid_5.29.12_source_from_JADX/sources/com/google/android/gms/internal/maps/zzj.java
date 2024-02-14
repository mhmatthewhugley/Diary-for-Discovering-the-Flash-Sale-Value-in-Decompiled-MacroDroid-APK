package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzj extends zza implements zzh {
    zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    /* renamed from: V7 */
    public final boolean mo50665V7(zzh zzh) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, zzh);
        Parcel t1 = mo50654t1(17, y);
        boolean e = zzc.m59348e(t1);
        t1.recycle();
        return e;
    }

    /* renamed from: h */
    public final int mo50666h() throws RemoteException {
        Parcel t1 = mo50654t1(18, mo50655y());
        int readInt = t1.readInt();
        t1.recycle();
        return readInt;
    }
}
