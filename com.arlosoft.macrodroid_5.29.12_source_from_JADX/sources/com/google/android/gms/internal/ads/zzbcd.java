package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbcd implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f26557a;

    /* renamed from: c */
    private final WeakReference f26558c;

    /* renamed from: d */
    private boolean f26559d = false;

    public zzbcd(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f26558c = new WeakReference(activityLifecycleCallbacks);
        this.f26557a = application;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42415a(zzbcc zzbcc) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f26558c.get();
            if (activityLifecycleCallbacks != null) {
                zzbcc.mo42414a(activityLifecycleCallbacks);
            } else if (!this.f26559d) {
                this.f26557a.unregisterActivityLifecycleCallbacks(this);
                this.f26559d = true;
            }
        } catch (Exception e) {
            zzcgp.m45227e("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        mo42415a(new zzbbv(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        mo42415a(new zzbcb(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        mo42415a(new zzbby(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        mo42415a(new zzbbx(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        mo42415a(new zzbca(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        mo42415a(new zzbbw(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        mo42415a(new zzbbz(this, activity));
    }
}
