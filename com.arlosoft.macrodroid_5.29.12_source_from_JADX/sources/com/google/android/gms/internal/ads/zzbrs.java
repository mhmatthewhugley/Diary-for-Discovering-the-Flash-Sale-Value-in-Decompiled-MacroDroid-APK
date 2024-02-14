package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbrs extends zzarz implements zzbru {
    zzbrs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    /* renamed from: z */
    public final void mo42933z(String str) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        mo41865A1(3, y);
    }
}
