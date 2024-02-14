package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class zzaw implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Activity f39329a;

    /* renamed from: c */
    final /* synthetic */ zzay f39330c;

    public final void onActivityCreated(Activity activity, @Nullable Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.f39329a) {
            this.f39330c.mo48691c(new zzj(3, "Activity is destroyed."));
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
