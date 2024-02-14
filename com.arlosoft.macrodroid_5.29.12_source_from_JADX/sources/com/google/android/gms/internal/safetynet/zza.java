package com.google.android.gms.internal.safetynet;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zza implements IInterface {

    /* renamed from: a */
    private final IBinder f45490a;

    /* renamed from: c */
    private final String f45491c;

    protected zza(IBinder iBinder, String str) {
        this.f45490a = iBinder;
        this.f45491c = str;
    }

    public IBinder asBinder() {
        return this.f45490a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final void mo53740t1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f45490a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Parcel mo53741y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f45491c);
        return obtain;
    }
}
