package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzd extends FullScreenContentCallback {
    @VisibleForTesting
    final AbstractAdViewAdapter zza;
    @VisibleForTesting
    final MediationInterstitialListener zzb;

    public zzd(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.zza = abstractAdViewAdapter;
        this.zzb = mediationInterstitialListener;
    }

    public final void onAdDismissedFullScreenContent() {
        this.zzb.mo20501q(this.zza);
    }

    public final void onAdShowedFullScreenContent() {
        this.zzb.mo20502s(this.zza);
    }
}
