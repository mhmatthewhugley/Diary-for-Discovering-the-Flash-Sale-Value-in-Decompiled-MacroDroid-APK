package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbng extends zzarz implements zzbni {
    zzbng(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* renamed from: Db */
    public final void mo42822Db(zzbmy zzbmy, String str) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzbmy);
        y.writeString(str);
        mo41865A1(1, y);
    }
}
