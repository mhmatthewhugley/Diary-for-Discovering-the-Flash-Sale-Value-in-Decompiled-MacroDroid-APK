package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zza implements CustomEventBannerListener {

    /* renamed from: a */
    private final CustomEventAdapter f2425a;

    /* renamed from: b */
    private final MediationBannerListener f2426b;

    public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
        this.f2425a = customEventAdapter;
        this.f2426b = mediationBannerListener;
    }
}
