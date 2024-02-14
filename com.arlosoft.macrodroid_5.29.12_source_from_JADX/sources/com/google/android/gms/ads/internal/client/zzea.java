package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzea extends zzcx {
    private zzea() {
    }

    /* renamed from: G3 */
    public final void mo19987G3(zze zze) {
        AdInspectorError adInspectorError;
        OnAdInspectorClosedListener a = zzed.m2259e().f1947g;
        if (a != null) {
            if (zze == null) {
                adInspectorError = null;
            } else {
                adInspectorError = new AdInspectorError(zze.f1934a, zze.f1935c, zze.f1936d);
            }
            a.mo19734a(adInspectorError);
        }
    }
}
