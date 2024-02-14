package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcis {

    /* renamed from: a */
    private final long f28543a = TimeUnit.MILLISECONDS.toNanos(((Long) zzay.m1924c().mo42663b(zzbjc.f26816B)).longValue());

    /* renamed from: b */
    private long f28544b;

    /* renamed from: c */
    private boolean f28545c = true;

    zzcis() {
    }

    /* renamed from: a */
    public final void mo43725a(SurfaceTexture surfaceTexture, zzcid zzcid) {
        if (zzcid != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f28545c || Math.abs(timestamp - this.f28544b) >= this.f28543a) {
                this.f28545c = false;
                this.f28544b = timestamp;
                zzs.f2304i.post(new zzcir(zzcid));
            }
        }
    }

    /* renamed from: b */
    public final void mo43726b() {
        this.f28545c = true;
    }
}
