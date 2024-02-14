package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbed extends zzarz {
    zzbed(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* renamed from: Z8 */
    public final long mo42536Z8(zzbeb zzbeb) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzbeb);
        Parcel t1 = mo41868t1(3, y);
        long readLong = t1.readLong();
        t1.recycle();
        return readLong;
    }

    /* renamed from: ia */
    public final zzbdy mo42537ia(zzbeb zzbeb) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzbeb);
        Parcel t1 = mo41868t1(1, y);
        zzbdy zzbdy = (zzbdy) zzasb.m42223a(t1, zzbdy.CREATOR);
        t1.recycle();
        return zzbdy;
    }

    /* renamed from: sb */
    public final zzbdy mo42538sb(zzbeb zzbeb) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzbeb);
        Parcel t1 = mo41868t1(2, y);
        zzbdy zzbdy = (zzbdy) zzasb.m42223a(t1, zzbdy.CREATOR);
        t1.recycle();
        return zzbdy;
    }
}
