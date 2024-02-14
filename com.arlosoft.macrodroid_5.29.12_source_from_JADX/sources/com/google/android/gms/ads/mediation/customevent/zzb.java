package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzb implements CustomEventInterstitialListener {

    /* renamed from: a */
    private final CustomEventAdapter f2427a;

    /* renamed from: b */
    private final MediationInterstitialListener f2428b;

    /* renamed from: c */
    final /* synthetic */ CustomEventAdapter f2429c;

    public zzb(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
        this.f2429c = customEventAdapter;
        this.f2427a = customEventAdapter2;
        this.f2428b = mediationInterstitialListener;
    }
}
