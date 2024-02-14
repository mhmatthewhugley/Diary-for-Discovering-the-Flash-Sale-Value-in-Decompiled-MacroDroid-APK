package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzca extends zzet {

    /* renamed from: a */
    private final Object f48198a = new Object();

    /* renamed from: c */
    private zzcb f48199c;

    /* renamed from: d */
    private zzbe f48200d;

    /* renamed from: g2 */
    public final void mo56333g2(int i, int i2) {
        zzcb zzcb;
        zzbe zzbe;
        synchronized (this.f48198a) {
            zzcb = this.f48199c;
            zzbe = new zzbe(i, i2);
            this.f48200d = zzbe;
        }
        if (zzcb != null) {
            zzcb.mo56310a(zzbe);
        }
    }

    /* renamed from: t1 */
    public final void mo56334t1(zzcb zzcb) {
        zzbe zzbe;
        synchronized (this.f48198a) {
            this.f48199c = (zzcb) Preconditions.m4488k(zzcb);
            zzbe = this.f48200d;
        }
        if (zzbe != null) {
            zzcb.mo56310a(zzbe);
        }
    }
}
