package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzox extends zzb implements zzoy {
    public zzox() {
        super("com.google.android.gms.nearby.uwb.internal.IRangingSessionCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc.m62338c(parcel);
            mo53098Bb((zzpm) zzc.m62336a(parcel, zzpm.CREATOR));
            return true;
        } else if (i == 3) {
            zzc.m62338c(parcel);
            mo53099I8((zzpo) zzc.m62336a(parcel, zzpo.CREATOR));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            zzc.m62338c(parcel);
            mo53100V3((zzpq) zzc.m62336a(parcel, zzpq.CREATOR));
            return true;
        }
    }
}
