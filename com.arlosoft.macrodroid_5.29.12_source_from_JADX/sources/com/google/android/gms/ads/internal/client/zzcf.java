package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzcf extends zzasa implements zzcg {
    public zzcf() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzasb.m42225c(parcel);
            mo19886H0((zze) zzasb.m42223a(parcel, zze.CREATOR));
        } else if (i == 2) {
            mo19889c();
        } else if (i == 3) {
            mo19887a();
        } else if (i == 4) {
            mo19888b();
        } else if (i != 5) {
            return false;
        } else {
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
