package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfgm {

    /* renamed from: a */
    private final zzffq f35744a;

    /* renamed from: b */
    private final zzfgk f35745b;

    /* renamed from: c */
    private final zzffm f35746c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ArrayDeque f35747d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public zzfgs f35748e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f35749f = 1;

    public zzfgm(zzffq zzffq, zzffm zzffm, zzfgk zzfgk) {
        this.f35744a = zzffq;
        this.f35746c = zzffm;
        this.f35745b = zzfgk;
        this.f35747d = new ArrayDeque();
        zzffm.mo45678b(new zzfgh(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final synchronized void m50137h() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27247s5)).booleanValue()) {
            if (!zzt.m2904q().mo43494h().mo20365e().mo43483h()) {
                this.f35747d.clear();
                return;
            }
        }
        if (m50138i()) {
            while (!this.f35747d.isEmpty()) {
                zzfgl zzfgl = (zzfgl) this.f35747d.pollFirst();
                if (zzfgl == null || (zzfgl.zza() != null && this.f35744a.mo45688b(zzfgl.zza()))) {
                    zzfgs zzfgs = new zzfgs(this.f35744a, this.f35745b, zzfgl);
                    this.f35748e = zzfgs;
                    zzfgs.mo45728d(new zzfgi(this, zzfgl));
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    private final synchronized boolean m50138i() {
        return this.f35748e == null;
    }

    @Nullable
    /* renamed from: a */
    public final synchronized zzfzp mo45712a(zzfgl zzfgl) {
        this.f35749f = 2;
        if (m50138i()) {
            return null;
        }
        return this.f35748e.mo45725a(zzfgl);
    }

    /* renamed from: e */
    public final synchronized void mo45713e(zzfgl zzfgl) {
        this.f35747d.add(zzfgl);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo45714f() {
        synchronized (this) {
            this.f35749f = 1;
            m50137h();
        }
    }
}
