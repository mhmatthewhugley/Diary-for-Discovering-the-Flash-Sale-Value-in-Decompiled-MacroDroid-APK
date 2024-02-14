package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zai extends zaa {
    zai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    /* renamed from: Z8 */
    public final void mo21744Z8(TelemetryData telemetryData) throws RemoteException {
        Parcel y = mo48578y();
        zac.m55856d(y, telemetryData);
        mo48576g8(1, y);
    }
}
