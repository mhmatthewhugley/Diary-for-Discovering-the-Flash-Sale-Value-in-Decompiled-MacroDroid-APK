package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Utils {

    /* renamed from: a */
    private static final ExecutorService f5030a = ExecutorUtils.m6744c("awaitEvenIfOnMainThread task continuation executor");

    private Utils() {
    }

    /* renamed from: d */
    public static <T> T m6804d(Task<T> task) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.mo23711l(f5030a, new C1876g(countDownLatch));
        countDownLatch.await(4, TimeUnit.SECONDS);
        if (task.mo23719t()) {
            return task.mo23715p();
        }
        if (task.mo23717r()) {
            throw new CancellationException("Task is already canceled");
        } else if (task.mo23718s()) {
            throw new IllegalStateException(task.mo23714o());
        } else {
            throw new TimeoutException();
        }
    }

    /* renamed from: e */
    public static boolean m6805e(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        long nanos;
        boolean await;
        boolean z = false;
        try {
            nanos = timeUnit.toNanos(j);
            while (true) {
                await = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                break;
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return await;
        } catch (InterruptedException unused) {
            z = true;
            nanos = (System.nanoTime() + nanos) - System.nanoTime();
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    /* renamed from: f */
    public static <T> Task<T> m6806f(Executor executor, final Callable<Task<T>> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() {
            public void run() {
                try {
                    ((Task) callable.call()).mo23710k(new Continuation<T, Void>() {
                        /* renamed from: b */
                        public Void mo21119a(@NonNull Task<T> task) throws Exception {
                            if (task.mo23719t()) {
                                taskCompletionSource.mo56139c(task.mo23715p());
                                return null;
                            }
                            taskCompletionSource.mo56138b(task.mo23714o());
                            return null;
                        }
                    });
                } catch (Exception e) {
                    taskCompletionSource.mo56138b(e);
                }
            }
        });
        return taskCompletionSource.mo56137a();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ Void m6808h(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.mo23719t()) {
            taskCompletionSource.mo56141e(task.mo23715p());
            return null;
        }
        Exception o = task.mo23714o();
        Objects.requireNonNull(o);
        Exception exc = o;
        taskCompletionSource.mo56140d(o);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ Void m6809i(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.mo23719t()) {
            taskCompletionSource.mo56141e(task.mo23715p());
            return null;
        }
        Exception o = task.mo23714o();
        Objects.requireNonNull(o);
        Exception exc = o;
        taskCompletionSource.mo56140d(o);
        return null;
    }

    /* renamed from: j */
    public static <T> Task<T> m6810j(Task<T> task, Task<T> task2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C1875f fVar = new C1875f(taskCompletionSource);
        task.mo23710k(fVar);
        task2.mo23710k(fVar);
        return taskCompletionSource.mo56137a();
    }

    /* renamed from: k */
    public static <T> Task<T> m6811k(Executor executor, Task<T> task, Task<T> task2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C1874e eVar = new C1874e(taskCompletionSource);
        task.mo23711l(executor, eVar);
        task2.mo23711l(executor, eVar);
        return taskCompletionSource.mo56137a();
    }
}
