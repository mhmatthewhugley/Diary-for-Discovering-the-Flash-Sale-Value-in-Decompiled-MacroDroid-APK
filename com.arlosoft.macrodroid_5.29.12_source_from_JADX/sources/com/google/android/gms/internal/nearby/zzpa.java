package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzpa extends zzb implements zzpb {
    public zzpa() {
        super("com.google.android.gms.nearby.uwb.internal.IResultListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        int readInt = parcel.readInt();
        zzc.m62338c(parcel);
        mo53101G(readInt);
        return true;
    }
}
