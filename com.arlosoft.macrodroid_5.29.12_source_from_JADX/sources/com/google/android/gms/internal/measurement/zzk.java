package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzk extends zzai {

    /* renamed from: d */
    private final zzab f41627d;

    public zzk(zzab zzab) {
        super("internal.eventLogger");
        this.f41627d = zzab;
    }

    /* renamed from: a */
    public final zzap mo50735a(zzg zzg, List list) {
        Map map;
        zzh.m60250h(this.f41190a, 3, list);
        String g = zzg.mo51055b((zzap) list.get(0)).mo50707g();
        long a = (long) zzh.m60243a(zzg.mo51055b((zzap) list.get(1)).mo50704e().doubleValue());
        zzap b = zzg.mo51055b((zzap) list.get(2));
        if (b instanceof zzam) {
            map = zzh.m60249g((zzam) b);
        } else {
            map = new HashMap();
        }
        this.f41627d.mo50695e(g, a, map);
        return zzap.f41197i;
    }
}
