package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public interface MediationNativeListener {
    /* renamed from: a */
    void mo20504a(@NonNull MediationNativeAdapter mediationNativeAdapter);

    /* renamed from: b */
    void mo20505b(@NonNull MediationNativeAdapter mediationNativeAdapter, @NonNull AdError adError);

    /* renamed from: e */
    void mo20506e(@NonNull MediationNativeAdapter mediationNativeAdapter, @NonNull NativeCustomTemplateAd nativeCustomTemplateAd);

    /* renamed from: g */
    void mo20507g(@NonNull MediationNativeAdapter mediationNativeAdapter);

    /* renamed from: i */
    void mo20508i(@NonNull MediationNativeAdapter mediationNativeAdapter, @NonNull NativeCustomTemplateAd nativeCustomTemplateAd, @NonNull String str);

    /* renamed from: l */
    void mo20509l(@NonNull MediationNativeAdapter mediationNativeAdapter);

    /* renamed from: n */
    void mo20510n(@NonNull MediationNativeAdapter mediationNativeAdapter);

    /* renamed from: r */
    void mo20511r(@NonNull MediationNativeAdapter mediationNativeAdapter, @NonNull UnifiedNativeAdMapper unifiedNativeAdMapper);
}
