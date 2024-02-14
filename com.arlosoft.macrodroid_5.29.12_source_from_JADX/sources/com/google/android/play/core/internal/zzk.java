package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
public class zzk implements IInterface {

    /* renamed from: a */
    private final IBinder f51722a;

    /* renamed from: c */
    private final String f51723c;

    protected zzk(IBinder iBinder, String str) {
        this.f51722a = iBinder;
        this.f51723c = str;
    }

    public final IBinder asBinder() {
        return this.f51722a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final void mo59892t1(int i, Parcel parcel) throws RemoteException {
        try {
            this.f51722a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Parcel mo59893y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f51723c);
        return obtain;
    }
}
