package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzdnl implements zzbpu {

    /* renamed from: a */
    private final WeakReference f32513a;

    /* synthetic */ zzdnl(zzdnq zzdnq, zzdnk zzdnk) {
        this.f32513a = new WeakReference(zzdnq);
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        zzdnq zzdnq = (zzdnq) this.f32513a.get();
        if (zzdnq != null && "_ac".equals((String) map.get("eventName"))) {
            zzdnq.f32524h.onAdClicked();
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27290w8)).booleanValue()) {
                zzdnq.f32525i.mo44113s();
            }
        }
    }
}
