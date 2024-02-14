package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public class zza implements IInterface {

    /* renamed from: a */
    private final IBinder f39075a;

    /* renamed from: c */
    private final String f39076c = "com.google.android.gms.appset.internal.IAppSetService";

    protected zza(IBinder iBinder, String str) {
        this.f39075a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f39075a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final void mo48483t1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f39075a.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Parcel mo48484y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f39076c);
        return obtain;
    }
}
