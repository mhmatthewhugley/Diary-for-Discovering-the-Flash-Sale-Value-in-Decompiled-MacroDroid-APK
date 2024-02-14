package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbd extends zzarz implements zzbf {
    zzbd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* renamed from: A */
    public final void mo19893A(int i) throws RemoteException {
        Parcel y = mo41869y();
        y.writeInt(i);
        mo41865A1(2, y);
    }

    /* renamed from: C */
    public final void mo19894C(zze zze) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zze);
        mo41865A1(8, y);
    }

    /* renamed from: a */
    public final void mo19895a() throws RemoteException {
        mo41865A1(6, mo41869y());
    }

    /* renamed from: d */
    public final void mo19896d() throws RemoteException {
        mo41865A1(1, mo41869y());
    }

    /* renamed from: e */
    public final void mo19897e() throws RemoteException {
        mo41865A1(3, mo41869y());
    }

    /* renamed from: f */
    public final void mo19898f() throws RemoteException {
        mo41865A1(7, mo41869y());
    }

    /* renamed from: g */
    public final void mo19899g() throws RemoteException {
        mo41865A1(4, mo41869y());
    }

    /* renamed from: h */
    public final void mo19900h() throws RemoteException {
        mo41865A1(5, mo41869y());
    }
}
