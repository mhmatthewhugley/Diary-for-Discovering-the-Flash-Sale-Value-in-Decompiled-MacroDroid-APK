package com.google.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    @NonNull
    public static final AdSize BANNER = new AdSize(320, 50, "mb");
    public static final int FULL_WIDTH = -1;
    @NonNull
    public static final AdSize IAB_BANNER = new AdSize(468, 60, "as");
    @NonNull
    public static final AdSize IAB_LEADERBOARD = new AdSize(728, 90, "as");
    @NonNull
    public static final AdSize IAB_MRECT = new AdSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "as");
    @NonNull
    public static final AdSize IAB_WIDE_SKYSCRAPER = new AdSize(160, 600, "as");
    public static final int LANDSCAPE_AD_HEIGHT = 32;
    public static final int LARGE_AD_HEIGHT = 90;
    public static final int PORTRAIT_AD_HEIGHT = 50;
    @NonNull
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "mb");
    private final com.google.android.gms.ads.AdSize zza;

    public AdSize(int i, int i2) {
        this(new com.google.android.gms.ads.AdSize(i, i2));
    }

    public AdSize(@NonNull com.google.android.gms.ads.AdSize adSize) {
        this.zza = adSize;
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof AdSize)) {
            return false;
        }
        return this.zza.equals(((AdSize) obj).zza);
    }

    @Nullable
    public AdSize findBestSize(@NonNull AdSize... adSizeArr) {
        AdSize adSize = null;
        if (adSizeArr == null) {
            return null;
        }
        int width = getWidth();
        int height = getHeight();
        float f = 0.0f;
        for (AdSize adSize2 : adSizeArr) {
            int width2 = adSize2.getWidth();
            int height2 = adSize2.getHeight();
            if (isSizeAppropriate(width2, height2)) {
                float f2 = ((float) (width2 * height2)) / ((float) (width * height));
                if (f2 > 1.0f) {
                    f2 = 1.0f / f2;
                }
                if (f2 > f) {
                    adSize = adSize2;
                    f = f2;
                }
            }
        }
        return adSize;
    }

    public int getHeight() {
        return this.zza.mo19678a();
    }

    public int getHeightInPixels(@NonNull Context context) {
        return this.zza.mo19679b(context);
    }

    public int getWidth() {
        return this.zza.mo19680c();
    }

    public int getWidthInPixels(@NonNull Context context) {
        return this.zza.mo19681d(context);
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zza.mo19682e();
    }

    public boolean isCustomAdSize() {
        return false;
    }

    public boolean isFullWidth() {
        return this.zza.mo19685g();
    }

    public boolean isSizeAppropriate(int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        float f = (float) i;
        float f2 = (float) width;
        if (f > f2 * 1.25f || f < f2 * 0.8f) {
            return false;
        }
        float f3 = (float) i2;
        float f4 = (float) height;
        return f3 <= 1.25f * f4 && f3 >= f4 * 0.8f;
    }

    @NonNull
    public String toString() {
        return this.zza.toString();
    }

    private AdSize(int i, int i2, String str) {
        this(new com.google.android.gms.ads.AdSize(i, i2));
    }
}
