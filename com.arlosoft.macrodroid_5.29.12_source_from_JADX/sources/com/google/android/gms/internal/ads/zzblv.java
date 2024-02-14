package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzblv extends zzasa implements zzblw {
    public zzblv() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: Jb */
    public static zzblw m43676Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof zzblw ? (zzblw) queryLocalInterface : new zzblu(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            String f = mo42738f();
            parcel2.writeNoException();
            parcel2.writeString(f);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            List e = mo42737e();
            parcel2.writeNoException();
            parcel2.writeList(e);
            return true;
        }
    }
}
