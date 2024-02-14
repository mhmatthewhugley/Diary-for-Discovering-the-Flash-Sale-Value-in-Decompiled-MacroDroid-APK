package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbnx extends zzasa implements zzbny {
    public zzbnx() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            zzasb.m42225c(parcel);
            mo42827W(readString);
        } else if (i != 2) {
            return false;
        } else {
            mo42828b();
        }
        parcel2.writeNoException();
        return true;
    }
}
