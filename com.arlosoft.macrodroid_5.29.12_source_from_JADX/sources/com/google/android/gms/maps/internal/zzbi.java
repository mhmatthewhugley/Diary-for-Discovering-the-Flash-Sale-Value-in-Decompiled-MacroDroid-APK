package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public abstract class zzbi extends zzb implements zzbh {
    public zzbi() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50661y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo54644l1((StreetViewPanoramaCamera) zzc.m59345b(parcel, StreetViewPanoramaCamera.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
