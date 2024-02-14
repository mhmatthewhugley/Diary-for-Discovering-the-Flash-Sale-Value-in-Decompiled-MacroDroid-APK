package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzcaf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zzd implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BaseAdView f2621a;

    public /* synthetic */ zzd(BaseAdView baseAdView) {
        this.f2621a = baseAdView;
    }

    public final void run() {
        BaseAdView baseAdView = this.f2621a;
        try {
            baseAdView.f1699a.mo20061q();
        } catch (IllegalStateException e) {
            zzcaf.m44757c(baseAdView.getContext()).mo43253b(e, "BaseAdView.pause");
        }
    }
}
