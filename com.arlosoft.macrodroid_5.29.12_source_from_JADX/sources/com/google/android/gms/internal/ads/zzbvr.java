package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbvr extends zzarz implements zzbvt {
    zzbvr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    /* renamed from: b */
    public final IObjectWrapper mo43089b() throws RemoteException {
        Parcel t1 = mo41868t1(1, mo41869y());
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: c */
    public final boolean mo43090c() throws RemoteException {
        Parcel t1 = mo41868t1(2, mo41869y());
        boolean h = zzasb.m42230h(t1);
        t1.recycle();
        return h;
    }
}
