package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzjo extends zzb implements zzjp {
    public zzjo() {
        super("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc.m62338c(parcel);
            mo52723c9((zzku) zzc.m62336a(parcel, zzku.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            zzlo zzlo = (zzlo) zzc.m62336a(parcel, zzlo.CREATOR);
            zzc.m62338c(parcel);
            return true;
        }
    }
}
