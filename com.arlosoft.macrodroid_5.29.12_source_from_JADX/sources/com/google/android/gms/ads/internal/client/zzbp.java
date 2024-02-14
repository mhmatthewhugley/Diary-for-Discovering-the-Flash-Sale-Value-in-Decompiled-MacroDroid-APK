package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzbvk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbp extends zzarz {
    zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    /* renamed from: Z8 */
    public final IBinder mo19921Z8(IObjectWrapper iObjectWrapper, String str, zzbvk zzbvk, int i) throws RemoteException {
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
