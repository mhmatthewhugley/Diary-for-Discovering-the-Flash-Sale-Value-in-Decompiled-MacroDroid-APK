package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzdo extends zzb implements zzdp {
    public zzdo() {
        super("com.google.android.gms.nearby.exposurenotification.internal.ILongCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        long readLong = parcel.readLong();
        zzc.m62338c(parcel);
        mo52523w6((Status) zzc.m62336a(parcel, Status.CREATOR), readLong);
        return true;
    }
}
