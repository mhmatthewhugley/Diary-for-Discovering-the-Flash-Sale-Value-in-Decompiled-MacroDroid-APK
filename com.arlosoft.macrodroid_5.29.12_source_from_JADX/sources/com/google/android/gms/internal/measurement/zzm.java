package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzm extends zzai {

    /* renamed from: d */
    final /* synthetic */ zzo f41708d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzm(zzn zzn, String str, zzo zzo) {
        super("getValue");
        this.f41708d = zzo;
    }

    /* renamed from: a */
    public final zzap mo50735a(zzg zzg, List list) {
        zzh.m60250h("getValue", 2, list);
        zzap b = zzg.mo51055b((zzap) list.get(0));
        zzap b2 = zzg.mo51055b((zzap) list.get(1));
        String o = this.f41708d.mo51665o(b.mo50707g());
        return o != null ? new zzat(o) : b2;
    }
}
