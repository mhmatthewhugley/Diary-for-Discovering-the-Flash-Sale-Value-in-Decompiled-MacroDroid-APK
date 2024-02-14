package com.google.firebase.appindexing.internal;

import android.os.Handler;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Queue;
import java.util.concurrent.Executor;

@VisibleForTesting
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzo implements OnCompleteListener<Void>, Executor {
    /* access modifiers changed from: private */
    @NonNull

    /* renamed from: a */
    public final GoogleApi<?> f53874a;
    @NonNull

    /* renamed from: c */
    private final Handler f53875c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Queue<zzn> f53876d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f53877f;

    /* renamed from: a */
    public final void mo21120a(@NonNull Task<Void> task) {
        zzn zzn;
        synchronized (this.f53876d) {
            if (this.f53877f == 2) {
                zzn = this.f53876d.peek();
                Preconditions.m4493p(zzn != null);
            } else {
                zzn = null;
            }
            this.f53877f = 0;
        }
        if (zzn != null) {
            zzn.mo62032a();
        }
    }

    public final void execute(Runnable runnable) {
        this.f53875c.post(runnable);
    }
}
