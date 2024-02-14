package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbrv extends zzarz implements zzbrx {
    zzbrv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    /* renamed from: j5 */
    public final void mo20076j5(List list) throws RemoteException {
        Parcel y = mo41869y();
        y.writeTypedList(list);
        mo41865A1(1, y);
    }
}
