package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzccx {
    @Nullable
    /* renamed from: a */
    public static final zzccl m44927a(Context context, String str, zzbvk zzbvk) {
        try {
            IBinder Z8 = ((zzccp) zzcgt.m45236b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzccw.f28214a)).mo43358Z8(ObjectWrapper.m5051g8(context), str, zzbvk, 223104000);
            if (Z8 == null) {
                return null;
            }
            IInterface queryLocalInterface = Z8.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzccl ? (zzccl) queryLocalInterface : new zzccj(Z8);
        } catch (RemoteException | zzcgs e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
