package com.google.android.gms.internal.p203authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.auth-api.zzd */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class zzd implements IInterface {

    /* renamed from: a */
    private final IBinder f39146a;

    /* renamed from: c */
    private final String f39147c;

    protected zzd(IBinder iBinder, String str) {
        this.f39146a = iBinder;
        this.f39147c = str;
    }

    public IBinder asBinder() {
        return this.f39146a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final void mo48518t1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f39146a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Parcel mo48519y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f39147c);
        return obtain;
    }
}
