package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzdnn implements zzbpu {

    /* renamed from: a */
    private final WeakReference f32514a;

    /* synthetic */ zzdnn(zzdnq zzdnq, zzdnm zzdnm) {
        this.f32514a = new WeakReference(zzdnq);
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        zzdnq zzdnq = (zzdnq) this.f32514a.get();
        if (zzdnq != null) {
            zzdnq.f32524h.onAdClicked();
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27290w8)).booleanValue()) {
                zzdnq.f32525i.mo44113s();
            }
        }
    }
}
