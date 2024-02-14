package com.google.android.gms.location.places.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;

public interface zzr extends IInterface {
    /* renamed from: Q1 */
    void mo54333Q1(PlaceReport placeReport, zzau zzau, zzx zzx) throws RemoteException;

    /* renamed from: u3 */
    void mo54334u3(PlaceFilter placeFilter, zzau zzau, zzx zzx) throws RemoteException;
}
