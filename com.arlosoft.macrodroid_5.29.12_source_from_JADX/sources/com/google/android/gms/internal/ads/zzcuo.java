package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcuo implements zzctw {

    /* renamed from: a */
    private final zzeak f31592a;

    zzcuo(zzeak zzeak) {
        this.f31592a = zzeak;
    }

    /* renamed from: a */
    public final void mo44375a(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (!TextUtils.isEmpty(str)) {
            this.f31592a.mo45134m(str.equals("true"));
        }
    }
}
