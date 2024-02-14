package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzbi extends zzaw {
    protected zzbi() {
        this.f41212a.add(zzbl.ADD);
        this.f41212a.add(zzbl.DIVIDE);
        this.f41212a.add(zzbl.MODULUS);
        this.f41212a.add(zzbl.MULTIPLY);
        this.f41212a.add(zzbl.NEGATE);
        this.f41212a.add(zzbl.POST_DECREMENT);
        this.f41212a.add(zzbl.POST_INCREMENT);
        this.f41212a.add(zzbl.PRE_DECREMENT);
        this.f41212a.add(zzbl.PRE_INCREMENT);
        this.f41212a.add(zzbl.SUBTRACT);
    }

    /* renamed from: a */
    public final zzap mo50760a(String str, zzg zzg, List list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = zzh.m60247e(str).ordinal();
        if (ordinal == 0) {
            zzh.m60250h(zzbl.name(), 2, list);
            zzap b = zzg.mo51055b((zzap) list.get(0));
            zzap b2 = zzg.mo51055b((zzap) list.get(1));
            if ((b instanceof zzal) || (b instanceof zzat) || (b2 instanceof zzal) || (b2 instanceof zzat)) {
                return new zzat(String.valueOf(b.mo50707g()).concat(String.valueOf(b2.mo50707g())));
            }
            return new zzah(Double.valueOf(b.mo50704e().doubleValue() + b2.mo50704e().doubleValue()));
        } else if (ordinal == 21) {
            zzh.m60250h(zzbl.DIVIDE.name(), 2, list);
            return new zzah(Double.valueOf(zzg.mo51055b((zzap) list.get(0)).mo50704e().doubleValue() / zzg.mo51055b((zzap) list.get(1)).mo50704e().doubleValue()));
        } else if (ordinal == 59) {
            zzh.m60250h(zzbl.SUBTRACT.name(), 2, list);
            return new zzah(Double.valueOf(zzg.mo51055b((zzap) list.get(0)).mo50704e().doubleValue() + new zzah(Double.valueOf(-zzg.mo51055b((zzap) list.get(1)).mo50704e().doubleValue())).mo50704e().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            zzh.m60250h(str, 2, list);
            zzap b3 = zzg.mo51055b((zzap) list.get(0));
            zzg.mo51055b((zzap) list.get(1));
            return b3;
        } else if (ordinal == 55 || ordinal == 56) {
            zzh.m60250h(str, 1, list);
            return zzg.mo51055b((zzap) list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    zzh.m60250h(zzbl.MODULUS.name(), 2, list);
                    return new zzah(Double.valueOf(zzg.mo51055b((zzap) list.get(0)).mo50704e().doubleValue() % zzg.mo51055b((zzap) list.get(1)).mo50704e().doubleValue()));
                case 45:
                    zzh.m60250h(zzbl.MULTIPLY.name(), 2, list);
                    return new zzah(Double.valueOf(zzg.mo51055b((zzap) list.get(0)).mo50704e().doubleValue() * zzg.mo51055b((zzap) list.get(1)).mo50704e().doubleValue()));
                case 46:
                    zzh.m60250h(zzbl.NEGATE.name(), 1, list);
                    return new zzah(Double.valueOf(-zzg.mo51055b((zzap) list.get(0)).mo50704e().doubleValue()));
                default:
                    return super.mo50761b(str);
            }
        }
    }
}
