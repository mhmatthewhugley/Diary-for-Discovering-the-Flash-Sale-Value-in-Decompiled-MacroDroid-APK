package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbdk extends zzarz implements zzbdm {
    zzbdk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    /* renamed from: B */
    public final void mo42497B(int i) throws RemoteException {
        Parcel y = mo41869y();
        y.writeInt(i);
        mo41865A1(2, y);
    }

    /* renamed from: qa */
    public final void mo42498qa(zze zze) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zze);
        mo41865A1(3, y);
    }

    /* renamed from: y3 */
    public final void mo42499y3(zzbdj zzbdj) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzbdj);
        mo41865A1(1, y);
    }
}
