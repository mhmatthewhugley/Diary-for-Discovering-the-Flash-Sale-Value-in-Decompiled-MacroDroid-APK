package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbyu extends zzasa implements zzbyv {
    public zzbyu() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    /* renamed from: Jb */
    public static zzbyv m44688Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof zzbyv ? (zzbyv) queryLocalInterface : new zzbyt(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzasb.m42225c(parcel);
            mo43227F1((Intent) zzasb.m42223a(parcel, Intent.CREATOR));
        } else if (i == 2) {
            IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzasb.m42225c(parcel);
            mo43226B7(t1, readString, readString2);
        } else if (i != 3) {
            return false;
        } else {
            mo43228c();
        }
        parcel2.writeNoException();
        return true;
    }
}
