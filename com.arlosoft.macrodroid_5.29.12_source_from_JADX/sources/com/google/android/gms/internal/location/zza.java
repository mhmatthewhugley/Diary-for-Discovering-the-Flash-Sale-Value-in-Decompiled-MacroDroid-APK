package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class zza implements IInterface {

    /* renamed from: a */
    private final IBinder f41078a;

    /* renamed from: c */
    private final String f41079c;

    protected zza(IBinder iBinder, String str) {
        this.f41078a = iBinder;
        this.f41079c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A1 */
    public final void mo50500A1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f41078a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f41078a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final Parcel mo50502t1(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f41078a.transact(i, parcel, parcel, 0);
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
    public final Parcel mo50503y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f41079c);
        return obtain;
    }
}
