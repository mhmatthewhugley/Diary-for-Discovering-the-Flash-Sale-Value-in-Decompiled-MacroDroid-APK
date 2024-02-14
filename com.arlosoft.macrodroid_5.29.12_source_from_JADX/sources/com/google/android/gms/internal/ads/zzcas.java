package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcas extends zzarz implements zzcau {
    zzcas(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* renamed from: H9 */
    public final void mo43263H9(String str, zzcay zzcay) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        zzasb.m42229g(y, zzcay);
        mo41865A1(7, y);
    }

    /* renamed from: P8 */
    public final void mo43264P8(zzcbc zzcbc, zzcay zzcay) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzcbc);
        zzasb.m42229g(y, zzcay);
        mo41865A1(5, y);
    }

    /* renamed from: Q6 */
    public final void mo43265Q6(zzcbc zzcbc, zzcay zzcay) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzcbc);
        zzasb.m42229g(y, zzcay);
        mo41865A1(6, y);
    }

    /* renamed from: h8 */
    public final void mo43266h8(zzcbc zzcbc, zzcay zzcay) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzcbc);
        zzasb.m42229g(y, zzcay);
        mo41865A1(4, y);
    }
}
