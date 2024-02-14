package com.google.firebase.storage.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.storage.StorageTaskScheduler;
import java.util.concurrent.Executor;

public class SmartHandler {

    /* renamed from: c */
    static boolean f55501c = false;

    /* renamed from: a */
    private final Handler f55502a;

    /* renamed from: b */
    private final Executor f55503b;

    public SmartHandler(@Nullable Executor executor) {
        this.f55503b = executor;
        if (executor != null) {
            this.f55502a = null;
        } else if (!f55501c) {
            this.f55502a = new Handler(Looper.getMainLooper());
        } else {
            this.f55502a = null;
        }
    }

    /* renamed from: a */
    public void mo63720a(@NonNull Runnable runnable) {
        Preconditions.m4488k(runnable);
        Handler handler = this.f55502a;
        if (handler == null) {
            Executor executor = this.f55503b;
            if (executor != null) {
                executor.execute(runnable);
            } else {
                StorageTaskScheduler.m77520b().mo63675c(runnable);
            }
        } else {
            handler.post(runnable);
        }
    }
}
