package com.google.android.gms.ads.rewardedinterstitial;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzcdf;
import com.google.android.gms.internal.ads.zzcge;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class RewardedInterstitialAd {
    /* renamed from: b */
    public static void m3097b(@NonNull Context context, @NonNull String str, @NonNull AdRequest adRequest, @NonNull RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        Preconditions.m4489l(context, "Context cannot be null.");
        Preconditions.m4489l(str, "AdUnitId cannot be null.");
        Preconditions.m4489l(adRequest, "AdRequest cannot be null.");
        Preconditions.m4489l(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzbjc.m43542c(context);
        if (((Boolean) zzbkq.f27451l.mo42728e()).booleanValue()) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26935M8)).booleanValue()) {
                zzcge.f28418b.execute(new zza(context, str, adRequest, rewardedInterstitialAdLoadCallback));
                return;
            }
        }
        new zzcdf(context, str).mo43390d(adRequest.mo19668a(), rewardedInterstitialAdLoadCallback);
    }

    @NonNull
    /* renamed from: a */
    public abstract ResponseInfo mo20715a();

    /* renamed from: c */
    public abstract void mo20716c(@NonNull Activity activity, @NonNull OnUserEarnedRewardListener onUserEarnedRewardListener);
}
