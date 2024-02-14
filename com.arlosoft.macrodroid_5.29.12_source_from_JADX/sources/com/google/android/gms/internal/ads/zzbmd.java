package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbmd extends zzasa implements zzbme {
    public zzbmd() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: Jb */
    public static zzbme m43695Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof zzbme ? (zzbme) queryLocalInterface : new zzbmc(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper c = mo42743c();
            parcel2.writeNoException();
            zzasb.m42229g(parcel2, c);
        } else if (i == 2) {
            Uri b = mo42742b();
            parcel2.writeNoException();
            zzasb.m42228f(parcel2, b);
        } else if (i == 3) {
            double zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeDouble(zzb);
        } else if (i == 4) {
            int d = mo42744d();
            parcel2.writeNoException();
            parcel2.writeInt(d);
        } else if (i != 5) {
            return false;
        } else {
            int a = mo42741a();
            parcel2.writeNoException();
            parcel2.writeInt(a);
        }
        return true;
    }
}
