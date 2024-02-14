package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbvs extends zzasa implements zzbvt {
    public zzbvs() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    /* renamed from: Jb */
    public static zzbvt m44319Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof zzbvt ? (zzbvt) queryLocalInterface : new zzbvr(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper b = mo43089b();
            parcel2.writeNoException();
            zzasb.m42229g(parcel2, b);
        } else if (i != 2) {
            return false;
        } else {
            boolean c = mo43090c();
            parcel2.writeNoException();
            zzasb.m42226d(parcel2, c);
        }
        return true;
    }
}
