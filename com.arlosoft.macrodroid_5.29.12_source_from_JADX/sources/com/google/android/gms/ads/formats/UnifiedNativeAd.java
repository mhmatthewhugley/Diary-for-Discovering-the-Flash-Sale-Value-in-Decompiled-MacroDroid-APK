package com.google.android.gms.ads.formats;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class UnifiedNativeAd {

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public interface OnUnifiedNativeAdLoadedListener {
        void onUnifiedNativeAdLoaded(@NonNull UnifiedNativeAd unifiedNativeAd);
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public interface UnconfirmedClickListener {
        /* renamed from: a */
        void mo19827a(@NonNull String str);

        /* renamed from: b */
        void mo19828b();
    }

    @NonNull
    /* renamed from: a */
    public abstract String mo19815a();

    @NonNull
    /* renamed from: b */
    public abstract String mo19816b();

    @NonNull
    /* renamed from: c */
    public abstract String mo19817c();

    @NonNull
    /* renamed from: d */
    public abstract String mo19818d();

    @NonNull
    /* renamed from: e */
    public abstract NativeAd.Image mo19819e();

    @NonNull
    /* renamed from: f */
    public abstract List<NativeAd.Image> mo19820f();

    @NonNull
    /* renamed from: g */
    public abstract String mo19821g();

    @NonNull
    /* renamed from: h */
    public abstract Double mo19822h();

    @NonNull
    /* renamed from: i */
    public abstract String mo19823i();

    @NonNull
    @Deprecated
    /* renamed from: j */
    public abstract VideoController mo19824j();

    @NonNull
    /* renamed from: k */
    public abstract Object mo19825k();
}
