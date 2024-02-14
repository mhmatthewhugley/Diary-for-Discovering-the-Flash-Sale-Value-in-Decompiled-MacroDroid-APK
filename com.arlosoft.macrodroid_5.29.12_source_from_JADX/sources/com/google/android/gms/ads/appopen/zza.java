package com.google.android.gms.ads.appopen;

import android.content.Context;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.internal.ads.zzbdr;
import com.google.android.gms.internal.ads.zzcaf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zza implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f1732a;

    /* renamed from: c */
    public final /* synthetic */ String f1733c;

    /* renamed from: d */
    public final /* synthetic */ AdManagerAdRequest f1734d;

    /* renamed from: f */
    public final /* synthetic */ int f1735f;

    /* renamed from: g */
    public final /* synthetic */ AppOpenAd.AppOpenAdLoadCallback f1736g;

    public final void run() {
        Context context = this.f1732a;
        String str = this.f1733c;
        AdManagerAdRequest adManagerAdRequest = this.f1734d;
        try {
            new zzbdr(context, str, adManagerAdRequest.mo19668a(), this.f1735f, this.f1736g).mo42512a();
        } catch (IllegalStateException e) {
            zzcaf.m44757c(context).mo43253b(e, "AppOpenAdManager.load");
        }
    }
}
