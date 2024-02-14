package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzl implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ModelResource f56412a;

    /* renamed from: c */
    public final /* synthetic */ TaskCompletionSource f56413c;

    public /* synthetic */ zzl(ModelResource modelResource, TaskCompletionSource taskCompletionSource) {
        this.f56412a = modelResource;
        this.f56413c = taskCompletionSource;
    }

    public final void run() {
        this.f56412a.mo64567i(this.f56413c);
    }
}
