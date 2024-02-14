package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzc implements CustomEventNativeListener {

    /* renamed from: a */
    private final CustomEventAdapter f2430a;

    /* renamed from: b */
    private final MediationNativeListener f2431b;

    public zzc(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
        this.f2430a = customEventAdapter;
        this.f2431b = mediationNativeListener;
    }
}
