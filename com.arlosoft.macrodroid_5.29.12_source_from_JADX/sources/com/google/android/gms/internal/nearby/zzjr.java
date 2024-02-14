package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzjr extends zzb implements zzjs {
    public zzjr() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc.m62338c(parcel);
            mo52729F6((zzli) zzc.m62336a(parcel, zzli.CREATOR));
            return true;
        } else if (i == 3) {
            zzc.m62338c(parcel);
            mo52730Fa((zzla) zzc.m62336a(parcel, zzla.CREATOR));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            zzlk zzlk = (zzlk) zzc.m62336a(parcel, zzlk.CREATOR);
            zzc.m62338c(parcel);
            return true;
        }
    }
}
