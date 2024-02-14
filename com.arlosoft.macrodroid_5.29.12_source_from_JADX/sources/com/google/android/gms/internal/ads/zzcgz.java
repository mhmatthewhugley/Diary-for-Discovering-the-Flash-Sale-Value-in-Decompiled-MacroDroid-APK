package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcgz implements Executor {

    /* renamed from: a */
    private final Handler f28453a = new zzf(Looper.getMainLooper());

    zzcgz() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzt.m2905r();
                zzs.m2758i(zzt.m2904q().mo43490c(), th);
                throw th;
            }
        } else {
            this.f28453a.post(runnable);
        }
    }
}
