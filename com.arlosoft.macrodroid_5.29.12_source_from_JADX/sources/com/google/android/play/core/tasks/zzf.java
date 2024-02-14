package com.google.android.play.core.tasks;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzf implements zzg {

    /* renamed from: a */
    private final Executor f51969a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f51970b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    @Nullable

    /* renamed from: c */
    public final OnSuccessListener f51971c;

    public zzf(Executor executor, OnSuccessListener onSuccessListener) {
        this.f51969a = executor;
        this.f51971c = onSuccessListener;
    }

    /* renamed from: a */
    public final void mo60025a(Task task) {
        if (task.mo60023i()) {
            synchronized (this.f51970b) {
                if (this.f51971c != null) {
                    this.f51969a.execute(new zze(this, task));
                }
            }
        }
    }
}
