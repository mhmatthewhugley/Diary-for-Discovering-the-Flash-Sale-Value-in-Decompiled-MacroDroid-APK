package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zae extends zai {

    /* renamed from: b */
    protected final BaseImplementation.ApiMethodImpl f3453b;

    public zae(int i, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        super(i);
        this.f3453b = (BaseImplementation.ApiMethodImpl) Preconditions.m4489l(apiMethodImpl, "Null methods are not runnable.");
    }

    /* renamed from: a */
    public final void mo21510a(@NonNull Status status) {
        try {
            this.f3453b.mo21321b(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    /* renamed from: b */
    public final void mo21511b(@NonNull Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f3453b.mo21321b(new Status(10, simpleName + ": " + localizedMessage));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    /* renamed from: c */
    public final void mo21512c(zabq zabq) throws DeadObjectException {
        try {
            this.f3453b.mo21325x(zabq.mo21485s());
        } catch (RuntimeException e) {
            mo21511b(e);
        }
    }

    /* renamed from: d */
    public final void mo21513d(@NonNull zaad zaad, boolean z) {
        zaad.mo21423c(this.f3453b, z);
    }
}
