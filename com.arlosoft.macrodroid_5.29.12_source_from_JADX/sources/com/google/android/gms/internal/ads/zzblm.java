package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzblm extends zzarz {
    zzblm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    /* renamed from: Z8 */
    public final void mo42731Z8(zzcam zzcam) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzcam);
        mo41865A1(1, y);
    }
}
