package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzy extends zza implements zzw {
    zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    /* renamed from: h */
    public final int mo50676h() throws RemoteException {
        Parcel t1 = mo50654t1(20, mo50655y());
        int readInt = t1.readInt();
        t1.recycle();
        return readInt;
    }

    /* renamed from: r6 */
    public final boolean mo50677r6(zzw zzw) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, zzw);
        Parcel t1 = mo50654t1(19, y);
        boolean e = zzc.m59348e(t1);
        t1.recycle();
        return e;
    }
}
