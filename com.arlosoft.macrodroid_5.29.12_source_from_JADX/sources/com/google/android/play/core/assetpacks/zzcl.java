package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzco;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzcl {

    /* renamed from: k */
    private static final zzag f51388k = new zzag("ExtractorLooper");

    /* renamed from: a */
    private final zzde f51389a;

    /* renamed from: b */
    private final zzcf f51390b;

    /* renamed from: c */
    private final zzer f51391c;

    /* renamed from: d */
    private final zzdu f51392d;

    /* renamed from: e */
    private final zzdz f51393e;

    /* renamed from: f */
    private final zzeg f51394f;

    /* renamed from: g */
    private final zzek f51395g;

    /* renamed from: h */
    private final zzco f51396h;

    /* renamed from: i */
    private final zzdh f51397i;

    /* renamed from: j */
    private final AtomicBoolean f51398j = new AtomicBoolean(false);

    zzcl(zzde zzde, zzco zzco, zzcf zzcf, zzer zzer, zzdu zzdu, zzdz zzdz, zzeg zzeg, zzek zzek, zzdh zzdh) {
        this.f51389a = zzde;
        this.f51396h = zzco;
        this.f51390b = zzcf;
        this.f51391c = zzer;
        this.f51392d = zzdu;
        this.f51393e = zzdz;
        this.f51394f = zzeg;
        this.f51395g = zzek;
        this.f51397i = zzdh;
    }

    /* renamed from: b */
    private final void m70645b(int i, Exception exc) {
        try {
            this.f51389a.mo59724l(i, 5);
            this.f51389a.mo59725m(i);
        } catch (zzck unused) {
            f51388k.mo59806b("Error during error handling: %s", exc.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo59704a() {
        zzag zzag = f51388k;
        zzag.mo59805a("Run extractor loop", new Object[0]);
        if (this.f51398j.compareAndSet(false, true)) {
            while (true) {
                zzdg zzdg = null;
                try {
                    zzdg = this.f51397i.mo59728a();
                } catch (zzck e) {
                    f51388k.mo59806b("Error while getting next extraction task: %s", e.getMessage());
                    if (e.zza >= 0) {
                        ((zzy) this.f51396h.zza()).mo59607b0(e.zza);
                        m70645b(e.zza, e);
                    }
                }
                if (zzdg != null) {
                    try {
                        if (zzdg instanceof zzce) {
                            this.f51390b.mo59698a((zzce) zzdg);
                        } else if (zzdg instanceof zzeq) {
                            this.f51391c.mo59772a((zzeq) zzdg);
                        } else if (zzdg instanceof zzdt) {
                            this.f51392d.mo59746a((zzdt) zzdg);
                        } else if (zzdg instanceof zzdw) {
                            this.f51393e.mo59749a((zzdw) zzdg);
                        } else if (zzdg instanceof zzef) {
                            this.f51394f.mo59754a((zzef) zzdg);
                        } else if (zzdg instanceof zzei) {
                            this.f51395g.mo59756a((zzei) zzdg);
                        } else {
                            f51388k.mo59806b("Unknown task type: %s", zzdg.getClass().getName());
                        }
                    } catch (Exception e2) {
                        f51388k.mo59806b("Error during extraction task: %s", e2.getMessage());
                        ((zzy) this.f51396h.zza()).mo59607b0(zzdg.f51463a);
                        m70645b(zzdg.f51463a, e2);
                    }
                } else {
                    this.f51398j.set(false);
                    return;
                }
            }
        } else {
            zzag.mo59809e("runLoop already looping; return", new Object[0]);
        }
    }
}
