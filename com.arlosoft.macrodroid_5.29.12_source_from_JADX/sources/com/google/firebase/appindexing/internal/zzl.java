package com.google.firebase.appindexing.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzl extends IStatusCallback.Stub {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f53868a;

    /* renamed from: c */
    final /* synthetic */ zzm f53869c;

    zzl(zzm zzm, TaskCompletionSource taskCompletionSource) {
        this.f53869c = zzm;
        this.f53868a = taskCompletionSource;
    }

    /* renamed from: j8 */
    public final void mo21356j8(Status status) throws RemoteException {
        if (!this.f53868a.mo56141e(null)) {
            return;
        }
        if (status.mo21297q2()) {
            this.f53869c.f53870d.f53872b.mo56139c(null);
        } else {
            this.f53869c.f53870d.f53872b.mo56138b(zzaf.m74511a(status, "Indexing error, please try again."));
        }
    }
}
