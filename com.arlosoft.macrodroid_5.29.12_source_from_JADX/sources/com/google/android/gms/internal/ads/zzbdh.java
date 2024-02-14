package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbdh extends zzarz implements zzbdj {
    zzbdh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    /* renamed from: M8 */
    public final void mo42505M8(IObjectWrapper iObjectWrapper, zzbdq zzbdq) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, iObjectWrapper);
        zzasb.m42229g(y, zzbdq);
        mo41865A1(4, y);
    }

    /* renamed from: c */
    public final zzdh mo42506c() throws RemoteException {
        Parcel t1 = mo41868t1(5, mo41869y());
        zzdh Jb = zzdg.m2143Jb(t1.readStrongBinder());
        t1.recycle();
        return Jb;
    }
}
