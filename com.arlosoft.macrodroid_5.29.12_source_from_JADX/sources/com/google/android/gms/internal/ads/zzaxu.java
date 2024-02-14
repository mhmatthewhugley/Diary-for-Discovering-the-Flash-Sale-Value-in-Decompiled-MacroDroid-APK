package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaxu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ IOException f26184a;

    /* renamed from: c */
    final /* synthetic */ zzaxy f26185c;

    zzaxu(zzaxy zzaxy, IOException iOException) {
        this.f26185c = zzaxy;
        this.f26184a = iOException;
    }

    public final void run() {
        this.f26185c.f26229g.mo42223c(this.f26184a);
    }
}
