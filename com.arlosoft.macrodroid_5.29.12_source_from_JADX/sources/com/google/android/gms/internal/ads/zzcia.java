package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcia implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzcic f28487a;

    zzcia(zzcic zzcic) {
        this.f28487a = zzcic;
    }

    public final void run() {
        zzcic zzcic = this.f28487a;
        if (zzcic.f28497H != null) {
            if (!zzcic.f28498I) {
                zzcic.f28497H.mo43643f();
                this.f28487a.f28498I = true;
            }
            this.f28487a.f28497H.mo43639b();
        }
    }
}
