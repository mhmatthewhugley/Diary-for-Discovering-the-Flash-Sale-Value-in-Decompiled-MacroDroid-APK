package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzl implements zzq {

    /* renamed from: a */
    private final Executor f48032a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f48033b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public OnFailureListener f48034c;

    public zzl(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.f48032a = executor;
        this.f48034c = onFailureListener;
    }

    /* renamed from: a */
    public final void mo56146a() {
        synchronized (this.f48033b) {
            this.f48034c = null;
        }
    }

    /* renamed from: e */
    public final void mo56147e(@NonNull Task task) {
        if (!task.mo23719t() && !task.mo23717r()) {
            synchronized (this.f48033b) {
                if (this.f48034c != null) {
                    this.f48032a.execute(new zzk(this, task));
                }
            }
        }
    }
}
