package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.android.billingclient:billing@@4.0.0 */
public class zze implements IInterface {

    /* renamed from: a */
    private final IBinder f45478a;

    /* renamed from: c */
    private final String f45479c = "com.android.vending.billing.IInAppBillingService";

    protected zze(IBinder iBinder, String str) {
        this.f45478a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f45478a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final Parcel mo53693t1(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f45478a.transact(i, parcel, parcel, 0);
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
    public final Parcel mo53694y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f45479c);
        return obtain;
    }
}
