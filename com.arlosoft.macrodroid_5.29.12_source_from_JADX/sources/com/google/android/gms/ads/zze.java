package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzcaf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zze implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BaseAdView f2622a;

    public /* synthetic */ zze(BaseAdView baseAdView) {
        this.f2622a = baseAdView;
    }

    public final void run() {
        BaseAdView baseAdView = this.f2622a;
        try {
            baseAdView.f1699a.mo20058n();
        } catch (IllegalStateException e) {
            zzcaf.m44757c(baseAdView.getContext()).mo43253b(e, "BaseAdView.destroy");
        }
    }
}
