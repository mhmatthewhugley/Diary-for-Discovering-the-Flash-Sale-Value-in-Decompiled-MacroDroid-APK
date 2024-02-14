package com.google.android.gms.ads.formats;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public interface ShouldDelayBannerRenderingListener {
    @KeepName
    boolean shouldDelayBannerRendering(@NonNull Runnable runnable);
}
