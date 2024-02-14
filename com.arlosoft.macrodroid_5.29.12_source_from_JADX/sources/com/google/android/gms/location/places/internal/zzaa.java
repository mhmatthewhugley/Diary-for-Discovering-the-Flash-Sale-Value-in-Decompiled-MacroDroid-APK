package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.places.zzb;
import com.google.android.gms.internal.places.zze;

public abstract class zzaa extends zzb implements zzx {
    public zzaa() {
        super("com.google.android.gms.location.places.internal.IPlacesCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo53438y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo54345V5((DataHolder) zze.m63753a(parcel, DataHolder.CREATOR));
        } else if (i == 2) {
            mo54342A6((DataHolder) zze.m63753a(parcel, DataHolder.CREATOR));
        } else if (i == 3) {
            mo54343C4((DataHolder) zze.m63753a(parcel, DataHolder.CREATOR));
        } else if (i == 4) {
            mo54346e0((Status) zze.m63753a(parcel, Status.CREATOR));
        } else if (i != 5) {
            return false;
        } else {
            mo54344V0((DataHolder) zze.m63753a(parcel, DataHolder.CREATOR));
        }
        return true;
    }
}
