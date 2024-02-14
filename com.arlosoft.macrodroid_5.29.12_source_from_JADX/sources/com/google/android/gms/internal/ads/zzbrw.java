package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbrw extends zzasa implements zzbrx {
    public zzbrw() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    /* renamed from: Jb */
    public static zzbrx m44026Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof zzbrx ? (zzbrx) queryLocalInterface : new zzbrv(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ArrayList<zzbrq> createTypedArrayList = parcel.createTypedArrayList(zzbrq.CREATOR);
        zzasb.m42225c(parcel);
        mo20076j5(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
