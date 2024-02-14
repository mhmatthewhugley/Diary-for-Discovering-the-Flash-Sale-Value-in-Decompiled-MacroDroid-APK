package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzpd extends zzb implements zzpe {
    public zzpd() {
        super("com.google.android.gms.nearby.uwb.internal.IUwbAddressResultListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        zzc.m62338c(parcel);
        mo53102x7((zzqq) zzc.m62336a(parcel, zzqq.CREATOR));
        return true;
    }
}
