package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzdd extends zzasa implements zzde {
    public zzdd() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    /* renamed from: Jb */
    public static zzde m2134Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof zzde ? (zzde) queryLocalInterface : new zzdc(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzasb.m42225c(parcel);
        mo19991V9((zzs) zzasb.m42223a(parcel, zzs.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
