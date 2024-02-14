package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbzb extends zzasa implements zzbzc {
    public zzbzb() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* renamed from: Jb */
    public static zzbzc m44712Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof zzbzc ? (zzbzc) queryLocalInterface : new zzbza(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzasb.m42225c(parcel);
                mo20193T0((Bundle) zzasb.m42223a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                mo20210q();
                parcel2.writeNoException();
                return true;
            case 4:
                mo20206m();
                parcel2.writeNoException();
                return true;
            case 5:
                mo20207n();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle = (Bundle) zzasb.m42223a(parcel, Bundle.CREATOR);
                zzasb.m42225c(parcel);
                mo20204k0(bundle);
                parcel2.writeNoException();
                zzasb.m42228f(parcel2, bundle);
                return true;
            case 7:
                mo20208p();
                parcel2.writeNoException();
                return true;
            case 8:
                mo20201j();
                parcel2.writeNoException();
                return true;
            case 9:
                mo20212w();
                parcel2.writeNoException();
                return true;
            case 10:
                mo20199e();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean P = mo20189P();
                parcel2.writeNoException();
                zzasb.m42226d(parcel2, P);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                Intent intent = (Intent) zzasb.m42223a(parcel, Intent.CREATOR);
                zzasb.m42225c(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo20200i0(t1);
                parcel2.writeNoException();
                return true;
            case 14:
                mo20211r();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
