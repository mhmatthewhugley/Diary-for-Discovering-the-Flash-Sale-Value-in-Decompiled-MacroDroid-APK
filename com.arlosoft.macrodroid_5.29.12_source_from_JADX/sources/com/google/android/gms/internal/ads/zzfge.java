package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfge {

    /* renamed from: a */
    private final HashMap f35737a = new HashMap();

    /* renamed from: a */
    public final zzfgd mo45711a(zzffu zzffu, Context context, zzffm zzffm, zzfgk zzfgk) {
        zzfgd zzfgd = (zzfgd) this.f35737a.get(zzffu);
        if (zzfgd != null) {
            return zzfgd;
        }
        zzffr zzffr = new zzffr(zzffx.m50123l2(zzffu, context));
        zzfgd zzfgd2 = new zzfgd(zzffr, new zzfgm(zzffr, zzffm, zzfgk));
        this.f35737a.put(zzffu, zzfgd2);
        return zzfgd2;
    }
}
