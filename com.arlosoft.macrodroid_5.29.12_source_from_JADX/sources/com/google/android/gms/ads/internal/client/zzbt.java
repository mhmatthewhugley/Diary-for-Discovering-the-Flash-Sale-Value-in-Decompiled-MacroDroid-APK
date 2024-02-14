package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzbvk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbt extends zzarz {
    zzbt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    /* renamed from: Z8 */
    public final IBinder mo19962Z8(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbvk zzbvk, int i, int i2) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42227e(y, zzq);
        y.writeString(str);
        zzasb.m42229g(y, zzbvk);
        y.writeInt(223104000);
        y.writeInt(i2);
        Parcel t1 = mo41868t1(2, y);
        IBinder readStrongBinder = t1.readStrongBinder();
        t1.recycle();
        return readStrongBinder;
    }
}
