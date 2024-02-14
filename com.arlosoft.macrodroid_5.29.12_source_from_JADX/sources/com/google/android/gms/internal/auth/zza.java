package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zza implements IInterface {

    /* renamed from: a */
    private final IBinder f39159a;

    /* renamed from: c */
    private final String f39160c;

    protected zza(IBinder iBinder, String str) {
        this.f39159a = iBinder;
        this.f39160c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A1 */
    public final void mo48534A1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f39159a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f39159a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final Parcel mo48536t1(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f39159a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Parcel mo48537y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f39160c);
        return obtain;
    }
}
