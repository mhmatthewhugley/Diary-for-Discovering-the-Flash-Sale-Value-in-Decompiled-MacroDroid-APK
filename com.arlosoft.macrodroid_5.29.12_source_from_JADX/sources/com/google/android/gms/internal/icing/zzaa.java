package com.google.android.gms.internal.icing;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.firebase.appindexing.internal.zzc;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzaa extends zza {
    zzaa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    }

    /* renamed from: Z8 */
    public final void mo50161Z8(zzac zzac, zzc[] zzcArr) throws RemoteException {
        Parcel y = mo50160y();
        zzc.m58653c(y, zzac);
        y.writeTypedArray(zzcArr, 0);
        mo50157A1(7, y);
    }

    /* renamed from: g8 */
    public final void mo50162g8(zzac zzac, String str, zzx[] zzxArr) throws RemoteException {
        Parcel y = mo50160y();
        zzc.m58653c(y, zzac);
        y.writeString((String) null);
        y.writeTypedArray(zzxArr, 0);
        mo50157A1(1, y);
    }
}
