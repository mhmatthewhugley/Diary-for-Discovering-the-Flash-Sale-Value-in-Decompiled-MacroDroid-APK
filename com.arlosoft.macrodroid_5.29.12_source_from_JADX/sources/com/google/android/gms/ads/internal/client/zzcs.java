package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzarz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcs extends zzarz implements zzcu {
    zzcs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* renamed from: b */
    public final String mo19984b() throws RemoteException {
        Parcel t1 = mo41868t1(1, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }

    /* renamed from: c */
    public final String mo19985c() throws RemoteException {
        Parcel t1 = mo41868t1(2, mo41869y());
        String readString = t1.readString();
        t1.recycle();
        return readString;
    }
}
