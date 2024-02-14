package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzf {

    /* renamed from: a */
    final zzax f41442a;

    /* renamed from: b */
    final zzg f41443b;

    /* renamed from: c */
    final zzg f41444c;

    /* renamed from: d */
    final zzj f41445d;

    public zzf() {
        zzax zzax = new zzax();
        this.f41442a = zzax;
        zzg zzg = new zzg((zzg) null, zzax);
        this.f41444c = zzg;
        this.f41443b = zzg.mo51054a();
        zzj zzj = new zzj();
        this.f41445d = zzj;
        zzg.mo51060g("require", new zzw(zzj));
        zzj.mo51338a("internal.platform", zze.f41415a);
        zzg.mo51060g("runtime.counter", new zzah(Double.valueOf(0.0d)));
    }

    /* renamed from: a */
    public final zzap mo50946a(zzg zzg, zzgy... zzgyArr) {
        zzap zzap = zzap.f41197i;
        for (zzgy a : zzgyArr) {
            zzap = zzi.m60291a(a);
            zzh.m60245c(this.f41444c);
            if ((zzap instanceof zzaq) || (zzap instanceof zzao)) {
                zzap = this.f41442a.mo50762a(zzg, zzap);
            }
        }
        return zzap;
    }
}
