package com.google.android.gms.internal.safetynet;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;

public abstract class zzh extends zzb implements zzg {
    public zzh() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo53744y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo53752u7((Status) zzc.m63954a(parcel, Status.CREATOR), (zza) zzc.m63954a(parcel, zza.CREATOR));
        } else if (i == 2) {
            mo53750o(parcel.readString());
        } else if (i == 3) {
            mo53749j3((Status) zzc.m63954a(parcel, Status.CREATOR), (SafeBrowsingData) zzc.m63954a(parcel, SafeBrowsingData.CREATOR));
        } else if (i == 4) {
            mo53748Z0((Status) zzc.m63954a(parcel, Status.CREATOR), zzc.m63956c(parcel));
        } else if (i == 6) {
            mo53746U3((Status) zzc.m63954a(parcel, Status.CREATOR), (zzf) zzc.m63954a(parcel, zzf.CREATOR));
        } else if (i == 8) {
            mo53751p5((Status) zzc.m63954a(parcel, Status.CREATOR), (zzd) zzc.m63954a(parcel, zzd.CREATOR));
        } else if (i == 15) {
            mo53753v5((Status) zzc.m63954a(parcel, Status.CREATOR), (com.google.android.gms.safetynet.zzh) zzc.m63954a(parcel, com.google.android.gms.safetynet.zzh.CREATOR));
        } else if (i == 10) {
            mo53747W0((Status) zzc.m63954a(parcel, Status.CREATOR), zzc.m63956c(parcel));
        } else if (i != 11) {
            return false;
        } else {
            mo53745Q0((Status) zzc.m63954a(parcel, Status.CREATOR));
        }
        return true;
    }
}
