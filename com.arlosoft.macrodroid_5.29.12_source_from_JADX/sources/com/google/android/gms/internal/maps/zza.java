package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zza implements IInterface {

    /* renamed from: a */
    private final IBinder f41170a;

    /* renamed from: c */
    private final String f41171c;

    protected zza(IBinder iBinder, String str) {
        this.f41170a = iBinder;
        this.f41171c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A1 */
    public final void mo50652A1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f41170a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f41170a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final Parcel mo50654t1(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f41170a.transact(i, parcel, parcel, 0);
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
    public final Parcel mo50655y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f41171c);
        return obtain;
    }
}
