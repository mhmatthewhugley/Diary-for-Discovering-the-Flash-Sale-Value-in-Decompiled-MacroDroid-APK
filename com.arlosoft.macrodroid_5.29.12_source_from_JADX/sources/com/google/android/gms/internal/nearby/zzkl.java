package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzkl extends zzb implements zzkm {
    public zzkl() {
        super("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        zzc.m62338c(parcel);
        mo52737R2((zzlm) zzc.m62336a(parcel, zzlm.CREATOR));
        return true;
    }
}
