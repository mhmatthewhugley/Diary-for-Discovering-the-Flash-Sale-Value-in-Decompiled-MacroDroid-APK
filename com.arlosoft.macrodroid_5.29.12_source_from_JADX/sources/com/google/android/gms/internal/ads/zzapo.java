package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzapo implements zzapt {

    /* renamed from: a */
    final /* synthetic */ Activity f25263a;

    zzapo(zzapu zzapu, Activity activity) {
        this.f25263a = activity;
    }

    /* renamed from: a */
    public final void mo41786a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f25263a);
    }
}
