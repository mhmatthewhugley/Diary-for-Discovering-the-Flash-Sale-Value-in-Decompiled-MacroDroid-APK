package com.google.android.gms.internal.nearby;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzko implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final WeakReference f44812a;

    /* renamed from: c */
    final /* synthetic */ zzkp f44813c;

    public final void onActivityCreated(Activity activity, @Nullable Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        if (activity == this.f44812a.get()) {
            this.f44813c.f44818d = true;
            this.f44813c.m62669f();
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (activity == this.f44812a.get()) {
            this.f44813c.f44818d = false;
            this.f44813c.m62669f();
        }
    }
}
