package com.google.android.play.core.tasks;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzb implements zzg {

    /* renamed from: a */
    private final Executor f51959a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f51960b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    @Nullable

    /* renamed from: c */
    public final OnCompleteListener f51961c;

    public zzb(Executor executor, OnCompleteListener onCompleteListener) {
        this.f51959a = executor;
        this.f51961c = onCompleteListener;
    }

    /* renamed from: a */
    public final void mo60025a(Task task) {
        synchronized (this.f51960b) {
            if (this.f51961c != null) {
                this.f51959a.execute(new zza(this, task));
            }
        }
    }
}
