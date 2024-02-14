package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final /* synthetic */ class zzaj {
    /* renamed from: a */
    public static zzap m59448a(zzal zzal, zzap zzap, zzg zzg, List list) {
        if (zzal.mo50708h(zzap.mo50707g())) {
            zzap W = zzal.mo50701W(zzap.mo50707g());
            if (W instanceof zzai) {
                return ((zzai) W).mo50735a(zzg, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{zzap.mo50707g()}));
        } else if ("hasOwnProperty".equals(zzap.mo50707g())) {
            zzh.m60250h("hasOwnProperty", 1, list);
            if (zzal.mo50708h(zzg.mo51055b((zzap) list.get(0)).mo50707g())) {
                return zzap.f41202n;
            }
            return zzap.f41203q;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{zzap.mo50707g()}));
        }
    }

    /* renamed from: b */
    public static Iterator m59449b(Map map) {
        return new zzak(map.keySet().iterator());
    }
}
