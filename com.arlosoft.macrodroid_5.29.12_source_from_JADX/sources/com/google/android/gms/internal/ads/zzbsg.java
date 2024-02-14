package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbsg extends zzarz implements zzbsi {
    zzbsg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    /* renamed from: A */
    public final void mo42947A(int i) throws RemoteException {
        Parcel y = mo41869y();
        y.writeInt(i);
        mo41865A1(2, y);
    }

    /* renamed from: c */
    public final void mo42948c() throws RemoteException {
        mo41865A1(1, mo41869y());
    }
}
