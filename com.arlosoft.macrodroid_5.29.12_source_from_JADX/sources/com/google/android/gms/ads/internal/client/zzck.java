package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzbrq;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzbvk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzck extends zzarz implements zzcm {
    zzck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* renamed from: F4 */
    public final void mo19966F4(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = mo41869y();
        y.writeString((String) null);
        zzasb.m42229g(y, iObjectWrapper);
        mo41865A1(6, y);
    }

    /* renamed from: Z7 */
    public final void mo19967Z7(zzez zzez) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42227e(y, zzez);
        mo41865A1(14, y);
    }

    /* renamed from: f */
    public final List mo19968f() throws RemoteException {
        Parcel t1 = mo41868t1(13, mo41869y());
        ArrayList<zzbrq> createTypedArrayList = t1.createTypedArrayList(zzbrq.CREATOR);
        t1.recycle();
        return createTypedArrayList;
    }

    /* renamed from: ga */
    public final void mo19969ga(zzbvk zzbvk) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzbvk);
        mo41865A1(11, y);
    }

    /* renamed from: h */
    public final void mo19970h() throws RemoteException {
        mo41865A1(1, mo41869y());
    }

    /* renamed from: k3 */
    public final void mo19971k3(zzbrx zzbrx) throws RemoteException {
        Parcel y = mo41869y();
        zzasb.m42229g(y, zzbrx);
        mo41865A1(12, y);
    }
}
