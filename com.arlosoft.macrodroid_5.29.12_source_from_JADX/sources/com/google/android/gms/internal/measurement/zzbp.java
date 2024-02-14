package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzbp extends zzbm implements zzbr {
    zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: g0 */
    public final Bundle mo50776g0(Bundle bundle) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, bundle);
        Parcel t1 = mo50771t1(1, y);
        Bundle bundle2 = (Bundle) zzbo.m59530a(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle2;
    }
}
