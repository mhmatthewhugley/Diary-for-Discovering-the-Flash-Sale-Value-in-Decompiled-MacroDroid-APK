package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzeax extends AdListener {

    /* renamed from: a */
    final /* synthetic */ String f33602a;

    /* renamed from: b */
    final /* synthetic */ AdView f33603b;

    /* renamed from: c */
    final /* synthetic */ String f33604c;

    /* renamed from: d */
    final /* synthetic */ zzebe f33605d;

    zzeax(zzebe zzebe, String str, AdView adView, String str2) {
        this.f33605d = zzebe;
        this.f33602a = str;
        this.f33603b = adView;
        this.f33604c = str2;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f33605d.m48545j(zzebe.m48544i(loadAdError), this.f33604c);
    }

    public final void onAdLoaded() {
        this.f33605d.mo45144e(this.f33602a, this.f33603b, this.f33604c);
    }
}
