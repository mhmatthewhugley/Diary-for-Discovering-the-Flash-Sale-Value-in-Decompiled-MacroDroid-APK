package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzcat extends zzasa implements zzcau {
    public zzcat() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcay zzcay = null;
        if (i == 1) {
            zzcao zzcao = (zzcao) zzasb.m42223a(parcel, zzcao.CREATOR);
            zzasb.m42225c(parcel);
            parcel2.writeNoException();
            zzasb.m42228f(parcel2, (Parcelable) null);
        } else if (i == 2) {
            zzcao zzcao2 = (zzcao) zzasb.m42223a(parcel, zzcao.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof zzcav) {
                    zzcav zzcav = (zzcav) queryLocalInterface;
                }
            }
            zzasb.m42225c(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzcbc zzcbc = (zzcbc) zzasb.m42223a(parcel, zzcbc.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcay = queryLocalInterface2 instanceof zzcay ? (zzcay) queryLocalInterface2 : new zzcaw(readStrongBinder2);
            }
            zzasb.m42225c(parcel);
            mo43266h8(zzcbc, zzcay);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzcbc zzcbc2 = (zzcbc) zzasb.m42223a(parcel, zzcbc.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcay = queryLocalInterface3 instanceof zzcay ? (zzcay) queryLocalInterface3 : new zzcaw(readStrongBinder3);
            }
            zzasb.m42225c(parcel);
            mo43264P8(zzcbc2, zzcay);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzcbc zzcbc3 = (zzcbc) zzasb.m42223a(parcel, zzcbc.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcay = queryLocalInterface4 instanceof zzcay ? (zzcay) queryLocalInterface4 : new zzcaw(readStrongBinder4);
            }
            zzasb.m42225c(parcel);
            mo43265Q6(zzcbc3, zzcay);
            parcel2.writeNoException();
        } else if (i != 7) {
            return false;
        } else {
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcay = queryLocalInterface5 instanceof zzcay ? (zzcay) queryLocalInterface5 : new zzcaw(readStrongBinder5);
            }
            zzasb.m42225c(parcel);
            mo43263H9(readString, zzcay);
            parcel2.writeNoException();
        }
        return true;
    }
}
