package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfru extends zzfro {

    /* renamed from: c */
    final /* synthetic */ IBinder f36311c;

    /* renamed from: d */
    final /* synthetic */ zzfrx f36312d;

    zzfru(zzfrx zzfrx, IBinder iBinder) {
        this.f36312d = zzfrx;
        this.f36311c = iBinder;
    }

    /* renamed from: a */
    public final void mo46131a() {
        this.f36312d.f36314a.f36328m = zzfrj.m50869Jb(this.f36311c);
        zzfry.m50900n(this.f36312d.f36314a);
        this.f36312d.f36314a.f36322g = false;
        for (Runnable run : this.f36312d.f36314a.f36319d) {
            run.run();
        }
        this.f36312d.f36314a.f36319d.clear();
    }
}
