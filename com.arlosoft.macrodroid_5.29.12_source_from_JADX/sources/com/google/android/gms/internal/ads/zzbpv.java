package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbpv implements zzbpu {

    /* renamed from: a */
    private final zzeak f27628a;

    public zzbpv(zzeak zzeak) {
        Preconditions.m4489l(zzeak, "The Inspector Manager must not be null");
        this.f27628a = zzeak;
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        if (map != null && map.containsKey("extras")) {
            boolean containsKey = map.containsKey(ClientCookie.EXPIRES_ATTR);
            long j = LocationRequestCompat.PASSIVE_INTERVAL;
            if (containsKey) {
                try {
                    j = Long.parseLong((String) map.get(ClientCookie.EXPIRES_ATTR));
                } catch (NumberFormatException unused) {
                }
            }
            this.f27628a.mo45130i((String) map.get("extras"), j);
        }
    }
}
