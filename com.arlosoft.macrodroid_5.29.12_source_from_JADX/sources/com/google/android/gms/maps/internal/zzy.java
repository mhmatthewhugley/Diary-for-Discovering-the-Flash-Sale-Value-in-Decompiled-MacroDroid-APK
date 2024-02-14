package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzl;

public abstract class zzy extends zzb implements zzx {
    public zzy() {
        super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50661y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo54666r9(zzl.m59360t1(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
