package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbqt extends zzasa implements zzbqu {
    public zzbqt() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    /* renamed from: Jb */
    public static zzbqu m43990Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        return queryLocalInterface instanceof zzbqu ? (zzbqu) queryLocalInterface : new zzbqs(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            zzasb.m42225c(parcel);
            mo42916W(readString);
        } else if (i != 2) {
            return false;
        } else {
            mo42917b();
        }
        parcel2.writeNoException();
        return true;
    }
}
