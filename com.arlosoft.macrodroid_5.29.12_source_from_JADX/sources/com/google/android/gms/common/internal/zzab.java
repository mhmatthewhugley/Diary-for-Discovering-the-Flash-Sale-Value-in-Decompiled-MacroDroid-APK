package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class zzab extends zzb implements IGmsCallbacks {
    public zzab() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo21710y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzc.m55905b(parcel);
            mo21713S3(parcel.readInt(), parcel.readStrongBinder(), (Bundle) zzc.m55904a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            zzc.m55905b(parcel);
            mo21714t0(parcel.readInt(), (Bundle) zzc.m55904a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            zzc.m55905b(parcel);
            mo21712R9(parcel.readInt(), parcel.readStrongBinder(), (zzj) zzc.m55904a(parcel, zzj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
