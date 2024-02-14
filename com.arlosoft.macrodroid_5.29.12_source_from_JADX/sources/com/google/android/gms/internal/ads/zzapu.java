package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzapu implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f25269a;

    /* renamed from: c */
    private final WeakReference f25270c;

    /* renamed from: d */
    private boolean f25271d = false;

    public zzapu(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f25270c = new WeakReference(activityLifecycleCallbacks);
        this.f25269a = application;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41787a(zzapt zzapt) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f25270c.get();
            if (activityLifecycleCallbacks != null) {
                zzapt.mo41786a(activityLifecycleCallbacks);
            } else if (!this.f25271d) {
                this.f25269a.unregisterActivityLifecycleCallbacks(this);
                this.f25271d = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        mo41787a(new zzapm(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        mo41787a(new zzaps(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        mo41787a(new zzapp(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        mo41787a(new zzapo(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        mo41787a(new zzapr(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        mo41787a(new zzapn(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        mo41787a(new zzapq(this, activity));
    }
}
