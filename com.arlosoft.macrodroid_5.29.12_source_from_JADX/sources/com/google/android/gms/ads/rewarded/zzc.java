package com.google.android.gms.ads.rewarded;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzccu;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zzc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f2600a;

    /* renamed from: c */
    public final /* synthetic */ String f2601c;

    /* renamed from: d */
    public final /* synthetic */ AdRequest f2602d;

    /* renamed from: f */
    public final /* synthetic */ RewardedAdLoadCallback f2603f;

    public /* synthetic */ zzc(Context context, String str, AdRequest adRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.f2600a = context;
        this.f2601c = str;
        this.f2602d = adRequest;
        this.f2603f = rewardedAdLoadCallback;
    }

    public final void run() {
        Context context = this.f2600a;
        String str = this.f2601c;
        AdRequest adRequest = this.f2602d;
        try {
            new zzccu(context, str).mo43363d(adRequest.mo19668a(), this.f2603f);
        } catch (IllegalStateException e) {
            zzcaf.m44757c(context).mo43253b(e, "RewardedAd.load");
        }
    }
}
