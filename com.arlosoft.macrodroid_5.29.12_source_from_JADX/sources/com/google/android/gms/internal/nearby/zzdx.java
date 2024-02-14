package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzdx extends zzb implements zzdy {
    public zzdx() {
        super("com.google.android.gms.nearby.exposurenotification.internal.ITemporaryExposureKeyListCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ArrayList<TemporaryExposureKey> createTypedArrayList = parcel.createTypedArrayList(TemporaryExposureKey.CREATOR);
        zzc.m62338c(parcel);
        mo52529Y((Status) zzc.m62336a(parcel, Status.CREATOR), createTypedArrayList);
        return true;
    }
}
