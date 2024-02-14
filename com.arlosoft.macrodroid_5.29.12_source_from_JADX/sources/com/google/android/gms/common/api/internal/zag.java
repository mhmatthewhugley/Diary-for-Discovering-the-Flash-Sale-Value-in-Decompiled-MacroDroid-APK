package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zag extends zac {

    /* renamed from: b */
    private final TaskApiCall f3455b;

    /* renamed from: c */
    private final TaskCompletionSource f3456c;

    /* renamed from: d */
    private final StatusExceptionMapper f3457d;

    public zag(int i, TaskApiCall taskApiCall, TaskCompletionSource taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i);
        this.f3456c = taskCompletionSource;
        this.f3455b = taskApiCall;
        this.f3457d = statusExceptionMapper;
        if (i == 2 && taskApiCall.mo21402e()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    /* renamed from: a */
    public final void mo21510a(@NonNull Status status) {
        this.f3456c.mo56140d(this.f3457d.mo21303a(status));
    }

    /* renamed from: b */
    public final void mo21511b(@NonNull Exception exc) {
        this.f3456c.mo56140d(exc);
    }

    /* renamed from: c */
    public final void mo21512c(zabq zabq) throws DeadObjectException {
        try {
            this.f3455b.mo20779d(zabq.mo21485s(), this.f3456c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo21510a(zai.m4226e(e2));
        } catch (RuntimeException e3) {
            this.f3456c.mo56140d(e3);
        }
    }

    /* renamed from: d */
    public final void mo21513d(@NonNull zaad zaad, boolean z) {
        zaad.mo21424d(this.f3456c, z);
    }

    /* renamed from: f */
    public final boolean mo21496f(zabq zabq) {
        return this.f3455b.mo21402e();
    }

    @Nullable
    /* renamed from: g */
    public final Feature[] mo21497g(zabq zabq) {
        return this.f3455b.mo21404g();
    }
}
