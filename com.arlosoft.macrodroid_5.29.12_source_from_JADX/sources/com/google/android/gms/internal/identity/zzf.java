package com.google.android.gms.internal.identity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50496y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        mo50497G7(parcel.readInt(), (Bundle) zzc.m59127a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
