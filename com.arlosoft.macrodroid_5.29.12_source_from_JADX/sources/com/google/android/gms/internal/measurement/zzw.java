package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzw extends zzai {

    /* renamed from: d */
    private final zzj f41925d;

    /* renamed from: f */
    final Map f41926f = new HashMap();

    public zzw(zzj zzj) {
        super("require");
        this.f41925d = zzj;
    }

    /* renamed from: a */
    public final zzap mo50735a(zzg zzg, List list) {
        zzap zzap;
        zzh.m60250h("require", 1, list);
        String g = zzg.mo51055b((zzap) list.get(0)).mo50707g();
        if (this.f41926f.containsKey(g)) {
            return (zzap) this.f41926f.get(g);
        }
        zzj zzj = this.f41925d;
        if (zzj.f41538a.containsKey(g)) {
            try {
                zzap = (zzap) ((Callable) zzj.f41538a.get(g)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(g)));
            }
        } else {
            zzap = zzap.f41197i;
        }
        if (zzap instanceof zzai) {
            this.f41926f.put(g, (zzai) zzap);
        }
        return zzap;
    }
}
