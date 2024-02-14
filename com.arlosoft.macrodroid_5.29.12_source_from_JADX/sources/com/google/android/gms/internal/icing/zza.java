package com.google.android.gms.internal.icing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public class zza implements IInterface {

    /* renamed from: a */
    private final IBinder f40756a;

    /* renamed from: c */
    private final String f40757c;

    protected zza(IBinder iBinder, String str) {
        this.f40756a = iBinder;
        this.f40757c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A1 */
    public final void mo50157A1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f40756a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f40756a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final Parcel mo50159t1(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f40756a.transact(8, parcel, parcel, 0);
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
    public final Parcel mo50160y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f40757c);
        return obtain;
    }
}
