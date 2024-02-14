package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;

public abstract class zzam extends zzb implements zzal {
    public zzam() {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50661y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo54631G0();
        parcel2.writeNoException();
        return true;
    }
}
