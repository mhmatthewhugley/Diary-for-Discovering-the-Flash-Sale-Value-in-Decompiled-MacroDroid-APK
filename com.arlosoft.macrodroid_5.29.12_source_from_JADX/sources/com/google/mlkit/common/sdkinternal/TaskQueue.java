package com.google.mlkit.common.sdkinternal;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class TaskQueue {

    /* renamed from: a */
    private final Object f56334a = new Object();
    @GuardedBy("lock")

    /* renamed from: b */
    private boolean f56335b;
    @GuardedBy("lock")

    /* renamed from: c */
    private final Queue f56336c = new ArrayDeque();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final AtomicReference f56337d = new AtomicReference();

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m79081d() {
        synchronized (this.f56334a) {
            if (this.f56336c.isEmpty()) {
                this.f56335b = false;
                return;
            }
            zzv zzv = (zzv) this.f56336c.remove();
            m79082e(zzv.f56428a, zzv.f56429b);
        }
    }

    /* renamed from: e */
    private final void m79082e(Executor executor, Runnable runnable) {
        try {
            executor.execute(new zzt(this, runnable));
        } catch (RejectedExecutionException unused) {
            m79081d();
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo64582a(@NonNull Executor executor, @NonNull Runnable runnable) {
        synchronized (this.f56334a) {
            if (this.f56335b) {
                this.f56336c.add(new zzv(executor, runnable, (zzu) null));
                return;
            }
            this.f56335b = true;
            m79082e(executor, runnable);
        }
    }
}
