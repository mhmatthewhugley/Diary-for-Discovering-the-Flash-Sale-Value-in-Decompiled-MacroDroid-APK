package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasa;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzct extends zzasa implements zzcu {
    public zzct() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* renamed from: Jb */
    public static zzcu m2122Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof zzcu ? (zzcu) queryLocalInterface : new zzcs(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String b = mo19984b();
            parcel2.writeNoException();
            parcel2.writeString(b);
        } else if (i != 2) {
            return false;
        } else {
            String c = mo19985c();
            parcel2.writeNoException();
            parcel2.writeString(c);
        }
        return true;
    }
}
