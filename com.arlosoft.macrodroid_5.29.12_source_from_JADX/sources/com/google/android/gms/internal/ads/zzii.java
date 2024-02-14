package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(31)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzii {
    @DoNotInline
    /* renamed from: a */
    public static zznb m53701a(Context context, zzit zzit, boolean z) {
        zzmx f = zzmx.m54263f(context);
        if (f == null) {
            zzdw.m48255e("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zznb(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            zzit.mo47650I(f);
        }
        return new zznb(f.mo47865e());
    }
}
