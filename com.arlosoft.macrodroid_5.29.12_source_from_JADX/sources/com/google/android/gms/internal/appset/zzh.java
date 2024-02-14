package com.google.android.gms.internal.appset;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final /* synthetic */ class zzh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzl f39078a;

    /* renamed from: c */
    public final /* synthetic */ TaskCompletionSource f39079c;

    public /* synthetic */ zzh(zzl zzl, TaskCompletionSource taskCompletionSource) {
        this.f39078a = zzl;
        this.f39079c = taskCompletionSource;
    }

    public final void run() {
        this.f39078a.mo48493d(this.f39079c);
    }
}
