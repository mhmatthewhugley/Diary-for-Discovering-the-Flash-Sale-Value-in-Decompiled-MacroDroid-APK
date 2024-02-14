package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public abstract class zzaj extends zzb implements zzak {
    public zzaj() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50507y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo50511Hb(parcel.readInt(), parcel.createStringArray());
        } else if (i == 2) {
            mo50512d2(parcel.readInt(), parcel.createStringArray());
        } else if (i != 3) {
            return false;
        } else {
            mo50510F5(parcel.readInt(), (PendingIntent) zzc.m59298b(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
