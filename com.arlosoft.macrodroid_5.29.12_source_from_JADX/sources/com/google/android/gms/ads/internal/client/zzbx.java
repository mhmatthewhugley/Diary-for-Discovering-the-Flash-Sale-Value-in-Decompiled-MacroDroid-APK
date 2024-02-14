package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzarz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbx extends zzarz implements zzbz {
    zzbx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: y1 */
    public final void mo19964y1(String str, String str2) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        y.writeString(str2);
        mo41865A1(1, y);
    }
}
