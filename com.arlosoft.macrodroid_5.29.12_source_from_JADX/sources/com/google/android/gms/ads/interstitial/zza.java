package com.google.android.gms.ads.interstitial;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzcaf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class zza implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f2401a;

    /* renamed from: c */
    public final /* synthetic */ String f2402c;

    /* renamed from: d */
    public final /* synthetic */ AdRequest f2403d;

    /* renamed from: f */
    public final /* synthetic */ InterstitialAdLoadCallback f2404f;

    public /* synthetic */ zza(Context context, String str, AdRequest adRequest, InterstitialAdLoadCallback interstitialAdLoadCallback) {
        this.f2401a = context;
        this.f2402c = str;
        this.f2403d = adRequest;
        this.f2404f = interstitialAdLoadCallback;
    }

    public final void run() {
        Context context = this.f2401a;
        String str = this.f2402c;
        AdRequest adRequest = this.f2403d;
        try {
            new zzbsm(context, str).mo42952f(adRequest.mo19668a(), this.f2404f);
        } catch (IllegalStateException e) {
            zzcaf.m44757c(context).mo43253b(e, "InterstitialAd.load");
        }
    }
}
