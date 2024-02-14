package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbpw implements zzbpu {

    /* renamed from: a */
    private final zzbpx f27629a;

    public zzbpw(zzbpx zzbpx, byte[] bArr) {
        this.f27629a = zzbpx;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42867a(Object obj, Map map) {
        zzcmp zzcmp = (zzcmp) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            zzcgp.m45227e("Fail to parse float", e);
        }
        this.f27629a.mo42872c(equals);
        this.f27629a.mo42871b(equals2, f);
        zzcmp.mo44036X(equals);
    }
}
