package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public class zzbm implements IInterface {

    /* renamed from: a */
    private final IBinder f41292a;

    /* renamed from: c */
    private final String f41293c;

    protected zzbm(IBinder iBinder, String str) {
        this.f41292a = iBinder;
        this.f41293c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A1 */
    public final void mo50769A1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f41292a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f41292a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final Parcel mo50771t1(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f41292a.transact(i, parcel, parcel, 0);
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
    public final Parcel mo50772y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f41293c);
        return obtain;
    }
}
