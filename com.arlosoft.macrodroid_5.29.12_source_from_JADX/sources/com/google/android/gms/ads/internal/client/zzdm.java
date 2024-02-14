package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzdm extends zzasa implements zzdn {
    public zzdm() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo20015g();
        } else if (i == 2) {
            mo20013e();
        } else if (i == 3) {
            mo20014f();
        } else if (i == 4) {
            mo20012b();
        } else if (i != 5) {
            return false;
        } else {
            boolean h = zzasb.m42230h(parcel);
            zzasb.m42225c(parcel);
            mo20011A5(h);
        }
        parcel2.writeNoException();
        return true;
    }
}
