package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzbb implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Activity f47748a;

    /* renamed from: c */
    private final zzbh f47749c;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.f47748a) {
            String.format("Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[]{activity.getPackageName()});
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
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
        if (activity == this.f47748a) {
            this.f47749c.m66491O(new zzap(1), 0);
        }
    }
}
