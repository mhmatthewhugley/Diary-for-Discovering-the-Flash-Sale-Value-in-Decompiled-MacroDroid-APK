package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public abstract class zzah extends zzb implements zzai {
    public zzah() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50507y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo50509gb((zzaa) zzc.m59298b(parcel, zzaa.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo50508a();
        }
        return true;
    }
}
