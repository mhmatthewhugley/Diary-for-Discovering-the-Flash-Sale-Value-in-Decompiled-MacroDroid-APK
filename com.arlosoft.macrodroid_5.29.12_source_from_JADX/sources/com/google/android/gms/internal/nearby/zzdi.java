package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.ExposureWindow;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzdi extends zzb implements zzdj {
    public zzdi() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IExposureWindowListCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ArrayList<ExposureWindow> createTypedArrayList = parcel.createTypedArrayList(ExposureWindow.CREATOR);
        zzc.m62338c(parcel);
        mo52532Y((Status) zzc.m62336a(parcel, Status.CREATOR), createTypedArrayList);
        return true;
    }
}
