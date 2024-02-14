package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzv extends LifecycleCallback {

    /* renamed from: c */
    private final List f48050c = new ArrayList();

    private zzv(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f3200a.mo21373t("TaskOnStopCallback", this);
    }

    /* renamed from: l */
    public static zzv m66728l(Activity activity) {
        LifecycleFragment c = LifecycleCallback.m3791c(activity);
        zzv zzv = (zzv) c.mo21374u("TaskOnStopCallback", zzv.class);
        return zzv == null ? new zzv(c) : zzv;
    }

    @MainThread
    /* renamed from: k */
    public final void mo21370k() {
        synchronized (this.f48050c) {
            for (WeakReference weakReference : this.f48050c) {
                zzq zzq = (zzq) weakReference.get();
                if (zzq != null) {
                    zzq.mo56146a();
                }
            }
            this.f48050c.clear();
        }
    }

    /* renamed from: m */
    public final void mo56158m(zzq zzq) {
        synchronized (this.f48050c) {
            this.f48050c.add(new WeakReference(zzq));
        }
    }
}
