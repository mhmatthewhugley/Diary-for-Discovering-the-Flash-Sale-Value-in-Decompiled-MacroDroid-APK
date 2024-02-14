package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdfj extends zzdij implements zzddu, zzdez {

    /* renamed from: c */
    private final zzfdk f32210c;

    /* renamed from: d */
    private final AtomicBoolean f32211d = new AtomicBoolean();

    public zzdfj(Set set, zzfdk zzfdk) {
        super(set);
        this.f32210c = zzfdk;
    }

    private final void zzb() {
        zzs zzs;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26893I6)).booleanValue() && this.f32211d.compareAndSet(false, true) && (zzs = this.f32210c.f35532g0) != null && zzs.f2034a == 3) {
            mo44631L0(new zzdfi(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public final /* synthetic */ void mo44604M0(zzdfl zzdfl) throws Exception {
        zzdfl.mo44605a(this.f32210c.f35532g0);
    }

    /* renamed from: e */
    public final void mo44603e() {
        if (this.f32210c.f35521b == 1) {
            zzb();
        }
    }

    /* renamed from: j */
    public final void mo44390j() {
        int i = this.f32210c.f35521b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
