package com.google.android.gms.ads.rewarded;

import android.content.Context;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzccu;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zzb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f2596a;

    /* renamed from: c */
    public final /* synthetic */ String f2597c;

    /* renamed from: d */
    public final /* synthetic */ AdManagerAdRequest f2598d;

    /* renamed from: f */
    public final /* synthetic */ RewardedAdLoadCallback f2599f;

    public final void run() {
        Context context = this.f2596a;
        String str = this.f2597c;
        AdManagerAdRequest adManagerAdRequest = this.f2598d;
        try {
            new zzccu(context, str).mo43363d(adManagerAdRequest.mo19668a(), this.f2599f);
        } catch (IllegalStateException e) {
            zzcaf.m44757c(context).mo43253b(e, "RewardedAd.loadAdManager");
        }
    }
}
