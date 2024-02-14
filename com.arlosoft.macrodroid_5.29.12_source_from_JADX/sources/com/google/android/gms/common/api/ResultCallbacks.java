package com.google.android.gms.common.api;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    @KeepForSdk
    /* renamed from: A */
    public final void mo21280A(@NonNull R r) {
        Status status = r.getStatus();
        if (status.mo21297q2()) {
            mo21281b(r);
            return;
        }
        mo21276a(status);
        if (r instanceof Releasable) {
            try {
                ((Releasable) r).release();
            } catch (RuntimeException e) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r)), e);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo21276a(@NonNull Status status);

    /* renamed from: b */
    public abstract void mo21281b(@NonNull R r);
}
