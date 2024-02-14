package com.google.android.gms.internal.p202authapiphone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzb */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public class zzb implements IInterface {

    /* renamed from: a */
    private final IBinder f39100a;

    /* renamed from: c */
    private final String f39101c;

    protected zzb(IBinder iBinder, String str) {
        this.f39100a = iBinder;
        this.f39101c = str;
    }

    public IBinder asBinder() {
        return this.f39100a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final void mo48498t1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f39100a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Parcel mo48499y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f39101c);
        return obtain;
    }
}
