package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbqq;
import com.google.android.gms.internal.ads.zzbqr;
import com.google.android.gms.internal.ads.zzbqu;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzccl;
import com.google.android.gms.internal.ads.zzcfg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzcb extends zzasa implements zzcc {
    public zzcb() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String readString = parcel.readString();
                zzbvk Jb = zzbvj.m44201Jb(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzasb.m42225c(parcel);
                zzbs Y7 = mo19863Y7(IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder()), (zzq) zzasb.m42223a(parcel, zzq.CREATOR), readString, Jb, readInt);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, Y7);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzbvk Jb2 = zzbvj.m44201Jb(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzasb.m42225c(parcel);
                zzbs p7 = mo19866p7(IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder()), (zzq) zzasb.m42223a(parcel, zzq.CREATOR), readString2, Jb2, readInt2);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, p7);
                return true;
            case 3:
                IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbvk Jb3 = zzbvj.m44201Jb(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzasb.m42225c(parcel);
                zzbo yb = mo19867yb(t1, readString3, Jb3, readInt3);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, yb);
                return true;
            case 4:
                IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, (IInterface) null);
                return true;
            case 5:
                IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                IObjectWrapper t13 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                zzbmi E4 = mo19856E4(t12, t13);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, E4);
                return true;
            case 6:
                IObjectWrapper t14 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzbvk Jb4 = zzbvj.m44201Jb(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzasb.m42225c(parcel);
                zzcbv O8 = mo19862O8(t14, Jb4, readInt4);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, O8);
                return true;
            case 7:
                IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, (IInterface) null);
                return true;
            case 8:
                IObjectWrapper t15 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                zzbzc D1 = mo19855D1(t15);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, D1);
                return true;
            case 9:
                IObjectWrapper t16 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzasb.m42225c(parcel);
                zzcm L0 = mo19861L0(t16, readInt5);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, L0);
                return true;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzasb.m42225c(parcel);
                zzbs F9 = mo19857F9(IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder()), (zzq) zzasb.m42223a(parcel, zzq.CREATOR), readString4, readInt6);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, F9);
                return true;
            case 11:
                IObjectWrapper t17 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                IObjectWrapper t18 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                IObjectWrapper t19 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                zzbmo lb = mo19865lb(t17, t18, t19);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, lb);
                return true;
            case 12:
                IObjectWrapper t110 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbvk Jb5 = zzbvj.m44201Jb(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzasb.m42225c(parcel);
                zzccl B3 = mo19854B3(t110, readString5, Jb5, readInt7);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, B3);
                return true;
            case 13:
                String readString6 = parcel.readString();
                zzbvk Jb6 = zzbvj.m44201Jb(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzasb.m42225c(parcel);
                zzbs G8 = mo19858G8(IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder()), (zzq) zzasb.m42223a(parcel, zzq.CREATOR), readString6, Jb6, readInt8);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, G8);
                return true;
            case 14:
                IObjectWrapper t111 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzbvk Jb7 = zzbvj.m44201Jb(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzasb.m42225c(parcel);
                zzcfg H8 = mo19859H8(t111, Jb7, readInt9);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, H8);
                return true;
            case 15:
                IObjectWrapper t112 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzbvk Jb8 = zzbvj.m44201Jb(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzasb.m42225c(parcel);
                zzbyv ha = mo19864ha(t112, Jb8, readInt10);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, ha);
                return true;
            case 16:
                IObjectWrapper t113 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzbvk Jb9 = zzbvj.m44201Jb(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbqr Jb10 = zzbqq.m43986Jb(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                zzbqu K1 = mo19860K1(t113, Jb9, readInt11, Jb10);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, K1);
                return true;
            default:
                return false;
        }
    }
}
