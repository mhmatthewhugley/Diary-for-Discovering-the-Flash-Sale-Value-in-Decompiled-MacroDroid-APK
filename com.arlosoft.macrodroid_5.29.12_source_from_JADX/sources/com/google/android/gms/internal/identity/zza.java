package com.google.android.gms.internal.identity;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
public class zza implements IInterface {

    /* renamed from: a */
    private final IBinder f41069a;

    /* renamed from: c */
    private final String f41070c = "com.google.android.gms.identity.intents.internal.IAddressService";

    protected zza(IBinder iBinder, String str) {
        this.f41069a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f41069a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final void mo50492t1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f41069a.transact(2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Parcel mo50493y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f41070c);
        return obtain;
    }
}
