package com.google.android.gms.internal.maps;

import android.os.Parcel;
import android.os.RemoteException;

public final class zzs extends zza implements zzq {
    /* renamed from: Y2 */
    public final boolean mo50671Y2(zzq zzq) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, zzq);
        Parcel t1 = mo50654t1(4, y);
        boolean e = zzc.m59348e(t1);
        t1.recycle();
        return e;
    }

    /* renamed from: h */
    public final int mo50672h() throws RemoteException {
        Parcel t1 = mo50654t1(5, mo50655y());
        int readInt = t1.readInt();
        t1.recycle();
        return readInt;
    }
}
