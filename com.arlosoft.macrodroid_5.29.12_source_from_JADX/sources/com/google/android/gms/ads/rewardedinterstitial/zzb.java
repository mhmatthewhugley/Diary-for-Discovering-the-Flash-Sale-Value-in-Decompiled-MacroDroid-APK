package com.google.android.gms.ads.rewardedinterstitial;

import android.content.Context;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcdf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zzb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f2608a;

    /* renamed from: c */
    public final /* synthetic */ String f2609c;

    /* renamed from: d */
    public final /* synthetic */ AdManagerAdRequest f2610d;

    /* renamed from: f */
    public final /* synthetic */ RewardedInterstitialAdLoadCallback f2611f;

    public final void run() {
        Context context = this.f2608a;
        String str = this.f2609c;
        AdManagerAdRequest adManagerAdRequest = this.f2610d;
        try {
            new zzcdf(context, str).mo43390d(adManagerAdRequest.mo19668a(), this.f2611f);
        } catch (IllegalStateException e) {
            zzcaf.m44757c(context).mo43253b(e, "RewardedInterstitialAdManager.load");
        }
    }
}
