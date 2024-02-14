package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbms extends zzasa implements zzbmt {
    public zzbms() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper e = mo42770e();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, e);
                return true;
            case 3:
                String i3 = mo42774i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 4:
                List l = mo42778l();
                parcel2.writeNoException();
                parcel2.writeList(l);
                return true;
            case 5:
                String g = mo42772g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 6:
                zzbme c = mo42768c();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, c);
                return true;
            case 7:
                String h = mo42773h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                return true;
            case 8:
                double zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(zzb);
                return true;
            case 9:
                String n = mo42780n();
                parcel2.writeNoException();
                parcel2.writeString(n);
                return true;
            case 10:
                String k = mo42776k();
                parcel2.writeNoException();
                parcel2.writeString(k);
                return true;
            case 11:
                Bundle a = mo42766a();
                parcel2.writeNoException();
                zzasb.m42228f(parcel2, a);
                return true;
            case 12:
                mo42779m();
                parcel2.writeNoException();
                return true;
            case 13:
                zzdk d = mo42769d();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, d);
                return true;
            case 14:
                zzasb.m42225c(parcel);
                mo42777k0((Bundle) zzasb.m42223a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzasb.m42225c(parcel);
                boolean u1 = mo42781u1((Bundle) zzasb.m42223a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzasb.m42226d(parcel2, u1);
                return true;
            case 16:
                zzasb.m42225c(parcel);
                mo42782x1((Bundle) zzasb.m42223a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                zzblw b = mo42767b();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, b);
                return true;
            case 18:
                IObjectWrapper f = mo42771f();
                parcel2.writeNoException();
                zzasb.m42229g(parcel2, f);
                return true;
            case 19:
                String j = mo42775j();
                parcel2.writeNoException();
                parcel2.writeString(j);
                return true;
            default:
                return false;
        }
    }
}
