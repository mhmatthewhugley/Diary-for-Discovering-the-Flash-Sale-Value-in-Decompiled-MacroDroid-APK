package com.google.firebase.crashlytics.internal.common;

import android.os.Process;

public abstract class BackgroundPriorityRunnable implements Runnable {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo22972a();

    public final void run() {
        Process.setThreadPriority(10);
        mo22972a();
    }
}
