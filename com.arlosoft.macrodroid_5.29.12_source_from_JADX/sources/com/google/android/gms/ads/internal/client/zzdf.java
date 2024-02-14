package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasb;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzdf extends zzarz implements zzdh {
    zzdf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    /* renamed from: b */
    public final Bundle mo19992b() throws RemoteException {
        Parcel t1 = mo41868t1(5, mo41869y());
        Bundle bundle = (Bundle) zzasb.m42223a(t1, Bundle.CREATOR);
        t1.recycle();
        return bundle;
    }

    /* renamed from: c */
    public final zzu mo19993c() throws RemoteException {
        Parcel t1 = mo41868t1(4, mo41869y());
        zzu zzu = (zzu) zzasb.m42223a(t1, zzu.CREATOR);
        t1.recycle();
        return zzu;
    }

    /* renamed from: e */
    public final String mo19994e() throws RemoteException {
        Parcel t1 = mo41868t1(6, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: f */
    public final String mo19995f() throws RemoteException {
        Parcel t1 = mo41868t1(1, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: g */
    public final String mo19996g() throws RemoteException {
        Parcel t1 = mo41868t1(2, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: h */
    public final List mo19997h() throws RemoteException {
        Parcel t1 = mo41868t1(3, mo41869y());
        ArrayList<zzu> createTypedArrayList = t1.createTypedArrayList(zzu.CREATOR);
        t1.recycle();
        return createTypedArrayList;
    }
}
