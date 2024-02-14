package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-base@@21.3.0 */
public class zzarz implements IInterface {

    /* renamed from: a */
    private final IBinder f25395a;

    /* renamed from: c */
    private final String f25396c;

    protected zzarz(IBinder iBinder, String str) {
        this.f25395a = iBinder;
        this.f25396c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A1 */
    public final void mo41865A1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f25395a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f25395a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g8 */
    public final void mo41867g8(int i, Parcel parcel) throws RemoteException {
        try {
            this.f25395a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final Parcel mo41868t1(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f25395a.transact(i, parcel, parcel, 0);
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
    public final Parcel mo41869y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f25396c);
        return obtain;
    }
}
