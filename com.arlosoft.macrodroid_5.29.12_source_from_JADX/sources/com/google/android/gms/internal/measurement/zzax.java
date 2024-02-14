package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzax {

    /* renamed from: a */
    final Map f41213a = new HashMap();

    /* renamed from: b */
    final zzbj f41214b = new zzbj();

    public zzax() {
        mo50763b(new zzav());
        mo50763b(new zzay());
        mo50763b(new zzaz());
        mo50763b(new zzbc());
        mo50763b(new zzbh());
        mo50763b(new zzbi());
        mo50763b(new zzbk());
    }

    /* renamed from: a */
    public final zzap mo50762a(zzg zzg, zzap zzap) {
        zzaw zzaw;
        zzh.m60245c(zzg);
        if (!(zzap instanceof zzaq)) {
            return zzap;
        }
        zzaq zzaq = (zzaq) zzap;
        ArrayList b = zzaq.mo50748b();
        String a = zzaq.mo50747a();
        if (this.f41213a.containsKey(a)) {
            zzaw = (zzaw) this.f41213a.get(a);
        } else {
            zzaw = this.f41214b;
        }
        return zzaw.mo50760a(a, zzg, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo50763b(zzaw zzaw) {
        for (zzbl d : zzaw.f41212a) {
            this.f41213a.put(d.mo50767d().toString(), zzaw);
        }
    }
}
