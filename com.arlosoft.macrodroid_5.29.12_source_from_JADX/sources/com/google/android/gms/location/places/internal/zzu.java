package com.google.android.gms.location.places.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.places.zzc;
import com.google.android.gms.internal.places.zze;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;

public final class zzu extends zzc implements zzr {
    zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
    }

    /* renamed from: Q1 */
    public final void mo54333Q1(PlaceReport placeReport, zzau zzau, zzx zzx) throws RemoteException {
        Parcel y = mo53510y();
        zze.m63755c(y, placeReport);
        zze.m63755c(y, zzau);
        zze.m63754b(y, zzx);
        mo53509t1(7, y);
    }

    /* renamed from: u3 */
    public final void mo54334u3(PlaceFilter placeFilter, zzau zzau, zzx zzx) throws RemoteException {
        Parcel y = mo53510y();
        zze.m63755c(y, placeFilter);
        zze.m63755c(y, zzau);
        zze.m63754b(y, zzx);
        mo53509t1(6, y);
    }
}
