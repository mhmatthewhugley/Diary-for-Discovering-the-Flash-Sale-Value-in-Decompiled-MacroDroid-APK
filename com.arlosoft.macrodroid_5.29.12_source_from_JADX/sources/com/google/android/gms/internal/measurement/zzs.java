package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzs extends zzai {

    /* renamed from: d */
    final boolean f41919d;

    /* renamed from: f */
    final boolean f41920f;

    /* renamed from: g */
    final /* synthetic */ zzt f41921g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzs(zzt zzt, boolean z, boolean z2) {
        super("log");
        this.f41921g = zzt;
        this.f41919d = z;
        this.f41920f = z2;
    }

    /* renamed from: a */
    public final zzap mo50735a(zzg zzg, List list) {
        zzh.m60251i("log", 1, list);
        if (list.size() == 1) {
            this.f41921g.f41922d.mo51715a(3, zzg.mo51055b((zzap) list.get(0)).mo50707g(), Collections.emptyList(), this.f41919d, this.f41920f);
            return zzap.f41197i;
        }
        int b = zzh.m60244b(zzg.mo51055b((zzap) list.get(0)).mo50704e().doubleValue());
        int i = b != 2 ? b != 3 ? b != 5 ? b != 6 ? 3 : 2 : 5 : 1 : 4;
        String g = zzg.mo51055b((zzap) list.get(1)).mo50707g();
        if (list.size() == 2) {
            this.f41921g.f41922d.mo51715a(i, g, Collections.emptyList(), this.f41919d, this.f41920f);
            return zzap.f41197i;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
            arrayList.add(zzg.mo51055b((zzap) list.get(i2)).mo50707g());
        }
        this.f41921g.f41922d.mo51715a(i, g, arrayList, this.f41919d, this.f41920f);
        return zzap.f41197i;
    }
}
