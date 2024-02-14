package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzfmt implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f36124a;

    /* renamed from: c */
    public final /* synthetic */ TaskCompletionSource f36125c;

    public /* synthetic */ zzfmt(Context context, TaskCompletionSource taskCompletionSource) {
        this.f36124a = context;
        this.f36125c = taskCompletionSource;
    }

    public final void run() {
        this.f36125c.mo56139c(zzfoz.m50719b(this.f36124a, "GLAS", (String) null));
    }
}
