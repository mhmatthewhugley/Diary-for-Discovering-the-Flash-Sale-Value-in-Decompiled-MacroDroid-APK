package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzcaf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zzc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BaseAdView f2619a;

    /* renamed from: c */
    public final /* synthetic */ AdRequest f2620c;

    public /* synthetic */ zzc(BaseAdView baseAdView, AdRequest adRequest) {
        this.f2619a = baseAdView;
        this.f2620c = adRequest;
    }

    public final void run() {
        BaseAdView baseAdView = this.f2619a;
        try {
            baseAdView.f1699a.mo20060p(this.f2620c.mo19668a());
        } catch (IllegalStateException e) {
            zzcaf.m44757c(baseAdView.getContext()).mo43253b(e, "BaseAdView.loadAd");
        }
    }
}
