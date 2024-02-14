package com.google.android.play.core.tasks;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzd implements zzg {

    /* renamed from: a */
    private final Executor f51964a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f51965b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    @Nullable

    /* renamed from: c */
    public final OnFailureListener f51966c;

    public zzd(Executor executor, OnFailureListener onFailureListener) {
        this.f51964a = executor;
        this.f51966c = onFailureListener;
    }

    /* renamed from: a */
    public final void mo60025a(Task task) {
        if (!task.mo60023i()) {
            synchronized (this.f51965b) {
                if (this.f51966c != null) {
                    this.f51964a.execute(new zzc(this, task));
                }
            }
        }
    }
}
