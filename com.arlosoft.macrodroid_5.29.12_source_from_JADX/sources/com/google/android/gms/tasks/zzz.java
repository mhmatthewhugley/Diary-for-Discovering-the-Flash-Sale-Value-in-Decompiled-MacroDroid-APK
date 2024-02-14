package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzw f48061a;

    /* renamed from: c */
    final /* synthetic */ Callable f48062c;

    zzz(zzw zzw, Callable callable) {
        this.f48061a = zzw;
        this.f48062c = callable;
    }

    public final void run() {
        try {
            this.f48061a.mo56161x(this.f48062c.call());
        } catch (Exception e) {
            this.f48061a.mo56160w(e);
        } catch (Throwable th) {
            this.f48061a.mo56160w(new RuntimeException(th));
        }
    }
}
