package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbsh extends zzasa implements zzbsi {
    public zzbsh() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            zzasb.m42225c(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
