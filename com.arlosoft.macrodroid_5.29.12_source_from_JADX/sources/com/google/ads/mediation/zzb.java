package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzb extends AdListener implements AppEventListener, zza {
    @VisibleForTesting
    final AbstractAdViewAdapter zza;
    @VisibleForTesting
    final MediationBannerListener zzb;

    public zzb(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.zza = abstractAdViewAdapter;
        this.zzb = mediationBannerListener;
    }

    public final void onAdClicked() {
        this.zzb.mo20489f(this.zza);
    }

    public final void onAdClosed() {
        this.zzb.mo20493m(this.zza);
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzb.mo20488d(this.zza, loadAdError);
    }

    public final void onAdLoaded() {
        this.zzb.mo20490h(this.zza);
    }

    public final void onAdOpened() {
        this.zzb.mo20491j(this.zza);
    }

    public final void onAppEvent(String str, String str2) {
        this.zzb.mo20492k(this.zza, str, str2);
    }
}
