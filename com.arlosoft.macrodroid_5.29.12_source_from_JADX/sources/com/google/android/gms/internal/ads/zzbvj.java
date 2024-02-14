package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbvj extends zzasa implements zzbvk {
    public zzbvj() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: Jb */
    public static zzbvk m44201Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzbvk ? (zzbvk) queryLocalInterface : new zzbvi(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            zzasb.m42225c(parcel);
            zzbvn t = mo43030t(readString);
            parcel2.writeNoException();
            zzasb.m42229g(parcel2, t);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            zzasb.m42225c(parcel);
            boolean z = mo43031z(readString2);
            parcel2.writeNoException();
            zzasb.m42226d(parcel2, z);
        } else if (i == 3) {
            String readString3 = parcel.readString();
            zzasb.m42225c(parcel);
            zzbxd f0 = mo43028f0(readString3);
            parcel2.writeNoException();
            zzasb.m42229g(parcel2, f0);
        } else if (i != 4) {
            return false;
        } else {
            String readString4 = parcel.readString();
            zzasb.m42225c(parcel);
            boolean h0 = mo43029h0(readString4);
            parcel2.writeNoException();
            zzasb.m42226d(parcel2, h0);
        }
        return true;
    }
}
