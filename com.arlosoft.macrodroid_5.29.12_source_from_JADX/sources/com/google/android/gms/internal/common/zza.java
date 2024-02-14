package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class zza implements IInterface {

    /* renamed from: a */
    private final IBinder f39280a;

    /* renamed from: c */
    private final String f39281c;

    protected zza(IBinder iBinder, String str) {
        this.f39280a = iBinder;
        this.f39281c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A1 */
    public final Parcel mo48610A1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f39281c);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f39280a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final void mo48612t1(int i, Parcel parcel) throws RemoteException {
        try {
            this.f39280a.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Parcel mo48613y(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f39280a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
