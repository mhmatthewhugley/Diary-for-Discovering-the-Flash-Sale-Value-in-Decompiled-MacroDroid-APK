package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbmn extends zzasa implements zzbmo {
    public zzbmn() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    /* renamed from: Jb */
    public static zzbmo m43728Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return queryLocalInterface instanceof zzbmo ? (zzbmo) queryLocalInterface : new zzbmm(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
            zzasb.m42225c(parcel);
            mo20112Y0(t1);
        } else if (i == 2) {
            mo20113d();
        } else if (i != 3) {
            return false;
        } else {
            IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
            zzasb.m42225c(parcel);
            mo20114q0(t12);
        }
        parcel2.writeNoException();
        return true;
    }
}
