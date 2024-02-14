package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzccy extends zzccr {

    /* renamed from: a */
    private final RewardedAdLoadCallback f28215a;

    /* renamed from: c */
    private final RewardedAd f28216c;

    public zzccy(RewardedAdLoadCallback rewardedAdLoadCallback, RewardedAd rewardedAd) {
        this.f28215a = rewardedAdLoadCallback;
        this.f28216c = rewardedAd;
    }

    /* renamed from: A */
    public final void mo43359A(int i) {
    }

    /* renamed from: C */
    public final void mo43360C(zze zze) {
        if (this.f28215a != null) {
            this.f28215a.onAdFailedToLoad(zze.mo20074m2());
        }
    }

    /* renamed from: f */
    public final void mo43361f() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.f28215a;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdLoaded(this.f28216c);
        }
    }
}
