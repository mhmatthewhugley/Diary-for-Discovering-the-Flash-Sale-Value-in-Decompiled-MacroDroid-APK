package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzz {

    /* renamed from: a */
    final TreeMap f41927a = new TreeMap();

    /* renamed from: b */
    final TreeMap f41928b = new TreeMap();

    /* renamed from: c */
    private static final int m61128c(zzg zzg, zzao zzao, zzap zzap) {
        zzap a = zzao.mo50735a(zzg, Collections.singletonList(zzap));
        if (a instanceof zzah) {
            return zzh.m60244b(a.mo50704e().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo51716a(String str, int i, zzao zzao, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f41928b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f41927a;
        } else {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), zzao);
    }

    /* renamed from: b */
    public final void mo51717b(zzg zzg, zzab zzab) {
        zzl zzl = new zzl(zzab);
        for (Integer num : this.f41927a.keySet()) {
            zzaa b = zzab.mo50691b().clone();
            int c = m61128c(zzg, (zzao) this.f41927a.get(num), zzl);
            if (c == 2 || c == -1) {
                zzab.mo50696f(b);
            }
        }
        for (Integer num2 : this.f41928b.keySet()) {
            m61128c(zzg, (zzao) this.f41928b.get(num2), zzl);
        }
    }
}
