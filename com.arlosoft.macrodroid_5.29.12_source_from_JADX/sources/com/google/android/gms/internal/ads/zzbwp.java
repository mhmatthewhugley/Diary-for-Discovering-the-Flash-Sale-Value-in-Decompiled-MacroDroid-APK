package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbwp extends zzarz implements zzbwr {
    zzbwp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* renamed from: C */
    public final void mo43157C(zze zze) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zze);
        mo41865A1(3, y);
    }
}
