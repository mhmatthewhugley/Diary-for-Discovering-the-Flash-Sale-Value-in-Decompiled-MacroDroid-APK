package com.google.android.gms.ads.appopen;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.internal.ads.zzbdr;
import com.google.android.gms.internal.ads.zzcaf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zzb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f1737a;

    /* renamed from: c */
    public final /* synthetic */ String f1738c;

    /* renamed from: d */
    public final /* synthetic */ AdRequest f1739d;

    /* renamed from: f */
    public final /* synthetic */ int f1740f;

    /* renamed from: g */
    public final /* synthetic */ AppOpenAd.AppOpenAdLoadCallback f1741g;

    public /* synthetic */ zzb(Context context, String str, AdRequest adRequest, int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.f1737a = context;
        this.f1738c = str;
        this.f1739d = adRequest;
        this.f1740f = i;
        this.f1741g = appOpenAdLoadCallback;
    }

    public final void run() {
        Context context = this.f1737a;
        String str = this.f1738c;
        AdRequest adRequest = this.f1739d;
        try {
            new zzbdr(context, str, adRequest.mo19668a(), this.f1740f, this.f1741g).mo42512a();
        } catch (IllegalStateException e) {
            zzcaf.m44757c(context).mo43253b(e, "AppOpenAd.load");
        }
    }
}
