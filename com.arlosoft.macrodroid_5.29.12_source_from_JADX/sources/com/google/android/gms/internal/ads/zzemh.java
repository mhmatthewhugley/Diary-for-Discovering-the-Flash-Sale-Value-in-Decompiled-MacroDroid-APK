package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzemh implements zzf {

    /* renamed from: a */
    private final zzdcy f34457a;

    /* renamed from: b */
    private final zzdds f34458b;

    /* renamed from: c */
    private final zzdkp f34459c;

    /* renamed from: d */
    private final zzdki f34460d;

    /* renamed from: e */
    private final zzcvk f34461e;

    /* renamed from: f */
    final AtomicBoolean f34462f = new AtomicBoolean(false);

    zzemh(zzdcy zzdcy, zzdds zzdds, zzdkp zzdkp, zzdki zzdki, zzcvk zzcvk) {
        this.f34457a = zzdcy;
        this.f34458b = zzdds;
        this.f34459c = zzdkp;
        this.f34460d = zzdki;
        this.f34461e = zzcvk;
    }

    /* renamed from: a */
    public final void mo20421a() {
        if (this.f34462f.get()) {
            this.f34458b.zza();
            this.f34459c.zza();
        }
    }

    /* renamed from: b */
    public final synchronized void mo20422b(View view) {
        if (this.f34462f.compareAndSet(false, true)) {
            this.f34461e.mo44390j();
            this.f34460d.mo44684M0(view);
        }
    }

    public final void zzb() {
        if (this.f34462f.get()) {
            this.f34457a.onAdClicked();
        }
    }
}
