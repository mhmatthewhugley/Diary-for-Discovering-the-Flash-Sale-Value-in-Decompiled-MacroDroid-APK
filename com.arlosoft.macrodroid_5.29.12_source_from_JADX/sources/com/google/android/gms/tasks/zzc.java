package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Task f48011a;

    /* renamed from: c */
    final /* synthetic */ zzd f48012c;

    zzc(zzd zzd, Task task) {
        this.f48012c = zzd;
        this.f48011a = task;
    }

    public final void run() {
        if (this.f48011a.mo23717r()) {
            this.f48012c.f48015c.mo56162y();
            return;
        }
        try {
            this.f48012c.f48015c.mo56161x(this.f48012c.f48014b.mo21119a(this.f48011a));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f48012c.f48015c.mo56160w((Exception) e.getCause());
            } else {
                this.f48012c.f48015c.mo56160w(e);
            }
        } catch (Exception e2) {
            this.f48012c.f48015c.mo56160w(e2);
        }
    }
}
