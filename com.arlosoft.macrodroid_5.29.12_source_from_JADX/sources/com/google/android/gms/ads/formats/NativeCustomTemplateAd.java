package com.google.android.gms.ads.formats;

import androidx.annotation.NonNull;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public interface NativeCustomTemplateAd {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public interface DisplayOpenMeasurement {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public interface OnCustomClickListener {
        void onCustomClick(@NonNull NativeCustomTemplateAd nativeCustomTemplateAd, @NonNull String str);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public interface OnCustomTemplateAdLoadedListener {
        void onCustomTemplateAdLoaded(@NonNull NativeCustomTemplateAd nativeCustomTemplateAd);
    }

    @NonNull
    /* renamed from: a */
    String mo19806a();
}
