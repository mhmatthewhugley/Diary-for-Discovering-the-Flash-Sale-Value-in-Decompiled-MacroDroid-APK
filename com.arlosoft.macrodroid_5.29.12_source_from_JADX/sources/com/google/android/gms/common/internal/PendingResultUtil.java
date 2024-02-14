package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class PendingResultUtil {

    /* renamed from: a */
    private static final zas f3669a = new zao();

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface ResultConverter<R extends Result, T> {
        @KeepForSdk
        @Nullable
        /* renamed from: a */
        T mo20769a(@NonNull R r);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static <R extends Result, T extends Response<R>> Task<T> m4474a(@NonNull PendingResult<R> pendingResult, @NonNull T t) {
        return m4475b(pendingResult, new zaq(t));
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static <R extends Result, T> Task<T> m4475b(@NonNull PendingResult<R> pendingResult, @NonNull ResultConverter<R, T> resultConverter) {
        zas zas = f3669a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        pendingResult.mo21270c(new zap(pendingResult, taskCompletionSource, resultConverter, zas));
        return taskCompletionSource.mo56137a();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public static <R extends Result> Task<Void> m4476c(@NonNull PendingResult<R> pendingResult) {
        return m4475b(pendingResult, new zar());
    }
}
