package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzv extends zza implements zzt {
    zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    /* renamed from: ea */
    public final boolean mo50673ea(zzt zzt) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, zzt);
        Parcel t1 = mo50654t1(16, y);
        boolean e = zzc.m59348e(t1);
        t1.recycle();
        return e;
    }

    /* renamed from: h */
    public final int mo50674h() throws RemoteException {
        Parcel t1 = mo50654t1(17, mo50655y());
        int readInt = t1.readInt();
        t1.recycle();
        return readInt;
    }

    public final void remove() throws RemoteException {
        mo50652A1(1, mo50655y());
    }
}
