package com.google.ads.mediation;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzc extends InterstitialAdLoadCallback {
    @VisibleForTesting
    final AbstractAdViewAdapter zza;
    @VisibleForTesting
    final MediationInterstitialListener zzb;

    public zzc(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.zza = abstractAdViewAdapter;
        this.zzb = mediationInterstitialListener;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzb.mo20499o(this.zza, loadAdError);
    }

    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        InterstitialAd interstitialAd = (InterstitialAd) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.zza;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd;
        interstitialAd.mo20462c(new zzd(abstractAdViewAdapter, this.zzb));
        this.zzb.mo20500p(this.zza);
    }
}
