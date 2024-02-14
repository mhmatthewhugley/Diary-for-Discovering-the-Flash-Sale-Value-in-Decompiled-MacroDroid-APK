package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzcr extends zzb implements zzcs {
    public zzcr() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IDailySummaryListCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ArrayList b = zzc.m62337b(parcel);
        zzc.m62338c(parcel);
        mo52524Y((Status) zzc.m62336a(parcel, Status.CREATOR), b);
        return true;
    }
}
