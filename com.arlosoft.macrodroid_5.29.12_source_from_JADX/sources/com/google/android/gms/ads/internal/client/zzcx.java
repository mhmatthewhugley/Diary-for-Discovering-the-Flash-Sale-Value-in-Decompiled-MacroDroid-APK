package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzcx extends zzasa implements zzcy {
    public zzcx() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzasb.m42225c(parcel);
        mo19987G3((zze) zzasb.m42223a(parcel, zze.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
