package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbmx extends zzasa implements zzbmy {
    public zzbmx() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: Jb */
    public static zzbmy m43773Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof zzbmy ? (zzbmy) queryLocalInterface : new zzbmw(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String readString = parcel.readString();
                zzasb.m42225c(parcel);
                String z1 = mo42814z1(readString);
                parcel2.writeNoException();
                parcel2.writeString(z1);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzasb.m42225c(parcel);
                zzbme z0 = mo42813z0(readString2);
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, z0);
                return true;
            case 3:
                List i3 = mo42807i();
                parcel2.writeNoException();
                parcel2.writeStringList(i3);
                return true;
            case 4:
                String g = mo42802g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zzasb.m42225c(parcel);
                mo42804Z(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                mo42810l();
                parcel2.writeNoException();
                return true;
            case 7:
                zzdk b = mo42805b();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, b);
                return true;
            case 8:
                mo42808j();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper e = mo42801e();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, e);
                return true;
            case 10:
                IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                boolean c0 = mo42800c0(t1);
                parcel2.writeNoException();
                zzasb.m42226d(parcel2, c0);
                return true;
            case 11:
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, (IInterface) null);
                return true;
            case 12:
                boolean s = mo42812s();
                parcel2.writeNoException();
                zzasb.m42226d(parcel2, s);
                return true;
            case 13:
                boolean p = mo42811p();
                parcel2.writeNoException();
                zzasb.m42226d(parcel2, p);
                return true;
            case 14:
                IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo42803L3(t12);
                parcel2.writeNoException();
                return true;
            case 15:
                mo42809k();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbmb c = mo42806c();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, c);
                return true;
            default:
                return false;
        }
    }
}
