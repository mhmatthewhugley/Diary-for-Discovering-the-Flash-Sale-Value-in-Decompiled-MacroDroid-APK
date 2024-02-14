package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzcfc extends zzasa implements zzcfd {
    public zzcfc() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            zzasb.m42225c(parcel);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzasb.m42225c(parcel);
            mo43235t(readString);
        } else if (i != 3) {
            return false;
        } else {
            zzasb.m42225c(parcel);
            mo43234F2(parcel.readString(), parcel.readString(), (Bundle) zzasb.m42223a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
