package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzo;

public abstract class zzaa extends zzb implements zzz {
    public zzaa() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50661y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo54668w1();
        } else if (i != 2) {
            return false;
        } else {
            mo54667va(zzo.m59365t1(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
