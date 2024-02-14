package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcbw extends zzarz implements zzcby {
    zzcbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: Ca */
    public final void mo43320Ca(zzcbs zzcbs) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzcbs);
        mo41865A1(5, y);
    }

    /* renamed from: c */
    public final void mo43321c() throws RemoteException {
        mo41865A1(4, mo41869y());
    }

    /* renamed from: e */
    public final void mo43322e() throws RemoteException {
        mo41865A1(6, mo41869y());
    }

    /* renamed from: g */
    public final void mo43323g() throws RemoteException {
        mo41865A1(1, mo41869y());
    }

    /* renamed from: h */
    public final void mo43324h() throws RemoteException {
        mo41865A1(2, mo41869y());
    }

    /* renamed from: i */
    public final void mo43325i() throws RemoteException {
        mo41865A1(8, mo41869y());
    }

    /* renamed from: j */
    public final void mo43326j() throws RemoteException {
        mo41865A1(3, mo41869y());
    }

    /* renamed from: x */
    public final void mo43327x(int i) throws RemoteException {
        Parcel y = mo41869y();
        y.writeInt(i);
        mo41865A1(7, y);
    }
}
