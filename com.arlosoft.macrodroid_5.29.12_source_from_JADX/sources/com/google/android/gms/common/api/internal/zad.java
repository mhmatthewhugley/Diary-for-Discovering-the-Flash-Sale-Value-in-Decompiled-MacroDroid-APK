package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
abstract class zad extends zac {

    /* renamed from: b */
    protected final TaskCompletionSource f3439b;

    public zad(int i, TaskCompletionSource taskCompletionSource) {
        super(i);
        this.f3439b = taskCompletionSource;
    }

    /* renamed from: a */
    public final void mo21510a(@NonNull Status status) {
        this.f3439b.mo56140d(new ApiException(status));
    }

    /* renamed from: b */
    public final void mo21511b(@NonNull Exception exc) {
        this.f3439b.mo56140d(exc);
    }

    /* renamed from: c */
    public final void mo21512c(zabq zabq) throws DeadObjectException {
        try {
            mo21514h(zabq);
        } catch (DeadObjectException e) {
            mo21510a(zai.m4226e(e));
            throw e;
        } catch (RemoteException e2) {
            mo21510a(zai.m4226e(e2));
        } catch (RuntimeException e3) {
            this.f3439b.mo56140d(e3);
        }
    }

    /* renamed from: d */
    public void mo21513d(@NonNull zaad zaad, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo21514h(zabq zabq) throws RemoteException;
}
