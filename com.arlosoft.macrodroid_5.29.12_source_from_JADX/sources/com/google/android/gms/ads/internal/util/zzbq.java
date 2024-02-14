package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbq extends zzasa implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzasb.m42225c(parcel);
            boolean zzf = zzf(t1, readString, readString2);
            parcel2.writeNoException();
            zzasb.m42226d(parcel2, zzf);
        } else if (i != 2) {
            return false;
        } else {
            IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
            zzasb.m42225c(parcel);
            zze(t12);
            parcel2.writeNoException();
        }
        return true;
    }
}
