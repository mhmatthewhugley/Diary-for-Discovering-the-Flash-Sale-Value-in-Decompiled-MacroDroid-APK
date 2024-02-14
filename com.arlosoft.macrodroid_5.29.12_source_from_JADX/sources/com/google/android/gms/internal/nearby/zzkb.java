package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzkb extends zzb implements zzkc {
    public zzkb() {
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc.m62338c(parcel);
            mo52728w8((zzle) zzc.m62336a(parcel, zzle.CREATOR));
            return true;
        } else if (i == 3) {
            zzc.m62338c(parcel);
            mo52726g5((zzlg) zzc.m62336a(parcel, zzlg.CREATOR));
            return true;
        } else if (i == 4) {
            zzlq zzlq = (zzlq) zzc.m62336a(parcel, zzlq.CREATOR);
            zzc.m62338c(parcel);
            return true;
        } else if (i != 5) {
            return false;
        } else {
            zzc.m62338c(parcel);
            mo52727kb((zzlc) zzc.m62336a(parcel, zzlc.CREATOR));
            return true;
        }
    }
}
