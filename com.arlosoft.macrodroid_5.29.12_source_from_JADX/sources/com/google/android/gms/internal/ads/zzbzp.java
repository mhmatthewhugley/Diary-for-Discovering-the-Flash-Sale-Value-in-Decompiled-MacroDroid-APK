package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbzp extends zzarz implements zzbzr {
    zzbzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    /* renamed from: y2 */
    public final void mo43232y2(List list) throws RemoteException {
        Parcel y = mo41869y();
        y.writeTypedList(list);
        mo41865A1(1, y);
    }

    /* renamed from: z */
    public final void mo43233z(String str) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        mo41865A1(2, y);
    }
}
