package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbzq extends zzasa implements zzbzr {
    public zzbzq() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    /* renamed from: Jb */
    public static zzbzr m44734Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof zzbzr ? (zzbzr) queryLocalInterface : new zzbzp(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            zzasb.m42225c(parcel);
            mo43232y2(createTypedArrayList);
        } else if (i != 2) {
            return false;
        } else {
            String readString = parcel.readString();
            zzasb.m42225c(parcel);
            mo43233z(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
