package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcfu extends zzb {

    /* renamed from: c */
    final /* synthetic */ zzcfy f28378c;

    zzcfu(zzcfy zzcfy) {
        this.f28378c = zzcfy;
    }

    /* renamed from: a */
    public final void mo20184a() {
        zzcfy zzcfy = this.f28378c;
        zzbjf zzbjf = new zzbjf(zzcfy.f28387e, zzcfy.f28388f.f28446a);
        synchronized (this.f28378c.f28383a) {
            try {
                zzt.m2894g();
                zzbji.m43559a(this.f28378c.f28389g, zzbjf);
            } catch (IllegalArgumentException e) {
                zzcgp.m45230h("Cannot config CSI reporter.", e);
            }
        }
    }
}
