package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class zza implements IInterface {

    /* renamed from: a */
    private final IBinder f44527a;

    /* renamed from: c */
    private final String f44528c;

    protected zza(IBinder iBinder, String str) {
        this.f44527a = iBinder;
        this.f44528c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A1 */
    public final void mo52519A1(int i, Parcel parcel) throws RemoteException {
        try {
            this.f44527a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f44527a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final void mo52521t1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f44527a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Parcel mo52522y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f44528c);
        return obtain;
    }
}
