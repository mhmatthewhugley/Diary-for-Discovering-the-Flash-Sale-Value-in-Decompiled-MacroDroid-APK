package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class zaa implements IInterface {

    /* renamed from: a */
    private final IBinder f39248a;

    /* renamed from: c */
    private final String f39249c;

    protected zaa(IBinder iBinder, String str) {
        this.f39248a = iBinder;
        this.f39249c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A1 */
    public final void mo48574A1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f39248a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f39248a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g8 */
    public final void mo48576g8(int i, Parcel parcel) throws RemoteException {
        try {
            this.f39248a.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final Parcel mo48577t1(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f39248a.transact(2, parcel, parcel, 0);
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
    public final Parcel mo48578y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f39249c);
        return obtain;
    }
}
