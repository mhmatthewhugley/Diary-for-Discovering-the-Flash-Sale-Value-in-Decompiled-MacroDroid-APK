package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbzk extends zzasa implements zzbzl {
    /* renamed from: Jb */
    public static zzbzl m44730Jb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return queryLocalInterface instanceof zzbzl ? (zzbzl) queryLocalInterface : new zzbzj(iBinder);
    }
}
