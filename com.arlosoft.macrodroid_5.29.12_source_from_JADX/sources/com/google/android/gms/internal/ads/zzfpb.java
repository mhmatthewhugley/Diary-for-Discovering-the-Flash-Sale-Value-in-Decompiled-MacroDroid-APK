package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzfpb extends zzasa implements zzfpc {
    public zzfpb() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                parcel.readString();
                zzasb.m42225c(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzasb.m42225c(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzasb.m42225c(parcel);
                break;
            case 6:
                parcel.readInt();
                zzasb.m42225c(parcel);
                break;
            case 7:
                parcel.readInt();
                zzasb.m42225c(parcel);
                break;
            case 8:
                IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzasb.m42225c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
