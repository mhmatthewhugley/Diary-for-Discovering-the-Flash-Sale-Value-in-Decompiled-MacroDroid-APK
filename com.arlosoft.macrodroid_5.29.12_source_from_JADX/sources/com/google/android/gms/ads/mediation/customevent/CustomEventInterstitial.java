package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.mediation.MediationAdRequest;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public interface CustomEventInterstitial extends CustomEvent {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(@NonNull Context context, @NonNull CustomEventInterstitialListener customEventInterstitialListener, @Nullable String str, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle);

    void showInterstitial();
}