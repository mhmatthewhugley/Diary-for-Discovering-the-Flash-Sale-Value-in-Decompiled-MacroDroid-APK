package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzc {

    /* renamed from: a */
    final zzf f41302a;

    /* renamed from: b */
    zzg f41303b;

    /* renamed from: c */
    final zzab f41304c = new zzab();

    /* renamed from: d */
    private final zzz f41305d = new zzz();

    public zzc() {
        zzf zzf = new zzf();
        this.f41302a = zzf;
        this.f41303b = zzf.f41443b.mo51054a();
        zzf.f41445d.mo51338a("internal.registerCallback", new zza(this));
        zzf.f41445d.mo51338a("internal.eventLogger", new zzb(this));
    }

    /* renamed from: a */
    public final zzab mo50781a() {
        return this.f41304c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzai mo50782b() throws Exception {
        return new zzv(this.f41305d);
    }

    /* renamed from: c */
    public final void mo50783c(zzgt zzgt) throws zzd {
        zzai zzai;
        try {
            this.f41303b = this.f41302a.f41443b.mo51054a();
            if (!(this.f41302a.mo50946a(this.f41303b, (zzgy[]) zzgt.mo51247D().toArray(new zzgy[0])) instanceof zzag)) {
                for (zzgr zzgr : zzgt.mo51246B().mo51243E()) {
                    List D = zzgr.mo51245D();
                    String C = zzgr.mo51244C();
                    Iterator it = D.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            zzap a = this.f41302a.mo50946a(this.f41303b, (zzgy) it.next());
                            if (a instanceof zzam) {
                                zzg zzg = this.f41303b;
                                if (!zzg.mo51061h(C)) {
                                    zzai = null;
                                } else {
                                    zzap d = zzg.mo51057d(C);
                                    if (d instanceof zzai) {
                                        zzai = (zzai) d;
                                    } else {
                                        throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(C)));
                                    }
                                }
                                if (zzai != null) {
                                    zzai.mo50735a(this.f41303b, Collections.singletonList(a));
                                } else {
                                    throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(C)));
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: d */
    public final void mo50784d(String str, Callable callable) {
        this.f41302a.f41445d.mo51338a(str, callable);
    }

    /* renamed from: e */
    public final boolean mo50785e(zzaa zzaa) throws zzd {
        try {
            this.f41304c.mo50694d(zzaa);
            this.f41302a.f41444c.mo51060g("runtime.counter", new zzah(Double.valueOf(0.0d)));
            this.f41305d.mo51717b(this.f41303b.mo51054a(), this.f41304c);
            return mo50787g() || mo50786f();
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: f */
    public final boolean mo50786f() {
        return !this.f41304c.mo50692c().isEmpty();
    }

    /* renamed from: g */
    public final boolean mo50787g() {
        zzab zzab = this.f41304c;
        return !zzab.mo50691b().equals(zzab.mo50690a());
    }
}
