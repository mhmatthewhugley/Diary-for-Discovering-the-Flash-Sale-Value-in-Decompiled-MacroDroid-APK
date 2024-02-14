package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Task f48040a;

    /* renamed from: c */
    final /* synthetic */ zzp f48041c;

    zzo(zzp zzp, Task task) {
        this.f48041c = zzp;
        this.f48040a = task;
    }

    public final void run() {
        try {
            Task a = this.f48041c.f48043b.mo21121a(this.f48040a.mo23715p());
            if (a == null) {
                this.f48041c.mo22733c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.f47997b;
            a.mo23709j(executor, this.f48041c);
            a.mo23706g(executor, this.f48041c);
            a.mo23701b(executor, this.f48041c);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f48041c.mo22733c((Exception) e.getCause());
            } else {
                this.f48041c.mo22733c(e);
            }
        } catch (CancellationException unused) {
            this.f48041c.mo30644d();
        } catch (Exception e2) {
            this.f48041c.mo22733c(e2);
        }
    }
}
