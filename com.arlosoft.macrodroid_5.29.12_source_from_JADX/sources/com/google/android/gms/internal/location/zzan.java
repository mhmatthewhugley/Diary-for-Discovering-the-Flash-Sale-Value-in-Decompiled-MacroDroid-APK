package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public abstract class zzan extends zzb implements zzao {
    public zzan() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50507y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo50532E2((LocationSettingsResult) zzc.m59298b(parcel, LocationSettingsResult.CREATOR));
        return true;
    }
}
