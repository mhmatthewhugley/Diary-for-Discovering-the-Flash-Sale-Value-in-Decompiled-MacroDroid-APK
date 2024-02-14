package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbmu extends zzasa implements zzbmv {
    public zzbmu() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper f = mo42790f();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, f);
                return true;
            case 3:
                String i3 = mo42793i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 4:
                List k = mo42795k();
                parcel2.writeNoException();
                parcel2.writeList(k);
                return true;
            case 5:
                String g = mo42791g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 6:
                zzbme b = mo42786b();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, b);
                return true;
            case 7:
                String h = mo42792h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                return true;
            case 8:
                String e = mo42789e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 9:
                Bundle zzb = zzb();
                parcel2.writeNoException();
                zzasb.m42228f(parcel2, zzb);
                return true;
            case 10:
                mo42797n();
                parcel2.writeNoException();
                return true;
            case 11:
                zzdk a = mo42785a();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, a);
                return true;
            case 12:
                zzasb.m42225c(parcel);
                mo42784I2((Bundle) zzasb.m42223a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzasb.m42225c(parcel);
                boolean k0 = mo42796k0((Bundle) zzasb.m42223a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzasb.m42226d(parcel2, k0);
                return true;
            case 14:
                zzasb.m42225c(parcel);
                mo42798n0((Bundle) zzasb.m42223a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzblw d = mo42788d();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, d);
                return true;
            case 16:
                IObjectWrapper c = mo42787c();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, c);
                return true;
            case 17:
                String j = mo42794j();
                parcel2.writeNoException();
                parcel2.writeString(j);
                return true;
            default:
                return false;
        }
    }
}
