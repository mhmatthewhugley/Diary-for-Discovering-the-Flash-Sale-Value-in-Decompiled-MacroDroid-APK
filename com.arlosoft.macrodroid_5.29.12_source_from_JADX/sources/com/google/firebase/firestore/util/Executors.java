package com.google.firebase.firestore.util;

import android.os.AsyncTask;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;

public final class Executors {

    /* renamed from: a */
    public static final Executor f54769a = TaskExecutors.f47996a;

    /* renamed from: b */
    public static final Executor f54770b = Executors$$Lambda$1.m76495a();

    /* renamed from: c */
    public static final Executor f54771c = new ThrottledForwardingExecutor(4, AsyncTask.THREAD_POOL_EXECUTOR);

    private Executors() {
    }
}
