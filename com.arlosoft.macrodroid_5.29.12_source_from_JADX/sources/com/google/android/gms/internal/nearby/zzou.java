package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzou extends zzb implements zzov {
    public zzou() {
        super("com.google.android.gms.nearby.uwb.internal.IRangingCapabilitiesResultListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzc.m62338c(parcel);
        mo53097W3((zzps) zzc.m62336a(parcel, zzps.CREATOR));
        return true;
    }
}
