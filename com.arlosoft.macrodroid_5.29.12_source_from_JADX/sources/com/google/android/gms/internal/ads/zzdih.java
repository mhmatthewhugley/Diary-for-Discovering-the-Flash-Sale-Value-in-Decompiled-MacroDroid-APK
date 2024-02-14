package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzdih implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzdii f32289a;

    /* renamed from: c */
    public final /* synthetic */ Object f32290c;

    public /* synthetic */ zzdih(zzdii zzdii, Object obj) {
        this.f32289a = zzdii;
        this.f32290c = obj;
    }

    public final void run() {
        try {
            this.f32289a.mo44573a(this.f32290c);
        } catch (Throwable th) {
            zzt.m2904q().mo43502s(th, "EventEmitter.notify");
            zze.m2646l("Event emitter exception.", th);
        }
    }
}
