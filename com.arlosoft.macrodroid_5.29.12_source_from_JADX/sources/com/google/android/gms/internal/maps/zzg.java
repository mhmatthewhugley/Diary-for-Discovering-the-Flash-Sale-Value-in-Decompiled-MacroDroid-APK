package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzg extends zza implements zze {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    /* renamed from: v */
    public final IObjectWrapper mo50664v(int i) throws RemoteException {
        Parcel y = mo50655y();
        y.writeInt(i);
        Parcel t1 = mo50654t1(1, y);
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }
}
