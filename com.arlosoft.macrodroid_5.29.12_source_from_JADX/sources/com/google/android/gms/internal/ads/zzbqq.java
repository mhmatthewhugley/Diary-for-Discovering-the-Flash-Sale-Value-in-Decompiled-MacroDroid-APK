package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbqq extends zzasa implements zzbqr {
    public zzbqq() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    /* renamed from: Jb */
    public static zzbqr m43986Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return queryLocalInterface instanceof zzbqr ? (zzbqr) queryLocalInterface : new zzbqp(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        zzasb.m42225c(parcel);
        mo42915t(readString);
        parcel2.writeNoException();
        return true;
    }
}
