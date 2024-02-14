package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zza extends UnifiedNativeAdMapper {
    private final UnifiedNativeAd zza;

    public zza(UnifiedNativeAd unifiedNativeAd) {
        this.zza = unifiedNativeAd;
        setHeadline(unifiedNativeAd.mo19818d());
        setImages(unifiedNativeAd.mo19820f());
        setBody(unifiedNativeAd.mo19816b());
        setIcon(unifiedNativeAd.mo19819e());
        setCallToAction(unifiedNativeAd.mo19817c());
        setAdvertiser(unifiedNativeAd.mo19815a());
        setStarRating(unifiedNativeAd.mo19822h());
        setStore(unifiedNativeAd.mo19823i());
        setPrice(unifiedNativeAd.mo19821g());
        zzd(unifiedNativeAd.mo19825k());
        setOverrideImpressionRecording(true);
        setOverrideClickHandling(true);
        zze(unifiedNativeAd.mo19824j());
    }

    public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        if (view instanceof zzg) {
            zzg zzg = (zzg) view;
            throw null;
        } else if (((zze) zze.f1764a.get(view)) != null) {
            throw null;
        }
    }
}
