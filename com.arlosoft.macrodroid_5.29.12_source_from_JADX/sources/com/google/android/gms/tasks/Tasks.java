package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class Tasks {
    private Tasks() {
    }

    /* renamed from: a */
    public static <TResult> TResult m66662a(@NonNull Task<TResult> task) throws ExecutionException, InterruptedException {
        Preconditions.m4486i();
        Preconditions.m4489l(task, "Task must not be null");
        if (task.mo23718s()) {
            return m66673l(task);
        }
        zzad zzad = new zzad((zzac) null);
        m66674m(task, zzad);
        zzad.mo56142a();
        return m66673l(task);
    }

    /* renamed from: b */
    public static <TResult> TResult m66663b(@NonNull Task<TResult> task, long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.m4486i();
        Preconditions.m4489l(task, "Task must not be null");
        Preconditions.m4489l(timeUnit, "TimeUnit must not be null");
        if (task.mo23718s()) {
            return m66673l(task);
        }
        zzad zzad = new zzad((zzac) null);
        m66674m(task, zzad);
        if (zzad.mo56143e(j, timeUnit)) {
            return m66673l(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @NonNull
    @Deprecated
    /* renamed from: c */
    public static <TResult> Task<TResult> m66664c(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        Preconditions.m4489l(executor, "Executor must not be null");
        Preconditions.m4489l(callable, "Callback must not be null");
        zzw zzw = new zzw();
        executor.execute(new zzz(zzw, callable));
        return zzw;
    }

    @NonNull
    /* renamed from: d */
    public static <TResult> Task<TResult> m66665d() {
        zzw zzw = new zzw();
        zzw.mo56162y();
        return zzw;
    }

    @NonNull
    /* renamed from: e */
    public static <TResult> Task<TResult> m66666e(@NonNull Exception exc) {
        zzw zzw = new zzw();
        zzw.mo56160w(exc);
        return zzw;
    }

    @NonNull
    /* renamed from: f */
    public static <TResult> Task<TResult> m66667f(TResult tresult) {
        zzw zzw = new zzw();
        zzw.mo56161x(tresult);
        return zzw;
    }

    @NonNull
    /* renamed from: g */
    public static Task<Void> m66668g(@Nullable Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m66667f((Object) null);
        }
        for (Task requireNonNull : collection) {
            Objects.requireNonNull(requireNonNull, "null tasks are not accepted");
        }
        zzw zzw = new zzw();
        zzaf zzaf = new zzaf(collection.size(), zzw);
        for (Task m : collection) {
            m66674m(m, zzaf);
        }
        return zzw;
    }

    @NonNull
    /* renamed from: h */
    public static Task<Void> m66669h(@Nullable Task<?>... taskArr) {
        if (taskArr == null || taskArr.length == 0) {
            return m66667f((Object) null);
        }
        return m66668g(Arrays.asList(taskArr));
    }

    @NonNull
    /* renamed from: i */
    public static Task<List<Task<?>>> m66670i(@Nullable Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m66667f(Collections.emptyList());
        }
        return m66668g(collection).mo23713n(TaskExecutors.f47996a, new zzab(collection));
    }

    @NonNull
    /* renamed from: j */
    public static Task<List<Task<?>>> m66671j(@Nullable Task<?>... taskArr) {
        if (taskArr == null || taskArr.length == 0) {
            return m66667f(Collections.emptyList());
        }
        return m66670i(Arrays.asList(taskArr));
    }

    @NonNull
    /* renamed from: k */
    public static <TResult> Task<List<TResult>> m66672k(@Nullable Collection<? extends Task> collection) {
        if (collection == null || collection.isEmpty()) {
            return m66667f(Collections.emptyList());
        }
        return m66668g(collection).mo23711l(TaskExecutors.f47996a, new zzaa(collection));
    }

    /* renamed from: l */
    private static Object m66673l(@NonNull Task task) throws ExecutionException {
        if (task.mo23719t()) {
            return task.mo23715p();
        }
        if (task.mo23717r()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.mo23714o());
    }

    /* renamed from: m */
    private static void m66674m(Task task, zzae zzae) {
        Executor executor = TaskExecutors.f47997b;
        task.mo23709j(executor, zzae);
        task.mo23706g(executor, zzae);
        task.mo23701b(executor, zzae);
    }
}
