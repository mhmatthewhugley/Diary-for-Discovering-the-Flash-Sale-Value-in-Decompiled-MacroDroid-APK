package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbh extends zzasa implements zzbi {
    public zzbh() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo19901a();
        } else if (i != 2) {
            return false;
        } else {
            zzasb.m42225c(parcel);
            mo19902r1((zze) zzasb.m42223a(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
