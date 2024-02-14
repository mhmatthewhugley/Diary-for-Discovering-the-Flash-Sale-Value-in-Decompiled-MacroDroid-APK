package com.google.android.gms.internal.wearable;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public class zza implements IInterface {

    /* renamed from: a */
    private final IBinder f45530a;

    /* renamed from: c */
    private final String f45531c;

    protected zza(IBinder iBinder, String str) {
        this.f45530a = iBinder;
        this.f45531c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A1 */
    public final Parcel mo53768A1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f45531c);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f45530a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final void mo53770t1(int i, Parcel parcel) throws RemoteException {
        try {
            this.f45530a.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo53771y(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f45530a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
