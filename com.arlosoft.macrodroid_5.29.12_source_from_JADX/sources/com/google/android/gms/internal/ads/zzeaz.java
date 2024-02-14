package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzeaz extends RewardedAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ String f33609a;

    /* renamed from: b */
    final /* synthetic */ String f33610b;

    /* renamed from: c */
    final /* synthetic */ zzebe f33611c;

    zzeaz(zzebe zzebe, String str, String str2) {
        this.f33611c = zzebe;
        this.f33609a = str;
        this.f33610b = str2;
    }

    public final void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
        this.f33611c.m48545j(zzebe.m48544i(loadAdError), this.f33610b);
    }

    public final /* bridge */ /* synthetic */ void onAdLoaded(@NonNull Object obj) {
        this.f33611c.mo45144e(this.f33609a, (RewardedAd) obj, this.f33610b);
    }
}
