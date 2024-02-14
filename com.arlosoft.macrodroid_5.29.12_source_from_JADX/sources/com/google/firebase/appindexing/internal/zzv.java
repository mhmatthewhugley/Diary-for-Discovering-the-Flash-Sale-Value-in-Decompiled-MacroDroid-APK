package com.google.firebase.appindexing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.internal.icing.zza;
import com.google.android.gms.internal.icing.zzc;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzv extends zza {
    zzv(IBinder iBinder) {
        super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingService");
    }

    /* renamed from: g8 */
    public final zzg mo62036g8(IStatusCallback iStatusCallback, zzz zzz) throws RemoteException {
        Parcel y = mo50160y();
        zzc.m58653c(y, iStatusCallback);
        zzc.m58652b(y, zzz);
        Parcel t1 = mo50159t1(8, y);
        zzg zzg = (zzg) zzc.m58651a(t1, zzg.CREATOR);
        t1.recycle();
        return zzg;
    }
}
