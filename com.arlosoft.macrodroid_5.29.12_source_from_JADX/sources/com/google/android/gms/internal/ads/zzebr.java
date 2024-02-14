package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzebr implements zzgxi {

    /* renamed from: a */
    private final zzgxv f33654a;

    /* renamed from: b */
    private final zzgxv f33655b;

    public zzebr(zzgxv zzgxv, zzgxv zzgxv2) {
        this.f33654a = zzgxv;
        this.f33655b = zzgxv2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        CookieManager b = zzt.m2906s().mo20247b((Context) this.f33655b.zzb());
        zzfib zzfib = zzfib.WEBVIEW_COOKIE;
        return zzfhr.m50179a(new zzebo(b), zzfib, (zzfih) this.f33654a.zzb()).mo45750i(1, TimeUnit.SECONDS).mo45744c(Exception.class, new zzfhu(zzebp.f33650a)).mo45742a();
    }
}
