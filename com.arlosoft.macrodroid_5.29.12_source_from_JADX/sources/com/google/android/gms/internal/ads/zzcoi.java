package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzcoi extends zzasa implements zzcoj {
    /* renamed from: Jb */
    public static zzcoj m46230Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return queryLocalInterface instanceof zzcoj ? (zzcoj) queryLocalInterface : new zzcoh(iBinder);
    }
}
