package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public interface CustomEventNative extends CustomEvent {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(@NonNull Context context, @NonNull CustomEventNativeListener customEventNativeListener, @Nullable String str, @NonNull NativeMediationAdRequest nativeMediationAdRequest, @Nullable Bundle bundle);
}
