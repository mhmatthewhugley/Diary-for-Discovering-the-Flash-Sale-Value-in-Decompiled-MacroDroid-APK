package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public abstract class zzaz extends zzb implements zzba {
    public zzaz() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: t1 */
    public static zzba m64852t1(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (queryLocalInterface instanceof zzba) {
            return (zzba) queryLocalInterface;
        }
        return new zzay(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50507y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo50535y7((LocationResult) zzc.m59298b(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo50534g3((LocationAvailability) zzc.m59298b(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
