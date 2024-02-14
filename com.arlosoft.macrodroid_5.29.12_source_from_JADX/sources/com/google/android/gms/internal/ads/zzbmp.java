package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbmp extends zzarz implements zzbmr {
    zzbmp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    /* renamed from: W1 */
    public final IBinder mo42765W1(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, iObjectWrapper2);
        zzasb.m42229g(y, iObjectWrapper3);
        Parcel t1 = mo41868t1(1, y);
        IBinder readStrongBinder = t1.readStrongBinder();
        t1.recycle();
        return readStrongBinder;
    }
}
