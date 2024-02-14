package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public abstract class zzcu extends zzb implements zzcv {
    public zzcu() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IDiagnosisKeyFileSupplier");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo52540y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            boolean a = mo52530a();
            parcel2.writeNoException();
            zzc.m62339d(parcel2, a);
        } else if (i == 2) {
            ParcelFileDescriptor zzb = zzb();
            parcel2.writeNoException();
            zzc.m62341f(parcel2, zzb);
        } else if (i != 3) {
            return false;
        } else {
            parcel2.writeNoException();
            zzc.m62339d(parcel2, true);
        }
        return true;
    }
}
