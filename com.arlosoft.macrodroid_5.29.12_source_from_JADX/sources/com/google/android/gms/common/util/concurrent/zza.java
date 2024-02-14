package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zza implements Runnable {

    /* renamed from: a */
    private final Runnable f3963a;

    public zza(Runnable runnable, int i) {
        this.f3963a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f3963a.run();
    }
}
