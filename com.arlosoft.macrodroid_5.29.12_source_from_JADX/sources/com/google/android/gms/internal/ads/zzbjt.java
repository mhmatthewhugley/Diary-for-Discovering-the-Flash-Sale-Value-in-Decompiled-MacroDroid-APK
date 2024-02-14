package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbjt extends zzasa implements zzbju {
    public zzbjt() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
        } else if (i == 2) {
            String a = mo42692a();
            parcel2.writeNoException();
            parcel2.writeString(a);
        } else if (i == 3) {
            IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
            zzasb.m42225c(parcel);
            mo42695d0(t1);
            parcel2.writeNoException();
        } else if (i == 4) {
            mo42693b();
            parcel2.writeNoException();
        } else if (i != 5) {
            return false;
        } else {
            mo42694c();
            parcel2.writeNoException();
        }
        return true;
    }
}
