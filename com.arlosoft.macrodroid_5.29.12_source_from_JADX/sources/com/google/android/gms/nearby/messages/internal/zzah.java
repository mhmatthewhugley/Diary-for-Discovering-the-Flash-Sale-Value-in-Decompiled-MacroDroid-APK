package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzah implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Activity f47714a;

    /* renamed from: c */
    private final zzai f47715c;

    /* synthetic */ zzah(Activity activity, zzai zzai, zzag zzag) {
        this.f47714a = activity;
        this.f47715c = zzai;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.f47714a) {
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                String.format("Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[]{activity.getPackageName()});
            }
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
        if (activity == this.f47714a) {
            try {
                this.f47715c.mo55958u0(1);
            } catch (RemoteException e) {
                if (Log.isLoggable("NearbyMessagesClient", 2)) {
                    String.format("Failed to emit ACTIVITY_STOPPED from ClientLifecycleSafetyNet for Activity %s: %s", new Object[]{activity.getPackageName(), e});
                }
            }
        }
    }
}
