package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzav extends zzaw {
    public zzav() {
        this.f41212a.add(zzbl.BITWISE_AND);
        this.f41212a.add(zzbl.BITWISE_LEFT_SHIFT);
        this.f41212a.add(zzbl.BITWISE_NOT);
        this.f41212a.add(zzbl.BITWISE_OR);
        this.f41212a.add(zzbl.BITWISE_RIGHT_SHIFT);
        this.f41212a.add(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f41212a.add(zzbl.BITWISE_XOR);
    }

    /* renamed from: a */
    public final zzap mo50760a(String str, zzg zzg, List list) {
        zzbl zzbl = zzbl.ADD;
        switch (zzh.m60247e(str).ordinal()) {
            case 4:
                zzh.m60250h(zzbl.BITWISE_AND.name(), 2, list);
                return new zzah(Double.valueOf((double) (zzh.m60244b(zzg.mo51055b((zzap) list.get(0)).mo50704e().doubleValue()) & zzh.m60244b(zzg.mo51055b((zzap) list.get(1)).mo50704e().doubleValue()))));
            case 5:
                zzh.m60250h(zzbl.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new zzah(Double.valueOf((double) (zzh.m60244b(zzg.mo51055b((zzap) list.get(0)).mo50704e().doubleValue()) << ((int) (zzh.m60246d(zzg.mo51055b((zzap) list.get(1)).mo50704e().doubleValue()) & 31)))));
            case 6:
                zzh.m60250h(zzbl.BITWISE_NOT.name(), 1, list);
                return new zzah(Double.valueOf((double) (~zzh.m60244b(zzg.mo51055b((zzap) list.get(0)).mo50704e().doubleValue()))));
            case 7:
                zzh.m60250h(zzbl.BITWISE_OR.name(), 2, list);
                return new zzah(Double.valueOf((double) (zzh.m60244b(zzg.mo51055b((zzap) list.get(0)).mo50704e().doubleValue()) | zzh.m60244b(zzg.mo51055b((zzap) list.get(1)).mo50704e().doubleValue()))));
            case 8:
                zzh.m60250h(zzbl.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new zzah(Double.valueOf((double) (zzh.m60244b(zzg.mo51055b((zzap) list.get(0)).mo50704e().doubleValue()) >> ((int) (zzh.m60246d(zzg.mo51055b((zzap) list.get(1)).mo50704e().doubleValue()) & 31)))));
            case 9:
                zzh.m60250h(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new zzah(Double.valueOf((double) (zzh.m60246d(zzg.mo51055b((zzap) list.get(0)).mo50704e().doubleValue()) >>> ((int) (zzh.m60246d(zzg.mo51055b((zzap) list.get(1)).mo50704e().doubleValue()) & 31)))));
            case 10:
                zzh.m60250h(zzbl.BITWISE_XOR.name(), 2, list);
                return new zzah(Double.valueOf((double) (zzh.m60244b(zzg.mo51055b((zzap) list.get(0)).mo50704e().doubleValue()) ^ zzh.m60244b(zzg.mo51055b((zzap) list.get(1)).mo50704e().doubleValue()))));
            default:
                return super.mo50761b(str);
        }
    }
}
