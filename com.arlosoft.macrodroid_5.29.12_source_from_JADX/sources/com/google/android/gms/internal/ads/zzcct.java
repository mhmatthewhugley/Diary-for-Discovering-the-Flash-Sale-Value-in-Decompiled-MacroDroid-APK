package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcct extends zzarz {
    zzcct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    /* renamed from: Z8 */
    public final void mo43362Z8(zzcci zzcci, String str, String str2) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzcci);
        y.writeString(str);
        y.writeString(str2);
        mo41865A1(2, y);
    }
}
