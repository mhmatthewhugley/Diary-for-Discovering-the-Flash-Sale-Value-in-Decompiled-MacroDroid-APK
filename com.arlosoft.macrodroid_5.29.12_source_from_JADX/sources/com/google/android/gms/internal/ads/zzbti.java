package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzca;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbti implements zzbpu {

    /* renamed from: a */
    final /* synthetic */ zzbsr f27740a;

    /* renamed from: b */
    final /* synthetic */ zzca f27741b;

    /* renamed from: c */
    final /* synthetic */ zzbtw f27742c;

    zzbti(zzbtw zzbtw, zzape zzape, zzbsr zzbsr, zzca zzca) {
        this.f27742c = zzbtw;
        this.f27740a = zzbsr;
        this.f27741b = zzca;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, com.google.android.gms.internal.ads.zzbpu] */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42867a(Object obj, Map map) {
        zzbtx zzbtx = (zzbtx) obj;
        synchronized (this.f27742c.f27767a) {
            zzcgp.m45228f("JS Engine is requesting an update");
            if (this.f27742c.f27775i == 0) {
                zzcgp.m45228f("Starting reload.");
                this.f27742c.f27775i = 2;
                this.f27742c.mo42990d((zzape) null);
            }
            this.f27740a.mo42969J0("/requestReload", this.f27741b.mo20338a());
        }
    }
}
