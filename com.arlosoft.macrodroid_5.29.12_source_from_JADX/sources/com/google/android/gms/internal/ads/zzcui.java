package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcui implements zzctw {

    /* renamed from: a */
    private final zzfdj f31586a;

    public zzcui(zzfdj zzfdj) {
        this.f31586a = zzfdj;
    }

    /* renamed from: a */
    public final void mo44375a(Map map) {
        String str = (String) map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f31586a.mo45597b(Boolean.parseBoolean(str));
            } catch (Exception unused) {
                throw new IllegalStateException("Invalid render_in_browser state");
            }
        }
    }
}
