package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzedg implements zzedi {

    /* renamed from: a */
    private final Map f33746a;

    /* renamed from: b */
    private final zzfzq f33747b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final zzdft f33748c;

    public zzedg(Map map, zzfzq zzfzq, zzdft zzdft) {
        this.f33746a = map;
        this.f33747b = zzfzq;
        this.f33748c = zzdft;
    }

    /* renamed from: a */
    public final zzfzp mo45167a(zzcbc zzcbc) {
        this.f33748c.mo44490u(zzcbc);
        zzfzp h = zzfzg.m51413h(new zzebh(3));
        for (String trim : ((String) zzay.m1924c().mo42663b(zzbjc.f27079b7)).split(",")) {
            zzgxv zzgxv = (zzgxv) this.f33746a.get(trim.trim());
            if (zzgxv != null) {
                h = zzfzg.m51412g(h, zzebh.class, new zzede(zzgxv, zzcbc), this.f33747b);
            }
        }
        zzfzg.m51423r(h, new zzedf(this), zzchc.f28461f);
        return h;
    }
}
