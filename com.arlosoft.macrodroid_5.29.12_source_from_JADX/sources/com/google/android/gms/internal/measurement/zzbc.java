package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzbc extends zzaw {
    protected zzbc() {
        this.f41212a.add(zzbl.AND);
        this.f41212a.add(zzbl.NOT);
        this.f41212a.add(zzbl.OR);
    }

    /* renamed from: a */
    public final zzap mo50760a(String str, zzg zzg, List list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = zzh.m60247e(str).ordinal();
        if (ordinal == 1) {
            zzh.m60250h(zzbl.AND.name(), 2, list);
            zzap b = zzg.mo51055b((zzap) list.get(0));
            if (!b.mo50706f().booleanValue()) {
                return b;
            }
            return zzg.mo51055b((zzap) list.get(1));
        } else if (ordinal == 47) {
            zzh.m60250h(zzbl.NOT.name(), 1, list);
            return new zzaf(Boolean.valueOf(!zzg.mo51055b((zzap) list.get(0)).mo50706f().booleanValue()));
        } else if (ordinal != 50) {
            return super.mo50761b(str);
        } else {
            zzh.m60250h(zzbl.OR.name(), 2, list);
            zzap b2 = zzg.mo51055b((zzap) list.get(0));
            if (b2.mo50706f().booleanValue()) {
                return b2;
            }
            return zzg.mo51055b((zzap) list.get(1));
        }
    }
}
