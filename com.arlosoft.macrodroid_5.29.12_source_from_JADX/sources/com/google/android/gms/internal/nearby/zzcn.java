package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzcn extends zzb implements zzco {
    public zzcn() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IBooleanCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean g = zzc.m62342g(parcel);
        zzc.m62338c(parcel);
        mo52528W0((Status) zzc.m62336a(parcel, Status.CREATOR), g);
        return true;
    }
}
