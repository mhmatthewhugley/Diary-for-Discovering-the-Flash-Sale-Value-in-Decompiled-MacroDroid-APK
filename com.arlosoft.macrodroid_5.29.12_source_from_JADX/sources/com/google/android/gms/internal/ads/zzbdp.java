package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbdp extends zzasa implements zzbdq {
    public zzbdp() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo42503c();
        } else if (i == 2) {
            mo42501a();
        } else if (i == 3) {
            zzasb.m42225c(parcel);
            mo42500H0((zze) zzasb.m42223a(parcel, zze.CREATOR));
        } else if (i == 4) {
            mo42502b();
        } else if (i != 5) {
            return false;
        } else {
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
