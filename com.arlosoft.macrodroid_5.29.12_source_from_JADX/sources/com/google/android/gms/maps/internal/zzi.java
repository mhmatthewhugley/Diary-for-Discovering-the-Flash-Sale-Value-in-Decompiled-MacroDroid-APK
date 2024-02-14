package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzu;

public abstract class zzi extends zzb implements zzh {
    public zzi() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50661y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper D8 = mo54658D8(zzu.m59374t1(parcel.readStrongBinder()));
            parcel2.writeNoException();
            zzc.m59346c(parcel2, D8);
        } else if (i != 2) {
            return false;
        } else {
            IObjectWrapper s9 = mo54659s9(zzu.m59374t1(parcel.readStrongBinder()));
            parcel2.writeNoException();
            zzc.m59346c(parcel2, s9);
        }
        return true;
    }
}
