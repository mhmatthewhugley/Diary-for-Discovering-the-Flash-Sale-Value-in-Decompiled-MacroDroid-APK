package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzce extends zzarz implements zzcg {
    zzce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    /* renamed from: H0 */
    public final void mo19886H0(zze zze) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zze);
        mo41865A1(1, y);
    }

    /* renamed from: a */
    public final void mo19887a() throws RemoteException {
        mo41865A1(3, mo41869y());
    }

    /* renamed from: b */
    public final void mo19888b() throws RemoteException {
        mo41865A1(4, mo41869y());
    }

    /* renamed from: c */
    public final void mo19889c() throws RemoteException {
        mo41865A1(2, mo41869y());
    }

    public final void zzb() throws RemoteException {
        mo41865A1(5, mo41869y());
    }
}
