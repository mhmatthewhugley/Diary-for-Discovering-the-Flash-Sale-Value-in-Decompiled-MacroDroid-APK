package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaju {

    /* renamed from: a */
    private final Executor f24858a;

    public zzaju(Handler handler) {
        this.f24858a = new zzajs(this, handler);
    }

    /* renamed from: a */
    public final void mo41567a(zzakd zzakd, zzakm zzakm) {
        zzakd.mo41591o("post-error");
        zzakj a = zzakj.m41655a(zzakm);
        Executor executor = this.f24858a;
        ((zzajs) executor).f24854a.post(new zzajt(zzakd, a, (Runnable) null));
    }

    /* renamed from: b */
    public final void mo41568b(zzakd zzakd, zzakj zzakj, Runnable runnable) {
        zzakd.mo41594t();
        zzakd.mo41591o("post-response");
        Executor executor = this.f24858a;
        ((zzajs) executor).f24854a.post(new zzajt(zzakd, zzakj, runnable));
    }
}
