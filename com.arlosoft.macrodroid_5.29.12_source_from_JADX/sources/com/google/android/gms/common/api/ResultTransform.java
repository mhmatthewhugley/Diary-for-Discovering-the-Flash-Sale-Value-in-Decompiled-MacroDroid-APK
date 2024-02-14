package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class ResultTransform<R extends Result, S extends Result> {
    @NonNull
    /* renamed from: a */
    public Status mo21282a(@NonNull Status status) {
        return status;
    }

    @WorkerThread
    @Nullable
    /* renamed from: b */
    public abstract PendingResult<S> mo21283b(@NonNull R r);
}
