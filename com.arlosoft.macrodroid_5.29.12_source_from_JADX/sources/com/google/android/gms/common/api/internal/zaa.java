package com.google.android.gms.common.api.internal;

import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

@VisibleForTesting(otherwise = 2)
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zaa extends LifecycleCallback {

    /* renamed from: c */
    private List f3243c;

    @MainThread
    /* renamed from: k */
    public final void mo21370k() {
        List<Runnable> list;
        synchronized (this) {
            list = this.f3243c;
            this.f3243c = new ArrayList();
        }
        for (Runnable run : list) {
            run.run();
        }
    }
}
