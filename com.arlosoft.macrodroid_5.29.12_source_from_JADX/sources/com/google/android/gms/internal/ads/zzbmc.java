package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbmc extends zzarz implements zzbme {
    zzbmc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: a */
    public final int mo42741a() throws RemoteException {
        Parcel t1 = mo41868t1(5, mo41869y());
        int readInt = t1.readInt();
        t1.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final Uri mo42742b() throws RemoteException {
        Parcel t1 = mo41868t1(2, mo41869y());
        Uri uri = (Uri) zzasb.m42223a(t1, Uri.CREATOR);
        t1.recycle();
        return uri;
    }

    /* renamed from: c */
    public final IObjectWrapper mo42743c() throws RemoteException {
        Parcel t1 = mo41868t1(1, mo41869y());
        IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* renamed from: d */
    public final int mo42744d() throws RemoteException {
        Parcel t1 = mo41868t1(4, mo41869y());
        int readInt = t1.readInt();
        t1.recycle();
        return readInt;
    }

    public final double zzb() throws RemoteException {
        Parcel t1 = mo41868t1(3, mo41869y());
        double readDouble = t1.readDouble();
        t1.recycle();
        return readDouble;
    }
}
