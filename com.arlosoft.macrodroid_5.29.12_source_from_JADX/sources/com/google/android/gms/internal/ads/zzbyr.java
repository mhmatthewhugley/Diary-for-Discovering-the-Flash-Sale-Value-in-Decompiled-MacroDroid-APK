package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbyr extends zzbnr {

    /* renamed from: a */
    private final NativeAd.OnNativeAdLoadedListener f28015a;

    public zzbyr(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.f28015a = onNativeAdLoadedListener;
    }

    /* renamed from: y8 */
    public final void mo42826y8(zzbob zzbob) {
        this.f28015a.mo20592a(new zzbyk(zzbob));
    }
}
