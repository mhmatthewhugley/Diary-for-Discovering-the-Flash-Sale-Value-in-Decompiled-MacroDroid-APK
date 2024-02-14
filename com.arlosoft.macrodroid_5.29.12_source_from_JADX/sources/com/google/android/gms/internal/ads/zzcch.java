package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzcch extends zzasa implements zzcci {
    public zzcch() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    /* renamed from: Jb */
    public static zzcci m44874Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return queryLocalInterface instanceof zzcci ? (zzcci) queryLocalInterface : new zzccg(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String c = mo43350c();
            parcel2.writeNoException();
            parcel2.writeString(c);
        } else if (i != 2) {
            return false;
        } else {
            int b = mo43349b();
            parcel2.writeNoException();
            parcel2.writeInt(b);
        }
        return true;
    }
}
