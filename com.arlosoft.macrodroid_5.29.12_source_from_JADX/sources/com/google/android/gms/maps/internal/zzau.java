package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzu;

public abstract class zzau extends zzb implements zzat {
    public zzau() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50661y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo54637R4(zzu.m59374t1(parcel.readStrongBinder()));
        } else if (i == 2) {
            mo54636J5(zzu.m59374t1(parcel.readStrongBinder()));
        } else if (i != 3) {
            return false;
        } else {
            mo54635E5(zzu.m59374t1(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
