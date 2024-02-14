package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.PackageConfiguration;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzdt extends zzb implements zzdu {
    public zzdt() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IPackageConfigurationCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzc.m62338c(parcel);
        mo52527z6((Status) zzc.m62336a(parcel, Status.CREATOR), (PackageConfiguration) zzc.m62336a(parcel, PackageConfiguration.CREATOR));
        return true;
    }
}
