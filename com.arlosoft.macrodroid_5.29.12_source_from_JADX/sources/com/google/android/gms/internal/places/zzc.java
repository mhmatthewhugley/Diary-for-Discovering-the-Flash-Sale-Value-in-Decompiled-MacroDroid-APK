package com.google.android.gms.internal.places;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zzc implements IInterface {

    /* renamed from: a */
    private final IBinder f45313a;

    /* renamed from: c */
    private final String f45314c;

    protected zzc(IBinder iBinder, String str) {
        this.f45313a = iBinder;
        this.f45314c = str;
    }

    public IBinder asBinder() {
        return this.f45313a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final void mo53509t1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f45313a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Parcel mo53510y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f45314c);
        return obtain;
    }
}
