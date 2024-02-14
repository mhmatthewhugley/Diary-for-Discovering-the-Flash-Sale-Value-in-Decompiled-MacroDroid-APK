package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbwz extends zzasa implements zzbxa {
    public zzbwz() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            mo43168f();
        } else if (i == 3) {
            String readString = parcel.readString();
            zzasb.m42225c(parcel);
            mo43169z(readString);
        } else if (i != 4) {
            return false;
        } else {
            zzasb.m42225c(parcel);
            mo43167C((zze) zzasb.m42223a(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
