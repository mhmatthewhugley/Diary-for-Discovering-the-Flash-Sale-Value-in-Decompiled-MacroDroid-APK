package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzj implements zzq {

    /* renamed from: a */
    private final Executor f48027a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f48028b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public OnCompleteListener f48029c;

    public zzj(@NonNull Executor executor, @NonNull OnCompleteListener onCompleteListener) {
        this.f48027a = executor;
        this.f48029c = onCompleteListener;
    }

    /* renamed from: a */
    public final void mo56146a() {
        synchronized (this.f48028b) {
            this.f48029c = null;
        }
    }

    /* renamed from: e */
    public final void mo56147e(@NonNull Task task) {
        synchronized (this.f48028b) {
            if (this.f48029c != null) {
                this.f48027a.execute(new zzi(this, task));
            }
        }
    }
}
