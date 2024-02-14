package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class TaskUtil {
    @KeepForSdk
    /* renamed from: a */
    public static void m3877a(@NonNull Status status, @NonNull TaskCompletionSource<Void> taskCompletionSource) {
        m3878b(status, (Object) null, taskCompletionSource);
    }

    @KeepForSdk
    /* renamed from: b */
    public static <ResultT> void m3878b(@NonNull Status status, @Nullable ResultT resultt, @NonNull TaskCompletionSource<ResultT> taskCompletionSource) {
        if (status.mo21297q2()) {
            taskCompletionSource.mo56139c(resultt);
        } else {
            taskCompletionSource.mo56138b(ApiExceptionUtil.m4340a(status));
        }
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    /* renamed from: c */
    public static Task<Void> m3879c(@NonNull Task<Boolean> task) {
        return task.mo23710k(new zacx());
    }

    @KeepForSdk
    /* renamed from: d */
    public static <ResultT> boolean m3880d(@NonNull Status status, @Nullable ResultT resultt, @NonNull TaskCompletionSource<ResultT> taskCompletionSource) {
        if (status.mo21297q2()) {
            return taskCompletionSource.mo56141e(resultt);
        }
        return taskCompletionSource.mo56140d(ApiExceptionUtil.m4340a(status));
    }
}
