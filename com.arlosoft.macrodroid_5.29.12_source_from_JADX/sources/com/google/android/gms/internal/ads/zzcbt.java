package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcbt extends zzarz {
    zzcbt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    /* renamed from: Z8 */
    public final void mo43299Z8(zzcbs zzcbs, String str, String str2) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzcbs);
        y.writeString(str);
        y.writeString(str2);
        mo41865A1(2, y);
    }
}
