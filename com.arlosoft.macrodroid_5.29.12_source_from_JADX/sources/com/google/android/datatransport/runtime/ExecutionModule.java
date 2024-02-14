package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Module
abstract class ExecutionModule {
    ExecutionModule() {
    }

    @Provides
    /* renamed from: a */
    static Executor m1231a() {
        return new SafeLoggingExecutor(Executors.newSingleThreadExecutor());
    }
}
