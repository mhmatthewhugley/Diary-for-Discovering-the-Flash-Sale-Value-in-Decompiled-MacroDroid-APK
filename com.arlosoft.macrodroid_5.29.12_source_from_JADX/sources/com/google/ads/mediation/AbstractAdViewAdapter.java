package com.google.ads.mediation;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcol;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zzcol, zzb {
    @NonNull
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdLoader adLoader;
    @NonNull
    protected AdView mAdView;
    @NonNull
    protected InterstitialAd mInterstitialAd;

    /* access modifiers changed from: package-private */
    public AdRequest buildAdRequest(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Date d = mediationAdRequest.mo20478d();
        if (d != null) {
            builder.mo19673e(d);
        }
        int g = mediationAdRequest.mo20480g();
        if (g != 0) {
            builder.mo19674f(g);
        }
        Set<String> i = mediationAdRequest.mo20481i();
        if (i != null) {
            for (String a : i) {
                builder.mo19669a(a);
            }
        }
        if (mediationAdRequest.mo20479e()) {
            zzaw.m1917b();
            builder.mo19672d(zzcgi.m45188x(context));
        }
        if (mediationAdRequest.mo20476b() != -1) {
            boolean z = true;
            if (mediationAdRequest.mo20476b() != 1) {
                z = false;
            }
            builder.mo19676h(z);
        }
        builder.mo19675g(mediationAdRequest.mo20477c());
        builder.mo19670b(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return builder.mo19671c();
    }

    /* access modifiers changed from: protected */
    @NonNull
    public abstract Bundle buildExtrasBundle(@NonNull Bundle bundle, @NonNull Bundle bundle2);

    @NonNull
    public String getAdUnitId(@NonNull Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @NonNull
    public View getBannerView() {
        return this.mAdView;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public InterstitialAd getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @NonNull
    public Bundle getInterstitialAdapterInfo() {
        zza zza = new zza();
        zza.mo20583b(1);
        return zza.mo20582a();
    }

    @Nullable
    public zzdk getVideoController() {
        AdView adView = this.mAdView;
        if (adView != null) {
            return adView.mo19697e().mo19753b();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public AdLoader.Builder newAdLoader(Context context, String str) {
        return new AdLoader.Builder(context, str);
    }

    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.mo19704a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.mo20463d(z);
        }
    }

    public void onPause() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.mo19706c();
        }
    }

    public void onResume() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.mo19707d();
        }
    }

    public void requestBannerAd(@NonNull Context context, @NonNull MediationBannerListener mediationBannerListener, @NonNull Bundle bundle, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, @NonNull Bundle bundle2) {
        AdView adView = new AdView(context);
        this.mAdView = adView;
        adView.setAdSize(new AdSize(adSize.mo19680c(), adSize.mo19678a()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new zzb(this, mediationBannerListener));
        this.mAdView.mo19705b(buildAdRequest(context, mediationAdRequest, bundle2, bundle));
    }

    public void requestInterstitialAd(@NonNull Context context, @NonNull MediationInterstitialListener mediationInterstitialListener, @NonNull Bundle bundle, @NonNull MediationAdRequest mediationAdRequest, @NonNull Bundle bundle2) {
        InterstitialAd.m2914b(context, getAdUnitId(bundle), buildAdRequest(context, mediationAdRequest, bundle2, bundle), new zzc(this, mediationInterstitialListener));
    }

    public void requestNativeAd(@NonNull Context context, @NonNull MediationNativeListener mediationNativeListener, @NonNull Bundle bundle, @NonNull NativeMediationAdRequest nativeMediationAdRequest, @NonNull Bundle bundle2) {
        zze zze = new zze(this, mediationNativeListener);
        AdLoader.Builder e = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER)).mo19665e(zze);
        e.mo19666f(nativeMediationAdRequest.mo20514f());
        e.mo19667g(nativeMediationAdRequest.mo20513a());
        if (nativeMediationAdRequest.mo20515h()) {
            e.mo19664d(zze);
        }
        if (nativeMediationAdRequest.zzb()) {
            for (String str : nativeMediationAdRequest.zza().keySet()) {
                e.mo19662b(str, zze, true != ((Boolean) nativeMediationAdRequest.zza().get(str)).booleanValue() ? null : zze);
            }
        }
        AdLoader a = e.mo19661a();
        this.adLoader = a;
        a.mo19659a(buildAdRequest(context, nativeMediationAdRequest, bundle2, bundle));
    }

    public void showInterstitial() {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.mo20464e((Activity) null);
        }
    }
}
