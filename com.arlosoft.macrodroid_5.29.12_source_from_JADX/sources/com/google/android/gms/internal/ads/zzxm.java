package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(30)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzxm {
    @DoNotInline
    /* renamed from: a */
    public static void m55367a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            zzdw.m48253c("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
