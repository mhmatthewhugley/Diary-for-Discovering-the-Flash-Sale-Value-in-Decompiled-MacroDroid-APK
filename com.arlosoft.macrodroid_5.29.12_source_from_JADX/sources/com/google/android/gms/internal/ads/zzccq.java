package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzccq extends zzarz implements zzccs {
    zzccq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    /* renamed from: A */
    public final void mo43359A(int i) throws RemoteException {
        Parcel y = mo41869y();
        y.writeInt(i);
        mo41865A1(2, y);
    }

    /* renamed from: C */
    public final void mo43360C(zze zze) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zze);
        mo41865A1(3, y);
    }

    /* renamed from: f */
    public final void mo43361f() throws RemoteException {
        mo41865A1(1, mo41869y());
    }
}
