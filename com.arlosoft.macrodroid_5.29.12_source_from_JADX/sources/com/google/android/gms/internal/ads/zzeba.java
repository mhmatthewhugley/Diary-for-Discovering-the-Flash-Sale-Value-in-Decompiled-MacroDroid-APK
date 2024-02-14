package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzeba extends RewardedInterstitialAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ String f33612a;

    /* renamed from: b */
    final /* synthetic */ String f33613b;

    /* renamed from: c */
    final /* synthetic */ zzebe f33614c;

    zzeba(zzebe zzebe, String str, String str2) {
        this.f33614c = zzebe;
        this.f33612a = str;
        this.f33613b = str2;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f33614c.m48545j(zzebe.m48544i(loadAdError), this.f33613b);
    }

    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        this.f33614c.mo45144e(this.f33612a, (RewardedInterstitialAd) obj, this.f33613b);
    }
}
