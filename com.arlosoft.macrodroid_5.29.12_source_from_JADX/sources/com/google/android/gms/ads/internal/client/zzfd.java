package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbnu;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzfd extends zzbnu {

    /* renamed from: a */
    private final ShouldDelayBannerRenderingListener f1972a;

    /* renamed from: q0 */
    public final boolean mo20139q0(IObjectWrapper iObjectWrapper) throws RemoteException {
        return this.f1972a.shouldDelayBannerRendering((Runnable) ObjectWrapper.m5050A1(iObjectWrapper));
    }
}
