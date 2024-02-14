package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbnq extends zzarz implements zzbns {
    zzbnq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    /* renamed from: y8 */
    public final void mo42826y8(zzbob zzbob) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzbob);
        mo41865A1(1, y);
    }
}
