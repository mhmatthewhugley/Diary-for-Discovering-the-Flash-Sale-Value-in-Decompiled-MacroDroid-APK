package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzcge;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class InterstitialAd {
    /* renamed from: b */
    public static void m2914b(@NonNull Context context, @NonNull String str, @NonNull AdRequest adRequest, @NonNull InterstitialAdLoadCallback interstitialAdLoadCallback) {
        Preconditions.m4489l(context, "Context cannot be null.");
        Preconditions.m4489l(str, "AdUnitId cannot be null.");
        Preconditions.m4489l(adRequest, "AdRequest cannot be null.");
        Preconditions.m4489l(interstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzbjc.m43542c(context);
        if (((Boolean) zzbkq.f27448i.mo42728e()).booleanValue()) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26935M8)).booleanValue()) {
                zzcge.f28418b.execute(new zza(context, str, adRequest, interstitialAdLoadCallback));
                return;
            }
        }
        new zzbsm(context, str).mo42952f(adRequest.mo19668a(), interstitialAdLoadCallback);
    }

    @NonNull
    /* renamed from: a */
    public abstract ResponseInfo mo20461a();

    /* renamed from: c */
    public abstract void mo20462c(@Nullable FullScreenContentCallback fullScreenContentCallback);

    /* renamed from: d */
    public abstract void mo20463d(boolean z);

    /* renamed from: e */
    public abstract void mo20464e(@NonNull Activity activity);
}
