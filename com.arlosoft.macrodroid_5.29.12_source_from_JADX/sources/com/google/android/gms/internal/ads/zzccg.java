package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzccg extends zzarz implements zzcci {
    zzccg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    /* renamed from: b */
    public final int mo43349b() throws RemoteException {
        Parcel t1 = mo41868t1(2, mo41869y());
        int readInt = t1.readInt();
        t1.recycle();
        return readInt;
    }

    /* renamed from: c */
    public final String mo43350c() throws RemoteException {
        Parcel t1 = mo41868t1(1, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }
}
