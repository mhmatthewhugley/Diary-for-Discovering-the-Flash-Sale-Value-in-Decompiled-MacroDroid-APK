package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

public abstract class zzbt extends zzb implements zzbs {
    public zzbt() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50661y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo54649C0((Bitmap) zzc.m59345b(parcel, Bitmap.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo54650q0(IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
