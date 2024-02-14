package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbom extends zzbnr {

    /* renamed from: a */
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener f27589a;

    public zzbom(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.f27589a = onUnifiedNativeAdLoadedListener;
    }

    /* renamed from: y8 */
    public final void mo42826y8(zzbob zzbob) {
        this.f27589a.onUnifiedNativeAdLoaded(new zzboc(zzbob));
    }
}
