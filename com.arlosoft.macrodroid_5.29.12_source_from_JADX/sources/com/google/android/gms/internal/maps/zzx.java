package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzx extends zzb implements zzw {
    /* renamed from: t1 */
    public static zzw m59379t1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        if (queryLocalInterface instanceof zzw) {
            return (zzw) queryLocalInterface;
        }
        return new zzy(iBinder);
    }
}
