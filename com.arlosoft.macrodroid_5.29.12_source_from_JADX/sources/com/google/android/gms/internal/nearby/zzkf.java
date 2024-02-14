package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzkf extends zzb implements zzkg {
    public zzkf() {
        super("com.google.android.gms.nearby.internal.connection.IPayloadListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc.m62338c(parcel);
            mo52735f5((zzli) zzc.m62336a(parcel, zzli.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            zzc.m62338c(parcel);
            mo52734e2((zzlk) zzc.m62336a(parcel, zzlk.CREATOR));
            return true;
        }
    }
}
