package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzchy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f28483a;

    /* renamed from: c */
    final /* synthetic */ int f28484c;

    /* renamed from: d */
    final /* synthetic */ zzcic f28485d;

    zzchy(zzcic zzcic, int i, int i2) {
        this.f28485d = zzcic;
        this.f28483a = i;
        this.f28484c = i2;
    }

    public final void run() {
        zzcic zzcic = this.f28485d;
        if (zzcic.f28497H != null) {
            zzcic.f28497H.mo43638a(this.f28483a, this.f28484c);
        }
    }
}
