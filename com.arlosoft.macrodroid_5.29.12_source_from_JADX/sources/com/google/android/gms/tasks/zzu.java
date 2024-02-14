package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.tasks.zza;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzu implements Executor {

    /* renamed from: a */
    private final Handler f48049a = new zza(Looper.getMainLooper());

    public final void execute(@NonNull Runnable runnable) {
        this.f48049a.post(runnable);
    }
}
