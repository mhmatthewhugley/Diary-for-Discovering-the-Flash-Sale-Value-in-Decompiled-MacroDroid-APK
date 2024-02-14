package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzh implements zzq {

    /* renamed from: a */
    private final Executor f48022a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f48023b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public OnCanceledListener f48024c;

    public zzh(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        this.f48022a = executor;
        this.f48024c = onCanceledListener;
    }

    /* renamed from: a */
    public final void mo56146a() {
        synchronized (this.f48023b) {
            this.f48024c = null;
        }
    }

    /* renamed from: e */
    public final void mo56147e(@NonNull Task task) {
        if (task.mo23717r()) {
            synchronized (this.f48023b) {
                if (this.f48024c != null) {
                    this.f48022a.execute(new zzg(this));
                }
            }
        }
    }
}
