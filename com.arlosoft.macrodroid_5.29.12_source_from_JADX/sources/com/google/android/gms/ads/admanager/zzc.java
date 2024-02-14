package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzcaf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zzc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f1728a;

    /* renamed from: c */
    public final /* synthetic */ String f1729c;

    /* renamed from: d */
    public final /* synthetic */ AdManagerAdRequest f1730d;

    /* renamed from: f */
    public final /* synthetic */ AdManagerInterstitialAdLoadCallback f1731f;

    public final void run() {
        Context context = this.f1728a;
        String str = this.f1729c;
        AdManagerAdRequest adManagerAdRequest = this.f1730d;
        try {
            new zzbsm(context, str).mo42952f(adManagerAdRequest.mo19668a(), this.f1731f);
        } catch (IllegalStateException e) {
            zzcaf.m44757c(context).mo43253b(e, "AdManagerInterstitialAd.load");
        }
    }
}
