package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzblu extends zzarz implements zzblw {
    zzblu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: e */
    public final List mo42737e() throws RemoteException {
        Parcel t1 = mo41868t1(3, mo41869y());
        ArrayList b = zzasb.m42224b(t1);
        t1.recycle();
        return b;
    }

    /* renamed from: f */
    public final String mo42738f() throws RemoteException {
        Parcel t1 = mo41868t1(2, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }
}
