package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.appset.zza;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class zzg extends zza {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    /* renamed from: A1 */
    public final void mo48489A1(zza zza, zzf zzf) throws RemoteException {
        Parcel y = mo48484y();
        zzc.m55601b(y, zza);
        zzc.m55602c(y, zzf);
        mo48483t1(1, y);
    }
}
