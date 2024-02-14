package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbnd extends zzarz implements zzbnf {
    zzbnd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    /* renamed from: r2 */
    public final void mo42821r2(zzbmv zzbmv) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzbmv);
        mo41865A1(1, y);
    }
}
