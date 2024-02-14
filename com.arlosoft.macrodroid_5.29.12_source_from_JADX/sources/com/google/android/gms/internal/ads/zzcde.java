package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcde extends zzccr {

    /* renamed from: a */
    private final RewardedInterstitialAdLoadCallback f28223a;

    /* renamed from: c */
    private final zzcdf f28224c;

    public zzcde(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzcdf zzcdf) {
        this.f28223a = rewardedInterstitialAdLoadCallback;
        this.f28224c = zzcdf;
    }

    /* renamed from: A */
    public final void mo43359A(int i) {
    }

    /* renamed from: C */
    public final void mo43360C(zze zze) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.f28223a;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zze.mo20074m2());
        }
    }

    /* renamed from: f */
    public final void mo43361f() {
        zzcdf zzcdf;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.f28223a;
        if (rewardedInterstitialAdLoadCallback != null && (zzcdf = this.f28224c) != null) {
            rewardedInterstitialAdLoadCallback.onAdLoaded(zzcdf);
        }
    }
}
