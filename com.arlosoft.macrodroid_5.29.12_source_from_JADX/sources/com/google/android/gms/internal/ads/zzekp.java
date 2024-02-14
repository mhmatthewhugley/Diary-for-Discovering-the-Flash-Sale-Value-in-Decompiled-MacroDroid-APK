package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzekp {

    /* renamed from: a */
    private final zzfeu f34299a;

    /* renamed from: b */
    private final zzdvi f34300b;

    /* renamed from: c */
    private final zzdxq f34301c;

    /* renamed from: d */
    private final zzfir f34302d;

    public zzekp(zzfeu zzfeu, zzdvi zzdvi, zzdxq zzdxq, zzfir zzfir) {
        this.f34299a = zzfeu;
        this.f34300b = zzdvi;
        this.f34301c = zzdxq;
        this.f34302d = zzfir;
    }

    /* renamed from: a */
    public final void mo45352a(zzfdn zzfdn, zzfdk zzfdk, int i, zzehg zzehg, long j) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27249s7)).booleanValue()) {
            zzfiq b = zzfiq.m50227b("adapter_status");
            b.mo45778g(zzfdn);
            b.mo45777f(zzfdk);
            b.mo45774a("adapter_l", String.valueOf(j));
            b.mo45774a("sc", Integer.toString(i));
            if (zzehg != null) {
                b.mo45774a("arec", Integer.toString(zzehg.mo45301b().f1934a));
                String a = this.f34299a.mo45632a(zzehg.getMessage());
                if (a != null) {
                    b.mo45774a("areec", a);
                }
            }
            zzdvh b2 = this.f34300b.mo45011b(zzfdk.f35555u);
            if (b2 != null) {
                b.mo45774a("ancn", b2.f33214a);
                zzbxq zzbxq = b2.f33215b;
                if (zzbxq != null) {
                    b.mo45774a("adapter_v", zzbxq.toString());
                }
                zzbxq zzbxq2 = b2.f33216c;
                if (zzbxq2 != null) {
                    b.mo45774a("adapter_sv", zzbxq2.toString());
                }
            }
            this.f34302d.mo45782a(b);
            return;
        }
        zzdxp a2 = this.f34301c.mo45050a();
        a2.mo45044e(zzfdn);
        a2.mo45043d(zzfdk);
        a2.mo45041b("action", "adapter_status");
        a2.mo45041b("adapter_l", String.valueOf(j));
        a2.mo45041b("sc", Integer.toString(i));
        if (zzehg != null) {
            a2.mo45041b("arec", Integer.toString(zzehg.mo45301b().f1934a));
            String a3 = this.f34299a.mo45632a(zzehg.getMessage());
            if (a3 != null) {
                a2.mo45041b("areec", a3);
            }
        }
        zzdvh b3 = this.f34300b.mo45011b(zzfdk.f35555u);
        if (b3 != null) {
            a2.mo45041b("ancn", b3.f33214a);
            zzbxq zzbxq3 = b3.f33215b;
            if (zzbxq3 != null) {
                a2.mo45041b("adapter_v", zzbxq3.toString());
            }
            zzbxq zzbxq4 = b3.f33216c;
            if (zzbxq4 != null) {
                a2.mo45041b("adapter_sv", zzbxq4.toString());
            }
        }
        a2.mo45046g();
    }
}
