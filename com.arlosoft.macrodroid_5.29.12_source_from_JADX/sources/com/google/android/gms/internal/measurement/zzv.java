package com.google.android.gms.internal.measurement;

import java.util.List;
import org.apache.commons.logging.LogFactory;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzv extends zzai {

    /* renamed from: d */
    private final zzz f41924d;

    public zzv(zzz zzz) {
        super("internal.registerCallback");
        this.f41924d = zzz;
    }

    /* renamed from: a */
    public final zzap mo50735a(zzg zzg, List list) {
        zzh.m60250h(this.f41190a, 3, list);
        String g = zzg.mo51055b((zzap) list.get(0)).mo50707g();
        zzap b = zzg.mo51055b((zzap) list.get(1));
        if (b instanceof zzao) {
            zzap b2 = zzg.mo51055b((zzap) list.get(2));
            if (b2 instanceof zzam) {
                zzam zzam = (zzam) b2;
                if (zzam.mo50708h("type")) {
                    this.f41924d.mo51716a(g, zzam.mo50708h(LogFactory.PRIORITY_KEY) ? zzh.m60244b(zzam.mo50701W(LogFactory.PRIORITY_KEY).mo50704e().doubleValue()) : 1000, (zzao) b, zzam.mo50701W("type").mo50707g());
                    return zzap.f41197i;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
