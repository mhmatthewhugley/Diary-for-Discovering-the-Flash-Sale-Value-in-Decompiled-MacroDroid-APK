package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzn implements zzq {

    /* renamed from: a */
    private final Executor f48037a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f48038b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public OnSuccessListener f48039c;

    public zzn(@NonNull Executor executor, @NonNull OnSuccessListener onSuccessListener) {
        this.f48037a = executor;
        this.f48039c = onSuccessListener;
    }

    /* renamed from: a */
    public final void mo56146a() {
        synchronized (this.f48038b) {
            this.f48039c = null;
        }
    }

    /* renamed from: e */
    public final void mo56147e(@NonNull Task task) {
        if (task.mo23719t()) {
            synchronized (this.f48038b) {
                if (this.f48039c != null) {
                    this.f48037a.execute(new zzm(this, task));
                }
            }
        }
    }
}
