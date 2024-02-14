package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public abstract class zzab extends zzb implements zzac {
    public zzab() {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50163y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo50164e0((Status) zzc.m58651a(parcel, Status.CREATOR));
        } else if (i == 2) {
            Status status = (Status) zzc.m58651a(parcel, Status.CREATOR);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzc.m58651a(parcel, ParcelFileDescriptor.CREATOR);
        } else if (i != 4) {
            return false;
        } else {
            zzo zzo = (zzo) zzc.m58651a(parcel, zzo.CREATOR);
        }
        return true;
    }
}
