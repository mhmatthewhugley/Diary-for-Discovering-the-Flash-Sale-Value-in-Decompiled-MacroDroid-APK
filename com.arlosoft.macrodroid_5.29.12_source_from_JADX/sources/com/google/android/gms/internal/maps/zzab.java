package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzab extends zza implements zzz {
    zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    /* renamed from: E8 */
    public final boolean mo50656E8(zzz zzz) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, zzz);
        Parcel t1 = mo50654t1(15, y);
        boolean e = zzc.m59348e(t1);
        t1.recycle();
        return e;
    }

    /* renamed from: h */
    public final int mo50657h() throws RemoteException {
        Parcel t1 = mo50654t1(16, mo50655y());
        int readInt = t1.readInt();
        t1.recycle();
        return readInt;
    }
}
