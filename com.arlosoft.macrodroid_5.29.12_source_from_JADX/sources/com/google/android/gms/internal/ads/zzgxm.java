package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgxm extends zzgxe {

    /* renamed from: b */
    private static final zzgxv f37418b = zzgxj.m53647a(Collections.emptyMap());

    /* synthetic */ zzgxm(Map map, zzgxk zzgxk) {
        super(map);
    }

    /* renamed from: b */
    public static zzgxl m53651b(int i) {
        return new zzgxl(i, (zzgxk) null);
    }

    /* renamed from: c */
    public final Map zzb() {
        LinkedHashMap b = zzgxf.m53641b(mo47597a().size());
        for (Map.Entry entry : mo47597a().entrySet()) {
            b.put(entry.getKey(), ((zzgxv) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(b);
    }
}
