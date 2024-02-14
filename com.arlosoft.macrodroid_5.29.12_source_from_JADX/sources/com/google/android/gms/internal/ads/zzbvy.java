package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbvy extends zzasa implements zzbvz {
    public zzbvy() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: Jb */
    public static zzbvz m44387Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof zzbvz ? (zzbvz) queryLocalInterface : new zzbvx(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String p = mo43148p();
                parcel2.writeNoException();
                parcel2.writeString(p);
                return true;
            case 3:
                List w = mo43153w();
                parcel2.writeNoException();
                parcel2.writeList(w);
                return true;
            case 4:
                String s = mo43151s();
                parcel2.writeNoException();
                parcel2.writeString(s);
                return true;
            case 5:
                zzbme j = mo43143j();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, j);
                return true;
            case 6:
                String q = mo43149q();
                parcel2.writeNoException();
                parcel2.writeString(q);
                return true;
            case 7:
                String m = mo43146m();
                parcel2.writeNoException();
                parcel2.writeString(m);
                return true;
            case 8:
                double b = mo43135b();
                parcel2.writeNoException();
                parcel2.writeDouble(b);
                return true;
            case 9:
                String u = mo43152u();
                parcel2.writeNoException();
                parcel2.writeString(u);
                return true;
            case 10:
                String r = mo43150r();
                parcel2.writeNoException();
                parcel2.writeString(r);
                return true;
            case 11:
                zzdk h = mo43141h();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, h);
                return true;
            case 12:
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, (IInterface) null);
                return true;
            case 13:
                IObjectWrapper k = mo43144k();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, k);
                return true;
            case 14:
                IObjectWrapper n = mo43147n();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, n);
                return true;
            case 15:
                IObjectWrapper l = mo43145l();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, l);
                return true;
            case 16:
                Bundle g = mo43140g();
                parcel2.writeNoException();
                zzasb.m42228f(parcel2, g);
                return true;
            case 17:
                boolean V = mo43134V();
                parcel2.writeNoException();
                zzasb.m42226d(parcel2, V);
                return true;
            case 18:
                boolean F = mo43133F();
                parcel2.writeNoException();
                zzasb.m42226d(parcel2, F);
                return true;
            case 19:
                mo43132D();
                parcel2.writeNoException();
                return true;
            case 20:
                IObjectWrapper t1 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo43136b7(t1);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper t12 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                IObjectWrapper t13 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                IObjectWrapper t14 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo43154wa(t12, t13, t14);
                parcel2.writeNoException();
                return true;
            case 22:
                IObjectWrapper t15 = IObjectWrapper.Stub.m5043t1(parcel.readStrongBinder());
                zzasb.m42225c(parcel);
                mo43131B8(t15);
                parcel2.writeNoException();
                return true;
            case 23:
                float c = mo43137c();
                parcel2.writeNoException();
                parcel2.writeFloat(c);
                return true;
            case 24:
                float e = mo43138e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            case 25:
                float f = mo43139f();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            default:
                return false;
        }
    }
}
