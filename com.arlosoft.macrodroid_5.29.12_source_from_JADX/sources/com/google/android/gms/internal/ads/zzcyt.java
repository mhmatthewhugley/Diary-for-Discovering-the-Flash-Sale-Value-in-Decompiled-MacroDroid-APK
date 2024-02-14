package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcyt implements zzdeo, zzbbq {

    /* renamed from: a */
    private final zzfdk f31871a;

    /* renamed from: c */
    private final zzdds f31872c;

    /* renamed from: d */
    private final zzdex f31873d;

    /* renamed from: f */
    private final AtomicBoolean f31874f = new AtomicBoolean();

    /* renamed from: g */
    private final AtomicBoolean f31875g = new AtomicBoolean();

    public zzcyt(zzfdk zzfdk, zzdds zzdds, zzdex zzdex) {
        this.f31871a = zzfdk;
        this.f31872c = zzdds;
        this.f31873d = zzdex;
    }

    /* renamed from: a */
    private final void m47044a() {
        if (this.f31874f.compareAndSet(false, true)) {
            this.f31872c.zza();
        }
    }

    /* renamed from: O0 */
    public final void mo42396O0(zzbbp zzbbp) {
        if (this.f31871a.f35529f == 1 && zzbbp.f26529j) {
            m47044a();
        }
        if (zzbbp.f26529j && this.f31875g.compareAndSet(false, true)) {
            this.f31873d.zza();
        }
    }

    /* renamed from: n */
    public final synchronized void mo44393n() {
        if (this.f31871a.f35529f != 1) {
            m47044a();
        }
    }
}
