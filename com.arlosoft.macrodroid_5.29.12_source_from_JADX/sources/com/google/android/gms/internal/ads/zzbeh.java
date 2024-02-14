package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzbeh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzchh f26694a;

    /* renamed from: c */
    public final /* synthetic */ Future f26695c;

    public /* synthetic */ zzbeh(zzchh zzchh, Future future) {
        this.f26694a = zzchh;
        this.f26695c = future;
    }

    public final void run() {
        zzchh zzchh = this.f26694a;
        Future future = this.f26695c;
        if (zzchh.isCancelled()) {
            future.cancel(true);
        }
    }
}
