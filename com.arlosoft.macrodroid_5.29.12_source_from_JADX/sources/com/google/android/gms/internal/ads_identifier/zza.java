package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public class zza implements IInterface {

    /* renamed from: a */
    private final IBinder f39071a;

    /* renamed from: c */
    private final String f39072c = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected zza(IBinder iBinder, String str) {
        this.f39071a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f39071a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final Parcel mo48475t1(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f39071a.transact(i, parcel, parcel, 0);
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
    public final Parcel mo48476y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f39072c);
        return obtain;
    }
}
