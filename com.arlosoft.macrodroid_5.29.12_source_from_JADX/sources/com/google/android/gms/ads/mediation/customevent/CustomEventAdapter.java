package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcgp;
import java.util.Objects;

@KeepName
@KeepForSdkWithMembers
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    @VisibleForTesting

    /* renamed from: e */
    static final AdError f2419e = new AdError(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");

    /* renamed from: a */
    private View f2420a;
    @Nullable
    @VisibleForTesting

    /* renamed from: b */
    CustomEventBanner f2421b;
    @Nullable
    @VisibleForTesting

    /* renamed from: c */
    CustomEventInterstitial f2422c;
    @Nullable
    @VisibleForTesting

    /* renamed from: d */
    CustomEventNative f2423d;

    @Nullable
    /* renamed from: a */
    private static Object m2953a(Class cls, @Nullable String str) {
        Objects.requireNonNull(str);
        try {
            return cls.cast(Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable th) {
            String message = th.getMessage();
            zzcgp.m45229g("Could not instantiate custom event adapter: " + str + ". " + message);
            return null;
        }
    }

    @NonNull
    public View getBannerView() {
        return this.f2420a;
    }

    public void onDestroy() {
        CustomEventBanner customEventBanner = this.f2421b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f2422c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f2423d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    public void onPause() {
        CustomEventBanner customEventBanner = this.f2421b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f2422c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f2423d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    public void onResume() {
        CustomEventBanner customEventBanner = this.f2421b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f2422c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f2423d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    public void requestBannerAd(@NonNull Context context, @NonNull MediationBannerListener mediationBannerListener, @NonNull Bundle bundle, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        Bundle bundle3;
        CustomEventBanner customEventBanner = (CustomEventBanner) m2953a(CustomEventBanner.class, bundle.getString("class_name"));
        this.f2421b = customEventBanner;
        if (customEventBanner == null) {
            mediationBannerListener.mo20488d(this, f2419e);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        CustomEventBanner customEventBanner2 = this.f2421b;
        Objects.requireNonNull(customEventBanner2);
        Context context2 = context;
        customEventBanner2.requestBannerAd(context2, new zza(this, mediationBannerListener), bundle.getString("parameter"), adSize, mediationAdRequest, bundle3);
    }

    public void requestInterstitialAd(@NonNull Context context, @NonNull MediationInterstitialListener mediationInterstitialListener, @NonNull Bundle bundle, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        Bundle bundle3;
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) m2953a(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.f2422c = customEventInterstitial;
        if (customEventInterstitial == null) {
            mediationInterstitialListener.mo20499o(this, f2419e);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        CustomEventInterstitial customEventInterstitial2 = this.f2422c;
        Objects.requireNonNull(customEventInterstitial2);
        Context context2 = context;
        customEventInterstitial2.requestInterstitialAd(context2, new zzb(this, this, mediationInterstitialListener), bundle.getString("parameter"), mediationAdRequest, bundle3);
    }

    public void requestNativeAd(@NonNull Context context, @NonNull MediationNativeListener mediationNativeListener, @NonNull Bundle bundle, @NonNull NativeMediationAdRequest nativeMediationAdRequest, @Nullable Bundle bundle2) {
        Bundle bundle3;
        CustomEventNative customEventNative = (CustomEventNative) m2953a(CustomEventNative.class, bundle.getString("class_name"));
        this.f2423d = customEventNative;
        if (customEventNative == null) {
            mediationNativeListener.mo20505b(this, f2419e);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        CustomEventNative customEventNative2 = this.f2423d;
        Objects.requireNonNull(customEventNative2);
        Context context2 = context;
        customEventNative2.requestNativeAd(context2, new zzc(this, mediationNativeListener), bundle.getString("parameter"), nativeMediationAdRequest, bundle3);
    }

    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.f2422c;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
