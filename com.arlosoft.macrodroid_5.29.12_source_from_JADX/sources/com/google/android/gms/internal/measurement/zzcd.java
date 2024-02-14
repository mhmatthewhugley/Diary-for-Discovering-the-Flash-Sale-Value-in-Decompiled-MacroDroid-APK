package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzcd extends zzbm implements zzcf {
    zzcd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: m1 */
    public final void mo50779m1(Bundle bundle) throws RemoteException {
        Parcel y = mo50772y();
        zzbo.m59534e(y, bundle);
        mo50769A1(1, y);
    }
}
