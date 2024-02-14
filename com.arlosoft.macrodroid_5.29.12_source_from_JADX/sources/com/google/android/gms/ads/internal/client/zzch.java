package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbvk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzch extends zzarz implements zzcj {
    zzch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public final zzbvk getAdapterCreator() throws RemoteException {
        Parcel t1 = mo41868t1(2, mo41869y());
        zzbvk Jb = zzbvj.m44201Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }

    public final zzeh getLiteSdkVersion() throws RemoteException {
        Parcel t1 = mo41868t1(1, mo41869y());
        zzeh zzeh = (zzeh) zzasb.m42223a(t1, zzeh.CREATOR);
        t1.recycle();
        return zzeh;
    }
}
