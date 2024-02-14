package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzeaw extends AppOpenAd.AppOpenAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ String f33599a;

    /* renamed from: b */
    final /* synthetic */ String f33600b;

    /* renamed from: c */
    final /* synthetic */ zzebe f33601c;

    zzeaw(zzebe zzebe, String str, String str2) {
        this.f33601c = zzebe;
        this.f33599a = str;
        this.f33600b = str2;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f33601c.m48545j(zzebe.m48544i(loadAdError), this.f33600b);
    }

    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        this.f33601c.mo45144e(this.f33599a, (AppOpenAd) obj, this.f33600b);
    }
}
