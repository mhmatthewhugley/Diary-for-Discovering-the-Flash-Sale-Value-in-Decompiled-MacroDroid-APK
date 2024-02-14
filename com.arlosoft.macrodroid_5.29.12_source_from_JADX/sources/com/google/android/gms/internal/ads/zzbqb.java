package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbqb implements zzbpu {

    /* renamed from: d */
    static final Map f27638d = CollectionUtils.m4865e(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a */
    private final zzb f27639a;

    /* renamed from: b */
    private final zzbxz f27640b;

    /* renamed from: c */
    private final zzbyg f27641c;

    public zzbqb(zzb zzb, zzbxz zzbxz, zzbyg zzbyg) {
        this.f27639a = zzb;
        this.f27640b = zzbxz;
        this.f27641c = zzbyg;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42867a(Object obj, Map map) {
        zzcmp zzcmp = (zzcmp) obj;
        int intValue = ((Integer) f27638d.get((String) map.get("a"))).intValue();
        int i = 6;
        boolean z = true;
        if (intValue != 5) {
            if (intValue != 7) {
                if (!this.f27639a.mo20416c()) {
                    this.f27639a.mo20415b((String) null);
                    return;
                } else if (intValue == 1) {
                    this.f27640b.mo43200i(map);
                    return;
                } else if (intValue == 3) {
                    new zzbyc(zzcmp, map).mo43210i();
                    return;
                } else if (intValue == 4) {
                    new zzbxx(zzcmp, map).mo43197j();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.f27640b.mo43199h(true);
                        return;
                    } else if (intValue != 7) {
                        zzcgp.m45228f("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f27641c.mo43223a();
            return;
        }
        String str = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            z = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        }
        if (zzcmp == null) {
            zzcgp.m45229g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = z ? -1 : 14;
        }
        zzcmp.mo44045g0(i);
    }
}
