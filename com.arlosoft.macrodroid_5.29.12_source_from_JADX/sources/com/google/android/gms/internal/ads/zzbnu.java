package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbnu extends zzasa implements zzbnv {
    public zzbnu() {
        super("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    /* renamed from: Jb */
    public static zzbnv m43818Jb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return queryLocalInterface instanceof zzbnv ? (zzbnv) queryLocalInterface : new zzbnt(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
        zzasb.m42225c(parcel);
        boolean q0 = mo20139q0(t1);
        parcel2.writeNoException();
        zzasb.m42226d(parcel2, q0);
        return true;
    }
}
