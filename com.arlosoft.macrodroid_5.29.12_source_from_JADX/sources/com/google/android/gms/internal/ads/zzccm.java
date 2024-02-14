package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzccm extends zzarz implements zzcco {
    zzccm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    /* renamed from: C5 */
    public final void mo43351C5(zze zze) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zze);
        mo41865A1(5, y);
    }

    /* renamed from: E */
    public final void mo43352E(int i) throws RemoteException {
        Parcel y = mo41869y();
        y.writeInt(i);
        mo41865A1(4, y);
    }

    /* renamed from: Y4 */
    public final void mo43353Y4(zzcci zzcci) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzcci);
        mo41865A1(3, y);
    }

    /* renamed from: b */
    public final void mo43354b() throws RemoteException {
        mo41865A1(7, mo41869y());
    }

    /* renamed from: c */
    public final void mo43355c() throws RemoteException {
        mo41865A1(6, mo41869y());
    }

    /* renamed from: f */
    public final void mo43356f() throws RemoteException {
        mo41865A1(2, mo41869y());
    }

    /* renamed from: h */
    public final void mo43357h() throws RemoteException {
        mo41865A1(1, mo41869y());
    }
}
