package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zze implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Task f48016a;

    /* renamed from: c */
    final /* synthetic */ zzf f48017c;

    zze(zzf zzf, Task task) {
        this.f48017c = zzf;
        this.f48016a = task;
    }

    public final void run() {
        try {
            Task task = (Task) this.f48017c.f48019b.mo21119a(this.f48016a);
            if (task == null) {
                this.f48017c.mo22733c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.f47997b;
            task.mo23709j(executor, this.f48017c);
            task.mo23706g(executor, this.f48017c);
            task.mo23701b(executor, this.f48017c);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f48017c.f48020c.mo56160w((Exception) e.getCause());
            } else {
                this.f48017c.f48020c.mo56160w(e);
            }
        } catch (Exception e2) {
            this.f48017c.f48020c.mo56160w(e2);
        }
    }
}
