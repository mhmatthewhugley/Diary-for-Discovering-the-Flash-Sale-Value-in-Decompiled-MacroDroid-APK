package com.google.android.gms.ads.nativead;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.ResponseInfo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class NativeAd {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static abstract class AdChoicesInfo {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static abstract class Image {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public interface OnNativeAdLoadedListener {
        /* renamed from: a */
        void mo20592a(@NonNull NativeAd nativeAd);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public interface UnconfirmedClickListener {
        /* renamed from: a */
        void mo20593a(@NonNull String str);

        /* renamed from: b */
        void mo20594b();
    }

    @Nullable
    /* renamed from: a */
    public abstract ResponseInfo mo20590a();

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: b */
    public abstract Object mo20591b();
}
