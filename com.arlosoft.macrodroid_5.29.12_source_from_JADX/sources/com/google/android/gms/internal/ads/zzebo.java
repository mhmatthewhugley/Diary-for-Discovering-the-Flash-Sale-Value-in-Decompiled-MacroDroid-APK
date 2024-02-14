package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzebo implements Callable {

    /* renamed from: a */
    public final /* synthetic */ CookieManager f33649a;

    public /* synthetic */ zzebo(CookieManager cookieManager) {
        this.f33649a = cookieManager;
    }

    public final Object call() {
        CookieManager cookieManager = this.f33649a;
        if (cookieManager == null) {
            return "";
        }
        return cookieManager.getCookie((String) zzay.m1924c().mo42663b(zzbjc.f26877H0));
    }
}
