package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzby extends zzasa implements zzbz {
    public zzby() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: Jb */
    public static zzbz m2050Jb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof zzbz ? (zzbz) queryLocalInterface : new zzbx(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        zzasb.m42225c(parcel);
        mo19964y1(readString, readString2);
        parcel2.writeNoException();
        return true;
    }
}
