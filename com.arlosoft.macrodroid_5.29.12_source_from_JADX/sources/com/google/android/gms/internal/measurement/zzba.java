package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzba implements Comparator {

    /* renamed from: a */
    final /* synthetic */ zzai f41216a;

    /* renamed from: c */
    final /* synthetic */ zzg f41217c;

    zzba(zzai zzai, zzg zzg) {
        this.f41216a = zzai;
        this.f41217c = zzg;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzap zzap = (zzap) obj;
        zzap zzap2 = (zzap) obj2;
        zzai zzai = this.f41216a;
        zzg zzg = this.f41217c;
        if (zzap instanceof zzau) {
            return !(zzap2 instanceof zzau) ? 1 : 0;
        }
        if (zzap2 instanceof zzau) {
            return -1;
        }
        if (zzai == null) {
            return zzap.mo50707g().compareTo(zzap2.mo50707g());
        }
        return (int) zzh.m60243a(zzai.mo50735a(zzg, Arrays.asList(new zzap[]{zzap, zzap2})).mo50704e().doubleValue());
    }
}
