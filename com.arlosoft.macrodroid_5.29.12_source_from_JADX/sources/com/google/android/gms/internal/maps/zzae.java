package com.google.android.gms.internal.maps;

import android.os.Parcel;
import android.os.RemoteException;

public final class zzae extends zza implements zzac {
    /* renamed from: h */
    public final int mo50658h() throws RemoteException {
        Parcel t1 = mo50654t1(9, mo50655y());
        int readInt = t1.readInt();
        t1.recycle();
        return readInt;
    }

    /* renamed from: v2 */
    public final boolean mo50659v2(zzac zzac) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, zzac);
        Parcel t1 = mo50654t1(8, y);
        boolean e = zzc.m59348e(t1);
        t1.recycle();
        return e;
    }
}
