package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzccp extends zzarz {
    zzccp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    /* renamed from: Z8 */
    public final IBinder mo43358Z8(IObjectWrapper iObjectWrapper, String str, zzbvk zzbvk, int i) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        y.writeString(str);
        zzasb.m42229g(y, zzbvk);
        y.writeInt(223104000);
        Parcel t1 = mo41868t1(1, y);
        IBinder readStrongBinder = t1.readStrongBinder();
        t1.recycle();
        return readStrongBinder;
    }
}
