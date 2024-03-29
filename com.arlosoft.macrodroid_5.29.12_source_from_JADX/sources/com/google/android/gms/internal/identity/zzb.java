package com.google.android.gms.internal.identity;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
public class zzb extends Binder implements IInterface {
    protected zzb(String str) {
        attachInterface(this, "com.google.android.gms.identity.intents.internal.IAddressCallbacks");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo50496y(i, parcel, parcel2, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo50496y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }
}
