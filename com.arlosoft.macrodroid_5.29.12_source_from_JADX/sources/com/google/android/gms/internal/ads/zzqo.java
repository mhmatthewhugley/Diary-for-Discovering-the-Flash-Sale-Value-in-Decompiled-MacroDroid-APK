package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(31)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzqo {
    @DoNotInline
    /* renamed from: a */
    public static void m54647a(zzqj zzqj, zznb zznb) {
        LogSessionId a = zznb.mo47866a();
        if (!a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            zzqj.f38252b.setString("log-session-id", a.getStringId());
        }
    }
}
