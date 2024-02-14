package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public abstract class zzbc extends zzb implements zzbd {
    public zzbc() {
        super("com.google.android.gms.location.ILocationListener");
    }

    /* renamed from: t1 */
    public static zzbd m64857t1(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (queryLocalInterface instanceof zzbd) {
            return (zzbd) queryLocalInterface;
        }
        return new zzbb(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo50507y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo50536S1((Location) zzc.m59298b(parcel, Location.CREATOR));
        return true;
    }
}
