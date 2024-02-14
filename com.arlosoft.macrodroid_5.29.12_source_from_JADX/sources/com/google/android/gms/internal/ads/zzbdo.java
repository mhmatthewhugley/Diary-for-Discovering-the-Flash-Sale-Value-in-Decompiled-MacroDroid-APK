package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbdo extends zzarz implements zzbdq {
    zzbdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    /* renamed from: H0 */
    public final void mo42500H0(zze zze) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zze);
        mo41865A1(3, y);
    }

    /* renamed from: a */
    public final void mo42501a() throws RemoteException {
        mo41865A1(2, mo41869y());
    }

    /* renamed from: b */
    public final void mo42502b() throws RemoteException {
        mo41865A1(4, mo41869y());
    }

    /* renamed from: c */
    public final void mo42503c() throws RemoteException {
        mo41865A1(1, mo41869y());
    }

    public final void zzb() throws RemoteException {
        mo41865A1(5, mo41869y());
    }
}
