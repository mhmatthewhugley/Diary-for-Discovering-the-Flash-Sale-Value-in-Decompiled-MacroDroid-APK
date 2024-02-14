package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzaa extends zzb implements zzz {
    /* renamed from: t1 */
    public static zzz m59332t1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        if (queryLocalInterface instanceof zzz) {
            return (zzz) queryLocalInterface;
        }
        return new zzab(iBinder);
    }
}
