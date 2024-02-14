package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzchw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f28479a;

    /* renamed from: c */
    final /* synthetic */ String f28480c;

    /* renamed from: d */
    final /* synthetic */ zzcic f28481d;

    zzchw(zzcic zzcic, String str, String str2) {
        this.f28481d = zzcic;
        this.f28479a = str;
        this.f28480c = str2;
    }

    public final void run() {
        zzcic zzcic = this.f28481d;
        if (zzcic.f28497H != null) {
            zzcic.f28497H.mo43647q(this.f28479a, this.f28480c);
        }
    }
}
