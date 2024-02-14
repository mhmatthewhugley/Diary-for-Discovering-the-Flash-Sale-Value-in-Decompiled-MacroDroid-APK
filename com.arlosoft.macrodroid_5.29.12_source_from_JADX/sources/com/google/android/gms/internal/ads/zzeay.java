package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzeay extends InterstitialAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ String f33606a;

    /* renamed from: b */
    final /* synthetic */ String f33607b;

    /* renamed from: c */
    final /* synthetic */ zzebe f33608c;

    zzeay(zzebe zzebe, String str, String str2) {
        this.f33608c = zzebe;
        this.f33606a = str;
        this.f33607b = str2;
    }

    public final void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
        this.f33608c.m48545j(zzebe.m48544i(loadAdError), this.f33607b);
    }

    public final /* bridge */ /* synthetic */ void onAdLoaded(@NonNull Object obj) {
        this.f33608c.mo45144e(this.f33606a, (InterstitialAd) obj, this.f33607b);
    }
}
