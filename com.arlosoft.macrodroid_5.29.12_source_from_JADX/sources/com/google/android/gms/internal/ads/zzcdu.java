package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcdu {

    /* renamed from: a */
    private final Clock f28266a;

    /* renamed from: b */
    private final zzg f28267b;

    /* renamed from: c */
    private final zzceu f28268c;

    zzcdu(Clock clock, zzg zzg, zzceu zzceu) {
        this.f28266a = clock;
        this.f28267b = zzg;
        this.f28268c = zzceu;
    }

    /* renamed from: a */
    public final void mo43406a() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27202o0)).booleanValue()) {
            this.f28268c.mo43448y();
        }
    }

    /* renamed from: b */
    public final void mo43407b(int i, long j) {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27192n0)).booleanValue()) {
            if (j - this.f28267b.mo20361c() < 0) {
                zze.m2645k("Receiving npa decision in the past, ignoring.");
                return;
            }
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27202o0)).booleanValue()) {
                this.f28267b.mo20382m0(-1);
                this.f28267b.mo20383n0(j);
            } else {
                this.f28267b.mo20382m0(i);
                this.f28267b.mo20383n0(j);
            }
            mo43406a();
        }
    }
}
