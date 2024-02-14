package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.Closeable;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzx implements Closeable {

    /* renamed from: a */
    final /* synthetic */ TaskQueue f56430a;

    /* synthetic */ zzx(TaskQueue taskQueue, zzw zzw) {
        this.f56430a = taskQueue;
        Preconditions.m4493p(((Thread) taskQueue.f56337d.getAndSet(Thread.currentThread())) == null);
    }

    public final void close() {
        this.f56430a.f56337d.set((Object) null);
        this.f56430a.m79081d();
    }
}
