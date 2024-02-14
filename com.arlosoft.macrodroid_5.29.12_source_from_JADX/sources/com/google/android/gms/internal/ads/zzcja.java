package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcja implements Runnable {

    /* renamed from: a */
    private final zzcim f28617a;

    /* renamed from: c */
    private boolean f28618c = false;

    zzcja(zzcim zzcim) {
        this.f28617a = zzcim;
    }

    /* renamed from: c */
    private final void m45467c() {
        zzfpz zzfpz = zzs.f2304i;
        zzfpz.removeCallbacks(this);
        zzfpz.postDelayed(this, 250);
    }

    /* renamed from: a */
    public final void mo43776a() {
        this.f28618c = true;
        this.f28617a.mo43665D();
    }

    /* renamed from: b */
    public final void mo43777b() {
        this.f28618c = false;
        m45467c();
    }

    public final void run() {
        if (!this.f28618c) {
            this.f28617a.mo43665D();
            m45467c();
        }
    }
}
