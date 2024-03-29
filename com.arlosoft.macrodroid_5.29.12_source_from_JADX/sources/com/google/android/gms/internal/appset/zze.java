package com.google.android.gms.internal.appset;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public abstract class zze extends zzb implements zzf {
    public zze() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo48487y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo48488e4((Status) zzc.m55600a(parcel, Status.CREATOR), (zzc) zzc.m55600a(parcel, zzc.CREATOR));
        return true;
    }
}
