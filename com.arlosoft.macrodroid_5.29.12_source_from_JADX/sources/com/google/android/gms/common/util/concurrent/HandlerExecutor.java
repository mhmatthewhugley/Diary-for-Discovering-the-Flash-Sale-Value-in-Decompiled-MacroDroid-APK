package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class HandlerExecutor implements Executor {

    /* renamed from: a */
    private final Handler f3957a;

    @KeepForSdk
    public HandlerExecutor(@NonNull Looper looper) {
        this.f3957a = new zzi(looper);
    }

    public final void execute(@NonNull Runnable runnable) {
        this.f3957a.post(runnable);
    }
}
