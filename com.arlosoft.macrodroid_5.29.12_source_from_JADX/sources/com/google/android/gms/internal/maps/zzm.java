package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzm extends zza implements zzk {
    zzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    /* renamed from: da */
    public final boolean mo50667da(zzk zzk) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, zzk);
        Parcel t1 = mo50654t1(19, y);
        boolean e = zzc.m59348e(t1);
        t1.recycle();
        return e;
    }

    /* renamed from: h */
    public final int mo50668h() throws RemoteException {
        Parcel t1 = mo50654t1(20, mo50655y());
        int readInt = t1.readInt();
        t1.recycle();
        return readInt;
    }
}
