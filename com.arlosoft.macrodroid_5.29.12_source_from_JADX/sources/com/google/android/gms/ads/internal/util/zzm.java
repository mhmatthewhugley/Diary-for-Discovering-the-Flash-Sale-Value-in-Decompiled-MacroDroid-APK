package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzfpz;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzm implements Callable {

    /* renamed from: a */
    public final /* synthetic */ WebSettings f2298a;

    /* renamed from: c */
    public final /* synthetic */ Context f2299c;

    public /* synthetic */ zzm(WebSettings webSettings, Context context) {
        this.f2298a = webSettings;
        this.f2299c = context;
    }

    public final Object call() {
        WebSettings webSettings = this.f2298a;
        Context context = this.f2299c;
        zzfpz zzfpz = zzs.f2304i;
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26847E0)).booleanValue()) {
            webSettings.setTextZoom(100);
        }
        webSettings.setAllowContentAccess(false);
        return Boolean.TRUE;
    }
}
