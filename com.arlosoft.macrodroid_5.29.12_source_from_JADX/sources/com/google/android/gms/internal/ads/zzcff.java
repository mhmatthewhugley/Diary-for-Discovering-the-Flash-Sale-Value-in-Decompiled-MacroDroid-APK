package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzcff extends zzasa implements zzcfg {
    public zzcff() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    /* renamed from: Jb */
    public static zzcfg m45072Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof zzcfg ? (zzcfg) queryLocalInterface : new zzcfe(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcfd zzcfd = null;
        switch (i) {
            case 1:
                IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzcfk zzcfk = (zzcfk) zzasb.m42223a(parcel, zzcfk.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzcfd = queryLocalInterface instanceof zzcfd ? (zzcfd) queryLocalInterface : new zzcfb(readStrongBinder);
                }
                zzasb.m42225c(parcel);
                mo20663q5(t1, zzcfk, zzcfd);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo20659i0(t12);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, (IInterface) null);
                return true;
            case 4:
                IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, (IInterface) null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper t13 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzbzr Jb = zzbzq.m44734Jb(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo20662p8(createTypedArrayList, t13, Jb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper t14 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzbzr Jb2 = zzbzq.m44734Jb(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo20655U4(createTypedArrayList2, t14, Jb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzasb.m42225c(parcel);
                mo20656U8((zzcaa) zzasb.m42223a(parcel, zzcaa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper t15 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo20668y0(t15);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper t16 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzbzr Jb3 = zzbzq.m44734Jb(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo20667x6(createTypedArrayList3, t16, Jb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper t17 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzbzr Jb4 = zzbzq.m44734Jb(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo20653S5(createTypedArrayList4, t17, Jb4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
