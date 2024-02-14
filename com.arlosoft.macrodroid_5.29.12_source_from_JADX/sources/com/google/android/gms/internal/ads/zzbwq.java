package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbwq extends zzasa implements zzbwr {
    public zzbwq() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
            zzasb.m42225c(parcel);
            mo43158Y8(t1);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzasb.m42225c(parcel);
            mo43160z(readString);
        } else if (i == 3) {
            zzasb.m42225c(parcel);
            mo43157C((zze) zzasb.m42223a(parcel, zze.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            zzbvt Jb = zzbvs.m44319Jb(parcel.readStrongBinder());
            zzasb.m42225c(parcel);
            mo43159s8(Jb);
        }
        parcel2.writeNoException();
        return true;
    }
}
