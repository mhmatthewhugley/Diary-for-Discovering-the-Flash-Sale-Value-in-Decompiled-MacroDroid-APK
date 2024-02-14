package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbrj extends zzarz {
    zzbrj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    /* renamed from: Z8 */
    public final void mo42928Z8(zzbrd zzbrd, zzbri zzbri) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzbrd);
        zzasb.m42229g(y, zzbri);
        mo41867g8(2, y);
    }
}
