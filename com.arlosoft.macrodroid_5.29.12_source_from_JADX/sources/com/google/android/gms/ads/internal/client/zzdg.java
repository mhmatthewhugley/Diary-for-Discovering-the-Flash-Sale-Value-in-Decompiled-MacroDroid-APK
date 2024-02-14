package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasb;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzdg extends zzasa implements zzdh {
    public zzdg() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    /* renamed from: Jb */
    public static zzdh m2143Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof zzdh ? (zzdh) queryLocalInterface : new zzdf(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ib */
    public final boolean mo19892Ib(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String f = mo19995f();
                parcel2.writeNoException();
                parcel2.writeString(f);
                return true;
            case 2:
                String g = mo19996g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 3:
                List h = mo19997h();
                parcel2.writeNoException();
                parcel2.writeTypedList(h);
                return true;
            case 4:
                zzu c = mo19993c();
                parcel2.writeNoException();
                zzasb.m42228f(parcel2, c);
                return true;
            case 5:
                Bundle b = mo19992b();
                parcel2.writeNoException();
                zzasb.m42228f(parcel2, b);
                return true;
            case 6:
                String e = mo19994e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            default:
                return false;
        }
    }
}
