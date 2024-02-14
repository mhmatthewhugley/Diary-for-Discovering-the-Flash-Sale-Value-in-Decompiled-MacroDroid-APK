package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzp extends zza implements zzn {
    zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    /* renamed from: bb */
    public final boolean mo50669bb(zzn zzn) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, zzn);
        Parcel t1 = mo50654t1(5, y);
        boolean e = zzc.m59348e(t1);
        t1.recycle();
        return e;
    }

    /* renamed from: h */
    public final int mo50670h() throws RemoteException {
        Parcel t1 = mo50654t1(6, mo50655y());
        int readInt = t1.readInt();
        t1.recycle();
        return readInt;
    }
}
