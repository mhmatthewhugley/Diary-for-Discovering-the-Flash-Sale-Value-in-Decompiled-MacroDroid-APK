package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzcg extends zzbm implements zzci {
    zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: M1 */
    public final void mo50833M1(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel y = mo50772y();
        y.writeString(str);
        y.writeString(str2);
        zzbo.m59534e(y, bundle);
        y.writeLong(j);
        mo50769A1(1, y);
    }

    /* renamed from: d */
    public final int mo50834d() throws RemoteException {
        Parcel t1 = mo50771t1(2, mo50772y());
        int readInt = t1.readInt();
        t1.recycle();
        return readInt;
    }
}
