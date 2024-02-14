package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbxt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AdOverlayInfoParcel f27931a;

    /* renamed from: c */
    final /* synthetic */ zzbxu f27932c;

    zzbxt(zzbxu zzbxu, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f27932c = zzbxu;
        this.f27931a = adOverlayInfoParcel;
    }

    public final void run() {
        zzt.m2898k();
        zzm.m2466a(this.f27932c.f27933a, this.f27931a, true);
    }
}
