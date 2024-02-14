package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbnw extends zzarz implements zzbny {
    zzbnw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    /* renamed from: W */
    public final void mo42827W(String str) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString(str);
        mo41865A1(1, y);
    }

    /* renamed from: b */
    public final void mo42828b() throws RemoteException {
        mo41865A1(2, mo41869y());
    }
}
