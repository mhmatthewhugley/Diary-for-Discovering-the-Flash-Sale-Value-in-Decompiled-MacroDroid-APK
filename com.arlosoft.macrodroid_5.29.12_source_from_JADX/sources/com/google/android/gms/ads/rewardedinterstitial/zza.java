package com.google.android.gms.ads.rewardedinterstitial;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcdf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zza implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f2604a;

    /* renamed from: c */
    public final /* synthetic */ String f2605c;

    /* renamed from: d */
    public final /* synthetic */ AdRequest f2606d;

    /* renamed from: f */
    public final /* synthetic */ RewardedInterstitialAdLoadCallback f2607f;

    public /* synthetic */ zza(Context context, String str, AdRequest adRequest, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        this.f2604a = context;
        this.f2605c = str;
        this.f2606d = adRequest;
        this.f2607f = rewardedInterstitialAdLoadCallback;
    }

    public final void run() {
        Context context = this.f2604a;
        String str = this.f2605c;
        AdRequest adRequest = this.f2606d;
        try {
            new zzcdf(context, str).mo43390d(adRequest.mo19668a(), this.f2607f);
        } catch (IllegalStateException e) {
            zzcaf.m44757c(context).mo43253b(e, "RewardedInterstitialAd.load");
        }
    }
}
