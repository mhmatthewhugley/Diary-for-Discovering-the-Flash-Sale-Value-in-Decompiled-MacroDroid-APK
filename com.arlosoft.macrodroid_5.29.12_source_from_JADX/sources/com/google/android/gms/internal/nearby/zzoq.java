package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzoq extends zzb implements zzor {
    public zzoq() {
        super("com.google.android.gms.nearby.uwb.internal.IBooleanResultListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean g = zzc.m62342g(parcel);
        zzc.m62338c(parcel);
        mo53087l0(g);
        return true;
    }
}
