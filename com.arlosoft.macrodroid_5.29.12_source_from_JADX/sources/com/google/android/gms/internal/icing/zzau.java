package com.google.android.gms.internal.icing;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzau extends zza {
    zzau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.internal.ISearchAuthService");
    }

    /* renamed from: Z8 */
    public final void mo50169Z8(zzat zzat, String str, String str2) throws RemoteException {
        Parcel y = mo50160y();
        zzc.m58653c(y, zzat);
        y.writeString(str);
        y.writeString(str2);
        mo50157A1(2, y);
    }

    /* renamed from: g8 */
    public final void mo50170g8(zzat zzat, String str, String str2) throws RemoteException {
        Parcel y = mo50160y();
        zzc.m58653c(y, zzat);
        y.writeString(str);
        y.writeString(str2);
        mo50157A1(1, y);
    }
}
