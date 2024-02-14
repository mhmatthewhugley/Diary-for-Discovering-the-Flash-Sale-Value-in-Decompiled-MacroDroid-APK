package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzccc extends zzasa implements zzccd {
    public zzccc() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: Jb */
    public static zzccd m44859Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof zzccd ? (zzccd) queryLocalInterface : new zzccb(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo43333D1(t1);
                break;
            case 2:
                IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzasb.m42225c(parcel);
                mo43343v7(t12, readInt);
                break;
            case 3:
                IObjectWrapper t13 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo43340y0(t13);
                break;
            case 4:
                IObjectWrapper t14 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo43338i0(t14);
                break;
            case 5:
                IObjectWrapper t15 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo43339k2(t15);
                break;
            case 6:
                IObjectWrapper t16 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo43337f1(t16);
                break;
            case 7:
                zzasb.m42225c(parcel);
                mo43334J4(IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder()), (zzcce) zzasb.m42223a(parcel, zzcce.CREATOR));
                break;
            case 8:
                IObjectWrapper t17 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                zze(t17);
                break;
            case 9:
                IObjectWrapper t18 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzasb.m42225c(parcel);
                mo43335L0(t18, readInt2);
                break;
            case 10:
                IObjectWrapper t19 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo43342k8(t19);
                break;
            case 11:
                IObjectWrapper t110 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo43336O2(t110);
                break;
            case 12:
                Bundle bundle = (Bundle) zzasb.m42223a(parcel, Bundle.CREATOR);
                zzasb.m42225c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
