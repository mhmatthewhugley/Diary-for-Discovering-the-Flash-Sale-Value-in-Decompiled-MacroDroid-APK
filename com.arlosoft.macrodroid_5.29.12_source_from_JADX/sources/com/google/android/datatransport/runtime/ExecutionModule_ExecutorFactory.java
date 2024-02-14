package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import java.util.concurrent.Executor;

public final class ExecutionModule_ExecutorFactory implements Factory<Executor> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final ExecutionModule_ExecutorFactory f1356a = new ExecutionModule_ExecutorFactory();

        private InstanceHolder() {
        }
    }

    /* renamed from: a */
    public static ExecutionModule_ExecutorFactory m1232a() {
        return InstanceHolder.f1356a;
    }

    /* renamed from: b */
    public static Executor m1233b() {
        return (Executor) Preconditions.m1337c(ExecutionModule.m1231a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public Executor get() {
        return m1233b();
    }
}
