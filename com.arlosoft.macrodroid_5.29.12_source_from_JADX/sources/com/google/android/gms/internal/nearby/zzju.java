package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzju extends zzb implements zzjv {
    public zzju() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc.m62338c(parcel);
            mo52722u8((zzks) zzc.m62336a(parcel, zzks.CREATOR));
            return true;
        } else if (i == 3) {
            zzc.m62338c(parcel);
            mo52718P2((zzky) zzc.m62336a(parcel, zzky.CREATOR));
            return true;
        } else if (i == 4) {
            zzc.m62338c(parcel);
            mo52719X6((zzla) zzc.m62336a(parcel, zzla.CREATOR));
            return true;
        } else if (i != 5) {
            return false;
        } else {
            zzc.m62338c(parcel);
            mo52721ib((zzkq) zzc.m62336a(parcel, zzkq.CREATOR));
            return true;
        }
    }
}
