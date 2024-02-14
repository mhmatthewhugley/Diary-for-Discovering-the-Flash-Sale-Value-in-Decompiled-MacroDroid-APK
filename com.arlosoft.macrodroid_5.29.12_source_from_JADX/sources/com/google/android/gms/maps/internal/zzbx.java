package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;

public final class zzbx extends zza implements IUiSettingsDelegate {
    zzbx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    /* renamed from: j9 */
    public final void mo54625j9(boolean z) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59344a(y, z);
        mo50652A1(1, y);
    }

    /* renamed from: na */
    public final void mo54626na(boolean z) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59344a(y, z);
        mo50652A1(4, y);
    }
}
