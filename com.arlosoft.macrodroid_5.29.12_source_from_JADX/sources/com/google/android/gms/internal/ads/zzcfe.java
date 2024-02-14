package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcfe extends zzarz implements zzcfg {
    zzcfe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    /* renamed from: q5 */
    public final void mo20663q5(IObjectWrapper iObjectWrapper, zzcfk zzcfk, zzcfd zzcfd) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42227e(y, zzcfk);
        zzasb.m42229g(y, zzcfd);
        mo41865A1(1, y);
    }
}
