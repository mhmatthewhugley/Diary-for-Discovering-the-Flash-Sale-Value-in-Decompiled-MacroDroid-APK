package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzx;

public abstract class zzbe extends zzb implements zzbd {
    public zzbe() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50661y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo54642I5(zzx.m59379t1(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
