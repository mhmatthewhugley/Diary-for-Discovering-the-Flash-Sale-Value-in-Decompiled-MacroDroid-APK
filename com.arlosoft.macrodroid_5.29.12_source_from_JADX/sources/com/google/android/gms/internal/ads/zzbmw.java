package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbmw extends zzarz implements zzbmy {
    zzbmw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: c0 */
    public final boolean mo42800c0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        Parcel t1 = mo41868t1(10, y);
        boolean h = zzasb.m42230h(t1);
        t1.recycle();
        return h;
    }

    /* renamed from: e */
    public final IObjectWrapper mo42801e() throws RemoteException {
        Parcel t1 = mo41868t1(9, mo41869y());
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: g */
    public final String mo42802g() throws RemoteException {
        Parcel t1 = mo41868t1(4, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }
}
