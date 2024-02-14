package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.nearby.zzb;
import com.google.android.gms.internal.nearby.zzc;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzx extends zzb implements zzy {
    public zzx() {
        super("com.google.android.gms.nearby.messages.internal.IStatusCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean g = zzc.m62342g(parcel);
        zzc.m62338c(parcel);
        mo53033l0(g);
        return true;
    }
}
